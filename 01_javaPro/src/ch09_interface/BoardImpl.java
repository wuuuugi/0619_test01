package ch09_interface;

public class BoardImpl implements Board {

	//오버라이딩
	public void boardWrite() {
		System.out.println("게시판 글쓰기");
		
	}

	
	public void boardList() {
		System.out.println("글목록 보기");
		
	}

	
	public void boardContent() {
		System.out.println("글 내용 보기");
		
	}

	
	public void boardEdit() {
		System.out.println("게시판 글 편집하기");
		
	}

	
	public void boardDelte() {
		System.out.println("게시판 글 지우기 ");
		
	}

}//class end 
