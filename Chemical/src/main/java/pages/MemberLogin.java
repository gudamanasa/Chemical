package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MemberLogin {
	
	@FindBy(xpath="//*[@id=\"navbarNavDropdown\"]/ul/li[1]/a")
	public static WebElement home_MODULE;

	@FindBy(xpath="//a[@class='site-button-link white ng-star-inserted']")
	public static WebElement member;

	@FindBy(xpath="//*[@id=\"login\"]/form/div[2]/input")
	public static WebElement username;

	@FindBy(xpath="//*[@id=\"login\"]/form/div[3]/input")
	public static WebElement pwd;

	@FindBy(xpath="//*[@id=\"login\"]/form/div[5]/button")
	public static WebElement loginbutton;

	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	public static WebElement memberprofile;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-chemicalagent/div/app-header1/header/div/div/div/app-navigation/div[1]/div/ul/li/div/a[2]/a")
	public static WebElement Logout;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-dashboard/div[1]/app-profile-dash/div[1]/section/div[1]/div[1]/div/div[2]/input")
	public static WebElement dashboard_searchbar;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-dashboard/div[1]/app-profile-dash/div[1]/section/div[1]/div[1]/div/div[1]/span")
	public static WebElement dashboard_search_button;
	
	


}
