/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author Nemesis
 */
public class frmChangePassword extends controls.MyInternalFrame {

    /**
     * Creates new form frmChangePassword
     */
    public frmChangePassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFname6 = new javax.swing.JPanel();
        jPictureBox8 = new controls.JPictureBox();
        jSeparator9 = new javax.swing.JSeparator();
        txtNew = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        pFname7 = new javax.swing.JPanel();
        jPictureBox9 = new controls.JPictureBox();
        jSeparator10 = new javax.swing.JSeparator();
        txtOld = new javax.swing.JPasswordField();
        pFname8 = new javax.swing.JPanel();
        jPictureBox10 = new controls.JPictureBox();
        jSeparator11 = new javax.swing.JSeparator();
        txtConfirm = new javax.swing.JPasswordField();
        btnConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        pFname6.setBackground(new java.awt.Color(255, 255, 255));
        pFname6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 186, 190)));

        jPictureBox8.setBackground(new java.awt.Color(255, 255, 255));
        jPictureBox8.setBorder(null);
        jPictureBox8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icon/key.png"))); // NOI18N
        jPictureBox8.setImageMode(controls.JPictureBox.mode.Center);
        jPictureBox8.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPictureBox8Layout = new javax.swing.GroupLayout(jPictureBox8);
        jPictureBox8.setLayout(jPictureBox8Layout);
        jPictureBox8Layout.setHorizontalGroup(
            jPictureBox8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPictureBox8Layout.setVerticalGroup(
            jPictureBox8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jSeparator9.setBackground(new java.awt.Color(176, 186, 190));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtNew.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout pFname6Layout = new javax.swing.GroupLayout(pFname6);
        pFname6.setLayout(pFname6Layout);
        pFname6Layout.setHorizontalGroup(
            pFname6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPictureBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pFname6Layout.setVerticalGroup(
            pFname6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPictureBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        txtNew.getAccessibleContext().setAccessibleName("");
        txtNew.getAccessibleContext().setAccessibleDescription("");

        pFname7.setBackground(new java.awt.Color(255, 255, 255));
        pFname7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(176, 186, 190)));

        jPictureBox9.setBackground(new java.awt.Color(255, 255, 255));
        jPictureBox9.setBorder(null);
        jPictureBox9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icon/lock.png"))); // NOI18N
        jPictureBox9.setImageMode(controls.JPictureBox.mode.Center);
        jPictureBox9.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPictureBox9Layout = new javax.swing.GroupLayout(jPictureBox9);
        jPictureBox9.setLayout(jPictureBox9Layout);
        jPictureBox9Layout.setHorizontalGroup(
            jPictureBox9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPictureBox9Layout.setVerticalGroup(
            jPictureBox9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jSeparator10.setBackground(new java.awt.Color(176, 186, 190));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtOld.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFname7Layout = new javax.swing.GroupLayout(pFname7);
        pFname7.setLayout(pFname7Layout);
        pFname7Layout.setHorizontalGroup(
            pFname7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPictureBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pFname7Layout.setVerticalGroup(
            pFname7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPictureBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pFname8.setBackground(new java.awt.Color(255, 255, 255));
        pFname8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(187, 187, 187)));

        jPictureBox10.setBackground(new java.awt.Color(255, 255, 255));
        jPictureBox10.setBorder(null);
        jPictureBox10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icon/key.png"))); // NOI18N
        jPictureBox10.setImageMode(controls.JPictureBox.mode.Center);
        jPictureBox10.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPictureBox10Layout = new javax.swing.GroupLayout(jPictureBox10);
        jPictureBox10.setLayout(jPictureBox10Layout);
        jPictureBox10Layout.setHorizontalGroup(
            jPictureBox10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPictureBox10Layout.setVerticalGroup(
            jPictureBox10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jSeparator11.setBackground(new java.awt.Color(176, 186, 190));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtConfirm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout pFname8Layout = new javax.swing.GroupLayout(pFname8);
        pFname8.setLayout(pFname8Layout);
        pFname8Layout.setHorizontalGroup(
            pFname8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPictureBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pFname8Layout.setVerticalGroup(
            pFname8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator11)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPictureBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFname8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        btnConfirm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Change Password");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Old Password:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("New Password:");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pFname8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pFname6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pFname7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addComponent(jSeparator1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(pFname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(pFname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(pFname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String concatChar(char[] ch){
        String st="";
        
        for(char c : ch){
            st+=c;
        }
        return st;
    }
    
    
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String old=concatChar(txtOld.getPassword()); 
        String newPass=concatChar(txtNew.getPassword()); 
        String confirm=concatChar(txtConfirm.getPassword()); 
        
        String sql="select password from user where empId="+Employee.getCurrentEmpId()+"";
        
        String pass=dataCon.one_cell_value(sql)+"";
        
        if(old.equals(pass)){
            if(newPass.equals(confirm)){
                
                if(Employee.updatePassword(newPass)){
                    JOptionPane.showMessageDialog(this,"Password Changed","",JOptionPane.INFORMATION_MESSAGE);
                }
                
                
            }else{
                JOptionPane.showMessageDialog(this,"Password does not match", "",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Wrong old password", "",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private controls.JPictureBox jPictureBox10;
    private controls.JPictureBox jPictureBox8;
    private controls.JPictureBox jPictureBox9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel pFname6;
    private javax.swing.JPanel pFname7;
    private javax.swing.JPanel pFname8;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtNew;
    private javax.swing.JPasswordField txtOld;
    // End of variables declaration//GEN-END:variables
}
