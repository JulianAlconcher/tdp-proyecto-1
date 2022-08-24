package gui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldSurname;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JTextField textFieldGitHub;
	private JLabel lblNewLabelHoraDeConsulta;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(new Dimension(615, 280));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\julia\\eclipse-workspace\\proyecto-1\\src\\images"));
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
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setBounds(10, 13, 63, 13);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(10, 42, 45, 13);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 71, 45, 13);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(10, 100, 45, 13);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setBounds(10, 129, 71, 13);
		tabInformation.add(lblNewLabel_4);
		contentPane.add(tabbedPane);
		
		
		
		
		lblNewLabelHoraDeConsulta = new JLabel("New label");
		lblNewLabelHoraDeConsulta.setBounds(5, 218, 430, 13);
		contentPane.add(lblNewLabelHoraDeConsulta);
		
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		
		lblNewLabelHoraDeConsulta.setText("Esta ventana fue generada el " + LocalDate.now() + " a las: " +  hours  + ":"+ minutes +":"+seconds );
		
		/*
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\julia\\eclipse-workspace\\proyecto-1\\src\\images"));
		Dimension size = lblNewLabel_5.getPreferredSize();
		lblNewLabel_5.setBounds(50, 30, size.width, size.height); //Sets the location of the image
		contentPane.add(lblNewLabel_5);
		*/
		
		
	
	}
}

