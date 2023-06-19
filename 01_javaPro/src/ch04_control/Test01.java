package ch04_control;

public class Test01 {

	public static void main(String[] args) {
		int x = 6;
		int y = 7;
		int z=++x +y;
		if(x>20){
		}
		System.out.println(z);
		// z변수는 if 블럭 안에서 지역변수로 선언 되어있기 때문에 if 를 벗어나면
		// 사용 불가능
	}

}
