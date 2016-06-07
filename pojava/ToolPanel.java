package pojava;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import pojava.Frame.StopButtonListener;

public class ToolPanel extends JPanel {

	private static final long serialVersionUID = -2010947848192211386L;
	private JTextField xFieldE;
	private JTextField yFieldE;
	private JTextField zFieldE;
	private JTextField xFieldM;
	private JTextField yFieldM;
	private JTextField zFieldM;
	private JTextField xFieldP;
	private JTextField yFieldP;
	private JTextField zFieldP;
	private JTextField xFieldV;
	private JTextField yFieldV;
	private JTextField zFieldV;
	private JTextField chargeField;
	private JTextField massField;
	private Frame globalFrame;
	private JComboBox<String> presetsCombo;
	private JLabel fieldsLabel;
	private JLabel electricLabel;
	private JLabel magneticLabel;
	private JLabel particleLabel;
	private JLabel chargeLabel;
	private JLabel massLabel;
	private JLabel velocityLabel;
	private JLabel positionLabel;
	private JLabel presets;
	private JButton runButton;
	private JButton stopButton;
	private JButton clearButton;
	private String[] presetChoicesEnglish = { "Helical motion", "Circular motion" };
	private String[] presetChoicesPolish = { "Ruch po spirali", "Ruch po okręgu" };

	public ToolPanel(Frame frame, StopButtonListener x) {

		globalFrame = frame;
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		this.setLayout(layout);
		fieldsLabel = new JLabel("Fields");
		electricLabel = new JLabel("Electric field vector [N/C]");
		magneticLabel = new JLabel("Magnetic field vector [T]");
		particleLabel = new JLabel("Particle");
		chargeLabel = new JLabel("Charge [C]");
		massLabel = new JLabel("Mass [kg]");
		positionLabel = new JLabel("Initial position vector [m]");
		velocityLabel = new JLabel("Initial velocity vector [m/s]");
		JLabel xLabelE = new JLabel("x");
		JLabel yLabelE = new JLabel("y");
		JLabel zLabelE = new JLabel("z");
		JLabel xLabelP = new JLabel("x");
		JLabel yLabelP = new JLabel("y");
		JLabel zLabelP = new JLabel("z");
		JLabel xLabelM = new JLabel("x");
		JLabel yLabelM = new JLabel("y");
		JLabel zLabelM = new JLabel("z");
		JLabel xLabelV = new JLabel("x");
		JLabel yLabelV = new JLabel("y");
		JLabel zLabelV = new JLabel("z");
		chargeField = new JTextField("", 7);
		massField = new JTextField("", 7);
		xFieldE = new JTextField("", 7);
		yFieldE = new JTextField("", 7);
		zFieldE = new JTextField("", 7);
		xFieldM = new JTextField("", 7);
		yFieldM = new JTextField("", 7);
		zFieldM = new JTextField("", 7);
		xFieldP = new JTextField("", 7);
		yFieldP = new JTextField("", 7);
		zFieldP = new JTextField("", 7);
		xFieldV = new JTextField("", 7);
		yFieldV = new JTextField("", 7);
		zFieldV = new JTextField("", 7);
		runButton = new JButton("Run");
		stopButton = new JButton("Stop");
		stopButton.setEnabled(false);
		clearButton = new JButton("Clear all");
		presets = new JLabel("Presets");
		presetsCombo = new JComboBox<String>(presetChoicesEnglish);
		presetsCombo.setSelectedItem(null);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fieldsLabel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		add(electricLabel, constraints);
		constraints.gridx = 2;
		constraints.gridy = 1;
		add(magneticLabel, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 2;
		add(xLabelE, constraints);
		constraints.gridy = 3;
		add(yLabelE, constraints);
		constraints.gridy = 4;
		add(zLabelE, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(xFieldE, constraints);
		constraints.gridy = 3;
		add(yFieldE, constraints);
		constraints.gridy = 4;
		add(zFieldE, constraints);
		constraints.gridx = 2;
		constraints.gridy = 2;
		add(xLabelM, constraints);
		constraints.gridy = 3;
		add(yLabelM, constraints);
		constraints.gridy = 4;
		add(zLabelM, constraints);
		constraints.gridx = 3;
		constraints.gridy = 2;
		add(xFieldM, constraints);
		constraints.gridy = 3;
		add(yFieldM, constraints);
		constraints.gridy = 4;
		add(zFieldM, constraints);
		constraints.gridwidth = 2;
		constraints.gridx = 0;
		constraints.gridy = 5;
		add(particleLabel, constraints);
		constraints.gridwidth = 1;
		constraints.gridy = 6;
		add(chargeLabel, constraints);
		constraints.gridx = 1;
		add(chargeField, constraints);
		constraints.gridx = 2;
		add(massLabel, constraints);
		constraints.gridx = 3;
		add(massField, constraints);
		constraints.gridx = 0;
		constraints.gridwidth = 2;
		constraints.gridy = 7;
		add(positionLabel, constraints);
		constraints.gridx = 2;
		add(velocityLabel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 8;
		constraints.gridwidth = 1;
		add(xLabelP, constraints);
		constraints.gridy = 9;
		add(yLabelP, constraints);
		constraints.gridy = 10;
		add(zLabelP, constraints);
		constraints.gridx = 1;
		constraints.gridy = 8;
		add(xFieldP, constraints);
		constraints.gridy = 9;
		add(yFieldP, constraints);
		constraints.gridy = 10;
		add(zFieldP, constraints);
		constraints.gridx = 2;
		constraints.gridy = 8;
		add(xLabelV, constraints);
		constraints.gridy = 9;
		add(yLabelV, constraints);
		constraints.gridy = 10;
		add(zLabelV, constraints);
		constraints.gridx = 3;
		constraints.gridy = 8;
		add(xFieldV, constraints);
		constraints.gridy = 9;
		add(yFieldV, constraints);
		constraints.gridy = 10;
		add(zFieldV, constraints);
		constraints.gridwidth = 2;
		constraints.gridy = 11;
		constraints.gridx = 0;
		constraints.gridx = 2;
		add(presets, constraints);
		constraints.gridx = 0;
		constraints.gridy = 12;
		constraints.gridx = 2;
		add(presetsCombo, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 13;
		add(runButton, constraints);
		constraints.gridx = 1;
		add(stopButton, constraints);
		constraints.gridx = 2;
		add(clearButton, constraints);

		class RunButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (massField.getText().equals("") || chargeField.getText().equals("") || xFieldE.getText().equals("")
						|| yFieldE.getText().equals("") || zFieldE.getText().equals("") || xFieldM.getText().equals("")
						|| yFieldM.getText().equals("") || zFieldM.getText().equals("") || xFieldP.getText().equals("")
						|| yFieldP.getText().equals("") || zFieldP.getText().equals("") || xFieldV.getText().equals("")
						|| yFieldV.getText().equals("") || zFieldV.getText().equals("")) {
					globalFrame.showDialogForBlankFields();
				}
				
				else if (massField.getText().equals("0") || chargeField.getText().equals("0")) {
					globalFrame.showDialogForMassAndCharge();
				} 
				else {
					Particle particle = new Particle();
					particle.setElectricFieldX(Float.parseFloat(xFieldE.getText()));
					particle.setElectricFieldY(Float.parseFloat(yFieldE.getText()));
					particle.setElectricFieldZ(Float.parseFloat(zFieldE.getText()));
					particle.setMagneticFieldX(Float.parseFloat(xFieldM.getText()));
					particle.setMagneticFieldY(Float.parseFloat(yFieldM.getText()));
					particle.setMagneticFieldZ(Float.parseFloat(zFieldM.getText()));
					particle.setPositionX(Float.parseFloat(xFieldP.getText()));
					particle.setPositionY(Float.parseFloat(yFieldP.getText()));
					particle.setPositionZ(Float.parseFloat(zFieldP.getText()));
					particle.setSpeedX(Float.parseFloat(xFieldV.getText()));
					particle.setSpeedY(Float.parseFloat(yFieldV.getText()));
					particle.setSpeedZ(Float.parseFloat(zFieldV.getText()));
					particle.setMass(Float.parseFloat(massField.getText()));
					particle.setCharge(Float.parseFloat(chargeField.getText()));
					globalFrame.startAnimation(particle);
					disableRunButton();
				}
			}

		}
		RunButtonListener runButtonListener = new RunButtonListener();
		runButton.addActionListener(runButtonListener);
		stopButton.addActionListener(x);
		class ClearButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				xFieldE.setText(null);
				yFieldE.setText(null);
				zFieldE.setText(null);
				xFieldM.setText(null);
				yFieldM.setText(null);
				zFieldM.setText(null);
				xFieldP.setText(null);
				yFieldP.setText(null);
				zFieldP.setText(null);
				xFieldV.setText(null);
				yFieldV.setText(null);
				zFieldV.setText(null);
				chargeField.setText(null);
				massField.setText(null);

			}
		}
		ClearButtonListener clearButtonListener = new ClearButtonListener();
		clearButton.addActionListener(clearButtonListener);

		class PresetsListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String xFieldEText = "0";
				String yFieldEText = "0";
				String zFieldEText = "0";
				String xFieldMText = "0";
				String yFieldMText = "0";
				String zFieldMText = "0";
				String xFieldPText = "0";
				String yFieldPText = "0";
				String zFieldPText = "0";
				String xFieldVText = "0";
				String yFieldVText = "0";
				String zFieldVText = "0";
				String chargeFieldText = "1";
				String massFieldText = "1";
				if (presetsCombo.getSelectedIndex() == 0) {
					xFieldEText = "0";
					yFieldEText = "0";
					zFieldEText = "0";
					xFieldMText = "0";
					yFieldMText = "0";
					zFieldMText = "0";
					xFieldPText = "0";
					yFieldPText = "0";
					zFieldPText = "0";
					xFieldVText = "0";
					yFieldVText = "0";
					zFieldVText = "0";
					xFieldMText = "5";
					yFieldPText = "150";
					zFieldPText = "150";
					xFieldVText = "20";
					yFieldVText = "20";
				} 
				
				else if (presetsCombo.getSelectedIndex() == 1) {
					xFieldEText = "0";
					yFieldEText = "0";
					zFieldEText = "0";
					xFieldMText = "0";
					yFieldMText = "0";
					zFieldMText = "0";
					xFieldPText = "0";
					yFieldPText = "0";
					zFieldPText = "0";
					xFieldVText = "0";
					yFieldVText = "0";
					zFieldVText = "0";
					yFieldMText = "1";
					xFieldPText = "150";
					yFieldPText = "150";
					zFieldPText = "80";
					xFieldVText = "80";
				} 
				
				else if (presetsCombo.getSelectedItem() == null) {
					xFieldEText = null;
					yFieldEText = null;
					zFieldEText = null;
					xFieldMText = null;
					yFieldMText = null;
					zFieldMText = null;
					xFieldPText = null;
					yFieldPText = null;
					zFieldPText = null;
					xFieldVText = null;
					yFieldVText = null;
					zFieldVText = null;
					yFieldMText = null;
					xFieldPText = null;
					yFieldPText = null;
					zFieldPText = null;
					xFieldVText = null;
					chargeFieldText = null;
					massFieldText = null;
				}
				
				xFieldE.setText(xFieldEText);
				yFieldE.setText(yFieldEText);
				zFieldE.setText(zFieldEText);
				xFieldM.setText(xFieldMText);
				yFieldM.setText(yFieldMText);
				zFieldM.setText(zFieldMText);
				xFieldP.setText(xFieldPText);
				yFieldP.setText(yFieldPText);
				zFieldP.setText(zFieldPText);
				xFieldV.setText(xFieldVText);
				yFieldV.setText(yFieldVText);
				zFieldV.setText(zFieldVText);
				chargeField.setText(chargeFieldText);
				massField.setText(massFieldText);
			}
		}
		PresetsListener presetsListener = new PresetsListener();
		presetsCombo.addActionListener(presetsListener);
	}

	public void changeLanguageToPolish() {
		fieldsLabel.setText("Pola");
		electricLabel.setText("Wektor elektryczny [N/C]");
		magneticLabel.setText("Wektor mangetyczny [T]");
		chargeLabel.setText("Ładunek [C]");
		massLabel.setText("Masa [kg]");
		particleLabel.setText("Cząstka");
		positionLabel.setText("Położenie początkowe [m]");
		velocityLabel.setText("Prędkość początkowa [m/s]");
		runButton.setText("Start");
		stopButton.setText("Stop");
		clearButton.setText("Wyczyść");
		presets.setText("Presety");
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(presetChoicesPolish);
		presetsCombo.setModel(model);
		presetsCombo.setSelectedItem(null);
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"Parametry symulacji"));

	}

	public void changeLanguageToEnglish() {
		fieldsLabel.setText("Fields");
		electricLabel.setText("Electric field vector [N/C]");
		magneticLabel.setText("Magnetic field vector [T]");
		chargeLabel.setText("Charge [C]");
		massLabel.setText("Mass [kg]");
		particleLabel.setText("Particle");
		positionLabel.setText("Initial position vector [m]");
		velocityLabel.setText("Initial velocity vector [m/s]");
		runButton.setText("Run");
		stopButton.setText("Stop");
		clearButton.setText("Clear all");
		presets.setText("Presets");
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(presetChoicesEnglish);
		presetsCombo.setModel(model);
		presetsCombo.setSelectedItem(null);
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
				"Simulation parameters"));
	}
	public void disableRunButton(){
		runButton.setEnabled(false);
		stopButton.setEnabled(true);
	}
	public void enableRunButton(){
		runButton.setEnabled(true);
		stopButton.setEnabled(false);
	}
	
}
