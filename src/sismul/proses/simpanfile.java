/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import sismul.Frame.Form;

/**
 *
 * @author wildan
 */
public class simpanfile implements ActionListener {
    private Form form;
    private JFileChooser pilih;
    
    public simpanfile(Form form){
       this.form=form;
    
        pilih=new JFileChooser();
        pilih.setMultiSelectionEnabled(true);
        pilih.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(pilih.showSaveDialog(form)==JFileChooser.APPROVE_OPTION){
            File file=pilih.getSelectedFile();
            if (!pilih.getSelectedFile().getName().toLowerCase().endsWith(".zip")) {
		file = new File(file.getPath() + ".zip");
	    }
	    form.setFileSaveTo(file);
        
        
        }
    
    }
    
}
