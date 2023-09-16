package teju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class hrc2
{
	public static void main(String[] args) throws Exception
{  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhanush","root","sunil123");
		Statement stmt=con.createStatement();
		//String sql="create table ksr(sno int,sname varchar(20),scity varchar(20))";
		//String sql1="insert into ksr values(4,'arjun','mpl') ";
		//String sql2="delete from ksr where sno=4";
		//stmt.execute(sql1);
		String sql= "select * from ksr";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("sno:"+rs.getInt(1)+"sname:"+rs.getString(2)+"scity:"+"scity:"+rs.getString(3));
		}
		System.out.println("done");
	}

}
