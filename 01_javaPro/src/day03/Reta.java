package day03;

import java.util.Scanner;

public class Reta {
	public int height;
	public int width;

	public int mul() {
		return height * width;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Reta re= new Reta();
		System.out.println(">>");
		re.height = scan.nextInt();
		re.width = scan.nextInt();
		System.out.println(" ∏È¿˚¿∫ "+re.mul());
		scan.close();

	}
}
