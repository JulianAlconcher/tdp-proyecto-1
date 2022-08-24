package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student Julian = new Student(126094,"Alconcher","Julian","alconcherjulian@gmail.com","https://github.com/JulianAlconcher","Imágenes/imagen.jpg");
            	SimplePresentationScreen scr1 = new SimplePresentationScreen(Julian);
            	scr1.setVisible(true);
            	
            }
        });
    }
}