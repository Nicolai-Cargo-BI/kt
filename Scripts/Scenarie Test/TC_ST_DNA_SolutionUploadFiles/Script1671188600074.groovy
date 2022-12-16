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

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Button_Maximize'))

not_run: Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_tbx_UserName'))

not_run: Windows.setText(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_tbx_UserName'), 'SuperAdmin')

not_run: Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_pbx_Password'))

not_run: Windows.setText(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_pbx_Password'), 'test')

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Text_SignIn'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Button_DNA'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Text_cat'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Text_Menu_RND9RKKUJI'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Text_Solution_102HGJI0RB'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Text'))

Windows.click(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/ToolBar'))

CustomKeywords.'com.db.keys.Scenarie_test_directory'()

Windows.setText(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_Address'), CustomKeywords.'com.db.keys.Scenarie_test_directory'())

Windows.sendKeys(findWindowsObject('CargoBI/Scenarie Test/Global/DNA/Edit_Address'), Keys.chord(Keys.ENTER))

Windows.delay(7)

Windows.closeApplication()

