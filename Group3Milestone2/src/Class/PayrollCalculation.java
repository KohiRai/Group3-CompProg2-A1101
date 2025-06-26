package Class;

import java.text.DecimalFormat;

public class PayrollCalculation<T> {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    private int BasicSalary;
    private int DaysWorked;
    private int OvertimeHours;
    private double DailyRate, OverTimePay ,Overtime,GrossIncome,Benefits,SSS, Philhealth, PagIbig, 
                   TotalDeduction,WithholdingTax,TaxableIncome,FinalTotalDeductions,NetIncome;

    //Constructor
    public PayrollCalculation(int BasicSalary, int DaysWorked, int OvertimeHours) {
        this.BasicSalary = BasicSalary;
        this.DaysWorked = DaysWorked;
        this.OvertimeHours = OvertimeHours;
    }

    public String showEarnings(){
        DailyRate = BasicSalary / 20;
        OverTimePay = DailyRate * .10; 
        Overtime = OvertimeHours * OverTimePay;
        GrossIncome = DailyRate * DaysWorked + Overtime;  
        return """
               Monthly Rate: """ + decfor.format(BasicSalary) + "\n"
               + "Daily Rate: " + decfor.format(DailyRate) + "\n"
               + "Overtime: " + decfor.format(Overtime) + "\n"
               + "Gross Income: " + decfor.format(GrossIncome) + "\n";
    }
    
    public String ShowBenefits(){
        Benefits = 4500.00d;
        return """
               Rice Subsidy: P1500.00
               Phone Allowance: P2000.00
               Clothing Allowance: P1000.00
               Benefits: P""" + decfor.format(Benefits) + "\n";
    }
    
    public String showDeductions(){
        SSS = BasicSalary * 0.045; //Calculation for SSS Deduction
        Philhealth = BasicSalary * 0.03; //Calculation for SSS Deduction
        PagIbig = BasicSalary * 0.02; // PagIbig = BasicSalary * 2%
        
        return """
               Social Security Systems Deductions: P""" //Title of next section
         + decfor.format(SSS) + "\n" +
               "Philhealth Deduction: P" + decfor.format(Philhealth) + "\n" +
               "Pag-Ibig Deduction: P" + decfor.format(PagIbig) + "\n" 
               + WithholdingTax();
    }
    
    public String Summary(){
        NetIncome = GrossIncome + Benefits - FinalTotalDeductions;
        return """
               Gross Income: P""" + decfor.format(GrossIncome) + "\n" +
               "Benefits: P" + decfor.format(Benefits) + "\n" +
               "Deductions: P" + decfor.format(FinalTotalDeductions) + "\n" +
               "Net Income: P" + decfor.format(NetIncome);
    }
    
    //Withholding tax calculation based on the BasicSalary
    private String WithholdingTax(){
        TotalDeduction = SSS + Philhealth + PagIbig;//These are Deductions without Withholding Tax Since it would be calculated with total deductions of SSS, Philhealht, and PagIbig
        WithholdingTax = 0;//WithHolding Tax is automatically 0, and would be declared inside if,elseif,else statements and would be calculated inside the conditions(If,elseif,else)
        TaxableIncome = BasicSalary - TotalDeduction;//TaxableIncome will be used to calculate the Withholding Tax
                    
                        if (BasicSalary >= 20_833 && BasicSalary < 33_333) {//This will run  if Basic Salary is 20,833 to below 33,333
                        WithholdingTax = (TaxableIncome - 20_833) * 0.20;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 33_333 && BasicSalary < 66_667) {//This will run  if Basic Salary is 33,333 to below 66,667
                        WithholdingTax = ((TaxableIncome - 33_333) * 0.25) + 2_500;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 66_667 && BasicSalary < 166_667) {//This will run  if Basic Salary is 66,667 to below 166,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.30) + 10_833;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 166_667 && BasicSalary < 666_667) {//This will run  if Basic Salary is 166,667 to below 666,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.32) + 40_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 666_667) {//This will run  if Basic Salary is 666,667 and above
                        WithholdingTax = ((TaxableIncome - 666_667) * 0.35) + 200_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else{//This will run  if Basic Salary is 20,832 and below
                            WithholdingTax = 0;//Basic Salaries that are 20,832 and below it will have no withholding Tax
                        }
                    FinalTotalDeductions = TotalDeduction + WithholdingTax;   
                    return "Withholding Tax: P" + decfor.format(WithholdingTax) + "\n" + 
                                       "Total Deductions: P" + decfor.format(FinalTotalDeductions) + "\n";
    }
    
    
}
