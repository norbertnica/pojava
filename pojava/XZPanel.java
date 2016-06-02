package pojava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class XZPanel extends JPanel {
	Molecule molecule;
	
	public XZPanel(Molecule molecule){
		super();
		this.molecule = molecule;
		setPreferredSize(new Dimension(300,300));
		}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        int x1 = (int)molecule.x;
        int y1 = (int)molecule.z;
        
        g.setColor(Color.black);
        g.fillOval(x1, y1, 10, 10);
	}
}



