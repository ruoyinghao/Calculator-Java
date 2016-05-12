// The calculator project. MyCalculator part.
// Written by Ruoying Hao, Magen Crawford, Daniel Say.
// Written since January 24.
//Honor Code: I have acted with honesty and integrity when producing this work and I am unaware of anyone who has not.

import acm.program.*;      // To import acm.program.*  we need to download acm.jar, an external .jar file from the Internet.
 						   // A .jar file is an archive file that contains many Java class files that used to build up an program.
                           // This package contains codes to view the applet. 
						   // Asterisks are used to import all classes in a specific package.
import javax.swing.*; 	   // The JButton class is part of the package  
import java.awt.*;		   // The GridLayout is part of this package 	
import java.awt.event.*;   // This package contains codes that make the buttons functional
import acm.gui.*;          // This package contains the code for the display screen.

public class MyCalculator extends DialogProgram{ //Class that contains coding for MyCalculator project                        
                                                 //These codes construct buttons 0-9,+-*/, C, CE and =,
	JButton zero = new JButton("0");             //Construct with JButton instead of Button.
	JButton seven = new JButton("7");            //JButton enable us to configure those buttons.
	JButton eight = new JButton("8");            	//we cannot control the appearance of the buttons
	JButton nine = new JButton("9");             	// if we use Button.
	JButton add = new JButton("+");
	JButton ded = new JButton("-");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton mul = new JButton("*");
	JButton over = new JButton("/");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton dot = new JButton(".");
	JButton equ = new JButton("=");
	JButton clear = new JButton("C");
	JButton ce = new JButton("CE");
	
	
	
	DoubleField screen = new DoubleField();   //Constructs a display
	
	Accumulator acc = new Accumulator();      //Constructs an 'accumulator' where codes are used to keep track of the operations 
											  //performed so far and results
	public void init(){					  // This method is for the appearance of the calculator
		JPanel textPanel = new JPanel();  // Construct a panel that contains the display screen.
		                                  // It is impossible to put the screen in the proper place 
		                                  		//when the screen is in the same panel with the buttons
		textPanel.add(screen);
		add(textPanel,BorderLayout.NORTH); //We found it in API(Application programming interface), 
		                                   //which enable the textPanel to show up in front of the samplePanel.
		screen.setPreferredSize(new Dimension(500, 100)); //The unit of width and height is Pixel, which is standard.
		
		JPanel samplePanel = new JPanel(); //This panel will contain all the buttons.
		
		samplePanel.add(seven);  //Add buttons to the samplePanel. 
		samplePanel.add(eight);  //Positions of the buttons on the calculator rely on the order of these statements
		samplePanel.add(nine);
		samplePanel.add(clear);
		samplePanel.add(ce);
		
		samplePanel.add(four);
		samplePanel.add(five);
		samplePanel.add(six);
		samplePanel.add(add);
		samplePanel.add(ded);
		
		

		samplePanel.add(one);
		samplePanel.add(two);
		samplePanel.add(three);
		samplePanel.add(mul);
		samplePanel.add(over);
		
		samplePanel.add(dot);
		samplePanel.add(zero);
		samplePanel.add(equ);
		
		
		zero.setFont(new Font("Times New Roman", Font.BOLD, 32)); //personalize the numbers/characters
		one.setFont(new Font("Times New Roman", Font.BOLD, 32));
		two.setFont(new Font("Times New Roman", Font.BOLD, 32));
		three.setFont(new Font("Times New Roman", Font.BOLD, 32));
		four.setFont(new Font("Times New Roman", Font.BOLD, 32));
		five.setFont(new Font("Times New Roman", Font.BOLD, 32));
		six.setFont(new Font("Times New Roman", Font.BOLD, 32));
		seven.setFont(new Font("Times New Roman", Font.BOLD, 32));		
		eight.setFont(new Font("Times New Roman", Font.BOLD, 32));	
		nine.setFont(new Font("Times New Roman", Font.BOLD, 32));		// We can personalize all aspects of the font (i.e. Times New Roman, bold, size) 
		add.setFont(new Font("Times New Roman", Font.BOLD, 32));		// using JButton rather than using 'Button'. 
		ded.setFont(new Font("Times New Roman", Font.BOLD, 32));	    // Button only lets us personalize size and bold.
		mul.setFont(new Font("Times New Roman", Font.BOLD, 32));
		over.setFont(new Font("Times New Roman", Font.BOLD, 32));
		dot.setFont(new Font("Times New Roman", Font.BOLD, 32));
		equ.setFont(new Font("Times New Roman", Font.BOLD, 32));
		clear.setFont(new Font("Times New Roman", Font.BOLD, 32));
		ce.setFont(new Font("Times New Roman", Font.BOLD, 32));

		screen.setFont(new Font("Times New Roman", Font.BOLD, 32));		// You can personalize the numbers on the display as well
		
		add(samplePanel); //This adds panel to the applet.
		
		samplePanel.setLayout(new GridLayout(4,5,9,9)); //Arrange the buttons. First number determines how many buttons will be in one column.
														// Second number determines how many buttons will be in one row.
		                                                // The third number determines how many pixels are in between the buttons horizontally.
														// The fourth number determines how many pixels are in between the buttons vertically.
	    setSize(500,500);	//This sets the size for the whole applet.
	    addActionListeners(); //This calling will enable the programming to detect the clicking of the buttons.
	}
	public void actionPerformed(ActionEvent e) {	//This method makes the buttons functional.
		String clicked = e.getActionCommand(); 
		if(clicked.equals("CE"))
			screen.setText("");
		
		if(clicked.equals("0"))
		screen.setText(screen.getText() + clicked);       //if we write if(clicked.equals("0"))
		if(clicked.equals("1"))                           //            screen.setText("0");
			screen.setText(screen.getText() + clicked);   //what might go wrong : we press 0 multiple time but only display 0 once.
		if(clicked.equals("2"))
			screen.setText(screen.getText() + clicked); 	//this code enables the program to reserve the numbers we've clicked.
		if(clicked.equals("3"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("4"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("5"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("6"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("7"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("8"))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("9"))
			screen.setText(screen.getText() + clicked); 
		if(clicked.equals("."))
			screen.setText(screen.getText() + clicked);
		if(clicked.equals("+")){                       		
			acc.calculate(screen.getValue(), "+");     		// These codes will call the accumulator to get the number on the screen
			screen.setText("");                        		// and do the calculation with whichever operator is in use. 
			}
		if(clicked.equals("-")){
			acc.calculate(screen.getValue(), "-");
			screen.setText("");
			}
		if(clicked.equals("*")){
			acc.calculate(screen.getValue(), "*");
			screen.setText("");
			}
		if(clicked.equals("/")){
			acc.calculate(screen.getValue(), "/");
			screen.setText("");
			}
		if(clicked.equals("C")){
			acc.calculate(screen.getValue(), "C");			//This calls the accumulator to clear all data in memory.
			screen.setText("");
			}
		if(clicked.equals("=")){
			acc.calculate(screen.getValue(), "="); 
			screen.setValue(acc.getValue()); 			//This code enables the screen to set a value that is the value we've calculated.
		   
		}

		

	}
	
	
}