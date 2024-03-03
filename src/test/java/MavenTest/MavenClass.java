package MavenTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class MavenClass {
   @Test
    public void mavenTest2024() {
       System.out.println("This is maven and Selenium class");//
       WebDriver driver = new ChromeDriver();// chrome browser launch
       driver.get("https://continentalhospitals.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       driver.close();
    }
}
