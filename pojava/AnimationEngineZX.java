package pojava;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class AnimationEngineZX extends JPanel implements Runnable 
{
Molecule Molecule2;;

	
	public AnimationEngineZX(Molecule molecule) 
	{
		super();
		Molecule2 = molecule;
		setPreferredSize(new Dimension (300, 300));
	}	
	
	public void run() 
	{
		
		
		double r=1; 
		double t = 1;
		double dt = 0.01;
		int maxX=getWidth();
		int maxY=getHeight();
	
		
		while(t!=0)
		{
		
				
			
			Molecule2. CalculationOfAccelarationX();
			Molecule2.CalculationOfAccelarationY();
			Molecule2.CalculationOfAccelarationZ();
			
			Molecule2.CalculationOfSpeedX(dt);
			Molecule2.CalculationOfSpeedY(dt);
			Molecule2.CalculationOfSpeedZ(dt);
			
			
			Molecule2.CalculationOfPositionX(dt);
			Molecule2.CalculationOfPositionZ(dt);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			repaint();
			t=t+dt;
		}
	}
	public void paintComponent(Graphics g)
	{
        super.paintComponent(g);              
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        int x1 = (int)Molecule2.x;
        int y1 = (int)Molecule2.y;
        
        g.setColor(Color.black);
        g.fillOval(x1, y1, 10, 10);
        
       
    }

}