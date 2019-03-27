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
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import static project.function.prepareDialog;
import static project.function.resetAutoNumber;

/**
 *
 * @author Nemesis
 */
public class frmLeagueList extends MyInternalFrame {

    /**
     * Creates new form frmClubList
     */
    public frmLeagueList(frmEmployeeList employeeList) {
        initComponents();
        
        MouseAdapter mouse=new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton()==MouseEvent.BUTTON3){
                    jPopupMenu1.show(jTableLeague, e.getX(), e.getY());
                }
            }
            
        };
        
        jTableLeague.addMouseListener(mouse);
        
        
        mouse=new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton()==MouseEvent.BUTTON3){
                    jPopupMenu1.show(jScrollPane1, e.getX(), e.getY());
                    
                }
            }
            
        };
        
        jScrollPane1.addMouseListener(mouse);
        
        
        
        
        jTableLeague.setDefaultRenderer(JPictureBox.class, new controls.PictureBoxRenderer());
        
        
        
        
        TableColumnModel tcm = jTableLeague.getColumnModel();
        tcm.removeColumn(tcm.getColumn(tcm.getColumnCount()-1));
        
        tcm.getColumn(0).setPreferredWidth(10);
        tcm.getColumn(1).setPreferredWidth(500);
        
        
        JTableHeader header = jTableLeague.getTableHeader();
        header.setPreferredSize(new Dimension(100, 30));
        
        Font f=new Font("Roboto",Font.PLAIN ,13);
        
        header.setFont(f);
        
        jTableLeague.setRowHeight(40);
        
        
        
        jTableLeague.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
        modelLeague=(MyModel)jTableLeague.getModel();
        
        League.getLeagueList(modelLeague);
        this.employeeList=employeeList;
        
        setVisiblePopUp(false);
        
        jTableLeague.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            boolean isVisibled=jTableLeague.getSelectedRowCount()==1;
            
            
            
            
            
            setVisiblePopUp(isVisibled);
            
            
            
        });
        
        
    }

    
    frmEmployeeList employeeList;
    MyModel modelLeague;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popAdd = new javax.swing.JMenuItem();
        popEdit = new javax.swing.JMenuItem();
        popDelete = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        popViewImage = new javax.swing.JMenuItem();
        pHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLeague = new controls.SubJTable();

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
        jPopupMenu1.add(jSeparator1);

        popViewImage.setText("View Logo");
        popViewImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popViewImageActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popViewImage);

        pHead.setBackground(new java.awt.Color(34, 45, 49));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("League List");

        javax.swing.GroupLayout pHeadLayout = new javax.swing.GroupLayout(pHead);
        pHead.setLayout(pHeadLayout);
        pHeadLayout.setHorizontalGroup(
            pHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeadLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        pHeadLayout.setVerticalGroup(
            pHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTableLeague.setModel(new MyModel(
            new Object [][] {

            },
            new String [] {
                "#", "League", "Logo", "leagueId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, controls.JPictureBox.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLeague);

        javax.swing.GroupLayout pTableLayout = new javax.swing.GroupLayout(pTable);
        pTable.setLayout(pTableLayout);
        pTableLayout.setHorizontalGroup(
            pTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTableLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addGap(35, 35, 35))
        );
        pTableLayout.setVerticalGroup(
            pTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTableLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int selectedRowIndex;
    private void popAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popAddActionPerformed
        JDialog dialog=new JDialog();
        pLeague league=new pLeague(dialog,modelLeague);

        
        
        prepareDialog(dialog, league,false);
    }//GEN-LAST:event_popAddActionPerformed

    private void popViewImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popViewImageActionPerformed
        selectedRowIndex=jTableLeague.getSelectedRow();
        String iconUrl=modelLeague.getValueAt(selectedRowIndex,2)+"";
        
        frmViewImage viewImage=new frmViewImage(iconUrl);
        JDialog dialog=new JDialog();
        
        prepareDialog(dialog, viewImage,true);
    }//GEN-LAST:event_popViewImageActionPerformed

    void setVisiblePopUp(boolean isVisibled){
        popEdit.setVisible(isVisibled);
        popDelete.setVisible(isVisibled);
        popViewImage.setVisible(isVisibled);
        jSeparator1.setVisible(isVisibled);
    }
    
    private void popDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDeleteActionPerformed
        selectedRowIndex=jTableLeague.getSelectedRow();
        
        int leagueId=Integer.parseInt(modelLeague.getValueAt(selectedRowIndex, modelLeague.getColumnCount()-1)+"");
        
        if(League.delete(leagueId)){
            
            modelLeague.removeRow(selectedRowIndex);
            resetAutoNumber(selectedRowIndex,modelLeague);
            JOptionPane.showMessageDialog(null,"Delete Successful","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_popDeleteActionPerformed

    private void popEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEditActionPerformed
        selectedRowIndex=jTableLeague.getSelectedRow();
        JDialog dialog=new JDialog();
        pLeague league=new pLeague(dialog,modelLeague,selectedRowIndex);

        
        
        prepareDialog(dialog, league,false);
    }//GEN-LAST:event_popEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private controls.SubJTable jTableLeague;
    private javax.swing.JPanel pHead;
    private javax.swing.JPanel pTable;
    private javax.swing.JMenuItem popAdd;
    private javax.swing.JMenuItem popDelete;
    private javax.swing.JMenuItem popEdit;
    private javax.swing.JMenuItem popViewImage;
    // End of variables declaration//GEN-END:variables
}