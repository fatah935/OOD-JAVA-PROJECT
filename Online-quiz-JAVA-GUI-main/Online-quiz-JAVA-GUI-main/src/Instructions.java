import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Instructions extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions frame = new Instructions();
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}


	public Instructions() {
		setBounds(100, 100, 1147, 683);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(123, 104, 238));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_1diu_whole_logo.png"));
		lblNewLabel.setBounds(492, 11, 100, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Daffodil International University\n\n\n\n");
		lblNewLabel_1.setForeground(new Color(100, 0, 0));
		lblNewLabel_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(330, 110, 707, 43);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Software Engineering");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(450, 181, 345, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_171ixd6yesnl.png"));
		lblNewLabel_4.setBounds(492, 223, 100, 100);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("1) You must use a functioning webcam and microphone.");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNewLabel_5.setBounds(40, 378, 584, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("2) There are 10 MCQ. Each contains 2 marks.");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNewLabel_6.setBounds(40, 413, 1062, 32);
		contentPane.add(lblNewLabel_6);
		
		JButton nextbutton = new JButton("NEXT PAGE");
		nextbutton.setForeground(new Color(240, 255, 240));
		nextbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				last la=new last(null);
				la.show();
				dispose();
			}
		});
		nextbutton.setBackground(new Color(0, 0, 0));
		nextbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		nextbutton.setBounds(470, 578, 154, 43);
		contentPane.add(nextbutton);
		
		JLabel lblNewLabel_8 = new JLabel("3) If you click next, you can not go previous.");
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNewLabel_8.setBounds(40, 449, 516, 26);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("INSTRUCTIONS:");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBackground(new Color(0, 191, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_7.setBounds(37, 287, 264, 54);
		contentPane.add(lblNewLabel_7);
	}
}
