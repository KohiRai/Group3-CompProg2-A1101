import java.util.Collection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Group3MotorPHGUI extends javax.swing.JFrame {


    public Group3MotorPHGUI() {
        initComponents();
        EmployeeDetails.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserIDComboBox = new javax.swing.JComboBox<>();
        SearchEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeDetails = new javax.swing.JTextArea();
        EnterBasicSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EnterDaysWorked = new javax.swing.JTextField();
        EnterOvertimeHours = new javax.swing.JTextField();
        CalculateSalary = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setText("Enter Basic Salary:");

        jLabel4.setText("Salary Calculator");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel5.setText("Enter Overtime Hours:");

        jLabel6.setText("Enter Days Worked:");

        EnterDaysWorked.setText("0");

        EnterOvertimeHours.setText("0");

        CalculateSalary.setText("Calculate");
        CalculateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchEmployee))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(25, 25, 25))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(33, 33, 33)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EnterBasicSalary)
                                .addComponent(EnterDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EnterOvertimeHours, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CalculateSalary))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(UserIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchEmployee))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(EnterBasicSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(EnterDaysWorked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(EnterOvertimeHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(CalculateSalary)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDComboBoxActionPerformed

    }//GEN-LAST:event_UserIDComboBoxActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        String selectedItem = (String) UserIDComboBox.getSelectedItem();
        
        EmployeeDetails.setText("Employee Information " + selectedItem); 
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

    // Show result dialog (Task for Allysa)
        JOptionPane.showMessageDialog(this, "Summary\n"
        + "Benefits: " + "\n"
        + "Gross Salary: "  );//Reconstruct this part by calling out methods such as 
                              //Calculate.showEarnings or other methods that can be found in the PayrollCalculation class

        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
        "Please enter NUMBERS ONLY in the salary, days worked, and overtime fields.", 
        "INPUT ERROR!", 
        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CalculateSalaryActionPerformed

    public void setUpGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        
        var Employee1 = new Employee("10001", "Juztin Kristoffer P. Estacio", "December 7, 2005", "Male");
        var Employee2 = new Employee("10002", "LeBron James", "December 30, 1984", "Male");
        Map<String,Employee> map = new HashMap<>();
        
        map.put(Employee1.getEmployeeID(), Employee1);
        map.put(Employee2.getEmployeeID(), Employee2);
        
        
     
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
    private javax.swing.JButton CalculateSalary;
    private javax.swing.JTextArea EmployeeDetails;
    private javax.swing.JTextField EnterBasicSalary;
    private javax.swing.JTextField EnterDaysWorked;
    private javax.swing.JTextField EnterOvertimeHours;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JComboBox<String> UserIDComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<EmployeeComparator> EmployeeList = new ArrayList<>();
}
