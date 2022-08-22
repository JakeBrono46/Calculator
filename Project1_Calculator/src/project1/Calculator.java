package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
	
	static JFrame frame;
	static JPanel textField, buttons;
	static JTextField result;
	static JButton zero, one, two, three, four, five, six, seven, eight, nine, clear, percent, decimal, close, divide, multiply, subtract, add, equal, delete;
	static double num1, num2, results;
	static String operations, answer;
	
	public static void main(String[] args){
		
		//Create GUI
		frame = new JFrame();	
		frame.setTitle("Calculator Application");
		frame.setSize(400, 400);
		
		//JPanel
		textField = new JPanel();
		textField.setLayout(new BorderLayout());
		
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(5, 4, 4, 4));

		//Text Field
		result = new JTextField(30);
		result.setEditable(false);
		result.setPreferredSize(new Dimension(100, 70));
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setFont(new Font("Tahoma", Font.PLAIN, 30));
				
		//Buttons
		
		//Numbers
		zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "0");
			}
		});
		
		one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.PLAIN, 20));
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "1");
			}
		});
		
		two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.PLAIN, 20));
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "2");
			}
		});
		
		three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.PLAIN, 20));
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "3");
			}
		});
		
		four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.PLAIN, 20));
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "4");
			}
		});
		
		five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.PLAIN, 20));
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "5");
			}
		});
		
		six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.PLAIN, 20));
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "6");
			}
		});
		
		seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.PLAIN, 20));
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "7");
			}
		});
		
		eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "8");
			}
		});
		
		nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "9");
			}
		});
		
		
		//Operators
		divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(result.getText());
				result.setText("");
				operations = "/";
			}
		});
		
		multiply = new JButton("*");
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(result.getText());
				result.setText("");
				operations = "*";
			}
		});
		
		subtract = new JButton("-");
		subtract.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(result.getText());
				result.setText("");
				operations = "-";
			}
		});
		
		add = new JButton("+");		
		add.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(result.getText());
				result.setText("");
				operations = "+";
			}
		});
		
		equal = new JButton("=");
		equal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(result.getText());
				
				if(operations == "+") {
					results = num1 + num2;
					answer = String.format("%.0f", results);
					result.setText(answer);
				}else if(operations == "-") {
					results = num1 - num2;
					answer = String.format("%.0f", results);
					result.setText(answer);
				}else if(operations == "*") {
					results = num1 * num2;
					answer = String.format("%.0f", results);
					result.setText(answer);
				}else if(operations == "/") {
					
					if(num2 != 0) {
						results = num1 / num2;
						answer = String.format("%.0f", results);
						result.setText(answer);
					}else {
						result.setText("Error");
					}
				}
			}
		});
		
		
		//Number Formatting
		percent = new JButton("%");
		percent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "%");
			}
		});
		
		decimal = new JButton(".");
		decimal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + ".");
			}
		});
		
		
		//Clear, delete, exit
		clear = new JButton("C");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
			}
		});
		
		delete = new JButton("Delete");
		delete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Delete = null;
				
				if(result.getText().length() > 0) {
					StringBuilder builder = new StringBuilder(result.getText());
					builder.deleteCharAt(result.getText().length() - 1);
					Delete = builder.toString();
					result.setText(Delete);
				}
			}
		});
		
		close = new JButton("Exit");
		close.setFont(new Font("Tahoma", Font.PLAIN, 20));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		//Add components to JPanel
		frame.add(textField);
		textField.add(result, BorderLayout.NORTH);
		textField.add(buttons, BorderLayout.CENTER);
		
		buttons.add(clear);
		buttons.add(delete);
		buttons.add(close);
		buttons.add(divide);
		
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(multiply);
		
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(subtract);
		
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(add);
		
		buttons.add(zero);
		buttons.add(decimal);
		buttons.add(percent);
		buttons.add(equal);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}

}
