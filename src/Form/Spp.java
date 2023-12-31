/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Lib.dbspp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAB 1-6
 */
public class Spp extends javax.swing.JInternalFrame {

    /**
     * Creates new form Spp
     */
    public Spp() {
        initComponents();
        reftable()                   ;
    }
    private void reftable(){
        DefaultTableModel md = (DefaultTableModel) dataspp.getModel();
        
        md.getDataVector().removeAllElements();
        
        String sql = "select * from spp";
        
        dbspp mdb = new dbspp();
        ResultSet rs = mdb.ambilData(sql);
        
        try {
            while(rs.next()){
                Vector row = new Vector();
                row.add(rs.getInt("id_spp"));
                row.add(rs.getInt("tahun"));
                row.add(rs.getInt("nominal"));
                md.addRow(row);
            }
        } catch (SQLException e) {
            Logger.getLogger(Spp.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    public void kosong(){
        tahuntxt.setText("");
        nomtxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tahuntxt = new javax.swing.JTextField();
        nomtxt = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataspp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notif = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SPP Interface");

        nomtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomtxtActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
        });

        btnhapus.setText("Delete");
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });

        dataspp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Spp", "Tahun", "Nominal"
            }
        ));
        dataspp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datasppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataspp);
        if (dataspp.getColumnModel().getColumnCount() > 0) {
            dataspp.getColumnModel().getColumn(0).setResizable(false);
            dataspp.getColumnModel().getColumn(1).setResizable(false);
            dataspp.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Nominal");

        jLabel3.setText("Tahun");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Data SPP");

        notif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221)
                        .addComponent(notif))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tahuntxt)
                                .addComponent(nomtxt)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notif))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tahuntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomtxtActionPerformed

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        // TODO add your handling code here:
        String thn = tahuntxt.getText();
        String nom = nomtxt.getText();
        String sql = "insert into spp(tahun,nominal)values('"+thn+"','"+nom+"')";
        
        dbspp mdb = new dbspp();
        if(mdb.ubahData(sql)){
            notif.setText("Data Tersimpan");
            reftable();
        }else{
            notif.setText("Gagal Tersimpan");
        }
        kosong();
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void datasppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasppMouseClicked
        // TODO add your handling code here:
        int nobaris = dataspp.getSelectedRow();
        tahuntxt.setText(dataspp.getValueAt(nobaris,1).toString());
        nomtxt.setText(dataspp.getValueAt(nobaris,2).toString());
    }//GEN-LAST:event_datasppMouseClicked

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
        int nobaris = dataspp.getSelectedRow();
        String kode = dataspp.getValueAt(nobaris, 0).toString();
        String thn = tahuntxt.getText();
        String nom = nomtxt.getText();
        String sql = "update spp set tahun='"+thn+"',nominal='"+nom+"' where id_spp='"+kode;
        
         dbspp mdb = new dbspp();
        if(mdb.ubahData(sql)){
            notif.setText("Data Tersimpan");
            reftable();
        }else{
            notif.setText("Gagal Tersimpan");
        }
        kosong();
    }//GEN-LAST:event_btnupdateMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
        int nobaris = dataspp.getSelectedRow();
        String kode = dataspp.getValueAt(nobaris, 0).toString();
        String sql = "delete from spp where id_spp="+kode;
        
        dbspp mdb = new dbspp();
        if(mdb.ubahData(sql)){
            notif.setText("Data Eliminasi");
            reftable();
        }else{
            notif.setText("Gagal TerEliminasi");
        }
        kosong();
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnbatalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTable dataspp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JLabel notif;
    private javax.swing.JTextField tahuntxt;
    // End of variables declaration//GEN-END:variables
}
