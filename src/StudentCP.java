import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

public class StudentCP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentCP frame = new StudentCP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentCP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(26, 31, 117, 29);
		contentPane.add(btnHome);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(170, 31, 117, 29);
		contentPane.add(btnProfile);
		
		JButton btnStartExm = new JButton("Start exm");
		btnStartExm.setBackground(Color.GREEN);
		btnStartExm.setBounds(313, 31, 117, 29);
		contentPane.add(btnStartExm);
	}
}
