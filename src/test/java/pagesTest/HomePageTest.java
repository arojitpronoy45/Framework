package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = false, priority = 2)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();

	}
	@Test(enabled = false)
	public void inputTextInUserIdFieldTest() {
		homePage.inputTextInUserIdField();
	}
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_user_name_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).click();
		Thread.sleep(4000);
	}
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_password_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password']")).click();
		Thread.sleep(4000);
}
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_forgot_user_id_hyperlink() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='LabelLink-sc-11yfjnx-9 clDRPU']")).click();
		Thread.sleep(4000);
	}
	@Test(enabled = false)
	public void use_of_linktext_as_locator_in_forgot_password_id_hyperlink() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create an account")).click();
		Thread.sleep(4000);
	}
	@Test(enabled = true)

	public void use_of_partialLinkText_as_locator_in_forgot_password_hyperlink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		Thread.sleep(4000);
}
}