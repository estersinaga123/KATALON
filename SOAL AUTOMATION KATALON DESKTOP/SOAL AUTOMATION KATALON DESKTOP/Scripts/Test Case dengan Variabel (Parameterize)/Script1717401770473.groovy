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

// Define variables
String username = 'variableUsername'
String password = 'variablePassword'

// Open application
Windows.startApplication('path/to/your/application.exe')

// Input username and password
Windows.setText(findWindowsObject('Object Repository/LoginPage/Username'), username)
Windows.setText(findWindowsObject('Object Repository/LoginPage/Password'), password)

// Click login button
Windows.click(findWindowsObject('Object Repository/LoginPage/LoginButton'))

// Verify login based on input
if (username == 'validUser' && password == 'validPass') {
	Windows.verifyElementPresent(findWindowsObject('Object Repository/HomePage/WelcomeMessage'), 5)
} else {
	Windows.verifyElementPresent(findWindowsObject('Object Repository/LoginPage/ErrorMessage'), 5)
}
