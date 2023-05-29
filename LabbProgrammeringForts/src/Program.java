import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		computeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int inp = Integer.valueOf(inputVal.getText()); 
				Long res = myModel.compute2Power(inp);
				System.out.println( "compute2Power result: " + res);
				
				if (res != -1) {
					resultPanel.setText("Result: " + res.toString());	
				}
				else {
					resultPanel.setText("Input a positive number please!");
				}
			}
		});
			
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				myModel.clearMemory();
				resultPanel.setText("Memory cleared");	
			}
		});
				
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				myModel.clearMemory();
				System.out.println("Good Bye!");
				System.exit(0);
			}
		});		
	}
}
