package pojava;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import pojava.ToolPanel;

public class Frame extends JFrame {

	private JPanel animationPanelyx;
	private JPanel animationPanelzx;
	private CalculationLoop calculationLoop;
	private ExecutorService exec = Executors.newFixedThreadPool(1);
	private String language = "eng";
	private ToolPanel toolPanel;
	private JButton languageButton;
	private JButton creditsButton;
	private CreditsFrame creditsFrame;

	class StopButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			calculationLoop.stopAnimation();
			toolPanel.enableRunButton();
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5085577579194397777L;

	public Frame() throws HeadlessException {

		setTitle("Particle in electric and mangetic fields - Kleszcze");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		JPanel pane = new JPanel(layout);
		animationPanelyx = new JPanel();
		animationPanelyx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"XY plane animation"));
		animationPanelzx = new JPanel();
		animationPanelzx.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"XZ plane animation"));
		StopButtonListener stopButtonListener = new StopButtonListener();
		toolPanel = new ToolPanel(this, stopButtonListener);

		toolPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"Simulation parameters"));
		URL url = getClass().getResource("/images/polish.jpg");
		languageButton = new JButton(new ImageIcon(url));
		creditsButton = new JButton("Credits");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.ipadx = 300;
		constraints.ipady = 300;
		add(pane);
		pane.add(animationPanelyx, constraints);
		constraints.gridx = 1;
		pane.add(animationPanelzx, constraints);
		constraints.gridx = 2;
		constraints.ipadx = 0;
		constraints.ipady = 0;
		pane.add(toolPanel, constraints);
		pane.add(languageButton);
		pane.add(creditsButton);

		class languageButtonListener implements ActionListener {

			ToolPanel toolPanel;
			Frame frame;

			public languageButtonListener(ToolPanel toolPanel, Frame frame) {
				this.toolPanel = toolPanel;
				this.frame = frame;
			}

			@Override
			public void actionPerformed(ActionEvent e) {
		
				if (language == "eng") {
					toolPanel.setLanguageToPolish();
					frame.setLanguageToPolish();
					language = "pl";
					URL url = getClass().getResource("/images/british-flag.png");
					languageButton.setIcon(new ImageIcon(url));
					if(creditsFrame!=null){
						creditsFrame.setPolishText();
					}

				} 
				else if (language == "pl") {
					toolPanel.setLanguageToEnglish();
					frame.setLanguageToEnglish();
					language = "eng";
					URL url = getClass().getResource("/images/polish.jpg");
					languageButton.setIcon(new ImageIcon(url));
					if(creditsFrame!=null){
						creditsFrame.setEnglishText();
					}
				}
			}
		}

		languageButton.addActionListener(new languageButtonListener(toolPanel, this));
		
		class CreditsButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				creditsFrame = new CreditsFrame(language);
				creditsFrame.setVisible(true);
			}}
		CreditsButtonListener creditsButtonListener = new CreditsButtonListener();
		creditsButton.addActionListener(creditsButtonListener);
		
	}
	
		

	public void startAnimation(final Particle particle) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				animationPanelyx.removeAll();
				animationPanelzx.removeAll();
				XYPanel xyPanel = new XYPanel(particle);
				XZPanel xzPanel = new XZPanel(particle);
				animationPanelyx.add(xyPanel);
				animationPanelzx.add(xzPanel);
				calculationLoop = new CalculationLoop(particle, xyPanel, xzPanel);
				animationPanelyx.revalidate();
				animationPanelzx.revalidate();
				exec.execute(calculationLoop);

			}

		});

	}

	public void setLanguageToPolish() {
		this.setTitle("Cząstka w polu elektrycznym i magnetycznym - Kleszcze");
		animationPanelyx.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Animacja w płaszczyźnie XY"));
		animationPanelzx.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "Animacja w płaszczyźnie XZ"));
		creditsButton.setText("Autorzy");
	}

	public void setLanguageToEnglish() {
		this.setTitle("Particle in electric and magnetic fields - Kleszcze");
		animationPanelyx.setBorder(BorderFactory
				.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "XY plane animation"));
		animationPanelzx.setBorder(BorderFactory
				.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "ZY plane animation"));
		creditsButton.setText("Credits");
	}

	public void showDialogForBlankFields() {
		if (language.equals("pl")) {
			JOptionPane.showMessageDialog(null, "Wykryto puste pola!");
		} 
		else if (language.equals("eng")) {
			JOptionPane.showMessageDialog(null, "Blank fields detected!");
		}
	}

	public void showDialogForMassAndCharge() {
		if (language.equals("pl")) {
			JOptionPane.showMessageDialog(null, "Masa/ładunek nie może być 0!");
		} 
		else if (language.equals("eng")) {
			JOptionPane.showMessageDialog(null, "Mass/charge cannot be 0!");
		}
	}

}
