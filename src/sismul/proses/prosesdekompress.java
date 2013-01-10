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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
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
    public String INPUT_ZIP_FILE ;
    public String OUTPUT_FOLDER;
    
    public prosesdekompress(Dekompress de){
    this.de=de;
    
    }
     @Override
    public void actionPerformed(ActionEvent e) {
if (de.buatdapatkanfile()== null) {
	    showMessage("'Save File To' is Empty");
	} else if (de.getListModel().getSize() == 0) {
	    showMessage("Files is Empty");
	} else {
	    ZipOutputStream zipOutputStream = null;
	    FileOutputStream fileOutputStream = null;
	    try {
		fileOutputStream = new FileOutputStream(de.buatdapatkanfile());
		zipOutputStream = new ZipOutputStream(fileOutputStream);

		byte[] buffer = new byte[2048];

		Enumeration<File> enumeration = (Enumeration<File>) de.getListModel().elements();
		while (enumeration.hasMoreElements()) {

		    File file = enumeration.nextElement();
		    FileInputStream stream = null;

		    try {

			stream = new FileInputStream(file);
			ZipEntry entry = new ZipEntry(file.getName());
			  BufferedInputStream bis = new BufferedInputStream(stream);

			for (int i = stream.read(buffer); i != -1; i = stream.read(buffer)) {
			    zipOutputStream.write(buffer, 0, i);
			}

			zipOutputStream.closeEntry();

		    } catch (IOException exception) {
		    } finally {
			if (stream != null) {
			    stream.close();
			}
		    }
		}

	    } catch (IOException exception) {
	    } finally {
		if (zipOutputStream != null) {
		    try {
			zipOutputStream.close();
		    } catch (IOException ex) {
		    }
		}
		resetData();
	    }
	}
    }

    public void showMessage(String message) {
	JOptionPane.showMessageDialog(de, message);
    }

    private void resetData() {
	de.setFileSaveTo(null);
	de.getListModel().removeAllElements();
    }
  
	   
}

