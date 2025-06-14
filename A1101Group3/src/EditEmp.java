import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;

public class EditEmp extends javax.swing.JFrame {

    private Employee OriginalEmpInfo;
    private Grp3EmpInfo parentView;
    
    /**
     * Creates new form NewEmployeeForm
     */
    public EditEmp(Employee selectedEmployee, Grp3EmpInfo parent) {
        this.OriginalEmpInfo = selectedEmployee;
        this.parentView = parent;
        initComponents();
        PopulateFields();
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblEmpID = new javax.swing.JLabel();
        lblEmpID1 = new javax.swing.JLabel();
        lblEmpID2 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        CboxGender = new javax.swing.JComboBox<>();
        CboxRole = new javax.swing.JComboBox<>();
        lblGender1 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Update Information");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblEmpID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpID.setText("Enter Last Name:");

        lblEmpID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpID1.setText("Enter Employee ID:");

        lblEmpID2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpID2.setText("Enter First Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGender.setText("Gender:");

        CboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to say" }));
        CboxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxGenderActionPerformed(evt);
            }
        });

        CboxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR", "IT", "Finance", "Admin" }));
        CboxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxRoleActionPerformed(evt);
            }
        });

        lblGender1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGender1.setText("Employee Role:");

        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(85, 85, 85)
                        .addComponent(btnGoBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblEmpID)
                                .addGap(78, 78, 78)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblGender)
                                .addGap(136, 136, 136)
                                .addComponent(CboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblEmpID2)
                                .addGap(78, 78, 78)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmpID1)
                                    .addComponent(lblGender1))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(CboxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpID1)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender1)
                    .addComponent(CboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpID)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpID2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addComponent(CboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnGoBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PopulateFields(){
        txtEmpID.setText(OriginalEmpInfo.getEmployeeID());
        CboxRole.setSelectedItem(OriginalEmpInfo.getEmployeePosition());
        txtLastName.setText(OriginalEmpInfo.getLastName());
        txtFirstName.setText(OriginalEmpInfo.getFirstName());
        CboxGender.setSelectedItem(OriginalEmpInfo.getEmployeeGender());
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
        String EmployeeID = txtEmpID.getText().trim();
        String EmployeePosition = CboxRole.getSelectedItem().toString();
        String LastName = txtLastName.getText().trim();
        String FirstName = txtFirstName.getText().trim();
        String EmployeeGender = CboxGender.getSelectedItem().toString();
        
        if (EmployeeID.trim().isEmpty()||LastName.trim().isEmpty()&&FirstName.trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter values inside the Text Fields", "Missing Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
            
        Employee updatedEmpInfo = new Employee(OriginalEmpInfo.getEmployeeID(), EmployeePosition, LastName, FirstName, EmployeeGender);
        
        boolean Success = MotorPHCSVUtil.UpdateEmpInfo(updatedEmpInfo);
        if (Success){
            JOptionPane.showMessageDialog(this,"Employee information updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            parentView.refreshTable();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update Employee Information", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        txtEmpID.setText("");
        CboxRole.setSelectedItem("HR");
        txtLastName.setText("");
        txtFirstName.setText("");
        CboxGender.setSelectedItem("Male");
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(this, 
            "Please enter STRING ONLY in the text fields.", 
            "INPUT ERROR!", 
            JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void CboxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxGenderActionPerformed

    private void CboxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxRoleActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        Grp3EmpInfo parentForm = new Grp3EmpInfo();
        parentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(NewEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new NewEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxGender;
    private javax.swing.JComboBox<String> CboxRole;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpID1;
    private javax.swing.JLabel lblEmpID2;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
private List<Employee> updatedEmpInfo;

}
