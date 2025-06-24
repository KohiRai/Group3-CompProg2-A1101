package Class;


import java.util.ArrayList;
import java.util.List;



public class Employee{
    private String EmployeeID;
    private String EmployeeName;
    private String Birthday;
    private String EmployeeGender;
    private String LastName;
    private String FirstName;
    private String EmployeePosition;
    private String PhoneNumber;
    

    public Employee(String EmployeeID, String EmployeePosition, String LastName, String FirstName, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeePosition = EmployeePosition;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.EmployeeGender = EmployeeGender;
    }
    
    public Employee(String EmployeeID, String EmployeePosition, String LastName, String FirstName, String EmployeeGender, String Birthday, String PhoneNumber){
        this.EmployeeID = EmployeeID;
        this.EmployeePosition = EmployeePosition;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.EmployeeGender = EmployeeGender;
        this.Birthday = Birthday;
        this.PhoneNumber = PhoneNumber;
    }
    
    
    
    

    
//    @Override
//    public int compareTo(Employee other) {
//        return EmployeeID.compareTo(other.EmployeeID);
//    }
//
    @Override
    public String toString(){ 
        return """             
               Employee ID: """ + EmployeeID + "\nPosition: " + EmployeePosition + "\nFirst Name: " + FirstName + 
                "\nLast Name: " + LastName + "\nEmployee Gender: " + EmployeeGender + "\nBirthday: " + Birthday +"\nPhone Number: " 
                + PhoneNumber;
    }
    
    public String getEmployeeID() {
    return EmployeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getEmployeeGender() {
        return EmployeeGender;
    }

    public String getEmployeePosition() {
        return EmployeePosition;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }
    
    
    
    
    
    
    
   
    
}
