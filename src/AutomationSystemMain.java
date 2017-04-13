import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AutomationSystemMain {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel Ulbl;
	private JLabel Plbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutomationSystemMain window = new AutomationSystemMain();
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
	public AutomationSystemMain() {
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
		
		Ulbl = new JLabel("username");
		Ulbl.setBounds(54, 42, 95, 16);
		frame.getContentPane().add(Ulbl);
		
		Plbl = new JLabel("password");
		Plbl.setBounds(53, 89, 83, 16);
		frame.getContentPane().add(Plbl);
		
		textField = new JTextField();
		textField.setBounds(182, 37, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 84, 130, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	JOptionPane.showMessageDialog(null, "Hi abdullah");
			//	Ulbl.setText("Hi it is user name");
			//	Plbl.setText("Hi it is password");
				String name = textField.getText();
		        String pass = passwordField.getText();
		        /**
		        if(name.equals("name")&& pass.equals("cm")){
		        	JOptionPane.showMessageDialog(null, "success");
		        }
		        else{
		        	JOptionPane.showMessageDialog(null, "not match");
		        }
		        */
		        if(booleanLoginTest.check(name, pass)){
		        	StudentCP cc = new StudentCP();
		        	//cc.NewScreen();
		        	cc.setVisible(true);
		        }
			}
		});
		btnSubmit.setBounds(168, 144, 117, 29);
		frame.getContentPane().add(btnSubmit);
	}
}
