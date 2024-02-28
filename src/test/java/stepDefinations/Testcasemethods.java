package stepDefinations;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Corporatewellness;
import pageObject.Findingdoctors;
import pageObject.Surgeryoptions;
import utils.Helper;

public class Testcasemethods {

	public static WebDriver driver;
	Findingdoctors f1;
	Surgeryoptions f2 = new Surgeryoptions(Helper.getDriver());
	Corporatewellness f3 = new Corporatewellness(Helper.getDriver());;
	static Properties Pr;

	@Given("User navigates to practo.com")
	public void user_navigates_to_practo_com() {
		f1 = new Findingdoctors(Helper.getDriver());
	}

	@When("User search for the prefered city as {string}")
	public void user_search_for_the_prefered_city_as(String string) throws InterruptedException {
		WebElement element = f1.Selectcity();
		element.click();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);
		Thread.sleep(2000);
		f1.Selectcitypath();

	}

	@When("User search for the prefered speciality as {string}")
	public void user_search_for_the_prefered_speciality_as(String string) throws InterruptedException {
		WebElement element = f1.Selectdisease();
		element.click();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);
		Thread.sleep(2000);
		f1.Selectcardiologist();
	}

	@Then("User can see the options under patient stories")
	public void user_can_see_the_options_under_patient_stories() throws InterruptedException {
		f1.Patient();
		Thread.sleep(2000);
	}

	@Then("User can select any patient stories")
	public void user_can_select_an_option_as_patient_stories() throws InterruptedException {
		f1.Clickonstory();
		Thread.sleep(2000);
	}

	@When("User is on experience option")
	public void user_is_on_experience_option() throws InterruptedException {
		f1.Experiencebox();
		Thread.sleep(2000);
	}

	@Then("User can select an option as years of experience")
	public void user_can_select_an_option_as_years_of_experience() throws InterruptedException {
		f1.Experience2();
		Thread.sleep(2000);
	}

	@When("User is on all filter option")
	public void user_is_on_all_filter_option() throws InterruptedException {
		f1.Allfilters();
		Thread.sleep(2000);

	}

	@Then("User can select an option zero to five hundred")
	public void user_can_select_an_option_zero_to_five_hundred() throws InterruptedException {
		f1.Selectfee();
		Thread.sleep(2000);
	}

	@Then("Again user is on all filter option")
	public void again_user_is_on_all_filter_option() throws InterruptedException {
		f1.Allfilters();
		Thread.sleep(2000);
	}

	@Then("User can select an option as available today")
	public void user_can_select_an_option_as_available_today() throws InterruptedException {
		f1.Availability();
		Thread.sleep(2000);
	}

	@When("User is on relevance option")
	public void user_is_on_relevance_option() throws InterruptedException {
		f1.Relavance();
		// Thread.sleep(2000);
	}

	@Then("User can select an option as experience-high to low")
	public void user_can_select_an_option_as_experience_high_to_low() {
		f1.Range();

	}

	@Then("User is to select display top doctor details")
	public void user_is_to_select_display_top_doctor_details() {
		f1.Displaydoctordetails();
	}

	@When("User does click on surgery option")
	public void user_does_click_on_surgery_option() throws InterruptedException {
		f2.Surgery();
		// Thread.sleep(2000);

	}

	@Then("User store and displays the surgery list on the console")
	public void user_store_and_displays_the_surgery_list_on_the_console() throws InterruptedException {
		f2.Surgerylist();
		Thread.sleep(2000);

	}

	@When("User clicks on for corporate option")
	public void user_clicks_on_for_corporate_option() throws InterruptedException {
		f3.Forcorporates();
		Thread.sleep(2000);
	}

	@Then("User clicks on health and wellness plan")
	public void user_clicks_on_health_and_wellness_plan() throws InterruptedException {
		f3.Healthplan();
	}

	@Then("User enters Name {string}")
	public void user_enters_name(String string) throws InterruptedException {
		WebElement element = f3.Name();
		element.click();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);

	}

	@Then("User enters Organization {string}")
	public void user_enters_organization(String string) {
		WebElement element = f3.Organizationname();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);
	}

	@Then("User enters Contact {string}")
	public void user_enters_contact(String string) {
		WebElement element = f3.Contactno();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);
	}

	@Then("user enters Email {string}")
	public void user_enters_email(String string) {
		WebElement element = f3.Officialemail();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		element.sendKeys(string);
	}

	@Then("User clicks on Organization size")
	public void user_clicks_on_organization_size() {
		f3.Organizationsize();
	}

	@Then("User chooses appropriate size")
	public void user_chooses_appropriate_size() {
		f3.Sizenumber();
	}

	@Then("User clicks on interesed")
	public void user_clicks_on_interesed() {
		f3.Interestedin();
	}

	@Then("User chooses appropriate option")
	public void user_chooses_appropriate_option() {
		f3.Clickdemo();
	}

	@Then("User prints the observation on window")
	public void user_prints_the_observation_on_window() {
		System.out.println("*****Taking a demo button is greyed out*****");
	}

	@Then("system prints the Thank you message on window")
	public void system_prints_the_thank_you_message_on_window() {
		f3.Scheduleademo();
	}

}
