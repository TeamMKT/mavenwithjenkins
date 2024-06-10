package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two2 {
	@Test
	public void testcas2()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement us = driver.findElement(By.id("ap_email"));
	us.sendKeys("shweta@gmail.com");//right un
	WebElement cn = driver.findElement(By.id("continue"));
	cn.click();
	WebElement ps = driver.findElement(By.name("password"));
	ps.sendKeys("shweta@123");//right password
	WebElement sg = driver.findElement(By.id("signInSubmit"));
	sg.click();
}
}