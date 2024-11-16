package com.kod.Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class calculator1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator1 frame = new calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 23, 200, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 85, 200, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 144, 200, 34);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performOperation('+');
			}
		});
		btnNewButton.setBounds(20, 203, 85, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUB");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performOperation('-');
			}
		});
		btnNewButton_1.setBounds(127, 203, 85, 34);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("MUL");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performOperation('*');
			}
		});
		btnNewButton_2.setBounds(239, 203, 85, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIV");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performOperation('/');
			}
		});
		btnNewButton_3.setBounds(341, 203, 85, 34);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Number1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 30, 85, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 88, 85, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 147, 85, 27);
		contentPane.add(lblNewLabel_2);
		
	}
	public void performOperation(char operator) {
		double num1=Double.parseDouble(textField.getText());
		double num2=Double.parseDouble(textField_1.getText());
		
		double res;
		String result="";
		DecimalFormat df=new DecimalFormat();
		switch(operator) {
		case '+':
			res=num1+num2;
			result="Add="+df.format(res);
			break;
		case '-':
			res=num1-num2;
			result="Sub="+df.format(res);
			break;
		case '*':
			res=num1*num2;
			result="Product="+df.format(res);
			break;
		case '/':
			if(num2!=0) {
			res=num1/num2;
			result="Quotient="+df.format(res);
			}else {
				textField_2.setText("Error:Div by 0");
				return;
			}
			break;
			default:
			break;
		}
		textField_2.setText(result);
	}
}
