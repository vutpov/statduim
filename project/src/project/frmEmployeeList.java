/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import controls.JPictureBox;
import controls.MyInternalFrame;
import controls.MyModel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import static project.function.prepareDialog;
import static project.function.resetAutoNumber;

/**
 *
 * @author Nemesis
 */
public class frmEmployeeList extends MyInternalFrame {

    /**
     * Creates new form frmUserList
     */
    
    frmMain mainForm;
    
    public frmEmployeeList(frmMain mainForm) {
        super();
        initComponents();
        
        try {
            dataCon.connectToDB();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        JTableHeader header = jTableEmployee.getTableHeader();
        header.setPreferredSize(new Dimension(100, 30));
        
        Font f=new Font("Roboto",Font.PLAIN ,13);
        
        header.setFont(f);
        
        jTableEmployee.setRowHeight(40);
        
        jTableEmployee.setDefaultRenderer(JPictureBox.class, new controls.PictureBoxRenderer());
        
        
        
        MouseAdapter mouse=new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton()==MouseEvent.BUTTON3){
                    jPopupMenu1.show(jTableEmployee, e.getX(), e.getY());
                }
            }
            
        };
        
        jTableEmployee.addMouseListener(mouse);
        
        
        mouse=new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton()==MouseEvent.BUTTON3){
                    jPopupMenu1.show(jScrollPane2, e.getX(), e.getY());
                    
                }
            }
            
        };
        
        jScrollPane2.addMouseListener(mouse);
        
        setVisiblePopUp(false,false,false);
        
        
        jTableEmployee.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            boolean isVisibled=jTableEmployee.getSelectedRowCount()>0;
            
            boolean isVisibledForViewImage=false;
            
            boolean isVisibledForActivate=false;
            
            if(jTableEmployee.getSelectedRowCount()==1){
                selectedRowIndex=jTableEmployee.getSelectedRow();
                isVisibledForViewImage=!(modelEmployee.getValueAt(selectedRowIndex, 14)+"").equals("");
                
                isVisibledForActivate=!(modelEmployee.getValueAt(selectedRowIndex, 13)+"").equals("");
            }
            
            
            
            setVisiblePopUp(isVisibled,isVisibledForActivate,isVisibledForViewImage);
            
            
            
        });
        
        this.mainForm=mainForm;
        
        
        
        TableColumnModel tcm = jTableEmployee.getColumnModel();
        tcm.removeColumn(tcm.getColumn(tcm.getColumnCount()-1));
        tcm.removeColumn(tcm.getColumn(tcm.getColumnCount()-1));
        
        jTableEmployee.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }

    void setTextOnPopActivate(){
        selectedRowIndex=jTableEmployee.getSelectedRow();
        if(jTableEmployee.getSelectedRowCount()==0) return;
        
        String st="";
        
        st=modelEmployee.getValueAt(selectedRowIndex,13).equals("Yes")?"Deactivate":"Activate";
        
        popActivate.setText(st);
    }
    
    void setVisiblePopUp(boolean isVisibled,boolean isVisibledForActivate,boolean isVisibledForViewImage){
        
        
        popEdit.setVisible(isVisibled);
        popDelete.setVisible(isVisibled);
        
        jSeparator1.setVisible(isVisibledForViewImage);
        popViewImage.setVisible(isVisibledForViewImage);
        
        jSeparator2.setVisible(isVisibledForActivate);
        popActivate.setVisible(isVisibledForActivate);
        popDeleteUser.setVisible(isVisibledForActivate);
        
        if(modelEmployee==null) return;
        
        setTextOnPopActivate();
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popAdd = new javax.swing.JMenuItem();
        popEdit = new javax.swing.JMenuItem();
        popDelete = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        popActivate = new javax.swing.JMenuItem();
        popDeleteUser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        popViewImage = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmployee = new controls.SubJTable();

        popAdd.setText("Add");
        popAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popAddActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popAdd);

        popEdit.setText("Edit");
        popEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popEditActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popEdit);

        popDelete.setText("Delete");
        popDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popDeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popDelete);
        jPopupMenu1.add(jSeparator2);

        popActivate.setText("Activate");
        popActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popActivateActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popActivate);

        popDeleteUser.setText("Delete User");
        popDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popDeleteUserActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popDeleteUser);
        jPopupMenu1.add(jSeparator1);

        popViewImage.setText("View Photo");
        popViewImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popViewImageActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popViewImage);

        setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 45, 49));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Employee List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pTable.setBackground(new java.awt.Color(214, 217, 223));
        pTable.setLayout(new java.awt.GridBagLayout());

        jTableEmployee.setModel(new controls.MyModel(
            new Object [][] {

            },
            new String [] {
                "#", "First Name", "Last Name", "Gender", "Job", "Date of Birth", "Hired Date", "Salary", "Address", "Phone", "Email", "Username", "Role", "Active", "Photo", "id", "userId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, controls.JPictureBox.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEmployee);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 943;
        gridBagConstraints.ipady = 516;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 30, 30);
        pTable.add(jScrollPane2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTable, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
        modelEmployee=(MyModel)jTableEmployee.getModel();
   
        Employee.getEmployeeList(modelEmployee);
        
        
    }//GEN-LAST:event_formInternalFrameOpened

    int selectedRowIndex=-1;
    private void popViewImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popViewImageActionPerformed
        selectedRowIndex=jTableEmployee.getSelectedRow();
        String iconUrl=modelEmployee.getValueAt(selectedRowIndex,14)+"";
        
        frmViewImage viewImage=new frmViewImage(iconUrl);
        JDialog dialog=new JDialog(mainForm);
        
        prepareDialog(dialog, viewImage,true);
        
    }//GEN-LAST:event_popViewImageActionPerformed
    
    
    
    
    
    private void popAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popAddActionPerformed
        
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        JDialog dialog=new JDialog(mainForm);
        pEmployee employee=new pEmployee(dialog,modelEmployee);

        
        
        prepareDialog(dialog, employee,false);
        
        
    }//GEN-LAST:event_popAddActionPerformed

    
    
    
    private void popActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popActivateActionPerformed
        int active=popActivate.getText().equals("Activate")?1:0;
        selectedRowIndex=jTableEmployee.getSelectedRow();
        int id=Integer.valueOf(modelEmployee.getValueAt(selectedRowIndex, modelEmployee.getColumnCount()-1)+"");
        
        if(Employee.setActivate(id, active)){
            String st=active==1?"Yes":"No";
            
            modelEmployee.setValueAt(st, selectedRowIndex, 13);
            popActivate.setText(active!=1?"Activate":"Deactivate");
        }
        
        
    }//GEN-LAST:event_popActivateActionPerformed

    private void popDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDeleteActionPerformed
        
        selectedRowIndex=jTableEmployee.getSelectedRow();
        
        if(Employee.getCurrentEmpId()==Integer.parseInt(modelEmployee.getValueAt(selectedRowIndex,modelEmployee.getColumnCount()-2)+"")){
            JOptionPane.showMessageDialog(this, "Cannot delete this user", "",JOptionPane.ERROR_MESSAGE);
        }
        
        if(!confirmation("Are you sure you want to delete this user")) return;
        
        
        
       
        
        int id=Integer.valueOf(modelEmployee.getValueAt(selectedRowIndex, modelEmployee.getColumnCount()-2)+"");
        
        if(Employee.delete(id)){
            modelEmployee.removeRow(selectedRowIndex);
            
            
            resetAutoNumber(selectedRowIndex,modelEmployee);
            
            
            JOptionPane.showMessageDialog(this, "Delete successful", "",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
    }//GEN-LAST:event_popDeleteActionPerformed

    private void popEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditActionPerformed
        selectedRowIndex=jTableEmployee.getSelectedRow();
        JDialog dialog=new JDialog(mainForm);
        pEmployee employee=new pEmployee(dialog,modelEmployee,selectedRowIndex);

        
        
        prepareDialog(dialog, employee,false);
    }//GEN-LAST:event_popEditActionPerformed

    
    public boolean confirmation(String message){
        boolean comfirm=false;
        int n=JOptionPane.showConfirmDialog(this, message,"",JOptionPane.YES_NO_OPTION);

        comfirm=n==JOptionPane.YES_OPTION;
        
        return comfirm;
        
        
    }
    
    
    private void popDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDeleteUserActionPerformed
        if(confirmation("Are you sure you want to delete this user?")){
            
            
            selectedRowIndex=jTableEmployee.getSelectedRow();
            
            String userId=modelEmployee.getValueAt(selectedRowIndex, modelEmployee.getColumnCount()-1)+"";
            
            if(Employee.deleteUser(userId)){
                

                
                for(int i=11;i<=13;i++){
                    modelEmployee.setValueAt("", selectedRowIndex, i);
                }
                
                modelEmployee.setValueAt("", selectedRowIndex, 16);
                
                jSeparator2.setVisible(false);
                popDeleteUser.setVisible(false);
                popActivate.setVisible(false);
                
                JOptionPane.showMessageDialog(this, "User deleted", "",JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            
        }
    }//GEN-LAST:event_popDeleteUserActionPerformed
    
    MyModel modelEmployee;
    

    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private controls.SubJTable jTableEmployee;
    private javax.swing.JPanel pTable;
    private javax.swing.JMenuItem popActivate;
    private javax.swing.JMenuItem popAdd;
    private javax.swing.JMenuItem popDelete;
    private javax.swing.JMenuItem popDeleteUser;
    private javax.swing.JMenuItem popEdit;
    private javax.swing.JMenuItem popViewImage;
    // End of variables declaration//GEN-END:variables
}
