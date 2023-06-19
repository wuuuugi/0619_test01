package jdbc_ex1;

import java.sql.*;

public class Jdbc_test02 {
	static void printData(ResultSet srs, String col1,String col2
			,String col3)throws SQLException{
		System.out.print(col1);
		System.out.print("\t|\t   "+col2);
		System.out.println("\t\t|\t" +col3);
		while (srs.next()) {
			if (!col1.equals(""))
			System.out.print(srs.getString("stu_name"));
			if (!col2.equals(""))
			System.out.print("\t|\t" + srs.getString("stu_no"));
			if (!col3.equals(""))
			System.out.println("\t|\t" + srs.getString("stu_dept"));
			else
			System.out.println();
		}
	}

	public static void main(String[] args) {
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
			ResultSet srs = stmt.executeQuery("select * from student");
			printData(srs, "name", "id", "dept");
			srs = stmt.executeQuery("select stu_name, stu_no"
					+ ", stu_dept from student where stu_name='옥한빛'");
			// printData(srs, "name", "id", "dept");

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
