package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {
	
	@FindBy(xpath="//*[@id=\"navbarNavDropdown\"]/ul/li[2]/a")
	public static WebElement ContactUs;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/input")
	public static WebElement yourname;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[2]/div/div/input")
	public static WebElement Your_Emailid;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[3]/div/div/input")
	public static WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[5]/div/div/textarea")
	public static WebElement yourMessage;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[6]/button")
	public static WebElement submit_now;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/app-banner2/div/div/div/div/ul/li[1]/a")
	public static WebElement home_link;
	
	@FindBy(xpath="//*[@id=\"mat-select-0\"]/div/div[2]")
	public static WebElement issue_arrow;
	
	@FindBy(xpath="//*[@id=\"mat-option-2\"]/span")
	public static WebElement issue_type;
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	