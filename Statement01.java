package edu.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement01 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-103", "postgres",
					"root");
			System.out.println(con);
			Statement statement = con.createStatement();
			boolean res = statement
					.execute("create table person (person_id integer , person_name varchar,primary key (person_id))");
			System.out.println("table created successfully");
			System.out.println(res);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
