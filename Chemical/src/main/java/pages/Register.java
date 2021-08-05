package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {

	@FindBy(xpath="//a[text()=' Register']")
	public static WebElement Register;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[1]/input")
	public static WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[2]/input")
	public static WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[3]/input")
	public static WebElement Email;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[4]/input")
	public static WebElement Address;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[5]/input")
	public static WebElement city;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[6]/input")
	public static WebElement Phonenumber;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[7]/input")
	public static WebElement companyname;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[8]/input")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[9]/input")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[10]/input")
	public static WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[12]/label")
	public static WebElement TermsAndPrivacy;
	
	@FindBy(xpath="//*[@id=\"register\"]/form/div[13]/button")
	public static WebElement Submit;
	
	
	@FindBy(xpath="/html/body/app-root/app-home1/div/div/app-search-form1/div/div/div/div[2]/div/div[1]/form/div/div[1]/form/mat-form-field/div/div[1]/div/input")
	public static WebElement home_search_Bar;
	
	@FindBy(xpath="/html/body/app-root/app-home1/div/div/app-search-form1/div/div/div/div[2]/div/div[1]/form/div/div[2]/button")
	public static WebElement home_Search_Button;
	
	
	
	
	
}
