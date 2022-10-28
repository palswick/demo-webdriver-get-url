import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://lichess.org/";
        driver.get(baseUrl);
        }
    }
