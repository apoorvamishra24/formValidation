package validatingForm;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Form {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\validatingForm\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
				
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/text-box");
				
				WebElement myname = driver.findElement(By.id("userName"));
				myname.sendKeys("Apoorva Mishra");
				
				// To Halt the execution for sometime (demonstration purposes)
				Thread.sleep(1000);
				
				WebElement email = driver.findElement(By.id("userEmail"));
				email.sendKeys("iamapoorva1@gmail.com");
				
				// To Halt the execution for sometime (demonstration purposes)
				Thread.sleep(1000);
				
				WebElement address = driver.findElement(By.id("currentAddress"));
				address.sendKeys("Bangalore");
				
				// To Halt the execution for sometime (demonstration purposes)
				Thread.sleep(1000);
				
				WebElement paddress = driver.findElement(By.id("permanentAddress"));
			   paddress.sendKeys("Bihar");
			   
			   WebElement formSubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
			   formSubmitButton.click();
			   
			   WebElement nameEntry = driver.findElement(By.id("name"));
			   String nameText =  nameEntry.getText();
			   System.out.println(nameText);
			   
			   WebElement emailName = driver.findElement(By.id("email"));
			    String emailEntry = emailName.getText();
			    System.out.println(emailEntry);
			    
			    String[] text =  nameText.split(":");
			    String[] emailid =  emailEntry.split(":");
			    
			    System.out.println("User name is "+text[1] +" " +"\n" + "user email id is "+emailid[1]);
			    
			    if(text[1].equals("Apoorva Mishra") && emailid[1].equals("iamapoorva1@gmail.com")) {
			    	   
			    	System.out.println("Input and Output are same");
			    }
			    else {
			    	System.out.println("Input and Output are not same");
			    }
			      Thread.sleep(500);
				
				 driver.quit();
			}

	
		
	}
				