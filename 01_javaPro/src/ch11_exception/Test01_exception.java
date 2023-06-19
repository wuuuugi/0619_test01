package ch11_exception;
//방법 1: 직접처리 
public class Test01_exception {
	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(args[0]); //문자열을 정수로 변환
			
			if (num%2==0){
				System.out.println(num+"은 짝수");
			}else{
				System.out.println(num+"은  홀수");
			}
			/*
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("배열 예외:"+e1);
		}catch(NumberFormatException e2){
			System.out.println("숫자를 입력하세요."+e2);
		}catch(ArithmeticException e3){
			System.out.println("연산 예외"+e3);
		}*/
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally절은 예외 발생과 상관없이 실행된다");
			//dbCon.close();
		}
		
		
	}//main end 
	
}//class end
/*  0. 실행하면 배열 에러 발생
    1. 배열값을 숫자로 입력하고 실행
    2. 배열값 입력 하지 않고 실행 
    3. a문자 입력 하고 실행
    4. 숫자 입력, 수식변경(연산에러)
 */












