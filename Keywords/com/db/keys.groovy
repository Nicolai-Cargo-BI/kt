package com.db

/*import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
 import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
 import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
 import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
 import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
 import com.kms.katalon.core.annotation.Keyword
 import com.kms.katalon.core.checkpoint.Checkpoint
 import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
 import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
 import com.kms.katalon.core.model.FailureHandling
 import com.kms.katalon.core.testcase.TestCase
 import com.kms.katalon.core.testdata.TestData
 import com.kms.katalon.core.testobject.TestObject
 import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
 import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
 import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
 import internal.GlobalVariable*/
import com.kms.katalon.core.annotation.Keyword
import com.github.kklisura.cdt.protocol.types.indexeddb.Metadata

import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class keys {


	@Keyword
	def Scenarie_test_directory() {
		
		for (int i = 0; i<200; i++) {
			println((char)i);
		}
		return ""+(char)92+"";
		
		
	}
	
	@Keyword
	def Macro_continue() {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_SHIFT)
		r.keyPress(KeyEvent.VK_C)
		r.keyRelease(KeyEvent.VK_C)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_SHIFT)
	}

	@Keyword
	def Test_Fails() {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_ESCAPE)
		r.keyRelease(KeyEvent.VK_ESCAPE)
	}

	@Keyword
	def Test_desktop() {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_WINDOWS)
		r.keyPress(KeyEvent.VK_M)
		r.keyRelease(KeyEvent.VK_WINDOWS)
		r.keyRelease(KeyEvent.VK_M)
	}

	@Keyword
	def Test_UpdateCheck() {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_SHIFT)
		r.keyPress(KeyEvent.VK_U)

		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_SHIFT)
		r.keyRelease(KeyEvent.VK_U)
	}

	@Keyword
	def Test_OldVersionInstall() {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_SHIFT)
		r.keyPress(KeyEvent.VK_I)

		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_SHIFT)
		r.keyRelease(KeyEvent.VK_I)
	}

	def key_start( ) {
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_SHIFT)
		r.keyPress(KeyEvent.VK_K)
		r.keyRelease(KeyEvent.VK_K)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_SHIFT)
	}
}
