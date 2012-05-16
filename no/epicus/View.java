package epicus;

import java.io.File;

import javax.swing.JFrame;

public class View {

	JFrame frame;
	
	public View() {
		frame = new JFrame("Vivi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	

	public File getStoragePath() {
		return null;
	}
	
	
	
}