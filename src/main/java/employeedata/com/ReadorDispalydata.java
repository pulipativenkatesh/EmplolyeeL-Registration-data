package employeedata.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadorDispalydata 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ employeelogindetails", "root", "root");
		
		//Statement st = conn.createStatement();
		
		//ResultSet rs = st.executeQuery("select * from emplyeereg");
		
		/*while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}*/
		PreparedStatement ps = conn.prepareStatement("select * from emplyeereg where FullName = ?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fullName...");
		String name = sc.nextLine();
		ps.setString(1, name);
		ResultSet rs1 = ps.executeQuery();
		while(rs1.next())
		{
			System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getString(5));

		}
		conn.close();		
	}

}
