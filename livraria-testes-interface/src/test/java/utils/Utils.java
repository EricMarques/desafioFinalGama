package utils;

import static utils.Utils.esperar;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Utils {

	public static WebDriver driver;
	
	public static void acessarSitema() {
		System.setProperty("webdriver.chrome.driver", "D:\\projects\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/");
	}
	
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
	
	public static void descerScroll() throws Exception { // rolar a tela para baixo
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.parent.scrollTo(0,500)", "0");
		esperar(2);
	}
	
	public static void moverPara(WebElement element) throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		esperar(1);
	}
	
	public static void esperar(int tempo) throws Exception {
		for (int i = 0; i < tempo; i++) {
			Thread.sleep(1000);
		}
	}
	
	public static void tirarPrint(String evidencia) throws Exception {
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}
	
}
