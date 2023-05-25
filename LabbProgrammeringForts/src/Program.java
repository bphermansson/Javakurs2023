import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program {
	public static void main(String[] args) {
		Model myModel = new Model();
		
		JFrame window = new JFrame();
		window.setSize(new Dimension(600, 300));
		window.setResizable(false);
		window.setTitle("Cache memory - 2^n");
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		// Top panel with input textfield
		JPanel inputPanel = new JPanel();
			inputPanel.setPreferredSize(new Dimension(600, 40));
		
			final JTextField inputVal = new JTextField("0");
			inputVal.setPreferredSize(new Dimension(150, 45));
			inputPanel.add(inputVal, BorderLayout.CENTER);	
			window.add(inputPanel, BorderLayout.NORTH);
		
		// Center panel with result label
		 JLabel resultPanel= new JLabel("Result: ");
		 	resultPanel.setPreferredSize(new Dimension(150, 100));
		 	resultPanel.setText("Result: ");
		 	resultPanel.setHorizontalAlignment(JLabel.CENTER);
		 	resultPanel.setVerticalAlignment(JLabel.CENTER);
		 	window.add(resultPanel);
		
		// Lower panel with buttons
		JPanel btnPanel = new JPanel();
			btnPanel.setPreferredSize(new Dimension(600, 45));
			window.add(btnPanel, BorderLayout.SOUTH);
	
			JButton computeButton = new JButton("Compute 2^n");
			computeButton.setPreferredSize(new Dimension(120, 40));
			JButton clearButton = new JButton("Clear memory");
			clearButton.setPreferredSize(new Dimension(120, 40));
			JButton quitButton = new JButton("Quit");
			quitButton.setPreferredSize(new Dimension(120, 40));
		
			btnPanel.add(computeButton, BorderLayout.EAST);
			btnPanel.add(clearButton, BorderLayout.CENTER);
			btnPanel.add(quitButton, BorderLayout.WEST);
		
		window.setVisible(true);

		/*
		try {
			long h = myModel.getValue(2);
		}
		catch (Exception e) {
			System.out.println("Error: " + e);	
		}
		
		myModel.setValue(1, (long)213);
		myModel.setValue(2, (long)3);
		myModel.setValue(3, (long)23);
		
		long h = myModel.getValue(2);
		System.out.println("Value from hashtable: " + h);		 
		System.out.println("Power 3: " + myModel.computePower(3));	// 8
		System.out.println("Power 5: " + myModel.computePower(5));	// 32
		System.out.println( "Power -2: " + myModel.computePower(-2));	// 0
		System.out.println("Power 15: " +  myModel.computePower(15));	// 32768
		System.out.println( "Power 25: " + myModel.computePower(25)); // 33554432
		System.out.println( "Power 0: " + myModel.computePower(0));	// 1
		System.out.println( "Power 1: " + myModel.computePower(1));	// 2
*/
		//System.out.println( "compute2Power -1: " + myModel.compute2Power(-1));
		System.out.println( "compute2Power 0 result: " + myModel.compute2Power(0));
		System.out.println( "compute2Power 1 result: " + myModel.compute2Power(1));
		System.out.println( "compute2Power 3 result: " + myModel.compute2Power(3));
		System.out.println( "compute2Power 5 result: " + myModel.compute2Power(5));
		System.out.println( "compute2Power 3 result: " + myModel.compute2Power(3));

		
	}
}
