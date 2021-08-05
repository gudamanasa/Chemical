package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellModule {
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-home1/div/app-header1/header/div/div/div/app-navigation/div[1]/div/a[2]")
	public static WebElement sell_module;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[1]/div/input")
	public static WebElement chemical_name;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[2]/div/input")
	public static WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"mat-select-0\"]/div/div[2]/div")
	public static WebElement units_downarrow;
	
	@FindBy(xpath="//*[@id=\"mat-option-2\"]/span")
	public static WebElement kilograms;
	
	//mfg date
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[3]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
	public static WebElement mfg_date_calender;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]/span[1]/div")
	public static WebElement downwardArrow_mfg;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[3]")
	public static WebElement next_sidearrow_mfg;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]")
	public static WebElement previous_sidearrow_mfg;

	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[1]/div[1]")
	public static WebElement year_2021_june_20;
	
	//expiry date
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[4]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
	public static WebElement Expirydate_calender;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/div/mat-multi-year-view/table/tbody/tr[1]/td[2]/div[1]")
	public static WebElement year_2022;

	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/div/mat-year-view/table/tbody/tr[3]/td[3]/div[1]")
	public static WebElement year_2022_jul;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[4]/td[4]/div[1]")
	public static WebElement year_2022_jul_20;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[1]/span[1]/div")
	public static WebElement downward_arrow_exp;

	//availability date
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[5]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
	public static WebElement availability_calender;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-2\"]/mat-calendar-header/div/div/button[1]/span[1]/div")
	public static WebElement downward_arrow_avl;
	
	@FindBy(xpath="//*[@id=\"mat-datepicker-2\"]/div/mat-month-view/table/tbody/tr[2]/td[6]/div[1]")
	public static WebElement year_2021_jul_09;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[6]/div[1]/input")
	public static WebElement price;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[6]/div[2]/div/input")
	public static WebElement createdBy;
	
	@FindBy(xpath="//*[@id=\"mat-select-2\"]/div/div[2]/div")
	public static WebElement status_downarrow;
	
	@FindBy(xpath="//*[@id=\"mat-option-6\"]/span")
	public static WebElement Status_available;
	
	@FindBy(xpath="//*[@id=\"bg\"]/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[7]/button")
	public static WebElement submit;
	
	
}
