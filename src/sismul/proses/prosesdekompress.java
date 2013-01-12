/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
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
	 if(de.Outputkeluaran()==null){
         showMessage("Isikan Nama Folder");
         }
         if (de.dapatkanfile() == null) {
	    showMessage("File kosong");
	} else {    
  byte[] buffer = new byte[1024];
 
  INPUT_ZIP_FILE=de.dapatkanfile().getText();
  OUTPUT_FOLDER=de.Outputkeluaran().getText();
     try{
 
    	//create output directory is not exists
    	File folder = new File(OUTPUT_FOLDER);
    	if(!folder.exists()){
    		folder.mkdir();
    	}
 
    	//get the zip file content
    	ZipInputStream zis = 
    		new ZipInputStream(new FileInputStream(INPUT_ZIP_FILE));
    	//get the zipped file list entry
    	ZipEntry ze = zis.getNextEntry();
  System.out.println(ze);
        
    	while(ze!=null){
 
    	   String fileName = ze.getName();
           File newFile = new File(OUTPUT_FOLDER + File.separator + fileName);
 
           System.out.println("file unzip : "+ newFile.getAbsoluteFile());
 
            //create all non exists folders
            //else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();
 
            FileOutputStream fos = new FileOutputStream(newFile);             
 
            int len;
            while ((len = zis.read(buffer)) > 0) {
       		fos.write(buffer, 0, len);
            }
 
            fos.close();   
            ze = zis.getNextEntry();
    	}
 
        zis.closeEntry();
    	zis.close();
 
    	System.out.println("Done");
 
    }catch(IOException ex){
       ex.printStackTrace(); 
    }
  
}
        
    }
     public void showMessage(String message) {
	JOptionPane.showMessageDialog(de, message);
     }
}

