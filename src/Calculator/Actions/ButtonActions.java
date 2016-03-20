package Calculator.Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Calculator.Model.Model;
import Calculator.View.View;

public class ButtonActions implements ActionListener{
	private Model m; private View v;
	public ButtonActions(Model m, View v) {
		this.m = m;
		this.v = v;
	}

	private static JButton button;

	@Override
	public void actionPerformed(ActionEvent e) {
		// get clicked button
		button = (JButton) e.getSource();
		
		if(button.getText() == "C"){
			
			// variable equals 0
			m.setFirstNumb(0);
			m.setSecondNumb(0);
			v.text.setText("");
			v.text.grabFocus();
			
		}else if(button.getText() == "+"){
			
			// get first number and send it to model
			String numb = v.text.getText();
			m.setFirstNumb(Double.parseDouble(numb));
			v.text.setText(v.text.getText() + "+");
			v.text.grabFocus();
			
		}else if(button.getText() == "-"){
			
			String numb = v.text.getText();
			m.setFirstNumb(Double.parseDouble(numb));
			v.text.setText(v.text.getText() + "-");
			v.text.grabFocus();
			
		}else if(button.getText() == "/"){
			
			String numb = v.text.getText();
			m.setFirstNumb(Double.parseDouble(numb));
			v.text.setText(v.text.getText() + "/");
			v.text.grabFocus();
			
		}else if(button.getText() == "*"){
			
			String numb = v.text.getText();
			m.setFirstNumb(Double.parseDouble(numb));
			v.text.setText(v.text.getText() + "*");
			v.text.grabFocus();
			
		}else if(button.getText() == "="){
			
			if(v.text.getText().contains("+")){
				
				// get all in String
				String numb = v.text.getText();
				// get where is plus in string
				int i = numb.indexOf("+");
				// get number after character
				numb = numb.substring(i+1);
				// get second number and send to model
				m.setSecondNumb(Double.parseDouble(numb));
				// do it
				m.setTotalNumb(m.getFirstNumb() + m.getSecondNumb());
				
			}else if(v.text.getText().contains("-")){
				
				String numb = v.text.getText();
				int i = numb.indexOf("-");
				numb = numb.substring(i+1);
				m.setSecondNumb(Double.parseDouble(numb));
				m.setTotalNumb(m.getFirstNumb() - m.getSecondNumb());
				
			}else if(v.text.getText().contains("*")){
				
				String numb = v.text.getText();
				int i = numb.indexOf("*");
				numb = numb.substring(i+1);
				m.setSecondNumb(Double.parseDouble(numb));
				m.setTotalNumb(m.getFirstNumb() * m.getSecondNumb());
				
			}else if(v.text.getText().contains("/")){
				
				String numb = v.text.getText();
				int i = numb.indexOf("/");
				numb = numb.substring(i+1);
				m.setSecondNumb(Double.parseDouble(numb));
				m.setTotalNumb(m.getFirstNumb() / m.getSecondNumb());
				
			}
			// set answer in total display
			v.text.setText(v.text.getText() + "=" + m.getTotalNumb());
			v.text.grabFocus();
		}
	}
}
