
import java.util.ArrayList;
import java.util.List;



public class Employee{
    private String EmployeeID;
    private String EmployeeName;
    private String Birthday;
    private String EmployeeGender;
    private String LastName;
    private String FirstName;
    private String Address;
    private String EmployeePosition;
    

    public Employee(String EmployeeID, String EmployeeName, String EmployeeBirthday, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Birthday = EmployeeBirthday;
        this.EmployeeGender = EmployeeGender;
    }

    public Employee(String EmployeeID, String EmployeePosition, String LastName, String FirstName, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeePosition = EmployeePosition;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.EmployeeGender = EmployeeGender;
    }
    
    
    

    
//    @Override
//    public int compareTo(Employee other) {
//        return EmployeeID.compareTo(other.EmployeeID);
//    }
//
    @Override
    public String toString(){
        int randomNum = (int)(Math.random() * 999999999);  //Sample phonennum creator
        
        
        return """             
               Employee ID: """ + EmployeeID + "\nFirst Name: " + FirstName + 
                "\nLast Name: " + LastName + "\nEmployee Gender: " + EmployeeGender + "\nPosition: " + EmployeePosition + "\nPhone Number: 09" + randomNum;
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

    public String getAddress() {
        return Address;
    }

    public String getEmployeePosition() {
        return EmployeePosition;
    }
     
    
    
    
    
   
    
}
