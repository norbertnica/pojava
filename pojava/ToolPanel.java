package pojava;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToolPanel extends JPanel {

	public ToolPanel() {
		// TODO Auto-generated constructor stub
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		JLabel fieldsLabel = new JLabel("Fields");
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 2;
		add(fieldsLabel,c);
		JLabel electricLabel = new JLabel("Electric field vector");
		c.gridx = 0;
		c.gridy = 1;
		add(electricLabel,c);
		JLabel magneticLabel = new JLabel("Magnetic field vector");
		c.gridx = 2;
		c.gridy = 1;
		add(magneticLabel,c);
	}


}
