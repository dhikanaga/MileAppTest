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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.basePage)

WebUI.waitForElementClickable(findTestObject('Automation/Page_Mile.app_Org_Login/input_Org_Name'), 3)

WebUI.setText(findTestObject('Automation/Page_Mile.app_Org_Login/input_Org_Name'), GlobalVariable.orgName)

WebUI.waitForElementClickable(findTestObject('Automation/Page_Mile.app_Org_Login/button_Login_Org'), 3)

WebUI.click(findTestObject('Automation/Page_Mile.app_Org_Login/button_Login_Org'))

WebUI.waitForElementClickable(findTestObject('Automation/Page_Mile.app  Login/input_Email Address or Username_email or username'), 
    3)

WebUI.setText(findTestObject('Automation/Page_Mile.app  Login/input_Email Address or Username_email or username'), GlobalVariable.dummyUsername)

WebUI.setEncryptedText(findTestObject('Automation/Page_Mile.app  Login/input_Password_password'), GlobalVariable.dummyPassword)

WebUI.click(findTestObject('Automation/Page_Mile.app  Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Automation/Page_Mile.app  Login/error_Fail_Login'), 
    5)

WebUI.closeBrowser()

