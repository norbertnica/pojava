package pojava;

import java.awt.Color;import java.awt.FlowLayout;

import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	public CalculationLoop calculationLoop;
	public ExecutorService exec = Executors.newFixedThreadPool(1);
	public String language = "eng";
	ToolPanel toolPanel;
	JButton languageButton;
	class StopButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			calculationLoop.stopAnimation();
		}}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5085577579194397777L;
	
	public Frame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		//Molecule molecule = new Molecule();
		setTitle("Particle in electric and mangetic fields - Kleszcze");
		setDefaultCloseOperation(EXIT_ON_CLOSE);;
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
		StopButtonListener stopButtonListener = new StopButtonListener();
		toolPanel = new ToolPanel(this, stopButtonListener);
		
		toolPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Simulation parameters"));
		pane.add(toolPanel,c);
		URL url = getClass().getResource("/images/polish.jpg");
		languageButton = new JButton(new ImageIcon(url));
		
		
		
		pane.add(languageButton);
		
		class languageButtonListener implements ActionListener{

			ToolPanel toolPanel;
			Frame frame;
			public languageButtonListener(ToolPanel toolPanel,Frame frame) {
				// TODO Auto-generated constructor stub
				this.toolPanel = toolPanel;
				this.frame = frame;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(language == "eng"){
				toolPanel.changeLanguageToPolish();
				frame.changeLanguageToPolish();
				language = "pl";
				URL url = getClass().getResource("/images/british-flag.png");
				languageButton.setIcon(new ImageIcon(url));
				
				
				}
				else if(language == "pl"){
					toolPanel.changeLanguageToEnglish();
					frame.changeLanguageToEnglish();
					language = "eng";
					URL url = getClass().getResource("/images/polish.jpg");
					languageButton.setIcon(new ImageIcon(url));
				}
			}}
	
		languageButton.addActionListener(new languageButtonListener(toolPanel,this));
		
		
		
		
	}
	
	public void startAnimation(final Molecule molecule){
		
		
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				animationPanelyx.removeAll();
				animationPanelzx.removeAll();
				XYPanel xyPanel = new XYPanel(molecule);
				XZPanel xzPanel = new XZPanel(molecule);
				animationPanelyx.add(xyPanel);
				animationPanelzx.add(xzPanel);
				calculationLoop = new CalculationLoop(molecule,xyPanel,xzPanel);
				animationPanelyx.revalidate();
				animationPanelzx.revalidate();
				exec.execute(calculationLoop);
				
			}
			
		});
		
	}
		public void changeLanguageToPolish(){
			this.setTitle("Cząstka w polu elektrycznym i magnetycznym - Kleszcze");
			animationPanelyx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Animacja w płaszczyźnie XY"));
			animationPanelzx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Animacja w płaszczyźnie XZ"));
		}
		public void changeLanguageToEnglish(){
			this.setTitle("Particle in electric and magnetic fields - Kleszcze");
			animationPanelyx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"XY plane animation"));
			animationPanelzx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"ZY plane animation"));
		}
		
	}



