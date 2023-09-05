package com.verifyStoredProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class compareTwoTables  {
	@Test
	public static void compareResults() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "root");
		ResultSet rst1 = conn.createStatement().executeQuery("select * from offices");
		ResultSet rst2= conn.createStatement().executeQuery("select * from officescopy");
		compareResultSets(rst1,rst2);
	}
	
	// utility to compare two result set
		public static boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException {
			while (resultSet1.next()) {
				resultSet2.next();
				int count = resultSet1.getMetaData().getColumnCount();
				for (int i = 1; i <= count; i++) {
					if (!StringUtils.equals(resultSet1.getString(i), resultSet2.getString(i))) {
						System.out.println(resultSet2.getString(i));
						String columnName = resultSet2.getMetaData().getColumnName(i);
						Assert.fail("Data Mismatched : found "+resultSet2.getString(i)+ "at Index"+resultSet2.getArray(i)+" in "+columnName);
						return false;
					}
					
				}
			}
			
			return true;
		}

}
