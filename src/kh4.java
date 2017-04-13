import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class kh4 {

	private JFrame frame;
	private JTextField txtEnterYourName;
	private JTextField txtAddress;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kh4 window = new kh4();
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
	public kh4() {
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
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setText("Enter your name");
		txtEnterYourName.setBounds(230, 78, 130, 26);
		frame.getContentPane().add(txtEnterYourName);
		txtEnterYourName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setBounds(230, 116, 130, 26);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		txtPhone.setBounds(230, 155, 130, 26);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(71, 83, 61, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(71, 121, 61, 16);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(71, 160, 61, 16);
		frame.getContentPane().add(lblPhone);
	}

}
