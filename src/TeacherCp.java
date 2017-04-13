import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherCp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherCp window = new TeacherCp();
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
	public TeacherCp() {
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
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(0, 19, 117, 29);
		frame.getContentPane().add(btnHome);
		
		JButton btnSchadule = new JButton("Schadule");
		btnSchadule.setBounds(111, 19, 117, 29);
		frame.getContentPane().add(btnSchadule);
		
		JButton btnQuestion = new JButton("Question");
		btnQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherQ t = new TeacherQ();
				t.Tq();//switch next page i.e question page
			}
		});
		btnQuestion.setBounds(222, 19, 117, 29);
		frame.getContentPane().add(btnQuestion);
		
		JButton btnResult = new JButton("Result");
		btnResult.setBounds(333, 19, 117, 29);
		frame.getContentPane().add(btnResult);
	}
}
