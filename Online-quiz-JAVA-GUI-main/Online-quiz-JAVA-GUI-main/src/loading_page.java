	import javax.swing.*;
	import java.awt.Color;
	import java.awt.Font;    
	public class loading_page extends JFrame{    
	JProgressBar jb;    
	int i=0,num=0;     
	public loading_page() 
	
	{
		//getContentPane().setBackground(new Color(0, 0, 153));    
		jb=new JProgressBar(0,2000);    
		jb.setBackground(new Color(153, 153, 153));
		jb.setForeground(new Color(124, 252, 0));
		jb.setBounds(10,438,623,11);         
		jb.setValue(0);    
		jb.setStringPainted(true); 
		
		getContentPane().add(jb);    
		setSize(657,499);    
		getContentPane().setLayout(null);    
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\rsz_1aiub_whole_logo.png"));
		lblNewLabel.setBounds(0, 0, 107, 105);
		getContentPane().add(lblNewLabel);
		
		JLabel OnlineQuiz = new JLabel("ONLINE QUIZ");
		//OnlineQuiz.setLabelFor(getContentPane());
		OnlineQuiz.setFont(new Font("Tahoma", Font.BOLD, 35));
		OnlineQuiz.setForeground(Color.BLACK);
		OnlineQuiz.setBounds(206, 22, 262, 47);
		getContentPane().add(OnlineQuiz);
		
		JLabel lblNewLabel_2 = new JLabel("By Sinister Trio");
		lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(220, 409, 199, 23);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures\\..gif"));
		lblNewLabel_4.setBounds(0, 0, 644, 458);
		getContentPane().add(lblNewLabel_4);
	}    
	public void iterate(){    
	while(i<=2000){    
	  jb.setValue(i);    
	  i=i+50; 
	  try{
		  Thread.sleep(100); 
	  }
	  catch(Exception e){}  
	  
	} 
	
	login log=new login();
	log.show();
	dispose();
	
	}    
	public static void main(String[] args) {    
	    loading_page m=new loading_page();    
	    m.setVisible(true);    
	    m.iterate(); 
	    }    
	}  