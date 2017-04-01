import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class AppWindow {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
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
	public AppWindow() {
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
		
		txtUsername = new JTextField();
		txtUsername.setBounds(229, 70, 130, 26);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(229, 107, 130, 26);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(153, 155, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ussername");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(76, 75, 95, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(76, 112, 95, 16);
		frame.getContentPane().add(lblPassword);
	}
}
