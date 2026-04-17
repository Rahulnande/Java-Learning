package Excel_practise;

interface Bonus{
	int calculate(int salary);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Bonus b=(salary)->salary+5000;
		int result=b.calculate(2000);
		System.out.println("Final Salary:"+ " "+ result);
	}

}
