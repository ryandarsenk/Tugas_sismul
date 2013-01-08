/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    
    public pilihdekompress(Dekompress de){
     this.de=de;
   
    pilih=new JFileChooser();
   
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(pilih.showOpenDialog(de)== JFileChooser.APPROVE_OPTION){
        File file=pilih.getCurrentDirectory();
         
                file = new File(file.toURI());
           
	    
	   de.setFileSaveTo(file);
      
    	}
	    }
    
            }
        
   


