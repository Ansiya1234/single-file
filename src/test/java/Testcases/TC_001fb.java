
package Testcases;

import org.testng.annotations.Test;

import PageObjects.Createaccntpage;
import PageObjects.Loginpage;
import testbase.Baseclass;

public class TC_001fb extends Baseclass{

@Test
public void loginandacnt() {
	Loginpage objlo=new Loginpage(driver);
	objlo.setusermail("abcdef@mail.com");
	objlo.setpasswd("2@qwe");
	objlo.clickbtn();
}
@Test
public void cre() {
	
	Createaccntpage objcre=new Createaccntpage(driver);
	objcre.createacnt();
	objcre.setusername("Ansiya");
	objcre.setlastname("PA");
	objcre.cickday();
}




}




