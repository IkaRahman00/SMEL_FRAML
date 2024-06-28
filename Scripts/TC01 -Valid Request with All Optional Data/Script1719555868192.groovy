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
import groovy.json.JsonSlurper

//private static String e_id;
'Send API request'
response= WS.sendRequest(findTestObject("Industry Risk Rating/Industry Prohibited Check"))

'Verify Status Reponse Code= 200'
WS.verifyResponseStatusCode(response, 200)

'Verify JSON element (event id)'
 e_id=WS.getElementPropertyValue(response, 'event_id')
println(e_id)

'Verify JSON element evaluation status'
e_stat=WS.getElementPropertyValue(response, 'evaluation_status')
println(e_stat)









//CustomKeywords.'framl.SMEL_FRAML.FBSD_211'()


/*'Send Request for Industry Risk Rating'
response = WS.sendRequest(findTestObject('Industry Risk Rating/Industry Prohibited Check'))

'Verify Response Code =200 '
response = WS.verifyResponseStatusCode(response, 200)

'Validate JSON element'
WS.getElementPropertyValue(response, 'event_id')*/

