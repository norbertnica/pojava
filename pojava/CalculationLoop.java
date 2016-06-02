package pojava;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CalculationLoop implements Runnable {

	Boolean stop = false;
	Molecule molecule;
	JPanel panelXY;
	JPanel panelXZ;
	
	CalculationLoop (Molecule molecule,JPanel panelXY,JPanel panelXZ){
		this.molecule = molecule;
		this.panelXY = panelXY;
		this.panelXZ = panelXZ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		double r=1; 
		double t = 1;
		double dt = 0.01;
		
	
		
		while(!stop)
		{
						
			molecule.CalculationOfAccelarationX();
			molecule.CalculationOfAccelarationY();
			molecule.CalculationOfAccelarationZ();
			
			molecule.CalculationOfSpeedX(dt);
			molecule.CalculationOfSpeedY(dt);
			molecule.CalculationOfSpeedZ(dt);
			
			
			molecule.CalculationOfPositionX(dt);
			molecule.CalculationOfPositionY(dt);
			molecule.CalculationOfPositionZ(dt);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			panelXY.repaint();
			panelXZ.repaint();
			
		}
		
	}
	void stopAnimation(){
		stop = true;
	}
}
