import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Student extends javax.swing.JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Student window = new Student();
					new Student().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHiabdullh = new JLabel("Hi @abdull@h");
		lblHiabdullh.setBounds(186, 111, 112, 16);
		frame.getContentPane().add(lblHiabdullh);
	}
}
