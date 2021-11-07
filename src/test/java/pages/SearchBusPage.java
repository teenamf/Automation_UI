package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;
import util.Common;
import util.Config;

public class SearchBusPage extends PageObject {

	Config con = new Config();
	Common common = new Common();

	@FindBy(xpath = "//input[@id='src']")
	WebElement fromPlace;

	@FindBy(xpath = "//input[@id='dest']")
	WebElement toPlace;

	@FindBy(xpath = "//input[@id='onward_cal']")
	WebElement dateTextBox;

	@FindBy(xpath = "//tr//td[@class='monthTitle']")
	WebElement monthTitle;

	@FindBy(xpath = "//tr//td[@class='next']")
	WebElement nextArowCalendar;

	@FindBy(xpath = "//table[@class='rb-monthTable first last']//td")
	List<WebElement> calendarList;

	@FindBy(xpath = "//button[@id='search_btn']")
	WebElement searchBtn;

	public SearchBusPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void launchUrl() {

		getDriver().get(con.retrievebaseUrl());
		getDriver().manage().window().maximize();

	}

	public void enterDepartureCity() throws InterruptedException {
		fromPlace.click();
		fromPlace.clear();
		fromPlace.sendKeys("Kochi");
		Thread.sleep(1000);
		// common.explicitWaitforVisibility(getDriver(),fromPlace,30);
		fromPlace.sendKeys(Keys.ENTER);

	}

	public void enterToCity() throws InterruptedException {
		toPlace.click();
		toPlace.clear();
		toPlace.sendKeys("Koyambedu");
		Thread.sleep(1000);
		toPlace.sendKeys(Keys.ENTER);

	}

	public void selectDate() throws InterruptedException {
		dateTextBox.click();
		String monthTit = monthTitle.getText();
		String[] month = monthTit.split(" ");
		System.out.println(month[0]);

		// DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		// Date date = new Date();
		// String date1= dateFormat.format(date);
		// System.out.println(date1);
		// int monthNum=Integer.parseInt(date1.substring(0, 2));
		// String month=Month.of(monthNum).getDisplayName(TextStyle.SHORT,
		// Locale.ENGLISH).substring(0, 3);
		// System.out.println(month);
		// String day=date1.substring(3, 5);
		// int dayValue=Integer.parseInt(day);

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		Date futureDateTime = calendar.getTime();
		System.out.println(futureDateTime);
		String[] futureDate = futureDateTime.toString().split(" ");
		common.explicitWaitforVisibility(getDriver(), nextArowCalendar, 30);
		if (!(month[0].equals(futureDate[1]))) {
			nextArowCalendar.click();
		}

		int total_node = calendarList.size();
		for (int i = 0; i < total_node; i++) {
			String date = calendarList.get(i).getText();
			if (date.equals(futureDate[2])) {
				calendarList.get(i).click();
				break;
			}
		}

	}

	public void searchBus() {

		searchBtn.click();
	}

}