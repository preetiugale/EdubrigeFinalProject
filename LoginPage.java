package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {

	

WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@class='left-pane-results-container']")
	WebElement searchResults ;
	
	
	@FindBy(partialLinkText="Best Sellers")
	WebElement bestSellers;
	

	@FindBy(xpath="//div[@id='glow-ingress-block']")
	WebElement selectYouraddress ;
	

	@FindBy(xpath="//input[@id='GLUXZipUpdateInput']")
	WebElement pincodeText ;
	
	@FindBy(xpath="//span[@id=\"GLUXZipUpdate\"]")
	WebElement applyButton;
	
	public LoginPage() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		 ChromeOptions options = new ChromeOptions();
			
		 options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		PageFactory.initElements(driver, this);
		
	}
	
	public void LaunchApplication() {
		driver.get("https://www.amazon.in/");
		
	}
	public void searchElement(String searchTerm) {
		searchBox.sendKeys(searchTerm);
		
	}
	
public void listSearchResult(String searchTerm) {
		
		
		String searchArr[] = searchResults.getText().split("\\R");
		
		System.out.println("Search Size: "+ searchArr.length);
		System.out.println("Search Result list is:"+ searchResults.getText());
		
		for(String T : searchArr) {
			
			System.out.println(T);
			
			if (T.contains(searchTerm)) {
				Assert.assertTrue(T.contains(searchTerm));
				break;
			}
		}
     
}

	
	public void clickButton() {
		searchButton.click();
	}
	
	
	public void bestSellers() {
		bestSellers.click();
	}
	
	public void helloSelectYourAddress() {
		selectYouraddress.click();
	}
	
	public void addPincodeInTextBox() {
		pincodeText.sendKeys("400612");
	}
	
	public void clickOnApplyButton() {
		
		applyButton.click();
	}
	public void closeBrowser() {
		driver.close();
	}
	
	
}


