package employeedata.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmpdata 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeelogindetails", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("update emplyeereg set Email_id = ? where FullName=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the Employee Full Name...");
		String name = sc.nextLine();
		
		System.out.println("Enter the update Email Id....");
		String email = sc.nextLine();

		ps.setString(1, email);
		ps.setString(2, name);
		
		int i = ps.executeUpdate();
		if(i !=0)
		{
			System.out.println("Data Will be sucessfully updated...");
		}
		else
		{
			System.out.println("Data is Not Updated...");
		}
		conn.close();
	}
	

}
