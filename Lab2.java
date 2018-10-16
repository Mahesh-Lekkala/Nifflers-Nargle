import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab2 {
			
	public static void main(String[] args) {
		Connection con=null;
		Statement st =null;
		ResultSet rs = null;
		try {
			con=JDBCUtilClass.getConnection();
			String sql ="select * from students";
			st=con.createStatement();
			rs= st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)
				+"\t"+rs.getLong(4));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		finally {
			JDBCUtilClass.cleanup(con,st,rs);
		}	
	}		
	

}
