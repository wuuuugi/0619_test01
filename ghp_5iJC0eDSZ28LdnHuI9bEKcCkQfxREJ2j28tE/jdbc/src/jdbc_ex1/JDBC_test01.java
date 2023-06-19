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
			System.out.println("������ ����");
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
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL ����̹� �ε�
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB ���� �Ϸ�");
			stmt = conn.createStatement();
			String stu_no=null;
			String stu_name=null;
			String stu_dept=null; 
			while (true) {
				System.out.println("(1)�Է�   (2)  ���   (3)����   (4)����   (9)��ü����Ʈ");
				int num = s.nextInt();
				if (num == 1) {
					System.out.print("�й� �Է� : ");
					stu_no = s.next();
					System.out.print("�̸� �Է� : ");
					stu_name = s.next();
					System.out.print("�а� �Է� : ");
					stu_dept = s.next();
					System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
				} else if (num == 2) {
					System.out.print("�˻��� �̸� �Է� : ");
					stu_name = s.next();
					printTable(stmt, stu_name);
				} else if (num == 3) {
					System.out.print("������ �̸� �Է� : ");
					stu_name = s.next();
					stmt.executeUpdate("delete from student where stu_name='" +stu_name+ "'");
				} else if (num == 4) {
					System.out.println("����");
					break;
				} else if (num==9){
					printData(stmt);
				}
				else {
					System.out.println("���Է�");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
