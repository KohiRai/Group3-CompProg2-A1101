
import java.util.ArrayList;
import java.util.List;



public class Employee{
    private String EmployeeID;
    private String EmployeeName;
    private String EmployeeBirthday;
    private String EmployeeGender;
    

    public Employee(String EmployeeID, String EmployeeName, String EmployeeBirthday, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeBirthday = EmployeeBirthday;
        this.EmployeeGender = EmployeeGender;
    }

    
//    @Override
//    public int compareTo(Employee other) {
//        return EmployeeID.compareTo(other.EmployeeID);
//    }
//
    @Override
    public String toString(){
        return "Employee Information\n\n" + "Employee ID: " + EmployeeID + "\nEmployee Name: " + EmployeeName + "\nEmployee Birthday: " + EmployeeBirthday + "\nEmployee Gender: " + EmployeeGender;
    }

    
        public String getEmployeeID() {
        return EmployeeID;
    }
//
//    public void setEmployeeID(String EmployeeID) {
//        this.EmployeeID = EmployeeID;
//    }
   
}
