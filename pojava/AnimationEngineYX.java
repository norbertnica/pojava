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



public class AnimationEngineYX  extends JPanel implements Runnable
{
	Molecule molecule;

	
	public AnimationEngineYX(Molecule molecule) 
	{
		super();
		this.molecule = molecule;
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
		
			double SpeedXDirectionX,SpeedXDirectionY,SpeedXDirectionZ;
	
			
			if(t==1)
				
		
			
			
			molecule. CalculationOfAccelarationX();
			molecule.CalculationOfAccelarationY();
			molecule.CalculationOfAccelarationZ();
			
			molecule.CalculationOfSpeedX(dt);
			molecule.CalculationOfSpeedY(dt);
			molecule.CalculationOfSpeedZ(dt);
			
			
			molecule.CalculationOfPositionX(dt);
			molecule.CalculationOfPositionY(dt);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			repaint();
			
		}
		
	}
	public void paintComponent(Graphics g)
	{
        super.paintComponent(g);              
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        int x1 = (int)molecule.x;
        int y1 = (int)molecule.y;
        
        g.setColor(Color.black);
        g.fillOval(x1, y1, 10, 10);
        
       
    }

}
