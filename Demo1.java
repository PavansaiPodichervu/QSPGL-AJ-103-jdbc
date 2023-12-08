package edu.jsp;

public class Demo1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver class is loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("driver is not loaded");
			e.printStackTrace();
		}
	}

}
