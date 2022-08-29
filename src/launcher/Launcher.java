package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student AlumnoJulian = new Student(126094,"Alconcher","Julian","alconcherjulian@gmail.com","https://github.com/JulianAlconcher","/images/imagen.jpg");
            	SimplePresentationScreen scr1 = new SimplePresentationScreen(AlumnoJulian);
            	scr1.setVisible(true);
            	
            }
        });
    }
}