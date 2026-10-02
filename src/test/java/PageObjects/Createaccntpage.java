package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccntpage extends BasePage{
	
	public Createaccntpage(WebDriver driver) {
		super(driver);
	}
	By createacntbtn=By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[5]/div/a/div/div[1]");
	By usernamew=By.xpath("//*[@id=\"_R_1cl2p4jikacppb6amH1_\"]");
	By lastname=By.cssSelector("#_R_1kl2p4jikacppb6amH1_");
By daydrop=By.xpath("//*[@id=\"_r_3_\"]/div");
public void createacnt() {
	driver.findElement(createacntbtn).click();
	
}
public void setusername(String user) {
	driver.findElement(usernamew).sendKeys(user);
	
}
public void setlastname(String last_name) {
	driver.findElement(lastname).sendKeys(last_name);
	
}
public void cickday() {
	driver.findElement(daydrop).click();
}



}
