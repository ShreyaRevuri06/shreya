package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOMMERCE {

	private JFrame frame;
	int items = 0;
	int bill = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCE window = new ECOMMERCE();
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
	public ECOMMERCE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ECOMMERCE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(145, 11, 121, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("RS.250");
		lb1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lb1.setBounds(93, 198, 46, 14);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("RS.500");
		lb2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lb2.setBounds(199, 198, 46, 14);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("RS.270");
		lb3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lb3.setBounds(308, 198, 46, 14);
		frame.getContentPane().add(lb3);
		
		JLabel l1 = new JLabel("CART : 0");
		l1.setBounds(308, 23, 79, 14);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "NUMBER OF ITEMS : " +items + "\nTOTAL BILL : "+bill);
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton b1 = new JButton("");
		b1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\BOOK2.jpg"));
		b1.setBounds(50, 61, 89, 124);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\BOOK2.jpg"));
		b2.setBounds(156, 61, 89, 124);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\BOOK2.jpg"));
		b3.setBounds(265, 61, 89, 124);
		frame.getContentPane().add(b3);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill = bill + 250;
				l1.setText("cart : "+items);
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill = bill + 500;
				l1.setText("cart : "+items);
				
				
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				bill = bill + 270;
				l1.setText("cart : "+items);
				
				
			}
		});
	}

}
