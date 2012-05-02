package test;


import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JFileChooser;

import javax.swing.JTextArea;

public class SaveAs {

	public void saveAs(JTextArea text) {

		JFileChooser fileC = new JFileChooser();
		// FileNameExtensionFilter filter = new FileNameExtensionFilter(
		// "Text files", ".txt");
		int ret = fileC.showSaveDialog(fileC);

		// fileC.setFileFilter(filter);
		if (ret == javax.swing.JFileChooser.APPROVE_OPTION) {
			java.io.File sFile = fileC.getSelectedFile();

			FileWriter writer = null;
			try {
				writer = new FileWriter(sFile);
				text.write(writer);
			} catch (IOException ex) {

			} finally {
				if (writer != null) {
					try {
						writer.close();
					} catch (IOException x) {
					}
				}
			}
		}
	}

	private void printStackTrace() {
		// TODO Auto-generated method stub

	}

}
