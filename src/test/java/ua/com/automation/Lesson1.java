package ua.com.automation;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

    /**
     * Unit test for simple App.
     */
    public class Lesson1
    {
        /**
         * Rigorous Test :-)
         */
        @Test
        public void shouldAnswerWithTrue() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://rozetka.com.ua");
            Thread.sleep(9999);
            driver.close();
        }
    }

