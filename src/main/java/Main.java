import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

        // TODO: починить чтоб работал автосетап актуального хромдрайвера
        // WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://baraholka.onliner.by/";

        driver.get(baseUrl);

        String xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/form/input";
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        waiter();
        driver.close();
    }

    private static void waiter() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
