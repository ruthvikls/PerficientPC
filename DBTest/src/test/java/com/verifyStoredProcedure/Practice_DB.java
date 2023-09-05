package com.verifyStoredProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_DB {
	static ResultSet rs3;
	static ResultSet rs4;
	static Connection conn=null;
	Statement statement = null;
	
	@Test(enabled=false)
	public static void VerifyCountofEmployees() throws Exception {

		 conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydbtest", "root", "root");

	/*	ResultSet rst = conn.createStatement().executeQuery("select * from staff");
		int columnCount = rst.getMetaData().getColumnCount();

		while (rst.next()) {
			for (int i = 1; i <= columnCount; i++) {

				System.out.println(rst.getString(i));

			}
		}
		*/
		ResultSet rst1 = conn.createStatement().executeQuery("select count(*) as NumberOfEmployees from staff");
		while (rst1.next()){
			String count = rst1.getString("NumberOfEmployees");
			Assert.assertEquals(count, "7" , "Correct");
			System.out.println("COrrect");
		}
		}

	@Test
	public static void compareTablesWithDifferentColumnPositions() throws SQLException {
		 conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydbtest", "root", "root");
		rs3 = conn.createStatement().executeQuery("select * from table1");
		rs4 = conn.createStatement().executeQuery("select * from table4");

		try {
			Assert.assertEquals(VerifyStoredProcedure.compareResultSets(rs3, rs4), true);
		} catch (AssertionError e) {
			System.out.println("Not equal");
			throw e;
		}
		System.out.println("Equal");
	}
}