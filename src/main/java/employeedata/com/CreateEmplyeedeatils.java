package employeedata.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmplyeedeatils
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeelogindetails", "root", "root");
		
		Statement st = conn.createStatement();
		
		st.execute("create table emplyeereg(user_id int(10) not null,FullName varchar(40) not null,dataofbirth varchar(10) not null,Email_id varchar(40) not null,Emp_id int(10) primary key)");
		
		System.out.println("Table created...");
		conn.close();
	}
	

}
