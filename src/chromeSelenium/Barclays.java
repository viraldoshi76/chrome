package chromeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Barclays {

    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*driver.manage().window().maximize();*/
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        System.out.println(title.toUpperCase());
        System.out.println(title.lastIndexOf("banking"));
        driver.close();

    }
}
