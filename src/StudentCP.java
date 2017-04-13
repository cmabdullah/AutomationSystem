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

public class StudentCP extends JFrame {

	private JPanel contentPane;
	private JTextField txtHiAbdullahHow;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnRadio = new JRadioButton("radio");
		panel.add(rdbtnRadio);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		txtHiAbdullahHow = new JTextField();
		txtHiAbdullahHow.setText("Hi abdullah How are you???");
		panel.add(txtHiAbdullahHow);
		txtHiAbdullahHow.setColumns(10);
	}

}
