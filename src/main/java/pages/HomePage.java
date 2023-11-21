package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	@FindBy(id = "submit_btn")
	WebElement loginButton;

	@FindBy(id = "//input[@id='username']")
	WebElement userIdElement;
	
	@FindBy(how = How.ID, using = "//input[@id='password']")
	WebElement password;
	
	By unlock = By.xpath("//a[text()='unlock']");
	
	//@FindBy (xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	//WebElement logo;
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(5000);
	}

	public void clickUserId() {

	}

public void clickPassword() {
	
}
public void inputTextInUserIdField () {
	userIdElement.sendKeys("apronoy 2001");
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	
	
}

