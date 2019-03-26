/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import controls.MyModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nemesis
 */
public class pLeague extends javax.swing.JPanel {

    /**
     * Creates new form pLeague
     */
    
    
    
    
    int selectedRowIndex=-1;
    public pLeague(JDialog dialog, MyModel modelLeague,int selectedRowIndex) {
        initComponents();
        prepareForm();
        
        this.modelLeague=modelLeague;
        
        this.selectedRowIndex=selectedRowIndex;
        
        String league=modelLeague.getValueAt(selectedRowIndex, 1)+"";
        String imageUrl=modelLeague.getValueAt(selectedRowIndex,2)+"";
        
        
        txtLeague.setOriginValueAndSetTxt(league);
        
        File f=new File(imageUrl);
        if(f.exists()){
            ImageIcon icon=new ImageIcon(f.getAbsolutePath());
            pbImage.setIcon(icon);
        }
        
    }
    
    
    void prepareForm(){
        
        
        MouseAdapter mouse=new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()){
                    popUpImage.show(pbImage,e.getX(),e.getY());
                }
            }
        };
        
        pbImage.addMouseListener(mouse);
    }

    public pLeague(JDialog dialog, MyModel modelLeague) {
        initComponents();
        
        this.dialog=dialog;
        this.modelLeague=modelLeague;
        
        
        originImagePath=pbImage.getIconAbsolutePath();
    
        prepareForm();
    }

    
    JDialog dialog;
    MyModel modelLeague;
    
    String originImagePath;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpImage = new javax.swing.JPopupMenu();
        popBrowse = new javax.swing.JMenuItem();
        popRemove = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pFname = new javax.swing.JPanel();
        txtLeague = new controls.WaterMarkedTextField("");
        jPictureBox1 = new controls.JPictureBox();
        jSeparator2 = new javax.swing.JSeparator();
        pbImage = new controls.JPictureBox();
        btnConfirm = new javax.swing.JButton();

        popBrowse.setText("Browse");
        popBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBrowseActionPerformed(evt);
            }
        });
        popUpImage.add(popBrowse);

        popRemove.setText("Remove");
        popRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popRemoveActionPerformed(evt);
            }
        });
        popUpImage.add(popRemove);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("League Infomation");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("League:");

        pFname.setBackground(new java.awt.Color(255, 255, 255));
        pFname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(176, 186, 190)));

        txtLeague.setBackground(new java.awt.Color(255, 255, 255));
        txtLeague.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtLeague.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLeague.setPreferredSize(new java.awt.Dimension(0, 52));
        txtLeague.setWatermarkedText("League");

        jPictureBox1.setBackground(new java.awt.Color(255, 255, 255));
        jPictureBox1.setBorder(null);
        jPictureBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icon/football.png"))); // NOI18N
        jPictureBox1.setImageMode(controls.JPictureBox.mode.Center);
        jPictureBox1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPictureBox1Layout = new javax.swing.GroupLayout(jPictureBox1);
        jPictureBox1.setLayout(jPictureBox1Layout);
        jPictureBox1Layout.setHorizontalGroup(
            jPictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPictureBox1Layout.setVerticalGroup(
            jPictureBox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jSeparator2.setBackground(new java.awt.Color(176, 186, 190));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout pFnameLayout = new javax.swing.GroupLayout(pFname);
        pFname.setLayout(pFnameLayout);
        pFnameLayout.setHorizontalGroup(
            pFnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFnameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pFnameLayout.setVerticalGroup(
            pFnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFnameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pFnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLeague, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPictureBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icon/football-big.png"))); // NOI18N
        pbImage.setImageMode(controls.JPictureBox.mode.Zoom);

        javax.swing.GroupLayout pbImageLayout = new javax.swing.GroupLayout(pbImage);
        pbImage.setLayout(pbImageLayout);
        pbImageLayout.setHorizontalGroup(
            pbImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
        pbImageLayout.setVerticalGroup(
            pbImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        btnConfirm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pFname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)
                            .addComponent(pbImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm))
                    .addComponent(pbImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String league=txtLeague.getThisText();
        String imageUrl=pbImage.getIconAbsolutePath();
        
        
        if(selectedRowIndex==-1){
            if(League.add(league,imageUrl)){
            
                modelLeague.addRow(modelLeague.getRowCount()+1,league,imageUrl,League.getLastInsertId());
                JOptionPane.showMessageDialog(this, "Added successful", "",JOptionPane.INFORMATION_MESSAGE);
            
            }
        }else{
            
            
            System.out.println(modelLeague.getValueAt(selectedRowIndex, modelLeague.getColumnCount()-1)+"");
            
            int leagueId=Integer.parseInt(modelLeague.getValueAt(selectedRowIndex, modelLeague.getColumnCount()-1)+"");
            
            if(League.update(leagueId, league,imageUrl)){
                
                function.updateModel(selectedRowIndex, modelLeague, league,imageUrl);
                JOptionPane.showMessageDialog(this, "Updated successful", "",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    
    
    
    FileFilter imageFilter = new FileNameExtensionFilter(
    "Image files", ImageIO.getReaderFileSuffixes());
    
    
    private void popBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBrowseActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setFileFilter(imageFilter);
        
        if(fc.showDialog(this, "Open")== JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();
            
            ImageIcon imageIcon=new ImageIcon(f.getAbsolutePath());
            pbImage.setIcon(imageIcon);
            
            
        }
    }//GEN-LAST:event_popBrowseActionPerformed

    
    
    private void popRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popRemoveActionPerformed
        ImageIcon imageIcon=new ImageIcon(originImagePath);
        pbImage.setIcon(imageIcon);
    }//GEN-LAST:event_popRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private controls.JPictureBox jPictureBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pFname;
    private controls.JPictureBox pbImage;
    private javax.swing.JMenuItem popBrowse;
    private javax.swing.JMenuItem popRemove;
    private javax.swing.JPopupMenu popUpImage;
    private controls.WaterMarkedTextField txtLeague;
    // End of variables declaration//GEN-END:variables
}
