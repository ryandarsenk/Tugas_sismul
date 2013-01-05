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
import sismul.Frame.Dekompress;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Cumi
 */
public class pilihdekompress  implements ActionListener {
    private Dekompress de;
    private JFileChooser pilih;
      private static final String INPUT_ZIP_FILE = "C:\\ewe\\ewe.";
    private static final String OUTPUT_FOLDER = "C:\\ewe";
    
    public pilihdekompress(Dekompress de){
     this.de=de;
   
    pilih=new JFileChooser();
    pilih.setMultiSelectionEnabled(true);
    pilih.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(pilih.showOpenDialog(de)== JFileChooser.APPROVE_OPTION){
        File file=pilih.getSelectedFile();
            if (!pilih.getSelectedFile().getName().toLowerCase().endsWith(".zip")) {
		 file = new File(file.getPath() + ".zip");
	    }
	   de.setFileSaveTo(file);
      
    	}
	    }
    
            }
        
   


