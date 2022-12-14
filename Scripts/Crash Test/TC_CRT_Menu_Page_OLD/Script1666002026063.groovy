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

not_run: Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargi-BI-Global-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.startApplicationWithTitle('C:\\Users\\Power\\AppData\\Local\\Cargo-BI\\Cargo-BI-Client\\Cargo_BI_Client.exe',
	'')

Windows.click(findWindowsObject('CargoBI/Misc/Button_Maximize'))

Windows.click(findWindowsObject('CargoBI/Crash Test/DQN/Login_Page/Button_Login'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Main_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Main_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Comment_Like'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ALT, Keys.TAB))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Image_Comment_Like'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ALT, Keys.TAB))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Help'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ALT, Keys.TAB))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Image_Help'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ALT, Keys.TAB))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Settings'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Image_Settings'))

Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'w'))

Windows.delay(45)

Windows.findElement(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu_Page_2/Custom_ELearning'))

Windows.findElement(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu_Page_2/Button_ELearning'))

Windows.findElement(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu_Page_2/Text_ELearning_Outer'))

Windows.findElement(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu_Page_2/Text_ELearning_Inner'))

Windows.delay(30)

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_ChatBot'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_ChatBot_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_ChatBot_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Edit_ChatBot_Window'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Button_Send_ChatBot_Pane'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Send_Outer_ChatBot_Pane'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Send_Inner_ChatBot_Pane'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_One_ChatBot_Header'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Image_One_ChatBot_Header'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Two_ChatBot_Header'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Image_Two_ChatBot_Header'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Pane_ChatBot'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_Bot_Message'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Edit_Bot_Message'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/ScrollBar_ChatBot_Pane'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Edit_ChatBot_Window'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Close_ChatBot_Pane'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_Screen'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_DNA'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Button_DNA'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Text_DNA_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Text_DNA_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Custom_DQN'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Button_DQN'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Text_DQN_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Text_DQN_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Menu/Custom_Omnia'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Omnia'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Omnia_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_Omnia_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Custom_ELearning'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_ELearning'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_ELearning_Outer'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Text_ELearning_Inner'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Menu/Button_Main'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Menu/xFindElements/Button_DNA'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Menu/xFindElements/Button_Omnia'))

Windows.closeApplication()

