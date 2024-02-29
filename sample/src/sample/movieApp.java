package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieApp {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieApp window = new movieApp();
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
	public movieApp() {
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
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(34, 81, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(56, 40, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("NO.OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setBounds(34, 122, 107, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("BUY");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tb1.getText();
				String movie = (String) cb1.getSelectedItem();
				String tickets = (String) cb2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill = nt*200;
				}

				if(movie.equals("PUSHPA"))
				{
					bill = nt*200;
				}
				int res = 0;
				Component btnNewButton = null;
				res = JOptionPane.showConfirmDialog( btnNewButton, "Name " +user + "\nName of the movie : " +movie +" \nNo.of tickets: " +tickets + "\nTotal bill is : " +bill)
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Your booking is confirmed!!");
					tb1.setText(" ");
					cb1.setSelectedItem("")
					
				}
				
				else
				{
					JOptionPane.showMessageDialog( btnNewButton, "Booking is cancelled!!");
				}
			}
		});
		b1.setBackground(SystemColor.text);
		b1.setFont(new Font("Tahoma", Font.BOLD, 11));
		b1.setForeground(SystemColor.activeCaptionText);
		b1.setBounds(151, 186, 58, 23);
		frame.getContentPane().add(b1);
		
		tb1 = new JTextField();
		tb1.setToolTipText("Enter your name here");
		tb1.setBounds(150, 38, 112, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("select movie name here");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"RRR", "PUSHPA"}));
		cb1.setBounds(150, 78, 112, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("MOVIE APPLICATION");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setBounds(150, 11, 127, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(151, 119, 111, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel = new JLabel("NO.OF TICKETS");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\movie.jpg"));
		lblNewLabel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(lblNewLabel);
	}
}
