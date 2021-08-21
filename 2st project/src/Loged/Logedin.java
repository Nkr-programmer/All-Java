package Loged;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import trial.tria;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Logedin {

	private JFrame frame;
	private JTextField txtghj;
	private JPasswordField pwdHttgr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logedin window = new Logedin();
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
	public Logedin() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(85, 101, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtghj = new JTextField();
		txtghj.setBounds(240, 98, 96, 20);
		frame.getContentPane().add(txtghj);
		txtghj.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(85, 158, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a= txtghj.getText();
			if(a.contains( "asd"))
			{
				txtghj.setText("");
				
				tria info=new tria();
			//	tria.main(null);
				info.main(null);
			}
			else
			{
				txtghj.setText("hello man");
			}
			}
			
		});
		btnNewButton.setBounds(150, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(164, 203, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		pwdHttgr = new JPasswordField();
		pwdHttgr.setText("httgr");
		pwdHttgr.setBounds(158, 46, 7, 20);
		frame.getContentPane().add(pwdHttgr);
	}
}
