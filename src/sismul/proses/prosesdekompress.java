/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JOptionPane;
import sismul.Frame.Dekompress;

/**
 *
 * @author wildan
 */
public class prosesdekompress implements ActionListener{
    private Dekompress de;
    List<String> fileList;
    public String INPUT_ZIP_FILE;
    public String OUTPUT_FOLDER;
    
    public prosesdekompress(Dekompress de){
    this.de=de;
    
    }
     @Override
    public void actionPerformed(ActionEvent e) {
	Dekompress unZip = new Dekompress();
    	unZip.unZipIt(INPUT_ZIP_FILE,OUTPUT_FOLDER);
	   
}
}
