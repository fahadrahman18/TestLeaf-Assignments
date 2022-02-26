package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

// 		get url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();  //maximize window
		
		WebElement enterusername = driver.findElement(By.id("username"));
		enterusername.sendKeys("Demosalesmanager");

// Giving credential and login
		WebElement enterpassword = driver.findElement(By.id("password"));
		enterpassword.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//      Perform create leads
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fahed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rahman");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Running tests");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");

// 		perform Drop down action
		WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(statedropdown);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
// print the title of the page
		System.out.println(driver.getTitle());
		

	}

}
