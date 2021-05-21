package com.project.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;

import com.calculater.CalcultorModels;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculater {

	private JFrame frame;
	private JTextField textResult;
	private JTextField textOperator;
	CalcultorModels model = new CalcultorModels();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater window = new Calculater();
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
	public Calculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textResult = new JTextField();
		textResult.setBounds(10, 38, 416, 51);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOperator.setText(null);
				textOperator.setText(null);
				
				
			}
		});
		btnClear.setBounds(10, 100, 89, 51);
		frame.getContentPane().add(btnClear);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum7.getText());
			}
		});
		btnNum7.setBounds(10, 162, 89, 51);
		frame.getContentPane().add(btnNum7);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum4.getText());
			}
		});
		btnNum4.setBounds(10, 224, 89, 51);
		frame.getContentPane().add(btnNum4);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum1.getText());
				
			}
		});
		btnNum1.setBounds(10, 286, 89, 51);
		frame.getContentPane().add(btnNum1);
		
		JButton btnNum00 = new JButton("00");
		btnNum00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum00.getText());
			}
		});
		btnNum00.setBounds(10, 348, 89, 51);
		frame.getContentPane().add(btnNum00);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum3(Double.parseDouble(textResult.getText()));
				model.mod();
				textResult.setText(toString().valueOf(model.getResult()));
				textOperator.setText(textOperator.getText()+" "+toString().valueOf(model.getNum3())+" % = ");
			}
		});
		btnPercentage.setBounds(118, 100, 89, 51);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnBackspace = new JButton("<--");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = new String();
				StringBuilder stringBuilder = new StringBuilder(textResult.getText());
				stringBuilder.deleteCharAt(textResult.getText().length()-1);
				textResult.setText( stringBuilder.toString());
				
				
			}
		});
		btnBackspace.setBounds(230, 100, 89, 51);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.setNum1(Double.parseDouble(textResult.getText()));
				model.setOperator(btnDivision.getText());
				textResult.setText(null);
				textOperator.setText(model.getNum1()+ model.getOperator());
			}
		});
		btnDivision.setBounds(329, 100, 89, 51);
		frame.getContentPane().add(btnDivision);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum8.getText());
			}
		});
		btnNum8.setBounds(118, 162, 89, 51);
		frame.getContentPane().add(btnNum8);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum5.getText());
			}
		});
		btnNum5.setBounds(118, 224, 89, 51);
		frame.getContentPane().add(btnNum5);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum2.getText());
			}
		});
		btnNum2.setBounds(118, 286, 89, 51);
		frame.getContentPane().add(btnNum2);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum0.getText());
			}
		});
		btnNum0.setBounds(118, 348, 89, 51);
		frame.getContentPane().add(btnNum0);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum9.getText());
			}
		});
		btnNum9.setBounds(230, 162, 89, 51);
		frame.getContentPane().add(btnNum9);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum6.getText());
			}
		});
		btnNum6.setBounds(230, 224, 89, 51);
		frame.getContentPane().add(btnNum6);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnNum3.getText());
			}
		});
		btnNum3.setBounds(230, 286, 89, 51);
		frame.getContentPane().add(btnNum3);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+btnDecimal.getText());
			}
		});
		btnDecimal.setBounds(230, 348, 89, 51);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEqualto = new JButton("=");
		btnEqualto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum2(Double.parseDouble(textResult.getText()));
				
			   switch (model.getOperator()) {
			case "+":
				
				textResult.setText(toString().valueOf(model.add()));
				textOperator.setText(model.getNum1()+" "+model.getOperator()+" "+model.getNum2()+""+"=");
				
				break;
				case "-":
				
				textResult.setText(toString().valueOf(model.sub()));
				textOperator.setText(model.getNum1()+" "+model.getOperator()+" "+model.getNum2()+""+"=");
				break;
				case "x":
					
					textResult.setText(toString().valueOf(model.multi()));
					textOperator.setText(model.getNum1()+" "+model.getOperator()+" "+model.getNum2()+""+"=");
					break;
				
				case "/":
					
					textResult.setText(toString().valueOf(model.div()));
					textOperator.setText(model.getNum1()+" "+model.getOperator()+" "+model.getNum2()+""+"=");
					
					break;

			default:
				textOperator.setText(textOperator.getText()+" "+toString().valueOf(model.getNum2())+" = ");
				break;
			}
			}
		});
		btnEqualto.setBounds(329, 348, 89, 51);
		frame.getContentPane().add(btnEqualto);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum1(Double.parseDouble(textResult.getText()));
				model.setOperator(btnAddition.getText());
				textResult.setText(null);
				textOperator.setText(model.getNum1()+model.getOperator());
				
			}
		});
		btnAddition.setBounds(329, 286, 89, 51);
		frame.getContentPane().add(btnAddition);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.setNum1(Double.parseDouble(textResult.getText()));
				model.setOperator(btnSubtraction.getText());
				textResult.setText(null);
				textOperator.setText(model.getNum1()+ model.getOperator());
			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtraction.setBounds(329, 224, 89, 51);
		frame.getContentPane().add(btnSubtraction);
		
		JButton btnMultiplection = new JButton("x");
		btnMultiplection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.setNum1(Double.parseDouble(textResult.getText()));
				model.setOperator(btnMultiplection.getText());
				textResult.setText(null);
				textOperator.setText(model.getNum1()+""+ btnMultiplection.getText());
			}
		});
		btnMultiplection.setBounds(329, 162, 89, 51);
		frame.getContentPane().add(btnMultiplection);
		
		textOperator = new JTextField();
		textOperator.setBounds(329, 11, 86, 20);
		frame.getContentPane().add(textOperator);
		textOperator.setColumns(10);
	}
}
