import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;




public class Group3MotorPHGUI extends javax.swing.JFrame {

    
    
    
    public Group3MotorPHGUI() {
        initComponents();
        EmployeeDetails.setEditable(false);
        
        Employees = new ArrayList<>();
        Employees.add(new Employee("10001", "Juztin Kristoffer P. Estacio", "December 7, 2005", "Male"));
        Employees.add(new Employee("10002", "LeBron James", "December 30, 1984", "Male"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserIDComboBox = new javax.swing.JComboBox<>();
        SearchEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeDetails = new javax.swing.JTextArea();
        EnterBasicSalary = new javax.swing.JTextField();
        EnterDaysWorked = new javax.swing.JTextField();
        EnterOvertimeHours = new javax.swing.JTextField();
        CalculateSalary = new javax.swing.JButton();
        SalaryCalculator = new javax.swing.JLabel();
        WorkedDays = new javax.swing.JLabel();
        OvertimeHours = new javax.swing.JLabel();
        BasicPay = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Choose User ID: ");

        jLabel2.setText("Registered User IDs: 10001 & 10002");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));

        UserIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10001", "10002" }));
        UserIDComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDComboBoxActionPerformed(evt);
            }
        });

        SearchEmployee.setText("Search");
        SearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });

        EmployeeDetails.setColumns(20);
        EmployeeDetails.setRows(5);
        jScrollPane1.setViewportView(EmployeeDetails);
        EmployeeDetails.getAccessibleContext().setAccessibleName("EmployeeDetails");

        EnterBasicSalary.setText("0");
        EnterBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBasicSalaryActionPerformed(evt);
            }
        });

        EnterDaysWorked.setText("0");
        EnterDaysWorked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterDaysWorkedActionPerformed(evt);
            }
        });

        EnterOvertimeHours.setText("0");

        CalculateSalary.setBackground(new java.awt.Color(204, 204, 204));
        CalculateSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CalculateSalary.setText("CALCULATE");
        CalculateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateSalaryActionPerformed(evt);
            }
        });

        SalaryCalculator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SalaryCalculator.setText("SALARY CALCULATOR");
        SalaryCalculator.setPreferredSize(new java.awt.Dimension(200, 20));

        WorkedDays.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WorkedDays.setText("Days Worked:");

        OvertimeHours.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OvertimeHours.setText("Overtime Hours:");

        BasicPay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BasicPay.setText("Basic Salary:");
        BasicPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BasicPayFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(UserIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(SearchEmployee)
                        .addGap(32, 32, 32)
                        .addComponent(SalaryCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(CalculateSalary))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OvertimeHours)
                                    .addComponent(WorkedDays)
                                    .addComponent(BasicPay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EnterBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnterDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnterOvertimeHours, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(UserIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchEmployee)
                    .addComponent(SalaryCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BasicPay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WorkedDays)
                            .addComponent(EnterDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OvertimeHours)
                            .addComponent(EnterOvertimeHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CalculateSalary))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDComboBoxActionPerformed
        

    }//GEN-LAST:event_UserIDComboBoxActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        String selectedEmpID = (String) UserIDComboBox.getSelectedItem();

            for (Employee emp : Employees) {
                if (emp.getEmployeeID().equals(selectedEmpID)){
                    EmployeeDetails.setText(emp.toString());
                    return;
                }
            }
        //Show Employee Details
        
//        if(EmployeeInformation)
    }//GEN-LAST:event_SearchEmployeeActionPerformed

    private void EnterBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBasicSalaryActionPerformed
        
    }//GEN-LAST:event_EnterBasicSalaryActionPerformed

    private void CalculateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateSalaryActionPerformed
        // TODO add your handling code here:
       try {
        int BasicSalary = Integer.parseInt(EnterBasicSalary.getText());
        int DaysWorked = Integer.parseInt(EnterDaysWorked.getText());
        int OvertimeHours = Integer.parseInt(EnterOvertimeHours.getText());
        
        var Calculate = new PayrollCalculation(BasicSalary, DaysWorked, OvertimeHours);

        JOptionPane.showMessageDialog(this, """
                                            Summary\n
                                            """ + Calculate.showEarnings() + "\n"
                                            + Calculate.ShowBenefits() +  "\n"
                                            + Calculate.showDeductions()+  "\n"
                                            + Calculate.Summary() +  "\n");//Reconstruct this part by calling out methods such as    

        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
        "Please enter NUMBERS ONLY in the salary, days worked, and overtime fields.", 
        "INPUT ERROR!", 
        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CalculateSalaryActionPerformed

    private void BasicPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BasicPayFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BasicPayFocusGained

    private void EnterDaysWorkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterDaysWorkedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterDaysWorkedActionPerformed

    public void setUpGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        
        
        
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Group3MotorPHGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Group3MotorPHGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Group3MotorPHGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Group3MotorPHGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Group3MotorPHGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BasicPay;
    private javax.swing.JButton CalculateSalary;
    private javax.swing.JTextArea EmployeeDetails;
    private javax.swing.JTextField EnterBasicSalary;
    private javax.swing.JTextField EnterDaysWorked;
    private javax.swing.JTextField EnterOvertimeHours;
    private javax.swing.JLabel OvertimeHours;
    private javax.swing.JLabel SalaryCalculator;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JComboBox<String> UserIDComboBox;
    private javax.swing.JLabel WorkedDays;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 private ArrayList<Employee> Employees;
}
