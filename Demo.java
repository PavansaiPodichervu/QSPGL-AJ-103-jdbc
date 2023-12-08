package edu.jsp;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Demo {
	public static void main(String[] args) {
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
			System.out.println("driver registered successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
