package gui;
import javax.swing.JFrame;


import java.awt.Dimension;
import java.time.LocalDateTime;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU,textFieldSurname,textFieldName,textFieldEmail,textFieldGitHub;
	private JLabel lblLU,lblSurname,lblName,lblEmail,lblGitHubUrl,lblDate,lblImage;
	
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 280));
		setResizable(false);
		setContentPane(contentPane);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 203);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 240));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		
		textFieldLU = new JTextField();
		textFieldLU.setBounds(83, 10, 332, 19);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		textFieldLU.setText(Integer.toString(studentData.getId()));
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(83, 39, 332, 19);
		textFieldSurname.setColumns(10);
		tabInformation.add(textFieldSurname);
		textFieldSurname.setText(studentData.getLastName());
		
		textFieldName = new JTextField();
		textFieldName.setBounds(83, 68, 332, 19);
		textFieldName.setColumns(10);
		tabInformation.add(textFieldName);
		textFieldName.setText(studentData.getFirstName());
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(83, 97, 332, 19);
		textFieldEmail.setColumns(10);
		tabInformation.add(textFieldEmail);
		textFieldEmail.setText(studentData.getMail());
		
		textFieldGitHub = new JTextField();
		textFieldGitHub.setBounds(83, 126, 332, 19);
		textFieldGitHub.setColumns(10);
		tabInformation.add(textFieldGitHub);
		textFieldGitHub.setText(studentData.getGithubURL());
		
		lblLU = new JLabel("LU");
		lblLU.setBounds(10, 13, 63, 13);
		tabInformation.add(lblLU);
		
		lblSurname = new JLabel("Apellido");
		lblSurname.setBounds(10, 42, 63, 13);
		tabInformation.add(lblSurname);
		
		lblName = new JLabel("Nombre");
		lblName.setBounds(10, 71, 45, 13);
		tabInformation.add(lblName);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 100, 45, 13);
		tabInformation.add(lblEmail);
		
		lblGitHubUrl = new JLabel("Github URL");
		lblGitHubUrl.setBounds(10, 129, 71, 13);
		tabInformation.add(lblGitHubUrl);
		contentPane.add(tabbedPane);
		
		lblDate = new JLabel("");
		lblDate.setBounds(5, 208, 430, 25);
		contentPane.add(lblDate);
	
		
		//Setting date and time
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		int day = locaDate.getDayOfMonth();
		int month = locaDate.getMonthValue();
		int year = locaDate.getYear();
		
		lblDate.setText("Esta ventana fue generada el " + day + "/" + month + "/" + year + " a las: " +  hours  + ":"+ minutes +":"+seconds );
		
		//Add image
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/imagen.jpg")));
		lblImage.setBounds(439, 26, 157, 154);
		contentPane.add(lblImage);
	
	}
}

