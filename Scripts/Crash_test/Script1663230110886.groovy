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

Windows.startApplicationWithTitle('C:\\Users\\Power\\Desktop\\Cargo-BI-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

not_run: Windows.delay(4)

not_run: Windows.click(findWindowsObject('MenuBar'))

Windows.click(findWindowsObject('Button - Maximize'))

Windows.sendKeys(findWindowsObject('Window'), Keys.chord(Keys.CONTROL, Keys.SHIFT, 'a'))

Windows.delay(65)

Windows.findElement(findWindowsObject('Window'))

Windows.findElement(findWindowsObject('TitleBar'))

Windows.findElement(findWindowsObject('MenuBar'))

Windows.findElement(findWindowsObject('Text_WelcomeToCargoBI_Outer'))

Windows.findElement(findWindowsObject('Text_WelcomeToCargoBI_Inner'))

Windows.findElement(findWindowsObject('Text_Username_Outer'))

Windows.findElement(findWindowsObject('Text_Username_Inner'))

Windows.findElement(findWindowsObject('ComboBox'))

Windows.click(findWindowsObject('ComboBox'))

Windows.findElement(findWindowsObject('Text_Test'))

Windows.findElement(findWindowsObject('Text_ADMethod'))

Windows.findElement(findWindowsObject('Text_CWMethod'))

Windows.findElement(findWindowsObject('ListItem_ADMethod'))

Windows.findElement(findWindowsObject('ListItem_CWMethod'))

Windows.findElement(findWindowsObject('ListItem_Test'))

Windows.findElement(findWindowsObject('Text_Password_Outer'))

Windows.findElement(findWindowsObject('Text_Password_Inner'))

Windows.findElement(findWindowsObject('Edit_Username'))

Windows.findElement(findWindowsObject('Edit_Password'))

Windows.findElement(findWindowsObject('Custom'))

Windows.findElement(findWindowsObject('Button_Login'))

Windows.click(findWindowsObject('Button_Login'))

Windows.click(findWindowsObject('Button_Login'))

Windows.findElement(findWindowsObject('Text_LoginBox_LoginIsSuccessful'))

Windows.findElement(findWindowsObject('Button_LoginBox_OK'))

Windows.click(findWindowsObject('Button_LoginBox_OK'))

Windows.delay(5)

Windows.closeApplication()

