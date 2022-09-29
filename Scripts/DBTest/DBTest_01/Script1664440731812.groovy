import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.sql.ResultSetMetaData
import java.sql.Connection;
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
// Test om der kan indhentes data fra databasen i SQL Server
String url = 'cargo-bi-testserver.database.windows.net;databaseName=TestDB'
//String dbName = 'TestDB'
String user = 'CargoBITestingAD'
String pass = '1h&0nxcJ$*6tgLe9TuV7LkDLkRRil%mH'

CustomKeywords.'com.db.sqlserver.connectDB'(url, user, pass)
String selectData = 'select * from elearning.ELE_courses'
List<List> rowList = CustomKeywords.'com.db.sqlserver.executeQuery'(selectData)

println('First Result: ' + rowList.get(0).get(1))



CustomKeywords.'com.db.sqlserver.closeDatabaseConnection'()