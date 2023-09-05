package com.verifyStoredProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyStoredProcedure {

	Connection connection = null;
	Statement statement = null;
	ResultSet result;
	ResultSet rs1;
	ResultSet rs2;
	

	@BeforeTest
	public void connectDB() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "root");
		// connection=
		// DriverManager.getConnection("dbc:mysql://localhost:3306/classicmodels?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8");
		// jdbc:mysql://localhost:3306/my_database?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8
	}

	@AfterTest
	public void closeDB() throws SQLException {
		connection.close();
	}

	@Test(enabled = false)
	public void verifyStoredProcedureExists() throws SQLException {

		statement = connection.createStatement();
		result = statement.executeQuery("show procedure status where name='customerByCityName_PinCode';");
		result.next();

		Assert.assertEquals(result.getString("Name"), "customerByCityName_PinCode", "The Procedure Exists in DB");

	}

	@Test(enabled = false)
	public void getAllCustomers() throws SQLException {
		statement = connection.createStatement();
		result = statement.executeQuery("select * from customers");
		while (result.next()) {
			System.out.println(result.getString("customerNumber"));
			System.out.println(result.getString("customerName"));
		}
	}

	@Test(enabled = false)
	public void getNumberofCustomers() throws SQLException {
		statement = connection.createStatement();
		result = statement.executeQuery("select count(*) as numberOfCustomers from customers");
		result.next();
		String actualCustomers = "122";
		Assert.assertEquals(result.getString("numberOfCustomers"), actualCustomers, "NumberOFCustomersAreCorrect");

	}

	@Test(enabled = false)

	public void compareStoredFunctionResults() throws SQLException {

		rs1 = connection.createStatement()
				.executeQuery("select customerName,customerlevel(creditlimit) from customers");
		rs2 = connection.createStatement().executeQuery(
				"select customername,CASE when creditlimit > 50000 then 'PLATINUM' when creditlimit>=10000 and creditlimit<=50000 then 'GOLD' when creditlimit < 10000 then 'SILVER' end as customerlevel from customers");
		// Assert.assertTrue(compareResultSets(rs1,rs2));

		try {
			Assert.assertEquals(compareResultSets(rs1, rs2), true);
		} catch (AssertionError e) {
			System.out.println("Not equal");
			throw e;
		}
		System.out.println("Equal");

	}
	


		
	

	// utility to compare two result set
	public static boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException {
		while (resultSet1.next()) {
			resultSet2.next();
			int count = resultSet1.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++) {
				if (!StringUtils.equals(resultSet1.getString(i), resultSet2.getString(i))) {
					return false;
				}
			}
		}
		return true;
	}
}
