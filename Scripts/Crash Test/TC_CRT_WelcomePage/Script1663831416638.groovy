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

not_run: Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargo-BI-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.startApplicationWithTitle('C:\\Users\\Power\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('Welcome_Page/Button_Maximize'))

Windows.click(findWindowsObject('CargoBI/Login_Page/Button_Login'))

Windows.sendKeys(findWindowsObject('Window'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'w'))

Windows.delay(45)

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_ELearning'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_ELearning'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_ELearning_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_ELearning_Inner'))

Windows.delay(30)

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_MainMenu'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_MainMenu'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_MainMenu_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_MainMenu_Inner'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_Comment'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Image_Comment'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_Help'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Image_Help'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_Settings'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Image_Settings'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_Container'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_DNA'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_DNA'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_DNA_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_DNA_Inner'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_DQN'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_DQN'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_DQN_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_DQN_Inner'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Custom_Omnia'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_Omnia'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_Omnia_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_Omnia_Inner'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Button_ChatBot'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_ChatBot'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/ComboBox'))

Windows.click(findWindowsObject('Object Repository/Welcome_Page/ComboBox'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Edit_Collapsed'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/ListItem_SuperAdmin'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/ListItem_Admin'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/ListItem_User'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_CBox_SuperAdmin'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_CBox_SuperAdmin'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_CBox_Admin'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_CBox_User'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_Version_Outer'))

Windows.findElement(findWindowsObject('Object Repository/Welcome_Page/Text_Version_Inner'))

Windows.sendKeys(findWindowsObject('Window'), Keys.chord(Keys.COMMAND, 'm'))

Windows.switchToApplication(FailureHandling.CONTINUE_ON_FAILURE)

Windows.click(findWindowsObject('Button_Close'))

Windows.click(findWindowsObject('Button_Close'))

