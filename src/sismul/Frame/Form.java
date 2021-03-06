/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Form.java
 *
 * Created on Jan 2, 2013, 9:59:07 PM
 */
package sismul.Frame;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import sismul.proses.simpanfile;
import sismul.proses.pilihfile;
import sismul.proses.hapusfile;
import sismul.proses.kompress;
import sismul.Frame.menuutama;

/**
 *
 * @author wildan
 */
public class Form extends javax.swing.JFrame {

    
    private File simpanfileya;
    private DefaultListModel list;

    /** Creates new form Form */
    public Form() {
        initComponents();
        list = new DefaultListModel();
        Listfile.setModel(list);
        
        btnSimpan.addActionListener(new simpanfile(this));
        btnmasukandata.addActionListener(new pilihfile(this));
        btnhapusfile.addActionListener(new hapusfile(this) );
        btnkompress.addActionListener(new kompress(this) );
        //        btnkompress.addActionListener(new ProsesKompress(this));
        // btnhapusfile.addActionListener(new Prosehapus(this));
    }
    
        public void close_Jframe(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    
    }
       public File buatdapatkanfile() {
       return simpanfileya;
    }
    
    public DefaultListModel getListModel() {
        return list;
    }

    public JList dapatkanfilelist() {
        return Listfile;
    }
    public void setFileSaveTo(File file) {
       this.simpanfileya = file;
	if (file == null) {
	    txtsimpanfile.setText("");
	} else {
	    txtsimpanfile.setText(simpanfileya.getPath());
	}
        
    }
    
    public JButton getSimpan(){
    return btnSimpan;
    
    }
    public JButton masukandata(){
    return btnmasukandata;
    
    }
    public JButton getkompress(){
    
    return btnkompress;
    }
    
    public JTextField textsimpanfile(){
    return txtsimpanfile;
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimpan = new javax.swing.JButton();
        txtsimpanfile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listfile = new javax.swing.JList();
        btnmasukandata = new javax.swing.JButton();
        btnhapusfile = new javax.swing.JButton();
        btnkompress = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSimpan.setText("Simpan File");

        txtsimpanfile.setEditable(false);

        jScrollPane1.setViewportView(Listfile);

        btnmasukandata.setText("Pilih Data");

        btnhapusfile.setText("Hapus File");

        btnkompress.setText("Kompress");

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                        .addComponent(btnkompress, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmasukandata)
                            .addComponent(btnhapusfile)
                            .addComponent(btnSimpan))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(txtsimpanfile, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmasukandata)
                        .addGap(21, 21, 21)
                        .addComponent(btnhapusfile)
                        .addGap(182, 182, 182))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsimpanfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkompress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        new menuutama().setVisible(true);
        close_Jframe();
    }//GEN-LAST:event_kembaliActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Listfile;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnhapusfile;
    private javax.swing.JButton btnkompress;
    private javax.swing.JButton btnmasukandata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField txtsimpanfile;
    // End of variables declaration//GEN-END:variables

 


  

 

}
