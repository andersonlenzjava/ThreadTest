package treTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class gblTest extends JDialog {

	JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6;

	public gblTest() {
	    unimportantStuff();

	    GridBagLayout gbl = new GridBagLayout();
	    setLayout(gbl);

	    GridBagConstraints gbc;

	    gbc = getGbc(0, 0, 3, 1, 0.5);
	    gbl.setConstraints(jPanel1, gbc);

	    gbc = getGbc(1, 0, 4, 1, 0.75);
	    gbl.setConstraints(jPanel2, gbc);

	    gbc = getGbc(2, 0, 3, 1, 0.5);
	    gbl.setConstraints(jPanel3, gbc);

	    gbc = getGbc(0, 3, 3, 1, 0.5);
	    gbl.setConstraints(jPanel4, gbc);

	    gbc = getGbc(1, 4, 2, 1, 0.25);
	    gbl.setConstraints(jPanel5, gbc);

	    gbc = getGbc(2, 3, 3, 1, 0.5);
	    gbl.setConstraints(jPanel6, gbc);

	    add(jPanel1);
	    add(jPanel2);
	    add(jPanel3);
	    add(jPanel4);
	    add(jPanel5);
	    add(jPanel6);

	    setVisible(true);
	}

	private GridBagConstraints getGbc(int x, int y, int height, int width, double weightY) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 2.0;
		gbc.weighty = weightY;

		return gbc;
	}

	private void unimportantStuff() {
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();

		jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jPanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jPanel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
