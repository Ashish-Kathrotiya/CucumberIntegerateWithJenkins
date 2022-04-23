package pages;

import utility.CommonDriverUtils;

public class LoginPage extends CommonDriverUtils {
	
	public void navigateToHomePage() {
		driver.get("https://www.contrado.co.uk/");
		driver.manage().window().maximize();
	}

}
