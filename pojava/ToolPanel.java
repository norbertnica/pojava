package pojava;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import pojava.Frame.StopButtonListener;
public class ToolPanel extends JPanel {
	
	public JTextField xFieldE;
	public JTextField yFieldE;
	public JTextField zFieldE;
	public JTextField xFieldM;
	public JTextField yFieldM;
	public JTextField zFieldM;
	public JTextField xFieldP;
	public JTextField yFieldP;
	public JTextField zFieldP;
	public JTextField xFieldV;
	public JTextField yFieldV;
	public JTextField zFieldV;
	public JTextField chargeField;
	public JTextField massField;
	public Frame globalFrame;
	public JComboBox presetsCombo;
	public JLabel fieldsLabel;
	public JLabel electricLabel;
	public JLabel magneticLabel;
	public JLabel particleLabel;
	public JLabel chargeLabel;
	public JLabel massLabel;
	public JLabel velocityLabel;
	public JLabel positionLabel;
	public JLabel timeFields;
	public JLabel presets;
	public JButton runButton;
	public JButton stopButton;
	public JButton clearButton;
	String[] presetChoicesEnglish = {"Helical motion","Circular motion"};
	String[] presetChoicesPolish = {"Ruch po spirali","Ruch po okręgu"};
	
	public ToolPanel(Frame frame, StopButtonListener x) {
		// TODO Auto-generated constructor stub
		
		globalFrame = frame;
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		fieldsLabel = new JLabel("Fields");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(fieldsLabel,c);
		electricLabel = new JLabel("Electric field vector");
		c.gridx = 0;
		c.gridy = 1;
		add(electricLabel,c);
		magneticLabel = new JLabel("Magnetic field vector");
		c.gridx = 2;
		c.gridy = 1;
		add(magneticLabel,c);
		JLabel xLabelE = new JLabel("x");
		JLabel yLabelE = new JLabel("y");
		JLabel zLabelE = new JLabel("z");
		xFieldE = new JTextField("",7);
		yFieldE = new JTextField("",7);
		zFieldE = new JTextField("",7);
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(xLabelE,c);
		c.gridy = 3;
		add(yLabelE,c);
		c.gridy = 4;
		add(zLabelE,c);
		c.gridx = 1;
		c.gridy = 2;
		add(xFieldE,c);
		c.gridy = 3;
		add(yFieldE,c);
		c.gridy = 4;
		add(zFieldE,c);
		JLabel xLabelM = new JLabel("x");
		JLabel yLabelM = new JLabel("y");
		JLabel zLabelM = new JLabel("z");
		xFieldM = new JTextField("",7);
		yFieldM = new JTextField("",7);
		zFieldM = new JTextField("",7);
		c.gridx = 2;
		c.gridy= 2;
		add(xLabelM,c);
		c.gridy = 3;
		add(yLabelM,c);
		c.gridy = 4;
		add(zLabelM,c);
		c.gridx = 3;
		c.gridy = 2;
		add(xFieldM,c);
		c.gridy = 3;
		add(yFieldM,c);
		c.gridy = 4;
		add(zFieldM,c);
		particleLabel = new JLabel("Particle");
		chargeLabel = new JLabel("Charge");
		massLabel = new JLabel("Mass");
		chargeField = new JTextField("",7);
		massField = new JTextField("",7);
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 5;
		add(particleLabel,c);
		c.gridwidth = 1;
		c.gridy = 6;
		add(chargeLabel,c);
		c.gridx = 1;
		add(chargeField,c);
		c.gridx = 2;
		add(massLabel,c);
		c.gridx = 3;
		add(massField,c);
		positionLabel = new JLabel("Initial position vector");
		velocityLabel = new JLabel("Initial velocity vector");
		c.gridx = 0;
		c.gridwidth = 2;
		c.gridy = 7;
		add(positionLabel,c);
		c.gridx = 2;
		add(velocityLabel,c);
		JLabel xLabelP = new JLabel("x");
		JLabel yLabelP = new JLabel("y");
		JLabel zLabelP = new JLabel("z");
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 1;
		add(xLabelP,c);
		c.gridy = 9;
		add(yLabelP,c);
		c.gridy = 10;
		add(zLabelP,c);
		xFieldP = new JTextField();
		yFieldP = new JTextField();
		zFieldP = new JTextField();
		c.gridx = 1;
		c.gridy = 8;
		add(xFieldP,c);
		c.gridy = 9;
		add(yFieldP,c);
		c.gridy = 10;
		add(zFieldP,c);
		JLabel xLabelV = new JLabel("x");
		JLabel yLabelV = new JLabel("y");
		JLabel zLabelV = new JLabel("z");
		xFieldV = new JTextField();
		yFieldV = new JTextField();
		zFieldV = new JTextField();
		c.gridx = 2;
		c.gridy = 8;
		add(xLabelV,c);
		c.gridy = 9;
		add(yLabelV,c);
		c.gridy = 10;
		add(zLabelV,c);
		c.gridx = 3;
		c.gridy = 8;
		add(xFieldV,c);
		c.gridy = 9;
		add(yFieldV,c);
		c.gridy = 10;
		add(zFieldV,c);
		runButton = new JButton("Run");
		stopButton = new JButton("Stop");
		clearButton = new JButton("Clear all");
		timeFields = new JLabel("Time-varying fields");
		presets = new JLabel("Presets");
		JComboBox timeCombo = new JComboBox();
		presetsCombo = new JComboBox(presetChoicesEnglish);
		presetsCombo.setSelectedItem(null);
		c.gridwidth = 2;
		c.gridy = 11;
		c.gridx = 0;
		add(timeFields,c);
		c.gridx = 2;
		add(presets,c);
		c.gridx = 0;
		c.gridy = 12;
		add(timeCombo,c);
		c.gridx = 2;
		add(presetsCombo,c);
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 13;
		add(runButton,c);
		c.gridx = 1;
		add(stopButton,c);
		c.gridx = 2;
		add(clearButton,c);
		
		
		class RunButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				 Molecule molecule = new Molecule();
				 molecule.setElectricFieldX(Float.parseFloat(xFieldE.getText()));
				 molecule.setElectricFieldY(Float.parseFloat(yFieldE.getText()));
				 molecule.setElectricFieldZ(Float.parseFloat(zFieldE.getText()));
				 molecule.setMagneticFieldX(Float.parseFloat(xFieldM.getText()));
				 molecule.setMagneticFieldY(Float.parseFloat(yFieldM.getText()));
				 molecule.setMagneticFieldZ( Float.parseFloat(zFieldM.getText()));
				 molecule.setX(Double.parseDouble(xFieldP.getText()));
				 molecule.setY(Double.parseDouble(yFieldP.getText()));
				 molecule.setZ(Double.parseDouble(zFieldP.getText()));
				 molecule.SetSpeedX(Float.parseFloat(xFieldV.getText()));
				 molecule.SetSpeedY(Float.parseFloat(yFieldV.getText()));
				 molecule.SetSpeedZ(Float.parseFloat(zFieldV.getText()));
				 molecule.setMass(Float.parseFloat(massField.getText()));
				 molecule.setCharge(Float.parseFloat(chargeField.getText()));
				 globalFrame.startAnimation(molecule);
			}
			
		}
		RunButtonListener runButtonListener = new RunButtonListener();
		runButton.addActionListener(runButtonListener);
		stopButton.addActionListener(x);
		class ClearButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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
		
		class PresetsListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
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
				if(presetsCombo.getSelectedIndex()==0){
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
				else if(presetsCombo.getSelectedIndex()==1){
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
				else if(presetsCombo.getSelectedItem()==null)
				{
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
			}}
		PresetsListener presetsListener = new PresetsListener();
		presetsCombo.addActionListener(presetsListener);
	}
	public void changeLanguageToPolish(){
		fieldsLabel.setText("Pola");
		electricLabel.setText("Wektor elektryczny");
		magneticLabel.setText("Wektor mangetyczny");
		chargeLabel.setText("Ładunek");
		massLabel.setText("Masa");
		particleLabel.setText("Cząstka");
		positionLabel.setText("Położenie początkowe");
		velocityLabel.setText("Prędkość początkowa");
		runButton.setText("Start");
		stopButton.setText("Stop");
		clearButton.setText("Wyczyść");
		presets.setText("Presety");
		timeFields.setText("Pola zmienne w czasie");
		DefaultComboBoxModel model = new DefaultComboBoxModel(presetChoicesPolish);
		presetsCombo.setModel(model);
		presetsCombo.setSelectedItem(null);
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Parametry symulacji"));
		
		
	}
	public void changeLanguageToEnglish(){
		fieldsLabel.setText("Fields");
		electricLabel.setText("Electric field vector");
		magneticLabel.setText("Magnetic field vector");
		chargeLabel.setText("Charge");
		massLabel.setText("Mass");
		particleLabel.setText("Particle");
		positionLabel.setText("Initial position vector");
		velocityLabel.setText("Initial velocity vector");
		runButton.setText("Run");
		stopButton.setText("Stop");
		clearButton.setText("Clear all");
		presets.setText("Presets");
		timeFields.setText("Time-varying fields");
		DefaultComboBoxModel model = new DefaultComboBoxModel(presetChoicesEnglish);
		presetsCombo.setModel(model);
		presetsCombo.setSelectedItem(null);
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),"Simulation parameters"));
	}
}
