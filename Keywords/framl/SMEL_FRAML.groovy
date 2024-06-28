package framl

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

import internal.GlobalVariable
import groovy.json.JsonSlurper
import com.kms.katalon.core.util.KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

class SMEL_FRAML {
	private def response;
	private static String e_id;
	private static String e_stat;
	private static String name;
	

	def FBSD_211(){
		response= WS.sendRequest(findTestObject("Industry Risk Rating/Industry Prohibited Check"))
		WS.verifyResponseStatusCode(response, 200)
		e_id=WS.getElementPropertyValue(response, 'event_id')
		KeywordUtil.logInfo(e_id)
	}
	
	def value() {
		def json = """
{
"event_id":"4ae3d994-aac9-48cb-8449-e4c4e64ea5b8",
  "evaluation_status":"Accepted"
}
"""
	}
	
	def validatetype() {
		response= WS.sendRequest(findTestObject("Industry Risk Rating/Industry Prohibited Check"))
	def json = """
{
"event_id":"4ae3d994-aac9-48cb-8449-e4c4e64ea5b8",
  "evaluation_status":"Accepted"
}
"""
		
		JsonSlurper slurper = new JsonSlurper()
		def obj = slurper.parseText(json)
		
		assert obj['evaluation_status'] instanceof String
		
		assert obj['event_id'] instanceof String
		/*def json=e_id
		
		JsonSlurper s=new JsonSlurper()
		def obj=s.parseText(json)
		assert obj['json'] instanceof String*/
	}
}
