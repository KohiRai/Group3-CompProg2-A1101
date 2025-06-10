//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;


import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;

import java.io.IOException;

public class MotorPHCSVUtil {
    
    private static String FILE_PATH = "files/EmpDet.csv";
    private static String[] HEADERS = {"Employee ID","Last Name","First Name","Address","Birthday","Gender"};
    
    //Saves Details of the employees
    public static void saveDetails(Employee employee){
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
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getAddress(),
                    employee.getBirthday(),
                    employee.getEmployeeGender()
                };
                
                writer.writeNext(row);
            }
        }
        catch(IOException e){
                System.err.println("Error Writing to CSV: " + e.getMessage());
            
        }
        
    }
    public static List<Employee> loadEmployee(){
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
                    if(row.length >= 6){
                    String EmployeeID = row[0];
                    String LastName = row[1];
                    String FirstName = row[2];
                    String Address = row[3];
                    String Birthday = row[4];
                    String EmployeeGender = row[5];
                    
                    Employee employee  = new Employee(EmployeeID, LastName, FirstName, Address, Birthday, EmployeeGender);
                    EmployeeList.add(employee);
                    }
                }
            }
            
        }catch(Exception e){
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
            
            return EmployeeList;
    }
    
    public static void ensureFileWithHeaders(){
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
                needsHeader = false;
            }
        }catch(IOException e){
            System.err.println("Error reading CSV for header check: " + e.getMessage());
        }
        
        
    }
}
            
