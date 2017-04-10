import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CelsiusFahrenheitConverter extends BaseFrame {
    private JLabel Label1; 
    private JTextField Celsius;
	private JButton ConvertToFahrenheit;
	private JButton ConvertToCelsius;
	private JLabel Label2; 
	private JTextField Fahrenheit;
	

	@Override
	public void createComponents() {
		Label1 = new JLabel("Celsius");
		Celsius = new JTextField(20);
		ConvertToFahrenheit = new JButton("ConvertToFahrenheit");
		ConvertToCelsius = new JButton("ConvertToCelsius");
		Label2 = new JLabel("Fahrenheit");
		Fahrenheit = new JTextField(20);
	
	}

	@Override
	public void addComponents() {
		Container con = this.getContentPane();
		con.add(Label1);
		con.add(Celsius);
		con.add(ConvertToFahrenheit);
		con.add(ConvertToCelsius);
		con.add(Label2);
		con.add(Fahrenheit);

	}

	@Override
	public void createLayout() {
		Container con = this.getContentPane();
		FlowLayout layout = new FlowLayout();
		con.setLayout(layout);
	}
	class ConvertToFahrenheit implements ActionListener {

		public void ConverttoFahrenheit(JTextField degree ) {
			//Fahrenheit.setText("0.0");
			String celsiusNumber = degree.getText();
			if ("".equals(celsiusNumber)) {
				celsiusNumber = "0.0";
				Celsius.setText(celsiusNumber);
			      }
			try{
			double celsiusValue = Double.parseDouble(celsiusNumber);
			double fahrenheitNumber = Math.round(celsiusValue*1.8+32);
			String fahrenheitText = String.valueOf(fahrenheitNumber);
			Fahrenheit.setText(fahrenheitText);
			}catch(NumberFormatException e){
				Celsius.setText("Invaild number");
			}
			
			//Celsius.setText("");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			ConverttoFahrenheit(Celsius);

		}

	}
		
	class ConvertToCelsius implements ActionListener {

		public void ConvertCelsius(JTextField degree) {
			//Celsius.setText("0.0");
			String fahrenheitNumber = degree.getText();
			if ("".equals(fahrenheitNumber)) {
				fahrenheitNumber = "0.0";
				Fahrenheit.setText(fahrenheitNumber);
			      }
			try{
			double fahrenheitValue = Double.parseDouble(fahrenheitNumber);
			double celsiusNumber = Math.round((fahrenheitValue -32) / 1.8);
			String celsiusText = String.valueOf(celsiusNumber);
			Celsius.setText(celsiusText);
			}catch(NumberFormatException e){
				Fahrenheit.setText("Invaild number");
			}
			//Fahrenheit.setText("");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			ConvertCelsius(Fahrenheit);
		}

	}

	@Override
	public void addListeners() {
		ConvertToFahrenheit behavior1 = new ConvertToFahrenheit();
		ConvertToFahrenheit.addActionListener(behavior1);
		Fahrenheit.addActionListener(behavior1);
		
		ConvertToCelsius behavior2 = new ConvertToCelsius();
		ConvertToCelsius.addActionListener(behavior2);
		Celsius.addActionListener(behavior2);
	}

	public static void main(String args[]) {
		new CelsiusFahrenheitConverter();
	}

}

