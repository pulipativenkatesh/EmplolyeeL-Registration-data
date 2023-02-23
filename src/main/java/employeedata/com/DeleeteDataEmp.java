package employeedata.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DeleeteDataEmp 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ employeelogindetails", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("delete from emplyeereg where FullName =?");
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the FullName...");
		String name = sc.nextLine();
		
		ps.setString(1, name);
		int i = ps.executeUpdate();
		if(i !=0)
		{
			System.out.println("Sucessfully data Deleted...");
			
		}
		else
		{
			System.out.println("Not data Deleted...");
		}
		conn.close();	
		
	}

}
