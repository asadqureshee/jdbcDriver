package jdbc;
import java.sql.*;
import java.util.Properties;

public class driver implements Driver{


	static{
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
			}
			
				catch(ClassNotFoundException ex) {
					   System.out.println("Error: unable to load driver class!");
					   System.exit(1);}
					}
			
			
		
	
	
		@Override
		public boolean acceptsURL(String arg0) throws SQLException {
			
			return false;
		}

	

		@Override
		public int getMajorVersion() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getMinorVersion() {
			// TODO Auto-generated method stub
			return 0;
		}

	

		@Override
		public boolean jdbcCompliant() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Connection connect(String url, Properties info)
				throws SQLException {
			// TODO Auto-generated method stub
			connection conn = new connection();
			connection.conn =DriverManager.getConnection(url,info);
			return conn;
			
		}

		@Override
		public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
				throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

	
}
	
	
