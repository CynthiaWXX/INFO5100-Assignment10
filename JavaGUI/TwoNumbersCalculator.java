import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoNumbersCalculator extends BaseFrame{
	private JTextField inputA;
	private JComboBox operator;
	private JTextField inputB;
	private JButton equal;
	private JTextField result;

	@Override
	public void createComponents() {
	inputA = new JTextField(20);
	String[] operators = {"+","-","*","/"};
	operator = new JComboBox(operators);
	inputB = new JTextField(20);
	equal = new JButton("=");
	result = new JTextField(30);
	
	}
	@Override
	public void addComponents() {
		Container con = this.getContentPane();
		con.add(inputA);
		con.add(operator);
		con.add(inputB);
		con.add(equal);
		con.add(result);
	

	}
	@Override
	public void createLayout() {
		Container con = this.getContentPane();
		FlowLayout layout = new FlowLayout();
		con.setLayout(layout);
	}
	
	class operation implements ActionListener {
		public void ConverttoFahrenheit(JTextField one, JTextField two ){
		try{
		String A = inputA.getText();
		String B = inputB.getText();
		double numberA = Double.parseDouble(A);
		double numberB = Double.parseDouble(B);
		System.out.println(numberA+numberB);
		if(operator.getSelectedItem() == "+"){
			String Result = String.valueOf(numberA+numberB);
			result.setText(Result);	
		}else if (operator.getSelectedItem() == "-"){
			String Result = String.valueOf(numberA-numberB);
			result.setText(Result);	
		}else if (operator.getSelectedItem() == "*"){
			String Result = String.valueOf(numberA*numberB);
			result.setText(Result);	
		}else if (operator.getSelectedItem() == "/"){
			String Result = String.valueOf(numberA/numberB);
			result.setText(Result);	
		}else{
			result.setText("");
		}
		}catch(NumberFormatException e){
				result.setText("Invaild number");
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			ConverttoFahrenheit(inputA, inputB);
		}
	}
	@Override
	public void addListeners() {
		operation behavior = new operation();
		equal.addActionListener(behavior);
	}
	public static void main(String args[]) {
		new TwoNumbersCalculator();
	}

	
}
