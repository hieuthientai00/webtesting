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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/ecommerce/login.php')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'), 'hieuthientai2001')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard - Ecommerce/input_Cart (0.00)_search_text'), 'as')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Ecommerce/input_Cart (0.00)_search_text'))

WebUI.click(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'), 'as')

WebUI.click(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'), 'a')

WebUI.click(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'), '\' or 1=1--')

WebUI.click(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_/div_supportecommercephp.com_col-md-4 logo'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Ecommerce/input_Cart (0.00)_search_text'))

WebUI.delay(3)

WebUI.closeBrowser()

