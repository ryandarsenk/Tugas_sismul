/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismul.proses;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import sismul.Frame.Form;
/**
 *
 * @author wildan
 */
public class hapusfile implements ActionListener {
    private Form form;
    
    public hapusfile(Form form){
    this.form=form;
    
    }
    @Override
    public void actionPerformed(ActionEvent event) {
	Object[] selecteds = form.dapatkanfilelist().getSelectedValues();
	if (selecteds.length != 0) {
	    DefaultListModel model = form.getListModel();
	    for (Object e : selecteds) {
		model.removeElement(e);
	    }
	}
    }
}