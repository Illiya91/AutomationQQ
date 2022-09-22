package Lesson2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    public static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        WebDriverSingleton.getInstance();
    }
}






