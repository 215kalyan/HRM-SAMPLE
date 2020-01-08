package package25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalyan\\Downloads\\njar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver bo=new ChromeDriver();
		 bo.get("https://sites.google.com/a/chromium.org/chromedriver/");
		 bo.close();
	}

}
