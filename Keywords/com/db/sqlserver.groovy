//package com.db
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//
//import internal.GlobalVariable
//
//public class sqlserver {
//}

package com.db

import java.sql.ResultSetMetaData
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.*

import com.github.kklisura.cdt.protocol.types.indexeddb.Metadata
import com.kms.katalon.core.annotation.Keyword

public class sqlserver {

	private static Connection connection = null;

	@Keyword

	def connectDB(String url, String username, String password) {

		String conn = "jdbc:sqlserver://" + url

		if(connection != null && !connection.isClosed()) {
			connection.close()
		}
		connection = DriverManager.getConnection(conn, username, password)
		return connection
	}


	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		ResultSetMetaData metadata = rs.getMetaData()
		int columnCount = metadata.getColumnCount()
		System.out.println("Execute Query ColumnCount: " + columnCount)
		List<List<String>> rowList = new LinkedList<List<String>>()
		while(rs.next()) {
			List<String> row =  new LinkedList<>()
			for(int i = 1; i<=columnCount; i++) {
				Object value = rs.getObject(i)
				row.add(value)
			}

			rowList.add(row)
		}
		int i = 1
		for(List<String> row: rowList) {
			
			for(String data: row) {
				System.out.println("Data (række "+ i + "): " + data)
			}
			i++
		}

		return rowList
	}

	@Keyword
	def closeDatabaseConnection() {
		if(connection != null && !connection.isClosed()) {
			connection.close()
		}
		connection = null
	}


	@Keyword
	def execute(String queryString) {
		Statement stm = connection.createStatement()
		boolean result = stm.execute(queryString)
		return result
	}
}