import Class.Employee;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;


import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MotorPHEmployeeCSVUtil {
    
    private static String FILE_PATH = "files/EmpDet.csv";
    private static String[] HEADERS = {"Employee ID","Employee Position","Last Name","First Name","Gender", "Birthday", "Phone Number"};
    
    //Saves Details of the employees
    public static void SaveDetails(Employee employee){
        try{
            //Ensure folder exists
            File folder = new File("files");
            if(!folder.exists()){
                folder.mkdir();
            }
            
            File file = new File(FILE_PATH);
            boolean fileExists = file.exists();
            boolean needsHeader = true;
            
            //Checks Header
            if(fileExists){
                try(BufferedReader br = new BufferedReader(new FileReader(file))){
                    String firstLine = br.readLine();
                    if (firstLine != null && firstLine.toLowerCase().contains("employee id")){
                        needsHeader = false;
                    }
                }
            }
            
            //Appends/Creates to file
            try(CSVWriter writer = new CSVWriter(new FileWriter(file,true))) {
                if(!fileExists || needsHeader){
                    writer.writeNext(HEADERS,false);
                }
                
                String[] row = {
                    employee.getEmployeeID(),
                    employee.getEmployeePosition(),
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getEmployeeGender(),
                    employee.getBirthday(),
                    employee.getPhoneNumber()
                };
                
                writer.writeNext(row);
            }
        }
        catch(IOException e){
                System.err.println("Error Writing to CSV: " + e.getMessage());
            
        }
        
    }
    public static List<Employee> LoadSelectedEmployeeInfo(){
            List<Employee> EmployeeList = new ArrayList<>();
            
            try{
            //Ensure folder exists
            File folder = new File("files");
            if(!folder.exists()){
                folder.mkdir();
            }
            
            File file = new File(FILE_PATH);
            
            //create file with headers if doesn't exist
            if(!file.exists()){
                try(CSVWriter writer = new CSVWriter(new FileWriter(file,true))) {
                    writer.writeNext(HEADERS, false);
                }
                return EmployeeList;
            } 
            //Read CSV
            try(CSVReader reader = new CSVReader(new FileReader(file))){
                List<String[]> rows = reader.readAll();
                
                //Skip header row then parse remaining rows
                for(int i = 1; 1 < rows.size(); i++){
                    String[] row = rows.get(i);
                    if(row.length >= 5){
                    String EmployeeID = row[0];
                    String EmployeePosition = row[1];
                    String LastName = row[2];
                    String FirstName = row[3];
                    String EmployeeGender = row[4];
                                                          
                    Employee employee  = new Employee(EmployeeID, EmployeePosition, LastName, FirstName, EmployeeGender);
                    EmployeeList.add(employee);
                    }
                }
            }
            
        }catch(Exception e){
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
            
            return EmployeeList;
    }
    
    public static List<Employee> LoadEmployeeInfo(){
            List<Employee> EmployeeList = new ArrayList<>();
            
            try{
            //Ensure folder exists
            File folder = new File("files");
            if(!folder.exists()){
                folder.mkdir();
            }
            
            File file = new File(FILE_PATH);
            
            //create file with headers if doesn't exist
            if(!file.exists()){
                try(CSVWriter writer = new CSVWriter(new FileWriter(file,true))) {
                    writer.writeNext(HEADERS, false);
                }
                return EmployeeList;
            } 
            //Read CSV
            try(CSVReader reader = new CSVReader(new FileReader(file))){
                List<String[]> rows = reader.readAll();
                
                //Skip header row then parse remaining rows
                for(int i = 1; 1 < rows.size(); i++){
                    String[] row = rows.get(i);
                    if(row.length >= 7){
                    String EmployeeID = row[0];
                    String EmployeePosition = row[1];
                    String LastName = row[2];
                    String FirstName = row[3];
                    String EmployeeGender = row[4];
                    String Birthday = row[5];
                    String PhoneNumber = row[6];
                                                          
                    Employee employee  = new Employee(EmployeeID, EmployeePosition, LastName, FirstName, EmployeeGender, Birthday, PhoneNumber);
                    EmployeeList.add(employee);
                    }
                }
            }
            
        }catch(Exception e){
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
            
            return EmployeeList;
    }
    
    public static void EnsureFileWithHeaders(){
        File folder = new File("files");
        if(!folder.exists()){
            folder.mkdir();
        }
        
        File file = new File(FILE_PATH);
        boolean needsHeader = false;
        
        if(!file.exists()){
            try(CSVWriter writer = new CSVWriter(new FileWriter(file))){
                writer.writeNext(HEADERS);
            }catch(IOException e){
                System.err.println("Error creating CSV with Headers: " + e.getMessage());
            }
            return;
        }
        
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String firstLine = br.readLine();
            if(firstLine==null || !firstLine.toLowerCase().contains("employee id")){
                needsHeader = true;
            }
        }catch(IOException e){
            System.err.println("Error reading CSV for header check: " + e.getMessage());
        }
        
        if(needsHeader){
            try(CSVReader reader = new CSVReader( new FileReader(file))){
                List<String[]> allRows = new ArrayList<>();
                List<String[]> updatedRows = new ArrayList<>();
                updatedRows.add(HEADERS);
                int idCounter = 1;
                for(int i = 1; i< allRows.size(); i++){
                    String[] oldRow = allRows.get(i);
                    String[] newRow = new String[7];
                    newRow[0] = String.format("1000"+idCounter++);
                    for(int j = 1; j < oldRow.length && j + 1 < newRow.length; j++){
                        newRow[j+1] = oldRow[j];
                    }
                    updatedRows.add(newRow);
                }
                try(CSVWriter writer = new CSVWriter(new FileWriter(file))){
                writer.writeAll(updatedRows);
                }
            }catch(Exception e){
                System.err.println("Error updating to CSV Headers: " + e.getMessage());
            }
        }
        
        
    }
    
     public static boolean DeleteEmpInfo(String EmployeeID){
        EnsureFileWithHeaders();
        File file = new File(FILE_PATH);
        List<String[]> allRows = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(file))){
           allRows = reader.readAll(); 
        }catch(Exception e){
            System.err.println("Error reading CSV for update: " + e.getMessage());
            return false;
        }
        
        List<String[]>UpdatedRows = new ArrayList<>();
        UpdatedRows.add(HEADERS);
        boolean Removed = false;
        for(int i = 1; i < allRows.size(); i++){
            String[] row = allRows.get(i);
            if(!row[0].equals(EmployeeID)){
                UpdatedRows.add(row);             
            } else{
                Removed = true;
            }        
        }
        if(!Removed){
            return false;
        }
        try(CSVWriter writer = new CSVWriter(new FileWriter(file))){
            writer.writeAll(UpdatedRows);
        }catch(IOException e){
            System.err.println("Error Writing to CSV after update: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean UpdateEmpInfo(Employee UpdatedEmployee){
        EnsureFileWithHeaders();
        File file = new File(FILE_PATH);
        List<String[]> allRows = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(file))){
           allRows = reader.readAll(); 
        }catch(Exception e){
            System.err.println("Error reading CSV for update: " + e.getMessage());
            return false;
        }
        
        List<String[]>UpdatedRows = new ArrayList<>();
        UpdatedRows.add(HEADERS);
        boolean Updated = false;
        for(int i = 1; i < allRows.size(); i++){
            String[] row = allRows.get(i);
            if(row[0].equals(UpdatedEmployee.getEmployeeID())){
                String[] newRow = {
                    UpdatedEmployee.getEmployeeID(),
                    UpdatedEmployee.getEmployeePosition(),
                    UpdatedEmployee.getLastName(),
                    UpdatedEmployee.getFirstName(),
                    UpdatedEmployee.getEmployeeGender()
                };
                UpdatedRows.add(newRow);
                Updated = true;
                
            } else{
                UpdatedRows.add(row);
            }        
        }
        if(!Updated){
            return false;
        }
        try(CSVWriter writer = new CSVWriter(new FileWriter(file))){
            writer.writeAll(UpdatedRows);
        }catch(IOException e){
            System.err.println("Error Writing to CSV after update: " + e.getMessage());
            return false;
        }
        return true;
    }

    public static Employee getEmployeeByID(String EmployeeID) {
        List<Employee> employees = LoadEmployeeInfo();
        for(Employee employee : employees){
            if(employee.getEmployeeID().equals(EmployeeID)){
                return employee;
                }
        }
        
        return null;
    }
}


            
