import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    private String EmployeeID;
    private String EmployeeName;
    private String EmployeeBirthday;
    private String EmployeeGender;

    public EmployeeList(String EmployeeID, String EmployeeName, String EmployeeBirthday, String EmployeeGender) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EmployeeBirthday = EmployeeBirthday;
        this.EmployeeGender = EmployeeGender;
    }
    
    EmployeeList Add1 = new EmployeeList("10001", "Juztin Kristoffer P. Estacio", "December 7, 2005", "Male");
    EmployeeList Add2 = new EmployeeList("10002", "LeBron James", "December 30, 1984", "Male");//For the meantime just manually add Users Info
    
    private static void show(){
    List<String> list = new ArrayList<>();
    
    Collections.addAll(list, EmployeeID, EmployeeName, EmployeeBirthday, EmployeeGender);
    }
    
}

    

