package jdbc_ex1;

import java.util.*;
import java.sql.*;

public class JDBC_test01 {
	static void printTable(Statement stmt, String stu_name) throws SQLException{
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("데이터 없음");
		}
	}
	static void printData(Statement stmt)throws SQLException{
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			String stu_no=null;
			String stu_name=null;
			String stu_dept=null; 
			while (true) {
				System.out.println("(1)입력   (2)  출력   (3)삭제   (4)종료   (9)전체리스트");
				int num = s.nextInt();
				if (num == 1) {
					System.out.print("학번 입력 : ");
					stu_no = s.next();
					System.out.print("이름 입력 : ");
					stu_name = s.next();
					System.out.print("학과 입력 : ");
					stu_dept = s.next();
					System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
				} else if (num == 2) {
					System.out.print("검색할 이름 입력 : ");
					stu_name = s.next();
					printTable(stmt, stu_name);
				} else if (num == 3) {
					System.out.print("삭제할 이름 입력 : ");
					stu_name = s.next();
					stmt.executeUpdate("delete from student where stu_name='" +stu_name+ "'");
				} else if (num == 4) {
					System.out.println("종료");
					break;
				} else if (num==9){
					printData(stmt);
				}
				else {
					System.out.println("재입력");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
