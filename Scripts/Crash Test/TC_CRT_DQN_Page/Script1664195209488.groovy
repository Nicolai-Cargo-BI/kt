import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.TearDownIfFailed as TearDownIfFailed
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

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\OneDrive - Jonson Consult Aps\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargo-BI-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('CargoBI/Misc/Button_Maximize'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Login_Page/Button_Login'))

Windows.sendKeys(findWindowsObject('Other/Window'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'q'))

Windows.delay(11)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Text_User_ShipmentID'), 0, 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(40)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Text_Admin_ManagerError_Overdue'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(22)

Windows.verifyElementNotPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Text_Admin_ManagerError_Overdue'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(19)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Button_Add_AddErrorPopUp'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(18)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Button_Add_AddCriteriaPopUp'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(29)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Button_Update_UpdateErrorPopUp'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(14)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Button_Switch_Middle'), 0, 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(35)

Windows.verifyElementPresent(findWindowsObject('Object Repository/CargoBI/Crash Test/DQN_Page/Text_SuperAdmin_ActiveError_Overdue'), 
    0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.db.keys.Macro_continue'()

Windows.delay(15)

Windows.closeApplication()

@TearDownIfFailed
def handleFailure() {
    Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ESCAPE))

    Windows.closeApplication()
}

