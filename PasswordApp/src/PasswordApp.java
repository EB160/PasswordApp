import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class PasswordApp {

	private JFrame frame;
	private JTextField textField;
	private JButton btnDisplay;
	private JTextArea textAreaOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordApp window = new PasswordApp();
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
	public PasswordApp() {
		initialize();
		buttonEvent();
	}
	private void buttonEvent() {
		btnDisplay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				actionInput();
			}
		});
		
	}
	
	public void actionInput() {
		String password = textField.getText();
		
		if (password.length() < 8 || password.length() > 12) {
            JOptionPane.showMessageDialog(frame, "Password is too short or too long!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password.contains(" ")) {
            JOptionPane.showMessageDialog(frame, "Remove spaces", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 197, 311, 69);
		frame.getContentPane().add(scrollPane);
		
		textAreaOutput = new JTextArea();
		scrollPane.setViewportView(textAreaOutput);
		
		btnDisplay = new JButton("Display");
		btnDisplay.setBounds(167, 156, 117, 29);
		frame.getContentPane().add(btnDisplay);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(83, 78, 70, 16);
		frame.getContentPane().add(passwordLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(154, 73, 164, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
