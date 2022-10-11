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

Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargi-BI-Global-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\OneDrive - Jonson Consult Aps\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

/*
	 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
	 * Test/DQN/Login_Page/Edit_Hidden'))
	 * 
	 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
	 * Test/DQN/Login_Page/Button_Send_Hidden'))
	 * 
	 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
	 * Test/DQN/Login_Page/Text_Send_One_Hidden'))
	 * 
	 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
	 * Test/DQN/Login_Page/Text_Send_Two_Hidden'))
	 */
Windows.click(findWindowsObject('CargoBI/Misc/Button_Maximize'))

/*
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Button_One_Collapsed'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Image_One_Collpased'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Button_Two_Collapsed'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Image_Two_Collpased'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Button_Three_Collapsed'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Image_Three_Collpased'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Custom_ChatBot'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Text_ChatBot_One'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Text_ChatBot_Two'))
 

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Custom_Screen'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Text_WelcomeTo'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Text_CargoBI'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Image_Username'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Edit_Username'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Image_Password'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login/Edit_Password'))
*/
Windows.sendKeys(findWindowsObject('Other/Window'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'p'))

Windows.delay(60)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Text_CARGO_BI'), 0)

/*
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/Button_Send_Hidden'))
 * 
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/Custom_Screen'))
 * 
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/Text_WelcomeTo'))
 * 
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/Custom_ChatBot'))
 * 
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/Text_Login'))
 * 
 * Windows.click(findWindowsObject('Object Repository/CargoBI/Crash
 * Test/DQN/Login_Page/Text_Login'))
 * 
 * Windows.getText(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/xFindElements/Edit_Hidden_Find'))
 * 
 * Windows.findElement(findWindowsObject('CargoBI/Crash
 * Test/DQN/Login_Page/xFindElements/Button_DNA_Find'))
 */
Windows.closeApplication()

