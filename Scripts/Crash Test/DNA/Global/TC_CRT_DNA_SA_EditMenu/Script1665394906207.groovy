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

Windows.startApplicationWithTitle('C:\\Users\\NicolaiBertelsenJens\\source\\repos\\Cargi-BI-Global-Client\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

not_run: Windows.startApplicationWithTitle('C:\\Users\\Power\\OneDrive - Jonson Consult Aps\\Desktop\\Cargo_BI_Client\\bin\\Debug\\net6.0-windows\\Cargo_BI_Client.exe', 
    '')

Windows.click(findWindowsObject('Object Repository/CargoBI/Misc/Button_Maximize'))

Windows.click(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Edit_Username'))

Windows.setText(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Edit_Username'), 'Super admin')

Windows.click(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Edit_Password'))

Windows.setText(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Edit_Password'), 'test')

Windows.click(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Button_Login'))

Windows.sendKeys(findWindowsObject('Other/Window'), Keys.chord(Keys.SHIFT, Keys.CONTROL, '1'))

Windows.delay(57)

Windows.verifyElementPresent(findWindowsObject('CargoBI/Crash Test/DNA/Global_DNA/Button_Update'), 0)

Windows.closeApplication()

@TearDownIfFailed
def handleFailure() {
    Windows.sendKeys(findWindowsObject('CargoBI/Misc/Window_CargoBI_Application'), Keys.chord(Keys.ESCAPE))

    Windows.closeApplication()
}

