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

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'), 'ngocanh11123@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), '01234654654')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/textarea_(Include transaction id and other _6caa2d'), 'hanoi')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'hanoi')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 'co nguoi yeu roi')

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), '12345')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_Password_cust_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'), 
    'RigbBhfdqOCai1lFGA521g==')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/div_Full Name                              _c4abdf'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'))

WebUI.closeBrowser()

