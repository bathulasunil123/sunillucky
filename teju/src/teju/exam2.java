package teju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class exam2
{
	public static void main(String[] args) throws Exception
{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/guru1","root","sunil123");
		
        PreparedStatement pst=con.prepareStatement("insert into jsp2 values(?,?,?)");
		pst.setInt(1, 444);
		pst.setString(2, "banana");
		pst.setString(3, "klm");
		//pst.execute();
		PreparedStatement pst1=con.prepareStatement("update jsp2 set sname=? where sno=? ");
		pst1.setString(1, "king");
		pst1.setInt(2, 333);
		//pst1.execute();
		PreparedStatement ps=con.prepareStatement("delete from jsp2  where sno=222 ");
		//ps.execute();
		PreparedStatement pst2=con.prepareStatement("select * from jsp2");
		ResultSet rs=pst2.executeQuery();
		while(rs.next())
		{
			System.out.println("sno:"+rs.getInt(1)+"sname:"+rs.getString(2)+"sname:"+rs.getString(3));
	}
		System.out.println("done");

	}

}
