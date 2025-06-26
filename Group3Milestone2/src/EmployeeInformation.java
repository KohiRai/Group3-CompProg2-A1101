 
import Class.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class EmployeeInformation extends javax.swing.JFrame {

    
    /**
     * Creates new form Grp3EmpInfo
     */
    
    private DefaultTableModel tableModel; //Variable Declaration ng DefaultTableModel
    private List<Employee> Employees; //Varibale Declaration ng Employees which is a list

    
    public EmployeeInformation() {
        initComponents();
        loadEmpInfo();
        addTableSelectionListener();
        
        btnView.setEnabled(false);
        btnEdit.setEnabled(false);
    }
    

    private void loadEmpInfo(){
        Employees = MotorPHEmployeeCSVUtil.LoadSelectedEmployeeInfo();
        String[] ColumnHeader = {"Employee ID", "Employee Position","Last Name", "First Name", "Gender"};
        tableModel = new DefaultTableModel(ColumnHeader, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        for(Employee employee: Employees){
        String[] row = {
                    employee.getEmployeeID(),
                    employee.getPosition(),
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getGender(),
                    employee.getBirthday(),
                    employee.getPhoneNumber()
                    };
                    tableModel.addRow(row);
        }
        
        tblEmpInfo.setModel(tableModel);
    }
    
    public void refreshTable(){
        loadEmpInfo();
    }
    
    private void addTableSelectionListener(){
        tblEmpInfo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                boolean selected = tblEmpInfo.getSelectedRow() != -1;
                btnView.setEnabled(selected);
                btnEdit.setEnabled(selected);
                }
        } );
        
        btnView.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tblEmpInfo.getSelectedRow();
                if(selectedRow != -1){
                    String EmployeeID = tableModel.getValueAt(selectedRow, 0).toString();
                    Employee selectedEmployee = MotorPHEmployeeCSVUtil.getEmployeeByID(EmployeeID);
                    
                    if(selectedEmployee != null){
                        ViewEmployee view = new ViewEmployee(selectedEmployee, EmployeeInformation.this);
                        view.setLocationRelativeTo(EmployeeInformation.this);
                        view.setVisible(true);
                        dispose();
                    }
                }
            }
        }); 
        
        btnEdit.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {

                        EditEmployee edit = new EditEmployee(EmployeeInformation.this);
                        edit.setLocationRelativeTo(EmployeeInformation.this);
                        edit.setVisible(true);
                        dispose();

            }
        });
    }      
                
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpInfo = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("MotorPH Employees");

        tblEmpInfo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpInfo.setCellSelectionEnabled(true);
        tblEmpInfo.setRowHeight(40);
        jScrollPane1.setViewportView(tblEmpInfo);
        if (tblEmpInfo.getColumnModel().getColumnCount() > 0) {
            tblEmpInfo.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tblEmpInfo.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tblEmpInfo.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tblEmpInfo.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        btnNew.setText("New Employee");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnView.setText("View Employee");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Employee");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNew)
                    .addComponent(btnView)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void FrameDispose(){
        this.dispose();
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        NewEmployeeForm NEF = new NewEmployeeForm();
        NEF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new EmployeeInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpInfo;
    // End of variables declaration//GEN-END:variables
}
