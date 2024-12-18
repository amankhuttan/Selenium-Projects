package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testy {

	//WebDriver driver;
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement ele = driver.findElement(By.linkText("Form Authentication"));
	    ele.click();
	    
	    WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='username']"));
	    usernameTextField.sendKeys("tomsmith");
	    
	    WebElement passwordTextField = driver.findElement(By.xpath("//*[@id='password']"));
	    passwordTextField.sendKeys("SuperSecretPassword!");
		
	    WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']/button"));
	    loginButton.click();
	  
	    WebElement confirmMessageEle = driver.findElement(By.xpath("//*[@id='flash-messages']"));
	    String confirmationText = confirmMessageEle.getText();
	    
	  //*[@id="flash-messages"]
	    System.out.println(confirmationText.contains("You logged into a secure area!") ? "Login Test Successful" : "Login Test Failed");
	    
	    
	    driver.quit();
	}

}

