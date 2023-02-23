package employeedata.com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertaempdata 
{
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeelogindetails", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement("insert into emplyeereg values(?,?,?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the userid....");
		//int userid = sc.nextInt();
		String userid = sc.nextLine();
		
		System.out.println("enter the employee full name...");
		String empname = sc.nextLine();
		
		System.out.println("Enter the date of Birth....");
		String dob =sc.nextLine();
		
		
		System.out.println("Enter the Email Id....");
		String email_id = sc.nextLine();
		
		System.out.println("Enter the Employee Id...");
		String empid = sc.nextLine();
		
		ps.setString(1, userid);
		ps.setString(2, empname);
		ps.setString(3, dob);
		ps.setString(4, email_id);
		ps.setString(5,empid );
		int i =ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("Data Inserted..");
		}
		else
		{
			System.out.println("data Not inserted...");
		}
		
		conn.close();
	}

}
