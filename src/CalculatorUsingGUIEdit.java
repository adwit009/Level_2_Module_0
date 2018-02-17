


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculatorUsingGUIEdit extends JFrame implements ActionListener {
	JTextField text = new JTextField(10);
	int check = 0;	
	double answer;
	double pnum;
	double num1;
	double num2;
	String string2;
	int doubleToInt;
	String string1;
	Font font1 = new Font ("Sanserif", Font.BOLD, 20);
	Font font2 = new Font ("Sanserif", Font.PLAIN, 40);
	public CalculatorUsingGUIEdit() {
		text.setFont(font2);
	JPanel p1 = new JPanel();
	p1.setLayout(new GridLayout(4,3));
	p1.add(jb_1);
	p1.add(jb_2);
	p1.add(jb_3);
	p1.add(jb_4);
	p1.add(jb_5);
	p1.add(jb_6);
	p1.add(jb_7);
	p1.add(jb_8);
	p1.add(jb_9);
	p1.add(jb_0);
	p1.add(jb_add);
	p1.add(jb_subtract);
	p1.add(jb_multiply);
	p1.add(jb_divide);
	p1.add(jb_equal);
	p1.add(jb_clear);
	JPanel p2 = new JPanel(new BorderLayout());
	
	p2.add(text,BorderLayout.NORTH);
	p2.add(p1, BorderLayout.CENTER);
	add(p2,BorderLayout.CENTER);

	}
	final JButton jb_1, jb_2, jb_3, jb_4,jb_5,jb_6,jb_7,jb_8,jb_9,jb_0,jb_add,jb_subtract,jb_multiply,jb_divide,jb_equal,jb_clear;{
		jb_1 = new JButton("1");
		jb_2 = new JButton("2");
		jb_3 = new JButton("3");
		jb_4 = new JButton("4");
		jb_5 = new JButton("5");
		jb_6 = new JButton("6");
		jb_7 = new JButton("7");
		jb_8 = new JButton("8");
		jb_9 = new JButton("9");
		jb_0 = new JButton("0");
		jb_add = new JButton("+");
		jb_subtract = new JButton("_");
		jb_multiply = new JButton("*");
		jb_divide = new JButton("/");
		jb_equal = new JButton("=");
		jb_clear = new JButton("Clear");
		jb_1.setFont(font1); 
		jb_2.setFont(font1); 
		jb_3.setFont(font1); 
		jb_4.setFont(font1); 
		jb_5.setFont(font1); 
		jb_6.setFont(font1); 
		jb_7.setFont(font1); 
		jb_8.setFont(font1); 
		jb_9.setFont(font1); 
		jb_0.setFont(font1); 
		jb_add.setFont(font1); 
		jb_subtract.setFont(font1);
		jb_multiply.setFont(font1); 
		jb_divide.setFont(font1); 
		jb_equal.setFont(font1); 
		jb_clear.setFont(font1); 
	jb_1.addActionListener(this);
	jb_2.addActionListener(this);
	jb_3.addActionListener(this);
	jb_4.addActionListener(this);
	jb_5.addActionListener(this);
	jb_6.addActionListener(this);
	jb_7.addActionListener(this);
	jb_8.addActionListener(this);
	jb_9.addActionListener(this);
	jb_0.addActionListener(this);
	jb_add.addActionListener(this);
	jb_subtract.addActionListener(this);
	jb_multiply.addActionListener(this);
	jb_divide.addActionListener(this);
	jb_equal.addActionListener(this);
	jb_clear.addActionListener(this);}
	
	public static void main(String[] args) {
	CalculatorUsingGUIEdit frame = new CalculatorUsingGUIEdit();
	frame.setTitle("Calculator");
	frame.setSize(350,500);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

	
}
String num = text.getText();  

public void actionPerformed(ActionEvent evt)
{
	if (evt.getSource()==jb_add)
    {
	 check = 1;
	 String str = text.getText();
	 num1 = Integer.parseInt(str);
	text.setText("0"); 
	num = "";
	
    }
else if (evt.getSource()==jb_subtract)
    {
	check = 2;   	 
	 String str = text.getText();
	  num1 = Integer.parseInt(str);
	text.setText("0"); 
	num = "";
    }
else if (evt.getSource()==jb_multiply)
    {
	check = 3;   	 
	 String str = text.getText();
	 num1 = Integer.parseInt(str);
	text.setText("0"); 
	num = "";        }
else if (evt.getSource()==jb_divide)
    {
	check = 4;   	 
	 String str = text.getText();
	  num1 = Integer.parseInt(str);
	text.setText("0"); 
	num = "";
    }
	else if (evt.getSource()==jb_1)
         {
    	 num = num + "1";
    	 
    	text.setText(num);
         }
     else if (evt.getSource()==jb_2)
         {
    	 num = num + "2";
    	 
	    	text.setText(num);

         }
     else if (evt.getSource()==jb_3)
         {
    	 num = num + "3";
    	 
	    	text.setText(num);
         }
     else if (evt.getSource()==jb_4)
         {
    	 num = num + "4";
    	 
	    	text.setText(num);
         }
     else if (evt.getSource()==jb_5)
         {
    	 num = num + "5";
    	 
	    	text.setText(num);
         }
     else if (evt.getSource()==jb_6)
     {
    	 num = num + "6";
    	 
	    	text.setText(num);
     }
 else if (evt.getSource()==jb_7)
     {
	 num = num + "7";
	 
    	text.setText(num);
     }
 else if (evt.getSource()==jb_8)
     {
	 num = num + "8";
	 
    	text.setText(num);
     }
 else if (evt.getSource()==jb_9)
     {
	 num = num + "9";
	 
    	text.setText(num);
     }          	
 else if (evt.getSource()==jb_0)
 {
	 num = num + "0";
	 
    	text.setText(num);
 }          	
 else if (evt.getSource()==jb_equal)
 {
	switch (check) {
case 1:
	 string1 = text.getText();
   	  num2 = Integer.parseInt(string1);
	 answer = num1 +  num2;
	 string2 = "";
	 doubleToInt = (int) answer;
	string2 = string2 + doubleToInt;
	text.setText(string2);
	num = "";
	break;
case 2:
   string1 = text.getText();
	num2 = Integer.parseInt(string1);
		answer = num1 -  num2;
		 string2 = "";
		 doubleToInt = (int) answer;
		string2 = string2 + doubleToInt;
		text.setText(string2);
	
	num1 = doubleToInt;
		break;
case 3:
	 string1 = text.getText();
	num2 = Integer.parseInt(string1);
		answer = num1 *  num2;
		 string2 = "";
		 doubleToInt = (int) answer;
		string2 = string2 + doubleToInt;
		text.setText(string2);
	num = "";
		break;
case 4:
	 string1 = text.getText(); 
	num2 = Integer.parseInt(string1);
	answer = 0;	
	answer = num1 /  num2;
		 string2 = "";
	
		
		 string2 = string2 + answer;
		text.setText(string2);
		num = "";
		
	break;

	default:
	JOptionPane.showMessageDialog(null, "Error, please enter a value, an operator, another value\nand then click the equals sign");
	break;
	}
 }
	else if (evt.getSource()==jb_clear)
    {
   text.setText("");
   num = "";
    check = 0;	
    answer = 0;
    pnum = 0;
    num1 = 0;
    num2 = 0;
    string2 = "";
    doubleToInt = 0;
    string1 = "";
    }	
 
 
}
}