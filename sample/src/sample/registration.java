package sample;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;

import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
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
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(81, 55, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTRATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(195, 11, 109, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(81, 90, 73, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(81, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(177, 52, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(177, 87, 86, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "EEE", "CS", "DS"}));
		cb1.setBounds(177, 122, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(172, 156, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(277, 156, 117, 23);
		frame.getContentPane().add(r2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "VJ", "WGL", "KADAPA", "KURNOOL", "VIZAG"}));
		cb2.setBounds(177, 191, 117, 22);
		frame.getContentPane().add(cb2);
		
		
		JLabel lblNewLabel_5 = new JLabel("GENDER");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(81, 160, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CITY");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(81, 195, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton b1 = new JButton("SUBMIT");
		b1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String branch = (String) cb1.getSelectedItem();
				String city = (String) cb2.getSelectedItem();
				ButtonGroup rgb = new ButtonGroup();
			
				rgb.add(r1);
				rgb.add(r2);
				String gender = "";
				if(r1.isSelected())
				{
					gender = "male";
				}
				else
				{
					gender = "female";
				}
				Component btnNewButton = null;
				JOptionPane.showMessageDialog(btnNewButton, " name "+user+"\n branch " +branch + "city " + city + "gender " +gender);
				
				
				
			}
		});
		b1.setBounds(177, 227, 86, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("CITY");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\4.2-1-1-696x1024.jpg"));
		lblNewLabel_1.setBounds(10, 0, 414, 287);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
