package ua.com.automation;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



    public class Lesson1
    {


        @Test
        public void shouldAnswerWithTrue() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://rozetka.com.ua");
            Thread.sleep(9999);
            driver.close();
        }
    }

