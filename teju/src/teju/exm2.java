package teju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exm2 
{
	public static void main(String[] args) throws Exception
{    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tharun1","root","sunil123");
		Statement stmt=con.createStatement();
		//String sql="create table sjr(sno int,sname varchar(20),scity varchar(20))";
		//String sql1="insert into sjr values(7,'kiran','blr')";
		//String sql2="update sjr set sname='venu' where sno=7";
		//String sql3="delete from sjr where sno=7";
		//stmt.execute(sql3);
		String sql="select * from sjr";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("sno:"+rs.getInt(1)+"sname:"+rs.getString(2)+"scity:"+rs.getString(3));
			
		}
		
		
		
}}