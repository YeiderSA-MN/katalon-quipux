import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Feature1 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given('Abro el navegador y me dirijo al test')
	def Abro_el_navegador_y_me_dirijo_al_test(){
		WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")
		WebUI.maximizeWindow()
	}

	@When('me logueo')
	def me_logueo() {
		WebUI.click(findTestObject('Object Repository/BtnIniciar'))
		WebUI.setText(findTestObject('Object Repository/Nombre'), 'John Doe')
		WebUI.setText(findTestObject('Object Repository/Contrasena'), 'ThisIsNotAPassword')
		WebUI.click(findTestObject('Object Repository/BtnLogin'))
	}

	@And('relleno el formulario')
	def relleno_el_formulario() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Select'), 'Seoul CURA Healthcare Center', false)
		WebUI.check(findTestObject('Object Repository/Checkbox'))
		WebUI.check(findTestObject('Object Repository/Radio'))
		WebUI.setText(findTestObject('Object Repository/Date'), '28/10/2023')
		WebUI.setText(findTestObject('Object Repository/Comment'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lectus mauris, semper non velit cursus, iaculis pulvinar nunc. Fusce non mi nibh. Maecenas eu maximus ante. Vestibulum non augue ac magna eleifend imperdiet. Proin lectus lorem, malesuada ut leo sed, fermentum sollicitudin nulla. Phasellus dolor est, varius sit amet porta ut, ornare sit amet nisl. Fusce venenatis metus quis enim tincidunt sagittis. Vivamus ac neque mollis, feugiat est sed, malesuada est. Cras fringilla, enim et auctor rutrum, ipsum odio ornare erat, at consectetur nunc erat sit amet libero. Nunc laoreet convallis eros finibus vulputate. Donec nibh mauris, rhoncus nec ex et, placerat tempus lorem.')
	}

	@And('confirmo el formulario')
	def confirmo_el_formulario() {
		WebUI.click(findTestObject('Object Repository/Submit'))
	}

	@Then('cierro el navegador')
	def cierro_el_navegador() {
		WebUI.click(findTestObject('Object Repository/BtnFinish'))
		WebUI.closeBrowser()
	}
}