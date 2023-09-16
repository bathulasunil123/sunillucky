package teju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class examp2
{
	public static void main(String[] args) throws Exception
{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhanush","root","sunil123");
		
        PreparedStatement pst=con.prepareStatement("insert into ksr values(?,?,?)");
		pst.setInt(1, 222);
		pst.setString(2, "mango");
		pst.setString(3, "tpt");
		//pst.execute();
		PreparedStatement pst1=con.prepareStatement("update ksr set sname=? where sno=? ");
		pst1.setString(1, "king");
		pst1.setInt(2, 222);		
		//pst1.execute();
		PreparedStatement ps=con.prepareStatement("delete from ksr  where sno=222 ");
		//ps.execute();
		PreparedStatement pst2=con.prepareStatement("select * from ksr");
		ResultSet rs=pst2.executeQuery();
		while(rs.next())
		{
			System.out.println("sno:"+rs.getInt(1)+"sname:"+rs.getString(2)+"sname:"+rs.getString(3));
		}
		System.out.println("done");
	}

}
