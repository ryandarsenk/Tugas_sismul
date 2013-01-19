/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Dekompress.java
 *
 * Created on 03 Jan 13, 12:19:15
 */
package sismul.Frame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.List;
import sismul.proses.pilihdekompress;
import sismul.proses.prosesdekompress;
import sismul.proses.simpanfiledekompresi;

/**
 *
 * @author Cumi
 */
public class Dekompress extends javax.swing.JFrame {

 List<String> fileList;
  
    private File simpanfileya;
    private DefaultListModel list;
    public int b;

    /** Creates new form Dekompress */
    public Dekompress() {
        initComponents();
   

        
        list = new DefaultListModel();
     
        NamaFolder.addActionListener(new simpanfiledekompresi(this));
        btnmasukandata.addActionListener(new pilihdekompress(this));   
      btndekompress.addActionListener(new prosesdekompress(this));
    
    
    }
          public void close_Jframe(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    
    }
    public JButton simpanfile(){
    
    return NamaFolder;
    }
    
    
    public void setFileSaveTo(File file) {
       this.simpanfileya = file;
	if (file == null) {
	    txtdata.setText("eweuhan");
	} else {
	    txtdata.setText(simpanfileya.getPath());
	}
        
    }
    
       public void outputnya(File file) {
       this.simpanfileya = file;
	if (file == null) {
	    txtout.setText("eweuhan");
	} else {
	    txtout.setText(simpanfileya.getPath());
	}
    }
    
        public File buatdapatkanfile() {
       return simpanfileya;
    }
     public DefaultListModel getListModel() {
       return list;
    }
     public JButton Dekompress(){
     return btndekompress;
     }

       public JButton masukandata(){
    return btnmasukandata;
    
    }
 
       public JTextField dapatkanfile() {
        return txtdata;
    }
     
       public JTextField Outputkeluaran() {
        return txtout;
    }

  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnmasukandata = new javax.swing.JButton();
        btndekompress = new javax.swing.JButton();
        btnkembali1 = new javax.swing.JButton();
        txtdata = new javax.swing.JTextField();
        NamaFolder = new javax.swing.JButton();
        txtout = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnmasukandata.setText("Pilih File");
        btnmasukandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukandataActionPerformed(evt);
            }
        });

        btndekompress.setText("DEKOMPRESS");
        btndekompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndekompressActionPerformed(evt);
            }
        });

        btnkembali1.setText("Kembali");
        btnkembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembali1ActionPerformed(evt);
            }
        });

        NamaFolder.setText("Nama Folder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnkembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndekompress, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaFolder)
                            .addComponent(btnmasukandata, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtout))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NamaFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmasukandata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnkembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndekompress, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmasukandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukandataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmasukandataActionPerformed

    private void btndekompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndekompressActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btndekompressActionPerformed

    private void btnkembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembali1ActionPerformed
        // TODO add your handling code here:
        new menuutama().setVisible(true);
        close_Jframe();
    }//GEN-LAST:event_btnkembali1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NamaFolder;
    private javax.swing.JButton btndekompress;
    private javax.swing.JButton btnkembali1;
    private javax.swing.JButton btnmasukandata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtout;
    // End of variables declaration//GEN-END:variables

 

   
    }



