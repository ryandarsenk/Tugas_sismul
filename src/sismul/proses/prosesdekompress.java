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

import java.util.List;

import java.util.zip.ZipEntry;
<<<<<<< HEAD
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
=======

import java.util.zip.ZipInputStream;

>>>>>>> 38f88c38fd24c973b8aa665bf148092d109e60cc
import javax.swing.JOptionPane;
import sismul.Frame.Dekompress;

/**
 *
 * @author wildan
 */
public class prosesdekompress implements ActionListener{
    private Dekompress de;
    List<String> fileList;
<<<<<<< HEAD
    public String INPUT_ZIP_FILE="D:\\aa.zip";
    public String OUTPUT_FOLDER="D:\\out" ;
=======
public String INPUT_ZIP_FILE;
   public String OUTPUT_FOLDER;

>>>>>>> 38f88c38fd24c973b8aa665bf148092d109e60cc
    
    public prosesdekompress(Dekompress de){
    this.de=de;
   
    }
     @Override
    public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
	

     try{

=======
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
 
>>>>>>> 38f88c38fd24c973b8aa665bf148092d109e60cc
    	//create output directory is not exists
    	File folder = new File(OUTPUT_FOLDER);
    	if(!folder.exists()){
    		folder.mkdir();
    	}
<<<<<<< HEAD

    	//get the zip file content
    	ZipInputStream zis =

    		new ZipInputStream(new FileInputStream(de.buatdapatkanfile()));
    	//get the zipped file list entry
    byte[] buffer = new byte[1024];
        ZipEntry ze = zis.getNextEntry();

    	while(ze!=null){

    	   String fileName = ze.getName();
           File newFile = new File(OUTPUT_FOLDER + File.separator + fileName);

           System.out.println("file unzip : "+ newFile.getAbsoluteFile());

            //create all non exists folders
            //else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();

            FileOutputStream fos = new FileOutputStream(newFile);

=======
 
    	//get the zip file content
    	ZipInputStream zis = 
    		new ZipInputStream(new FileInputStream(INPUT_ZIP_FILE));
    	//get the zipped file list entry
    	ZipEntry ze = zis.getNextEntry();
  System.out.println(ze);
        
    	while(ze!=null){
 
    	   String fileName = ze.getName();
           File newFile = new File(OUTPUT_FOLDER + File.separator + fileName);
      
          
 
            //create all non exists folders
            //else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();
 
            FileOutputStream fos = new FileOutputStream(newFile);             
 
>>>>>>> 38f88c38fd24c973b8aa665bf148092d109e60cc
            int len;
            while ((len = zis.read(buffer)) > 0) {
       		fos.write(buffer, 0, len);
            }
<<<<<<< HEAD

            fos.close();
            ze = zis.getNextEntry();
    	}

        zis.closeEntry();
    	zis.close();

    	System.out.println("Done");

    }catch(IOException ex){
       ex.printStackTrace();
    }

	   
=======
 
            fos.close();   
            ze = zis.getNextEntry();
    	}
 
        zis.closeEntry();
    	zis.close();
 
    	JOptionPane.showMessageDialog(de, "Dekompress File Berhasil");
 
    }catch(IOException ex){
       ex.printStackTrace(); 
    }
  
>>>>>>> 38f88c38fd24c973b8aa665bf148092d109e60cc
}
        reset();
    }
     public void reset(){
     de.dapatkanfile().setText("");     
      de.Outputkeluaran().setText("");    
     }
     
     public void showMessage(String message) {
	JOptionPane.showMessageDialog(de, message);
     }
}

