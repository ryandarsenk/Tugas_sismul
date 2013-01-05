/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import sismul.Frame.Form;

/**
 *
 * @author wildan
 */
public class pilihfile implements ActionListener {
    private Form form;
    private JFileChooser pilih;
    
    public pilihfile(Form form){
    this.form=form;
    
    pilih=new JFileChooser();
    pilih.setMultiSelectionEnabled(true);
    pilih.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(pilih.showOpenDialog(form)== JFileChooser.APPROVE_OPTION){
            File[] files=pilih.getSelectedFiles();
    
        for(File file : files){
            DefaultListModel model= form.getListModel();
            model.addElement(file);
    
            }
       }    
   }
}
