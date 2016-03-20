package Calculator.Model;

public class Model {
	private double firstNumb, secondNumb, total;
	public Model() {
		firstNumb = 0;
		secondNumb = 0;
		total = 0;
	}
	public double setFirstNumb(double numb){
		firstNumb = numb;
		return firstNumb;
	}
	public double setSecondNumb(double numb){
		secondNumb = numb;
		return secondNumb;
	}
	public double setTotalNumb(double numb){
		total = numb;
		return total;
	}
	public double getFirstNumb(){
		return firstNumb;
	}
	public double getSecondNumb(){
		return secondNumb;
	}
	public double getTotalNumb(){
		return total;
	}
}
