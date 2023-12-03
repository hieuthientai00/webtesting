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

WebUI.navigateToUrl('http://localhost/ecommerce/registration.php')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'Hoang Ngoc Anh')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'KMA')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'), 'ngocanh123123@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/textarea_(Include transaction id and other _6caa2d'), 'Yen Xa, Tan Trieu, Thanh Tri, Ha Noi')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'Ha noi')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'active')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), '134566')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_Password_cust_password'), 'Bx0gmfDZMngAs7PAZw9AL42/0vxWG8+z')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 
    'Bx0gmfDZMngAs7PAZw9AL42/0vxWG8+z')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'), 'ngocanh123123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_Password_cust_password'), 'Bx0gmfDZMngAs7PAZw9AL42/0vxWG8+z')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Ecommerce/button_Update Profile'))

WebUI.click(findTestObject('Object Repository/Page_Update Profile - Ecommerce/button_Logout'))

WebUI.closeBrowser()

