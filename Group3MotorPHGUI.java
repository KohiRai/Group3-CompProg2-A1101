
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;



public class Group3MotorPHGUI extends javax.swing.JFrame {


    public Group3MotorPHGUI() {
        initComponents();
        EmployeeDetails.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserIDComboBox = new javax.swing.JComboBox<>();
        SearchEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeDetails = new javax.swing.JTextArea();
        SalaryCalculator = new javax.swing.JLabel();
        OvertimeHours = new javax.swing.JLabel();
        BasicPayAmount = new javax.swing.JTextField();
        CalculateSalary = new javax.swing.JButton();
        OvertimeHours1 = new javax.swing.JTextField();
        BasicPay = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        WorkedDays = new javax.swing.JLabel();
        WorkedDays1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jLabel11.setText("jLabel11");

        jTextField1.setText("jTextField1");

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

        SalaryCalculator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SalaryCalculator.setText("SALARY CALCULATOR");
        SalaryCalculator.setPreferredSize(new java.awt.Dimension(200, 20));

        OvertimeHours.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OvertimeHours.setText("Overtime Hours:");

        BasicPayAmount.setText("0");

        CalculateSalary.setBackground(new java.awt.Color(204, 204, 204));
        CalculateSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CalculateSalary.setText("CALCULATE");
        CalculateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateSalaryActionPerformed(evt);
            }
        });

        OvertimeHours1.setText("0");
        OvertimeHours1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvertimeHours1ActionPerformed(evt);
            }
        });

        BasicPay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BasicPay.setText("Basic Salary:");
        BasicPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BasicPayFocusGained(evt);
            }
        });

        WorkedDays.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WorkedDays.setText("Days Worked:");

        WorkedDays1.setText("0");
        WorkedDays1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkedDays1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(CalculateSalary)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WorkedDays)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OvertimeHours)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(BasicPay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OvertimeHours1)
                                    .addComponent(BasicPayAmount)
                                    .addComponent(WorkedDays1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SalaryCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalaryCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(UserIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchEmployee))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WorkedDays1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WorkedDays)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OvertimeHours)
                            .addComponent(OvertimeHours1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BasicPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BasicPay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CalculateSalary)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDComboBoxActionPerformed

    }//GEN-LAST:event_UserIDComboBoxActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        String selectedItem = (String) UserIDComboBox.getSelectedItem();
        
        var EmpInfo = new EmployeeInformation(selectedItem);
        EmployeeDetails.setText("Employee Information " + selectedItem); 
        //Show Employee Details
        
//        if(EmployeeInformation)
    }//GEN-LAST:event_SearchEmployeeActionPerformed

    private void CalculateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateSalaryActionPerformed
        // Get values from earnings inputs:
        var BS = EnterBasicSalary.getText();
        int BasicSalary = Integer.parseInt(BS);
        var DW = EnterDaysWorked.getText();
        int DaysWorked = Integer.parseInt(DW);
        var OH = BasicPayAmount.getText();
        int OvertimeHours = Integer.parseInt(OH);
        
        //Insert here a showmessagedialog using these below (Task for Allysa)
         JOptionPane.showMessageDialog(this, "Summary\n"
                                        + "Benefits: sampleInt\n"
                                        + "Gross Salary: SampleInt");
         
        //exception(If statements where if user entered text instead of Int(Numbers) (Task for Rodel)
        //if statement then add the code below inside the {} after you created working if statement/s
        JOptionPane.showMessageDialog(this, 
                              "Please enter Numbers instead of Text", 
                              "CALCULATION ERROR!", 
                              JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_CalculateSalaryActionPerformed

    private void OvertimeHours1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvertimeHours1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OvertimeHours1ActionPerformed

    private void WorkedDays1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkedDays1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkedDays1ActionPerformed

    private void BasicPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BasicPayFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BasicPayFocusGained

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
    private javax.swing.JTextField BasicPayAmount;
    private javax.swing.JButton CalculateSalary;
    private javax.swing.JTextArea EmployeeDetails;
    private javax.swing.JLabel OvertimeHours;
    private javax.swing.JTextField OvertimeHours1;
    private javax.swing.JLabel SalaryCalculator;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JComboBox<String> UserIDComboBox;
    private javax.swing.JLabel WorkedDays;
    private javax.swing.JTextField WorkedDays1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<EmployeeList> EmployeeList = new ArrayList<>();
}
