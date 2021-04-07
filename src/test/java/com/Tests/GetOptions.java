package com.Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptions {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\Excelfile_creating\\Driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
	      driver.get(url);
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      
	      Select s = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	      driver.quit();
	   }

	

}
