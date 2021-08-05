package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyModule {

	@FindBy(xpath="//a[text()='Buy']")
	public static WebElement buy;
	
	@FindBy(xpath="//a[text()=' Next ']")
	public static WebElement next;
	
	@FindBy(xpath="//a[text()=' Previous ']")
	public static WebElement previous;
	
	
}
