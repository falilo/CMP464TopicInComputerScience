package mypackage;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class TemperatureConvertor implements ActionListener {
	
	JFrame frame = new JFrame("Fahrenheit to Celsius");
	JButton fahrenheitLabel = new JButton("FAHRENHEIT");
	//JLabel fahrenheitLabel = new JLabel("Fahrenheit");
	JTextField fahrenheitText = new JTextField();
	JButton celsiusLabel = new JButton("CELSIUS");
	//JLabel celsiusLabel = new JLabel("Celsius");
	JTextField celsiusText = new JTextField("Result be here");
	JButton convertButton  = new JButton("Convert");
	GridLayout gl = new GridLayout();
	
	TemperatureConvertor()
	{
		gl.setRows(3);
		gl.setColumns(2);
		
		frame.setLayout(gl);
		
		convertButton.addActionListener(this);
		
		frame.add(fahrenheitLabel); 
		frame.add(fahrenheitText);
		frame.add(celsiusLabel);
		frame.add(celsiusText);
		frame.add(convertButton);
		
		frame.setSize(350,100);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==convertButton)
		{
			double far = Double.parseDouble(fahrenheitText.getText());
			double cel = (far - 32)*5/9;
			celsiusText.setText(""+cel);
	}
	
}
}