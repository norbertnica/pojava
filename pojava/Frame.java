package pojava;

import java.awt.Color;import java.awt.FlowLayout;

import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import pojava.ToolPanel;

public class Frame extends JFrame {

	public JPanel animationPanelyx;
	public JPanel animationPanelzx;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5085577579194397777L;
	
	public Frame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		//Molecule molecule = new Molecule();
		setTitle("Kleszcze simulation");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10,10,10,10);
		c.ipadx = 300;
		c.ipady = 300;
		JPanel pane = new JPanel(layout);
		add(pane);
		JPanel animation1 = new JPanel();
		
		animation1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"XY plane animation"));
		pane.add(animation1,c);
		JPanel animation2 = new JPanel();
		animation2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"XZ plane animation"));
		c.gridx = 1;
		pane.add(animation2,c);
		c.gridx = 2;
		c.ipadx = 0;
		c.ipady = 0;
		animationPanelyx = animation1;
		animationPanelzx = animation2;
		ToolPanel toolPanel = new ToolPanel(this);
		
		toolPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Simulation parameters"));
		pane.add(toolPanel,c);
	
		
		
		
		
	}
	
	public void startAnimation(final Molecule molecule){
		
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				AnimationEngineYX animationyx = new AnimationEngineYX(molecule);
				AnimationEngineZX animationzx = new AnimationEngineZX(molecule);
				animationPanelyx.add(animationyx);
				animationPanelzx.add(animationzx);
				ExecutorService exec = Executors.newFixedThreadPool(2);
				exec.execute(animationyx);
				exec.execute(animationzx);
				exec.shutdown();
			}
			
		});
	}
	
	}



