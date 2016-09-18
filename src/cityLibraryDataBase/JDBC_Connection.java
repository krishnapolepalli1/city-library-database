package cityLibraryDataBase;

//citylibrarydatabase

import java.sql.*;

import javax.swing.JOptionPane;

public class JDBC_Connection {

	Connection connection = null;
	
	public static Connection DBConnection()
	{
		
		try
		{
			// create a database connection
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;integratedSecurity=true;");
			return conn;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}

}
