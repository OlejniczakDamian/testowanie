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

import org.junit.After
import org.openqa.selenium.Keys as Keys



WebUI.openBrowser('')

for (def row = 4; row <= 5; row++) {
	

WebUI.navigateToUrl(GlobalVariable.URI)

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Register'))


WebUI.setText(findTestObject('Object Repository/Strona główna/input_First Name_firstname'), findTestData('dane testowe').getValue('imie', row))

WebUI.setText(findTestObject('Object Repository/Strona główna/input_Last Name_lastname'), findTestData('dane testowe').getValue('nazwisko', row))

text_malpa = findTestData('dane testowe').getValue(3,row)

WebUI.setText(findTestObject('Object Repository/Strona główna/input_E-Mail_email'), text_malpa)
WebUI.setText(findTestObject('Object Repository/Strona główna/input_Telephone_telephone'), findTestData('dane testowe').getValue('telefon', row))

WebUI.setText(findTestObject('Object Repository/Strona główna/input_Password_password'), findTestData('dane testowe').getValue('haslo', row))

WebUI.setText(findTestObject('Object Repository/Strona główna/input_Password Confirm_confirm'), findTestData('dane testowe').getValue('haslo', row))

WebUI.click(findTestObject('Object Repository/Strona główna/input_Privacy Policy_agree'))

WebUI.click(findTestObject('Object Repository/Strona główna/input_Privacy Policy_btn btn-primary'))
}

//WebUI.verifyElementVisible(findTestObject('Object Repository/Strona główna/Komunikat telefon moze zawierać tylko cyfry'))//

WebUI.closeBrowser()