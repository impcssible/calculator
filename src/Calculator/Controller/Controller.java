package Calculator.Controller;

import Calculator.Actions.ButtonActions;
import Calculator.Model.Model;
import Calculator.View.View;

public class Controller {
	Model m; View v;
	public Controller(Model m, View v) {
		this.m = m;
		this.v = v;
		
		v.plus.addActionListener(new ButtonActions(m, v));
		v.minus.addActionListener(new ButtonActions(m, v));
		v.multiply.addActionListener(new ButtonActions(m, v));
		v.divide.addActionListener(new ButtonActions(m, v));
		v.equals.addActionListener(new ButtonActions(m, v));
		v.reset.addActionListener(new ButtonActions(m, v));
	}
}
