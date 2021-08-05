package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfilePage {
	
	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	public static WebElement welcome;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-home1/div/app-header1/header/div/div/div/app-navigation/div[1]/div/ul/li/div/a[1]")
	public static WebElement mydashboard;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-dashboard/div[1]/app-profile-dash/div[1]/section/div[2]/div[2]/div/div/div[2]/div/h3/i")
	public static WebElement editicon;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div[1]/app-profile-dash/div[2]/div/div/div[2]/div[1]/div[2]/input")
	public static WebElement fullname;
	
	@FindBy(xpath="//*[@id=\"imagemodal\"]/div/div/div[2]/div[2]/input")
	public static WebElement choosefile;
	
	@FindBy(xpath="//*[@id=\"imagemodal\"]/div/div/div[2]/div[3]/input")
	public static WebElement phonenum;
	
	@FindBy(xpath="//*[@id=\"imagemodal\"]/div/div/div[2]/div[4]/button[1]")
	public static WebElement update_button;

}
