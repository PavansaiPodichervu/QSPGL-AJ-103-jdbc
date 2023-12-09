package edu.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("class loaded successfully");
			Connection connection = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/jdbc-103?user=postgres&password=root");
			System.out.println("connection is established");
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
