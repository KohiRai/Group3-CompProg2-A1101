
import java.util.ArrayList;
import java.util.List;



public class Employee{
    private String EmployeeID;
    private String EmployeeName;
    private String Birthday;
    private String EmployeeGender;
    private String SSS;
    private String TIN;
    private String Philhealth;
    private String Pagibig;
    private String LastName;
    private String FirstName;
    private String PhoneNum;
    private String Address;
    

    public Employee(String EmployeeID, String EmployeeName, String EmployeeBirthday, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.Birthday = EmployeeBirthday;
        this.EmployeeGender = EmployeeGender;
    }

    public Employee(String EmployeeID, String LastName, String FirstName, String Address, String Birthday, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Address = Address;
        this.Birthday = Birthday;
        this.EmployeeGender = EmployeeGender;
    }
    
    
    

    
//    @Override
//    public int compareTo(Employee other) {
//        return EmployeeID.compareTo(other.EmployeeID);
//    }
//
    @Override
    public String toString(){
        return """
               Employee Information
               
               Employee ID: """ + EmployeeID + "\nEmployee Name: " + EmployeeName + 
                "\nEmployee Birthday: " + Birthday + "\nEmployee Gender: " + EmployeeGender;
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
    
   
    
}
