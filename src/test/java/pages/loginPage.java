package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;

	private By txt_username = By.id("username");
	
	private By txt_password = By.id("password");
	
	private By btn_login = By.id("submit");
	
	//private By btn_logout = By.id("logout");
	
	private By btn_logout = By.xpath("//a[@href ='https://practicetestautomation.com/practice-test-login/']");
	
	
	public loginPage(WebDriver driver) {
	
		this.driver = driver;
		
//		if(!driver.getTitle().equals("TestProject Demo")) {
//			
//			throw new IllegalStateException("This is not Login Page. The Current page is "
//			+driver.getCurrentUrl());
//		}
	}
	
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	
	
	
}
