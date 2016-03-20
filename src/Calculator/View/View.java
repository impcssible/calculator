package Calculator.View;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class View extends JFrame{
	JFrame frame;
	public JTextField text;
	JPanel display, options;
	public JButton plus, minus, multiply, divide, equals, reset;
	public View(){
		initialize();
		frame.setVisible(true);
	}
	
	private void initialize(){
		frame = new JFrame("MVC Calculator");
		frame.setBounds(75, 75, 300, 75);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(display = new JPanel(), BorderLayout.NORTH);
		frame.add(options = new JPanel(), BorderLayout.SOUTH);
		display.setVisible(true);
		options.setVisible(true);
		display.add(text = new JTextField(10));
		text.setFont(new Font("Italic", 1, 21));
		text.setColumns(12);
		options.add(plus = new JButton("+"));
		options.add(minus = new JButton("-"));
		options.add(multiply = new JButton("*"));
		options.add(divide = new JButton("/"));
		options.add(equals = new JButton("="));
		options.add(reset = new JButton("C"));
	}
}
