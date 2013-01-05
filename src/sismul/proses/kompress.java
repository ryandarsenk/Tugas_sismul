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
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JOptionPane;
import sismul.Frame.Form;
/**
 *
 * @author wildan
 */
public class kompress implements ActionListener {
     private Form form;

    public kompress(Form form) {
	this.form = form;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (form.buatdapatkanfile()== null) {
	    showMessage("'Save File To' is Empty");
	} else if (form.getListModel().getSize() == 0) {
	    showMessage("Files is Empty");
	} else {
	    ZipOutputStream zipOutputStream = null;
	    FileOutputStream fileOutputStream = null;
	    try {
		fileOutputStream = new FileOutputStream(form.buatdapatkanfile());
		zipOutputStream = new ZipOutputStream(fileOutputStream);

		byte[] buffer = new byte[1024];

		Enumeration<File> enumeration = (Enumeration<File>) form.getListModel().elements();
		while (enumeration.hasMoreElements()) {

		    File file = enumeration.nextElement();
		    FileInputStream stream = null;

		    try {

			stream = new FileInputStream(file);
			ZipEntry entry = new ZipEntry(file.getName());
			zipOutputStream.putNextEntry(entry);

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
	JOptionPane.showMessageDialog(form, message);
    }

    private void resetData() {
	form.setFileSaveTo(null);
	form.getListModel().removeAllElements();
    }
}

