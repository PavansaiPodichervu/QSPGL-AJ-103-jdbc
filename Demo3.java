package edu.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo3 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-103", "postgres", "root");

			System.out.println("connection is established");
			System.out.println(connection);
			connection.close();
			System.out.println("connection object is closed");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
