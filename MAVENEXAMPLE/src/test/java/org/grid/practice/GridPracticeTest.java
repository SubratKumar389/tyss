package org.grid.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//hi
public class GridPracticeTest {

	public static void main(String[] args) throws MalformedURLException {
		
 URL url = new URL("http://localhost:4444/wd/hub");
 DesiredCapabilities cap=new DesiredCapabilities();
 //heloobb
 cap.setBrowserName("chrome12");
 cap.setPlatform(Platform.WINDOWS);
 RemoteWebDriver driver=new RemoteWebDriver(url, cap);
 
 driver.get("https://youtube.com");
	}

}
