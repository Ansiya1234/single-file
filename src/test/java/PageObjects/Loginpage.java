package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends BasePage {
public Loginpage(WebDriver driver) {
	super(driver);
}
By usermail=By.name("email");
By passwd=By.name("pass");
By loginbtn=By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div/span/span");

public void setusermail(String usermail_name) {
	driver.findElement(usermail).sendKeys(usermail_name);
	
}
public void setpasswd(String password) {
	driver.findElement(passwd).sendKeys(password);
	}
public void clickbtn() {
	driver.findElement(loginbtn).click();
	}
}
