package jdbc_ex1;
import java.util.*;
import java.sql.*;

public class CopyOfJdbc_test03 {

	static void printTable(Statement stmt, String stu_name) throws SQLException{
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("������ ����");
		}
	}
	static void insert(Statement stmt,String Str1,String Str2,String Str3)throws SQLException{
		stmt.executeUpdate("insert into student (stu_no, stu_name, stu_dept) values(Str1, Str2, Str3)");
	}
	static void select(Statement stmt,String Str1)throws SQLException{
		ResultSet srs = stmt.executeQuery("select * from "+Str1);
		while (srs.next()) {
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL ����̹� �ε�
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB ���� �Ϸ�");
			Scanner s = new Scanner(System.in);

			stmt = conn.createStatement();
			System.out.print("�й� �Է� : ");
			String stu_no = s.next();
			System.out.print("�̸� �Է� : ");
			String stu_name = s.next();
			System.out.print("�а� �Է� : ");
			String stu_dept = s.next();
			System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
			stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
			printTable(stmt, stu_name);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
