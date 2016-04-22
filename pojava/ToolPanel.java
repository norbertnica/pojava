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
		JLabel xlabel1 = new JLabel("x");
		JLabel ylabel1 = new JLabel("y");
		JLabel zlabel1 = new JLabel("z");
		JTextField xfield1 = new JTextField();
		JTextField yfield1 = new JTextField();
		JTextField zfield1 = new JTextField();
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(xlabel1,c);
		c.gridy = 3;
		add(ylabel1,c);
		c.gridy = 4;
		add(zlabel1,c);
		c.gridx = 1;
		c.gridy = 2;
		add(xfield1,c);
		c.gridy = 3;
		add(yfield1,c);
		c.gridy = 4;
		add(zfield1,c);
		JLabel xlabel2 = new JLabel("x");
		JLabel ylabel2 = new JLabel("y");
		JLabel zlabel2 = new JLabel("z");
		JTextField xfield2 = new JTextField();
		JTextField yfield2 = new JTextField();
		JTextField zfield2 = new JTextField();
		c.gridx = 2;
		c.gridy= 2;
		add(xlabel2,c);
		c.gridy = 3;
		add(ylabel2,c);
		c.gridy = 4;
		add(zlabel2,c);
		c.gridx = 3;
		c.gridy = 2;
		add(xfield2,c);
		c.gridy = 3;
		add(yfield2,c);
		c.gridy = 4;
		add(zfield2,c);
		
		
		
	}


}
