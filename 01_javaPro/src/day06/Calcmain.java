package day06;

public class Calcmain {
	public static void main(String[] args) {
		CalcClass cal = new CalcClass();

		int a = 10;
		int b = 5;
		System.out.println(cal.Add(a, b));
		System.out.println(cal.Sub(a, b));
		System.out.println(cal.Mul(a, b));
		System.out.println(cal.Div(a, b));

	}

}
