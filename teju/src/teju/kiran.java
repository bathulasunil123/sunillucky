package teju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class kiran
{

	public static void main(String[] args) throws Exception 
{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunil1","root","sunil123");
		Statement stmt=con.createStatement();
		String sql="create table hi(sno int,sname varchar(20),scity varchar(20))";
		String sql1="insert into hi values(7,'venu','mn')"	;
		String sql2="update hi set sname= 'venu' where sno=4 ";
		String sql3="delete from hi where sno=4";
		stmt.execute(sql1);
		con.close();
		System.out.println("done");

	}

}
