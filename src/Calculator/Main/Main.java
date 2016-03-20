package Calculator.Main;

import Calculator.Controller.Controller;
import Calculator.Model.Model;
import Calculator.View.View;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Model m = new Model(); View v = new View();
		Controller c = new Controller(m, v);
	}
}
