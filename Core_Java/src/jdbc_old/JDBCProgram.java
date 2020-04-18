package jdbc_old;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCProgram {
	static Statement stat = null;
	static PreparedStatement pstat = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			System.out.println("Connected sucessfully...");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.create Table..." + "\n2.insert into table..." + "\n3.update into table..."
					+ "\n4.remove table..." + "\n5.readOne in table..." + "\n6.readAll in table...");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				stat = con.createStatement();
				String c = "create table student(id int,name varchar(50),mobileno varchar(15),address varchar(60))";
				stat.executeUpdate(c);
				System.out.println("Table created suscessfully...");
				break;
			case 2:				
				String i = "insert into student(id,name,mobileno,address) values(?,?,?,?)";
				pstat = con.prepareStatement(i);
				Scanner inp = new Scanner(System.in);
				int id = inp.nextInt();
				String name = inp.next();
				String mobileno = inp.next();
				String address = inp.next();
				pstat.setInt(1, id);
				pstat.setString(2, name);
				pstat.setString(3, mobileno);
				pstat.setString(4, address);
				pstat.executeUpdate();
				System.out.println("data inserted suscessfully into table...");
				break;
			case 3:
				String u="update student set name=?,mobileno=?,address=? where id=?";
				pstat=con.prepareStatement(u);
				Scanner uinp=new Scanner(System.in);
				String n=uinp.next();
				String mno=uinp.next();
				String add=uinp.next();
				int ids=uinp.nextInt();
				pstat.setInt(4, ids);
				pstat.setString(1, n);
				pstat.setString(2, mno);
				pstat.setString(3, add);
				pstat.executeUpdate();
				System.out.println("data updated sucessfully...");
				break;
			case 4:
				String r="delete form student where id=?";
				pstat=con.prepareStatement(r);
				Scanner rinp=new Scanner(System.in);
				int sid=rinp.nextInt();
				pstat.setInt(1,sid);
				pstat.executeUpdate(r);
				System.out.println("removed a student from table...");
				break;
			case 5:
				String one="select * form student where id=?";
				System.out.println("readOne table...");
				break;
			case 6:
				String all="select * from student";
				System.out.println("readAll table...");
				break;
			default:
				System.out.println("Wrong selection...");
				break;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
