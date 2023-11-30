import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;



	public login() {
		setBounds(100, 100, 958, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		JLabel leftGif = new JLabel("");
		leftGif.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\thoughtworks-gif_dribbble.gif"));
		leftGif.setBounds(0, 0, 469, 509);
		contentPane.add(leftGif);  
		
		JLabel UsernameJlebel = new JLabel("USERNAME");
		UsernameJlebel.setForeground(new Color(255, 255, 255));
		UsernameJlebel.setFont(new Font("Tahoma", Font.BOLD, 20));
		UsernameJlebel.setBounds(572, 171, 123, 31);
		contentPane.add(UsernameJlebel);
		
		JLabel passwordJlebel = new JLabel("PASSWORD");
		passwordJlebel.setForeground(new Color(255, 255, 255));
		passwordJlebel.setFont(new Font("Tahoma", Font.BOLD, 19));
		passwordJlebel.setBounds(572, 239, 123, 31);
		contentPane.add(passwordJlebel);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		textField.setBounds(705, 171, 211, 29);
		contentPane.add(textField);
		//textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(705, 239, 211, 31);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Dropbox\\PC\\Downloads\\thoughtworks-gif_dribbble.gif"));
		lblNewLabel_4.setBounds(0, 0, 469, 509);
		contentPane.add(lblNewLabel_4);
		
		
		JButton resetbutton = new JButton("Reset");
		resetbutton.setBackground(new Color(127, 255, 0));
		resetbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		resetbutton.setBounds(705, 332, 101, 31);
		contentPane.add(resetbutton);
		resetbutton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		
		
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.setBackground(new Color(255, 127, 80));
		exitbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		exitbutton.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		JButton loginbutton = new JButton("Log in");
		loginbutton.setBackground(new Color(0, 255, 51));
		loginbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		loginbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String un=textField.getText();
				String pas=passwordField.getText();
				
				if(un.equals ("student")&&pas.equals("student")) {
					Instructions l=new Instructions();
					l.show();
					dispose();
				}
				else {
					JFrame f;
					f=new JFrame(); 
					JOptionPane.showMessageDialog(f,"Invalid User & Password.Try Again."); 	
				}
				
			
			}

		});
		loginbutton.setBounds(816, 331, 100, 31);
		contentPane.add(loginbutton);
		
		exitbutton.setBounds(605, 331, 90, 31);
		contentPane.add(exitbutton);
		
		JLabel userPIC = new JLabel("");
		userPIC.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_png-transparent-login-computer-icons-password-login-black-symbol-subscription-business-model-thumbnail-removebg-preview.png"));
		userPIC.setBounds(528, 175, 31, 31);
		contentPane.add(userPIC);
		
		JLabel passPIC = new JLabel("");
		passPIC.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_268-2683321_change-password-svg-png-icon-free-download-password-removebg-preview.png"));
		passPIC.setBounds(528, 239, 31, 31);
		contentPane.add(passPIC);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_1aiub_whole_logo.png"));
		lblNewLabel.setBounds(833, 10, 101, 111);
		contentPane.add(lblNewLabel);
	}
	
	
	public static void main(String[] args) {

				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
				
				}
			}
		
	}

