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

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/input_Email Address_cust_email'), 'ngocanh@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ecommerce/input_Password_cust_password'), 'Bx0gmfDZMngAs7PAZw9AL42/0vxWG8+z')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_Password_form1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Ecommerce/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_Quantity_form_add_to_cart'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/a_Cart (39)'))

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/a_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Ecommerce/textarea_(Include transaction id and other _6caa2d'), 'transaction: 19237278882')

WebUI.click(findTestObject('Object Repository/Page_Ecommerce/input_(Include transaction id and other inf_948c0c'))

WebUI.click(findTestObject('Object Repository/Page_/a_Back to Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Ecommerce/button_Orders'))

WebUI.click(findTestObject('Object Repository/Page_Orders - Ecommerce/button_Logout'))

WebUI.closeBrowser()

