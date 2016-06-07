package pojava;
import java.awt.Color;
import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreditsFrame extends JFrame {


	private static final long serialVersionUID = -970705666054119829L;
	private JTextArea textArea;
	
	CreditsFrame(String language){
		
		this.setSize(700, 600);
		this.setBackground(Color.WHITE);
		FlowLayout layout = new FlowLayout();
		JPanel pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setLayout(layout);
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel1.setSize(300, 300);
		textArea = new JTextArea();
		textArea.setEditable(false);
		panel1.add(textArea);
		URL url = getClass().getResource("/images/kleszcze.jpg");
		ImageIcon icon = new ImageIcon(url);
		JLabel label = new JLabel(icon);
		this.add(pane);
		panel2.add(label);
		pane.add(panel1, layout);
		pane.add(panel2, layout);
		if(language.equals("eng")){
			setEnglishText();
		}
		else{
			setPolishText();
		}
		
	}
	public void setEnglishText(){
		textArea.setText("Kleszcze team are: \nMaciej Czarnynoga"
				+ " & Hubert Majcherski,\nsecond year Bachelor students"
				+ " in Physics at Warsaw University of Technology.\n\n"
				+ "Cheers.");
		
	}
	public void setPolishText(){
		textArea.setText("Zespół Kleszcze to:\nMaciej Czarnynoga "
				+ "i Hubert Majcherski,\nstudenci drugiego roku Fizyki"
				+ " Technicznej na Politechnice Warszawskiej.\n\n"
				+ "<><    <><  <><");
	}
}
