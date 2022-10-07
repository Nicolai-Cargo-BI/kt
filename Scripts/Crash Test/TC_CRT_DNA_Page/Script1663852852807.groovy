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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.annotation.TearDownIfFailed as TearDownIfFailed

Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargo-BI-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\OneDrive - Jonson Consult Aps\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('CargoBI/Crash Test/Login_Page/Button_Login'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Misc/Button_Maximize'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'd'))

Windows.delay(10)

Windows.verifyElementNotPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Button_Solutions'), 0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(65)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Button_Update_M20RLH46AQ'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(21)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Button_Update_YF7Q0SCROK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(29)


Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Button_Update_DHWVCUGCPO'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(20)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Text_Mandatory_Menu'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(23)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Text_Click_Me'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(40)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA_Page/Button_Update_Tag'), 0, FailureHandling.CONTINUE_ON_FAILURE)


Windows.closeApplication()

@TearDownIfFailed
def handleFailure() {
    Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ESCAPE))

    Windows.closeApplication()
}

