
public class CalculatorTest {

	public static void main(String[] args) {
		AdvanceCalc calc=new AdvanceCalc();
		calc.preformOperation(10.0);
		calc.preformOperation("+");
		calc.preformOperation(10.0);
		calc.preformOperation("+");
		calc.preformOperation(10.0);
		
		calc.preformOperation("*");
		calc.preformOperation(10.0);
		calc.preformOperation("*");
		calc.preformOperation(10.0);
		calc.preformOperation("/");
		calc.preformOperation(10.0);
		calc.preformOperation("=");
		calc.organize();
		calc.calc();
	}	

}
