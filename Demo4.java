package edu.jsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("class loaded successfully");
			FileInputStream fis = new FileInputStream("database.properties");
			Properties properties = new Properties();
			properties.load(fis);
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-103", properties);
			System.out.println(con);
			Statement statement = con.createStatement();
			System.out.println(statement);
			boolean res = statement
					.execute("create table person (person_id integer , person_name varchar,primary key (person_id))");
			System.out.println("table created successfully");
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
