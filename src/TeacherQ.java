import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TeacherQ {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Tq() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherQ window = new TeacherQ();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeacherQ() {
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
		
		JLabel lblQuestionPage = new JLabel("Question page");
		lblQuestionPage.setBounds(163, 6, 96, 16);
		frame.getContentPane().add(lblQuestionPage);
		
		JLabel label = new JLabel("1");
		label.setBounds(30, 42, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(30, 80, 61, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(30, 122, 61, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(30, 165, 61, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(30, 207, 61, 16);
		frame.getContentPane().add(label_4);
	}

}
