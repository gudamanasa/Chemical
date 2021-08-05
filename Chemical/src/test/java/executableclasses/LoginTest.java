package executableclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utilities.BaseTest;
import utilities.ReUsableCode;

public class LoginTest extends BaseTest {
	
String filepath="E:\\chemical agent.xlsx";
	
	@Test(priority=1)
	public void chemicalUrlLaunch() throws Throwable {
		test=extent.createTest("Launch Url");
		inIt();
		browserInitialisation();
		launchurl();
		test.log(Status.INFO, "Url entered and chemical agent site opened");
		Thread.sleep(3000);
	}
	

//	@Test(priority=2,dataProvider="mydataprovider")
//	public void memberLogin(String Username,String Password) throws Throwable 
//	{
//		test=extent.createTest("Member Login");
//		int rc = ReUsableCode.getRowCount(filepath, "member login");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		for(int i=1;i<=rc;i++) {
//
//		click(MemberLoginObject.member);
//		test.log(Status.INFO, "clicked on member login");
////		Thread.sleep(2000);
//		sendData(MemberLoginObject.username,Username);
//		test.log(Status.INFO, "Entered username");
////		Thread.sleep(2000);
//		sendData(MemberLogin.pwd,Password);
//		test.log(Status.INFO, "Entered password");
////		Thread.sleep(2000);
//		click(MemberLoginObject.loginbutton);
//		test.log(Status.INFO, "clicked on login button");
//		}
//	}
//	
//	@DataProvider
//	public Object[][] mydataprovider() throws Throwable{
//		return ReUsableCode.ChemicalMemberLoginData(filepath, "member login");
//	}
	
	
//	@Test(priority=2)
//	public void register() throws Throwable {
//		click(MemberLoginObject.member);
//		Thread.sleep(3000);
//		click(RegisterObject.Register);
//		Thread.sleep(2000);
//		sendData(RegisterObject.firstname,"Prameela");
//		Thread.sleep(1000);
//		sendData(RegisterObject.lastname,"Gadepalli");
//		Thread.sleep(1000);
//		sendData(RegisterObject.Email,"gudamanasa10@gmail.com");
//		Thread.sleep(1000);
//		sendData(RegisterObject.Address,"Nellore");
//		Thread.sleep(1000);
//		sendData(RegisterObject.city,"Nellore");
//		Thread.sleep(1000);
//		sendData(RegisterObject.Phonenumber,"8008052179");
//		Thread.sleep(1000);
//		sendData(RegisterObject.companyname,"Teluguganga");
//		Thread.sleep(1000);
//		sendData(RegisterObject.username,"Prameela72");
//		Thread.sleep(1000);
//		sendData(RegisterObject.password,"Prameela72@");
//		Thread.sleep(1000);
//		sendData(RegisterObject.ConfirmPassword,"Prameela72@");
//		Thread.sleep(2000);
//		click(RegisterObject.TermsAndPrivacy);
////		Thread.sleep(1000);
////		click(RegisterObject.Submit);
//	}
 	

//	//Update Profile
//		@Test(priority=3, dataProvider="Updateprofile")
//		
//		public void UpdateProfile(String fullname, String phonenum) throws Throwable {
//			test=extent.createTest("Update profile functionality");
//			int rc = ReUsableCode.getRowCount(filepath, "update profile");
//			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			for(int i=1;i<=rc;i++) {
//				
//			//Thread.sleep(2000);
//			click(UpdateProfilePageObject.welcome);
//			test.log(Status.INFO, "Clicked on member profile");
//			//Thread.sleep(2000);
//			click(UpdateProfilePageObject.mydashboard);
//			test.log(Status.INFO, "Clicked on mydashboard");
//			//Thread.sleep(2000);
//			click(UpdateProfilePageObject.editicon);
//			test.log(Status.INFO, "clicked on edit icon");
//			//Thread.sleep(2000);
//			sendData(UpdateProfilePageObject.fullname,fullname);
//			test.log(Status.INFO, "Full name entered");
//			//Thread.sleep(2000);
////			click(UpdateProfilePage.choosefile);
////			Thread.sleep(3000);
////			//it will run the 'exe' files
////			Runtime.getRuntime().exec("E:\\Selenium\\Chemical Agent\\ChemicalagentFile.exe");
////			Thread.sleep(3000);
//			sendData(UpdateProfilePageObject.phonenum,phonenum);
//			test.log(Status.INFO, "phone number entered");
//			//Thread.sleep(2000);
//			click(UpdateProfilePageObject.update_button);
//			test.log(Status.INFO, "clicked on update button");
//			//Thread.sleep(4000);
//		}
//		}
//		@DataProvider
//		public Object[][] Updateprofile() throws Throwable
//		{
//			return ReUsableCode.chemicalMemberUpdate(filepath, "update profile");
//	}
		
		

//		@Test(priority=5)
//		public void SellModule() throws Throwable {
//			test=extent.createTest("Sell functionality");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			click(SellModuleObject.sell_module);
//			test.log(Status.INFO, "clicked on sell module");
//			//Thread.sleep(2000);
//			sendData(SellModuleObject.chemical_name,"Radium");
//			test.log(Status.INFO, "chemical name is entered");
//			//Thread.sleep(1000);
//			sendData(SellModuleObject.quantity,"5000");
//			test.log(Status.INFO, "quantity is entered");
//			//Thread.sleep(1000);
//			click(SellModuleObject.units_downarrow);
//			test.log(Status.INFO, "clicked on downarrow");
//			//Thread.sleep(1000);
//			click(SellModuleObject.kilograms);
//			test.log(Status.INFO, "units selected");
//			//Thread.sleep(1000);
//			
//			//Manufacturing date
//			click(SellModuleObject.mfg_date_calender);
//			test.log(Status.INFO, "clicked on manufacturing date calender");
//			//Thread.sleep(1000);
//			click(SellModuleObject.previous_sidearrow_mfg);
//			test.log(Status.INFO, "clicked on side arrow");
//			//Thread.sleep(1000);
//			click(SellModuleObject.year_2021_june_20);
//			test.log(Status.INFO, "manufacturing date selected");
//			//Thread.sleep(2000);
//			
//			//Expire Date
//			click(SellModuleObject.Expirydate_calender);
//			test.log(Status.INFO, "clicked on expiry date calender");
//			//Thread.sleep(1000);
//			click(SellModuleObject.downward_arrow_exp);
//			test.log(Status.INFO, "clicked on downward arrow");
//			//Thread.sleep(1000);
//			click(SellModuleObject.year_2022);
//			test.log(Status.INFO, "expiry year selected");
//			//Thread.sleep(1000);
//			click(SellModuleObject.year_2022_jul);
//			test.log(Status.INFO, "expiry month selected");
//			//Thread.sleep(1000);
//			click(SellModuleObject.year_2022_jul_20);
//			test.log(Status.INFO, "Expiry date selected");
//			//Thread.sleep(2000);
//			
//			//Available Date
//			click(SellModuleObject.availability_calender);
//			test.log(Status.INFO, "clicked on availability calender");
//			//Thread.sleep(1000);
//			click(SellModuleObject.year_2021_jul_09);
//			test.log(Status.INFO, "available date selected");
//			//Thread.sleep(1000);
//			
//			sendData(SellModuleObject.price,"50000");
//			test.log(Status.INFO, "entered the price in price text field");
//			//Thread.sleep(1000);
//			
//			sendData(SellModuleObject.createdBy,"Manasa");
//			test.log(Status.INFO, "entered the text in created by text field");
//			//Thread.sleep(1000);
//			
//			click(SellModuleObject.status_downarrow);
//			test.log(Status.INFO, "clicked on downarrow");
//			//Thread.sleep(1000);
//			click(SellModuleObject.Status_available);
//			test.log(Status.INFO, "clicked on available status");
//			//Thread.sleep(1000);
//			
//			click(SellModuleObject.submit);
//			test.log(Status.INFO, "clicked on submit button");
//			//Thread.sleep(2000);
//		}
		
		
		
		//next and previous buttons functionality in buy module
//		@Test(priority=6)
//		public void buyModule() throws Throwable {
//			test=extent.createTest("Buy Module Functionality");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//			click(BuyModuleObject.buy);
//			test.log(Status.INFO, "clicked on buy");
//			//Thread.sleep(2000);
//			
//			WebElement nextBtn = driver.findElement(By.xpath("//a[text()=' Next ']"));
//			Point nextbtnloc = nextBtn.getLocation();
//			System.out.println(nextbtnloc);
//			
//			JavascriptExecutor jse=(JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy"+nextbtnloc);
//			
//			click(BuyModuleObject.next);
//			test.log(Status.INFO, "clicked on next button");
//			//Thread.sleep(2000);  
//			click(BuyModuleObject.previous);
//			test.log(Status.INFO, "clicked on previous button");
//			//Thread.sleep(2000);
//			
//		}
		
		
		
		@Test(priority=4,dataProvider="homeSearch")
		public void search(String chemicalnames) throws Throwable {
			test=extent.createTest("Search Functionality");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			click(MemberLoginObject.home_MODULE);
//			test.log(Status.INFO, "clicked on home");
			//Thread.sleep(1000);
			
			int rc = ReUsableCode.getRowCount(filepath, "home_search");
			
			for(int i=1;i<=rc;i++) {
				
				click(MemberLoginObject.home_MODULE);
				Thread.sleep(2000);
				
			click(RegisterObject.home_search_Bar);
			test.log(Status.INFO, "clicked on search bar");
			Thread.sleep(1000);
			
			sendData(RegisterObject.home_search_Bar,chemicalnames);
			test.log(Status.INFO, "chemical name entered");
			Thread.sleep(1000);
			
			click(RegisterObject.home_Search_Button);
			test.log(Status.INFO, "clicked on search button");
			Thread.sleep(1000);
			
			//Thread.sleep(3000);
			WebElement elemadd = driver.findElement(By.xpath("//*[@id=\"bg\"]/app-root/app-chemicalagent/div/table/tr[2]/td[1]"));
			String addrvalue = elemadd.getText();
			
			// Chemical Verification

			Assert.assertEquals(addrvalue, chemicalnames);
			Thread.sleep(2000);
			
			}
			
		}
		
		@DataProvider
		public Object[][] homeSearch() throws Throwable
		{
			return ReUsableCode.chemicalHomeSearch(filepath, "home_search");
	    }
		
		
//		@Test(priority=7)
//		public void submitNow() throws Throwable {
//			test=extent.createTest("Submit Now button functionality");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			click(ContactUsObject.ContactUs);
//			test.log(Status.INFO, "clicked on contact us");
//			//Thread.sleep(3000);
//			WebElement submitaddr = driver.findElement(By.xpath("//*[@id=\"bg\"]/app-root/app-contact-us/div/div[1]/div/div/div[2]/div[1]/div/div[3]/div[6]/button"));
//			Point submitbtnloc = submitaddr.getLocation();
//			System.out.println(submitbtnloc);
//			
//			JavascriptExecutor jse=(JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy"+submitbtnloc);
//			
//			sendData(ContactUsObject.yourname,"Manasa");
//			test.log(Status.INFO, "name entered");
//			//Thread.sleep(1000);
//			sendData(ContactUsObject.Your_Emailid,"gudamanasa10@gmail.com");
//			test.log(Status.INFO, "email id entered");
//			//Thread.sleep(1000);
//			sendData(ContactUsObject.phoneNumber,"8008052179");
//			test.log(Status.INFO, "phone number entered");
//			//Thread.sleep(3000);
//			click(ContactUsObject.issue_arrow);
//			test.log(Status.INFO, "clicked on downarrow");
//			
//			click(ContactUsObject.issue_type);
//			test.log(Status.INFO, "issue type is selected");
//			
//			sendData(ContactUsObject.yourMessage,"nothing it is technical issue");
//			test.log(Status.INFO, "message entered");
//			
//			//Thread.sleep(1000);
//			click(ContactUsObject.submit_now);
//			test.log(Status.INFO, "clicked on submit now button");
//			
////			Thread.sleep(2000);
////			click(ContactUsObject.home_link);
//			
//			//Thread.sleep(4000);
//		}
		
		
		
	//logout
	
//	@Test(priority=8)
//	public void logout() throws Throwable {
//		
//		test=extent.createTest("Logout functionality");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		click(MemberLoginObject.memberprofile);
//		test.log(Status.INFO, "clicked on member profile");
//		Thread.sleep(2000);
//		click(MemberLoginObject.Logout);
//		test.log(Status.INFO, "clicked on logout button");
//		
//	}
	
//	@Test(priority=3,dataProvider="dashboardSearch")
//	public void dashboard_search(String chemicalnames) throws Throwable {
//
//		test=extent.createTest("Dashboard Search Functionality");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		click(MemberLoginObject.memberprofile);
//		test.log(Status.INFO, "clicked on member profile");
//		
//		click(UpdateProfilePage.mydashboard);
//		test.log(Status.INFO, "clicked on dashboard");
//		
//		int rc = ReUsableCode.getRowCount(filepath, "dashboard_search");
//		System.out.println(rc);
//		
//		for(int i=1;i<=rc;i++) {
//		click(MemberLoginObject.dashboard_searchbar);
//		test.log(Status.INFO, "clicked on searchbar");
//		
//		sendData(MemberLoginObject.dashboard_searchbar,chemicalnames);
//		test.log(Status.INFO,"chemical name entered");
//		Thread.sleep(1000);
//		
//		click(MemberLoginObject.dashboard_search_button);
//		test.log(Status.INFO, "clicked on search button");
//		Thread.sleep(1000);
//		
//		clear(MemberLoginObject.dashboard_searchbar);
//		test.log(Status.INFO, "cleared the content in the search bar");
//		Thread.sleep(2000);
//		
//		//chemical verification
//		WebElement chemicalnameaddr = driver.findElement(By.xpath("//*[@id=\"bg\"]/app-root/app-dashboard/div[1]/app-profile-dash/div[1]/section/div[2]/div[1]/div/div/div/table/tr[2]/td[1]"));
//		String chemicalname = chemicalnameaddr.getText();
//		
//		Assert.assertEquals(chemicalname, chemicalnames);
////		Assert.assertEquals(chemicalname, "chloroform");
////		Assert.assertEquals(chemicalname, "Sulphur");
////		
////		if(chemicalname.equalsIgnoreCase(chemicalnames)) {
////			System.out.println("chemical exist");
////			test.log(Status.PASS, "chemical exist");
////		}
////		else {
////			System.out.println("chemical doesn't exist");
////			test.log(Status.FAIL, "chemical doesn't exist");
////		}
////		
////		Thread.sleep(2000);
//		}
//    }
//	
//	@DataProvider
//	public Object[][] dashboardSearch() throws Throwable
//	{
//		return ReUsableCode.chemicalDashboardSearch(filepath, "dashboard_search");
//    }
	
	
	
	
	
	
	



























}
