package executableclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://chemicalagentmain.s3-website-us-east-1.amazonaws.com/");
		
		driver.findElement(By.xpath("//*[@id=\"bg\"]/app-root/app-home1/div/app-header1/header/div/div/div/app-navigation/div[1]/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[2]/input")).sendKeys("Manasa96");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input")).sendKeys("guda1996@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[5]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bg\"]/app-root/app-home1/div/app-header1/header/div/div/div/app-navigation/div[1]/div/a[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-add-listing/div/div[1]/div/div/div/div[2]/form/div[3]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]/span[1]/div")).click();
//		Thread.sleep(1000);
		
	
		String mfgDate="July 2021 17";
		String avldate="July 2021 17";
		String expDate="July 2022 17";
		
		String  dateSplit[]=mfgDate.split(" "); 
		String month_year=dateSplit[0]+" "+dateSplit[1];
		String day=dateSplit[2];
		
		Thread.sleep(3000);
		System.out.println("input date:"+month_year+" "+day);
		
		selectDate(month_year,day);
	}

		public static void selectDate(String month_year,String day) throws Throwable {
			
			List<WebElement> monthyearElements = driver.findElements(By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]"));
			Thread.sleep(2000);
			System.out.println(monthyearElements.size());
			
			for(int i=0;i<monthyearElements.size();i++) {
				String elementstext=monthyearElements.get(i).getText();
				System.out.println("month year:"+elementstext);
				
				if(elementstext.equalsIgnoreCase(month_year)) {
					List<WebElement> days= driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/mat-datepicker-content/mat-calendar/div/mat-month-view"));	
					for(WebElement d:days) {
						System.out.println("date is:"+d.getText());
						if(d.getText().equals(day)) {
							d.click();
							break;
						}
					}
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
