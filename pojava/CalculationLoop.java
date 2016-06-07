package pojava;

import javax.swing.JPanel;

public class CalculationLoop implements Runnable {

	private Boolean stop = false;
	private Particle particle;
	private JPanel panelXY;
	private JPanel panelXZ;

	CalculationLoop(Particle particle, JPanel panelXY, JPanel panelXZ) {
		this.particle = particle;
		this.panelXY = panelXY;
		this.panelXZ = panelXZ;
	}

	@Override
	public void run() {
		
		
		double dt = 0.01;

		while (!stop) {

			particle.calculateAccelerationX();
			particle.calculateAccelarationY();
			particle.calculateAccelarationZ();

			particle.calculateSpeedX(dt);
			particle.calculateSpeedY(dt);
			particle.calculateSpeedZ(dt);

			particle.calculatePositionX(dt);
			particle.calculationPositionY(dt);
			particle.calculatePositionZ(dt);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			panelXY.repaint();
			panelXZ.repaint();

		}

	}

	public void stopAnimation() {
		stop = true;
	}
	
}
