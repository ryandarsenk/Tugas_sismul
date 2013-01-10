/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import sismul.Frame.Dekompress;

/**
 *
 * @author wildan
 */
public class simpanfiledekompresi implements ActionListener {
        private Dekompress de;
    private JFileChooser pilih;
    
    public simpanfiledekompresi(Dekompress de){
       this.de=de;
    
        pilih=new JFileChooser();
        pilih.setMultiSelectionEnabled(true);
        pilih.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(pilih.showOpenDialog(de)==JFileChooser.APPROVE_OPTION){
            File file=pilih.getSelectedFile();
            if (!pilih.getSelectedFile().getName().toLowerCase().endsWith(".zip")) {
		file = new File(file.getParent());
	    }
	    de.setFileSaveTo(file);
        
        
        }
    
    }
}
