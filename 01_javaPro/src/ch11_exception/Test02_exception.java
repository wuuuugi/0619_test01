package ch11_exception;
//방법2: 예외 간접 처리 
public class Test02_exception {
	public static void main(String[] args) throws Exception{
		int num = Integer.parseInt(args[0]); //문자열을 숫자로 변환 
		if (num%0==0){
			System.out.println(num+" 은 짝수");
		}else {
			System.out.println(num+" 은 홀수 ");
		}
		
	}//main end

}//class end 

/*  0. 실행하면 배열 에러 발생
1. 배열값을 숫자로 입력하고 실행 : 정상처리
2. 배열값 입력 하지 않고 실행  :배열에러 발생 
3. a문자 입력 하고 실행
4. 숫자 입력, 수식변경(연산에러)  3/0
*/
