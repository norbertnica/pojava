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
		JLabel xLabelE = new JLabel("x");
		JLabel yLabelE = new JLabel("y");
		JLabel zLabelE = new JLabel("z");
		JTextField xFieldE = new JTextField();
		JTextField yFieldE = new JTextField();
		JTextField zFieldE = new JTextField();
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(xLabelE,c);
		c.gridy = 3;
		add(yLabelE,c);
		c.gridy = 4;
		add(zLabelE,c);
		c.gridx = 1;
		c.gridy = 2;
		add(xFieldE,c);
		c.gridy = 3;
		add(yFieldE,c);
		c.gridy = 4;
		add(zFieldE,c);
		JLabel xLabelM = new JLabel("x");
		JLabel yLabelM = new JLabel("y");
		JLabel zLabelM = new JLabel("z");
		JTextField xFieldM = new JTextField();
		JTextField yFieldM = new JTextField();
		JTextField zFieldM = new JTextField();
		c.gridx = 2;
		c.gridy= 2;
		add(xLabelM,c);
		c.gridy = 3;
		add(yLabelM,c);
		c.gridy = 4;
		add(zLabelM,c);
		c.gridx = 3;
		c.gridy = 2;
		add(xFieldM,c);
		c.gridy = 3;
		add(yFieldM,c);
		c.gridy = 4;
		add(zFieldM,c);
		JLabel particle = new JLabel("Particle");
		JLabel charge = new JLabel("Charge");
		JTextField chargeField = new JTextField();
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 5;
		add(particle,c);
		c.gridwidth = 1;
		c.gridy = 6;
		add(charge,c);
		c.gridx = 1;
		add(chargeField,c);
		JLabel position = new JLabel("Initial position vector");
		JLabel velocity = new JLabel("Initial velocity vector");
		c.gridx = 0;
		c.gridwidth = 2;
		c.gridy = 7;
		add(position,c);
		c.gridx = 2;
		add(velocity,c);
		JLabel xLabelP = new JLabel("x");
		JLabel yLabelP = new JLabel("y");
		JLabel zLabelP = new JLabel("z");
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 1;
		add(xLabelP,c);
		c.gridy = 9;
		add(yLabelP,c);
		c.gridy = 10;
		add(zLabelP,c);
		JTextField xFieldP = new JTextField();
		JTextField yFieldP = new JTextField();
		JTextField zFieldP = new JTextField();
		c.gridx = 1;
		c.gridy = 8;
		add(xFieldP,c);
		c.gridy = 9;
		add(yFieldP,c);
		c.gridy = 10;
		add(zFieldP,c);
		JLabel xLabelV = new JLabel("x");
		JLabel yLabelV = new JLabel("y");
		JLabel zLabelV = new JLabel("z");
		JTextField xFieldV = new JTextField();
		JTextField yFieldV = new JTextField();
		JTextField zFieldV = new JTextField();
		c.gridx = 2;
		c.gridy = 8;
		add(xLabelV,c);
		c.gridy = 9;
		add(yLabelV,c);
		c.gridy = 10;
		add(zLabelV,c);
		c.gridx = 3;
		c.gridy = 8;
		add(xFieldV,c);
		c.gridy = 9;
		add(yFieldV,c);
		c.gridy = 10;
		add(zFieldV,c);
		
		
		
		
		
		
	}


}
