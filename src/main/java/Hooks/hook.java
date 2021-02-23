package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.DriverManager;
import Utility.Util;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hook extends DriverManager {

	@BeforeStep
	public void beforeStep() {
	}

	@AfterStep
	public void afterStep() {
	}

	@Before
	public void beforeScenario() {
	}

	@After
	public void afterScenario(Scenario scenario) {
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
	}
}
