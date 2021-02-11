package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.DriverManager;

public class Util extends DriverManager{

	public static byte[] takeScreenShot() {
	return	((TakesScreenshot)webDriver.get()).getScreenshotAs(OutputType.BYTES);
	}
	
}
