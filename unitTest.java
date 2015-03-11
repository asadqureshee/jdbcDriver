package jdbc;

import java.sql.*;
import java.util.*;

public class unitTest {



		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String URL = "jdbc:mysql://localhost:3306";
			String USER = "root";
			String PASS = "";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			}

		
		
		
	}

	
	

