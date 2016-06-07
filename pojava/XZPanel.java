package pojava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class XZPanel extends JPanel {
	
	private static final long serialVersionUID = 6259710449843157313L;
	private Particle particle;

	public XZPanel(Particle particle) {
		super();
		this.particle = particle;
		setPreferredSize(new Dimension(300, 300));
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		int x1 = (int) particle.getPositionX();
		int y1 = (int) particle.getPositionZ();
		g.setColor(Color.black);
		g.fillOval(x1, y1, 10, 10);
		g.drawLine(0, 285, 290, 285);
		g.fillPolygon(new int[] { 290, 290, 300 }, new int[] { 290, 280, 285 }, 3);
		g.drawLine(15, 10, 15, 300);
		g.fillPolygon(new int[] { 10, 15, 20 }, new int[] { 10, 0, 10 }, 3);
		
		g.drawString("x[m]", 260, 299);
		g.drawString("y", 2, 11);
		g.drawString("[m]", 0, 22);

		for (int i = 65; i < 260; i += 50) {
			int number = i - 15;
			g.drawLine(i, 282, i, 288);
			String s = Integer.toString(number);
			if (number < 100)
				g.drawString(s, i - 7, 300);
			if (number >= 100)
				g.drawString(s, i - 10, 300);
		}

		for (int i = 25; i < 290; i += 10) {

			g.drawLine(i, 284, i, 286);

		}

		for (int i = 65; i < 271; i += 50) {
			int position = 300 - i;
			int number = i - 15;
			g.drawLine(12, position, 18, position);
			String s = Integer.toString(number);
			if (i < 100)
				g.drawString(s, 0, position + 5);

		}

		for (int i = 25; i < 290; i += 10) {
			int position = 300 - i;

			g.drawLine(14, position, 16, position);

		}
	}
}
