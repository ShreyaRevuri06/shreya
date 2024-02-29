package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro window = new Metro();
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
	public Metro() {
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
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setBounds(75, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(75, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(75, 147, 89, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setBounds(75, 184, 104, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("METRO APPLICATION");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setForeground(SystemColor.text);
		lblNewLabel_5.setBounds(111, 11, 168, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton b1 = new JButton("BUY");
		b1.setToolTipText("ENTER FROM:");
		b1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String source = (String)cb1.getSelectedItem();
				String destination = (String)cb2.getSelectedItem();
				
				String tickets = (String)cb3.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				int bill = 0;
				Component btnNewButton = null;
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "please check the source and destination");
				}
				else
				{   bill = bill+45*nt;
					JOptionPane.showConfirmDialog(btnNewButton, "name " +name +"\n source " +source +"\ndestination: "+destination +"\nno.of tickets "+nt +"\namount "+bill);
				}
				
			
				
			}
		});
		b1.setBounds(184, 217, 60, 20);
		frame.getContentPane().add(b1);
		
		tb1 = new JTextField();
		tb1.setBounds(174, 70, 92, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"UPPAL", "MIYAPUR"}));
		cb1.setBounds(174, 103, 92, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setToolTipText("ENTER TO:");
		cb2.setModel(new DefaultComboBoxModel(new String[] {"RAIDURG", "LB NAGAR"}));
		cb2.setBounds(174, 143, 92, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cb3.setBounds(174, 184, 92, 22);
		frame.getContentPane().add(cb3);
		
		JLabel lblNewLabel = new JLabel("DESTINATION");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\metro.jpg"));
		lblNewLabel.setBounds(10, 0, 424, 250);
		frame.getContentPane().add(lblNewLabel);
	}

}
