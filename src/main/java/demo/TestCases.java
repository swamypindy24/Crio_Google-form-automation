package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    static WebDriver driver = null;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        // WebDriverManager.chromedriver().timeout(30).setup();
        driver =new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swamy\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        //driver = new ChromeDriver();
        //driver =new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        //driver.get("https://www.google.com");
         driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
		 //driver.manage().window().maximize();	
		 WebElement namefield=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		 namefield.sendKeys("pindy swamy");
	        Thread.sleep(2000);
	        WebElement moto=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/textarea"));
	        moto.sendKeys("I want to be the best QA Engineer! 1710572021");
	        WebElement experince=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/span/div/div[1]/label/div/div[1]/div/div[3]/div"));
	        experince.click();
	        WebElement java=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div[1]/label/div/div[1]/div[2]"));
	        java.click();
	        Thread.sleep(1000);
	        WebElement selen=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/label/div/div[1]/div[2]"));
	        selen.click();
	        WebElement testNg=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div[4]/label/div/div[1]/div[2]"));
	        testNg.click();
	        WebElement called=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div[1]/div[1]/span"));
	        called.click();
	        WebElement mr=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[2]/div[3]/span"));
	        mr.click();
	        WebElement month=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
	        month.sendKeys("22");
	        WebElement date=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[1]/input"));
	        date.sendKeys("05");
	        WebElement year=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div/div[5]/div/div[2]/div[1]/div/div[1]/input"));
	        year.sendKeys("2024");
	        WebElement timehours=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/input"));
	        timehours.sendKeys("12");
	        WebElement minutes=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[3]/div/div[1]/div/div[1]/input"));
	        minutes.sendKeys("56");
	        WebElement submit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/span"));
	        submit.click();
        System.out.println("end Test case: testCase02");
    }


}
