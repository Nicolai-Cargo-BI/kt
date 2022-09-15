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

Windows.click(findWindowsObject('Object Repository/Window'))

Windows.click(findWindowsObject('Object Repository/TitleBar'))

Windows.click(findWindowsObject('Object Repository/MenuBar'))

Windows.click(findWindowsObject('Object Repository/Custom'))

Windows.click(findWindowsObject('Object Repository/Text_WelcomeToCargoBI_Outer'))

Windows.click(findWindowsObject('Object Repository/Text_WelcomeToCargoBI_Inner'))

Windows.click(findWindowsObject('Object Repository/Text_Username_Outer'))

Windows.click(findWindowsObject('Object Repository/Text_Username_Inner'))

Windows.click(findWindowsObject('Object Repository/Edit_Username'))

Windows.click(findWindowsObject('Object Repository/Text_Password_Outer'))

Windows.click(findWindowsObject('Object Repository/Text_Password_Inner'))

Windows.click(findWindowsObject('Object Repository/Edit_Password'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/ListItem_ADMethod'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/Text_ADMethod'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/ListItem_CWMethod'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/Text_CWMethod'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/ListItem_Test'))

Windows.click(findWindowsObject('Object Repository/ComboBox'))

Windows.click(findWindowsObject('Object Repository/Text_Test'))

Windows.click(findWindowsObject('Object Repository/Button_Login'))

Windows.click(findWindowsObject('Object Repository/Text_LoginBox_LoginIsSuccessful'))

Windows.click(findWindowsObject('Object Repository/Button_LoginBox_OK'))

Windows.closeApplication()

