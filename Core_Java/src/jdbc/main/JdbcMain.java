package jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author B Shashidhar
 *
 * 
 */
public class JdbcMain {
	public static void main(String[] args) {
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/myworld";
		final String USER = "root";
		final String PASS = "root";
		try {
			Class.forName(JDBC_DRIVER);
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			if (con != null) {
				/*
				 * String empno=JOptionPane.showInputDialog("Enter empno"); String
				 * cmd="Select deptid from emp where empno=?"; PreparedStatement
				 * stmt=con.prepareStatement(cmd); stmt.setString(1, empno);
				 * 
				 * ResultSet rs=stmt.executeQuery(); while(rs.next()) {
				 * JOptionPane.showMessageDialog(null, rs.getInt("deptid")); }
				 */
				String empno = JOptionPane.showInputDialog("Enter empno to update");
				String newempno = JOptionPane.showInputDialog("Enter new empno ");
				String cmd1 = "Update emp set empno=? where empno=?";
				PreparedStatement stmt = con.prepareStatement(cmd1);
				stmt.setString(1, newempno);
				stmt.setString(2, empno);
				int rowsAffected = stmt.executeUpdate();
				if (rowsAffected == 0) {
					JOptionPane.showMessageDialog(null, "not updated");
				} else {
					JOptionPane.showMessageDialog(null, "no of rows updated" + " " + rowsAffected);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
