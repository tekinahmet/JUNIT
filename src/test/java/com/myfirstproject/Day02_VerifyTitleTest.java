package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();//NO NEED TO USE THIS ANYMORE
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize window
//        Navigate to amazon homepage
        driver.get("https://www.amazon.com");
//        Verify if page title contains “Amazon”
        String actualTitle = driver.getTitle();//returns the page title as String
        System.out.println("PAGE TITLE "+ actualTitle);
        if (actualTitle.contains("Amazon")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILS");
            System.out.println("ACTUAL TITLE : "+actualTitle+" doesn't contain expected title : Amazon");
        }
        driver.quit();//quit browser
    }
}
