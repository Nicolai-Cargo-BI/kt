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

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('Object Repository/CargoBI/Misc/Button_Maximize'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Button_Collapsed_One'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Image_Collapsed_One'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Button_Collapsed_Two'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Image_Collapsed_Two'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Custom'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Text_WelcomeTo'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Text_CargoBI'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Edit_Username'))

Windows.click(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Edit_Password'))

Windows.sendKeys(findWindowsObject('Other/Window'), Keys.chord(Keys.SHIFT, Keys.CONTROL, 'p'))

Windows.delay(60)

Windows.findElement(findWindowsObject('Object Repository/CargoBI/Crash Test/Login_Page/Button_Collapsed_One'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Button_Collapsed_Two'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Custom'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Edit_Password'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Edit_Username'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Image_Collapsed_One'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Image_Collapsed_Two'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Text_CargoBI'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Text_WelcomeTo'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Button_Login_disable'))

Windows.findElement(findWindowsObject('CargoBI/Crash Test/Login_Page/Text_Login'))

Windows.click(findWindowsObject('CargoBI/Crash Test/Login_Page/Button_Login'))

Windows.click(findWindowsObject('CargoBI/Misc/Button_Close'))

