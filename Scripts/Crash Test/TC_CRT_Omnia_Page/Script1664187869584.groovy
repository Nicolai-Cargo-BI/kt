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

Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargo-BI-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\OneDrive - Jonson Consult Aps\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('CargoBI/Misc/Button_Maximize'))

Windows.click(findWindowsObject('CargoBI/Crash Test/DQN/Login_Page/Button_Login'))

not_run: Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 
        'o'))

Windows.delay(30)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_Employee'), 0)

Windows.delay(20)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_Department'), 0)

Windows.delay(5)

Windows.verifyElementNotPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_Branch'), 0)

Windows.delay(20)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_Origin'), 0)

Windows.delay(20)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_Destination'), 0)

Windows.delay(5)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_JobProfit'), 0)

Windows.delay(5)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/Omnia/Text_F_JobStatus'), 0)

Windows.closeApplication()

