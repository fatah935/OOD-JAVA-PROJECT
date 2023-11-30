import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class last extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    private JLabel lblNewLabel;
    last(String s)  
    {   
      
        l=new JLabel(); 
    
        getContentPane().add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            getContentPane().add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b1.setForeground(new Color(0, 0, 0));
        b1.setBackground(new Color(192, 192, 192));
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        b2=new JButton("RESULT");  
        b2.setBackground(new Color(192, 192, 192));
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        getContentPane().add(b1);
        getContentPane().add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(48,480,100,30);  
        b2.setBounds(171,480,141,30);  
       
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblNewLabel.setIcon(new ImageIcon("D:\\DIU\\CODING\\JAVA\\LEARN\\Online_Quiz\\Pictures"));
        lblNewLabel.setBounds(0, 0, 786, 563);
        getContentPane().add(lblNewLabel);
        setLocation(250,100);  
        setVisible(true);  
        setSize(724,600);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
       
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;   
            JOptionPane.showMessageDialog(this,"NUMBER OF CORRECT ANSWERS:"+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true); 
        if(current==0)  
        {  
            l.setText("Q-1: What is the default value of short variable?");  
            jb[0].setText("0.0");jb[1].setText("0");jb[2].setText("null");jb[3].setText("false");   
        }  
        if(current==1)  
        {  
            l.setText("Q-2: What is the default value of Object variable?");  
            jb[0].setText("Undefined");jb[1].setText("0");jb[2].setText("null");jb[3].setText("true");  
        }  
        if(current==2)  
        {  
            l.setText("Q-3: java.util.Collections is a:");  
            jb[0].setText("All of the below");jb[1].setText("object");jb[2].setText("interface");jb[3].setText("class");  
        }  
        if(current==3)  
        {  
            l.setText("Q-4: String class is defined in which package?");  
            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
        }  
        if(current==4)  
        {  
            l.setText("Q-5: Which institute is best for java coaching?");  
            jb[0].setText("Utek");jb[1].setText("Aptech");jb[2].setText("SSS IT");jb[3].setText("jtek");  
        }  
        if(current==5)  
        {  
            l.setText("Q-6: Which one among these is not a keyword?");  
            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
        }  
        if(current==6)  
        {  
            l.setText("Q-7: Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
                        jb[3].setText("Button");  
        }  
        if(current==7)  
        {  
            l.setText("Q-8: which one among these is not a function of Object class?");  
            jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
                        jb[3].setText("getDocumentBase");         
        }  
        if(current==8)  
        {  
            l.setText("Q-9: which function is not present in Applet class?");  
            jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
        }  
        if(current==9)  
        {  
            l.setText("Q-10: Which one among these is not a valid component?");  
            jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");  
                        jb[3].setText("JTextArea");  
        }  
        l.setBounds(30,40,858,20);  
     
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return true;  
    }  
    public static void main(String s[])  
    {  
        new last("");  
    }  
}  