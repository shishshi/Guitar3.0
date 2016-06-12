package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil1 {
	public static Connection getConnection() {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1/Guitar";
		Connection conn=null;
		String user = "root";  
		String password = "123456";  
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;		
	}
	

}
