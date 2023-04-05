package adactin_hotel_res.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class hotel_reservation {
	WebDriver d=new ChromeDriver();
	

	private void new_user_register() throws InterruptedException, AWTException, IOException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
d.get("https://adactinhotelapp.com/");

d.findElement(By.id("username")).sendKeys("umasakthi123456");

d.findElement(By.id("password")).sendKeys("umasakthi123456");
Thread.sleep(4000);
d.findElement(By.id("login")).click();
WebElement findElement = d.findElement(By.cssSelector("#location"));
Select s=new Select(findElement);
s.selectByIndex(2);
WebElement findElement2 = d.findElement(By.cssSelector("#hotels"));
Select s1=new Select(findElement2);
s1.selectByValue("Hotel Sunshine");
WebElement findElement3 = d.findElement(By.cssSelector("#room_type"));
Select s2=new Select(findElement3);
s2.selectByVisibleText("Super Deluxe");

WebElement findElement4 = d.findElement(By.cssSelector("#room_nos"));
Select s3=new Select(findElement4);
s3.selectByVisibleText("4 - Four");
WebElement findElement6 = d.findElement(By.cssSelector("[name='datepick_in']"));
findElement6.click();
findElement6.clear();
findElement6.sendKeys("10/01/2023");
WebElement findElement7 = d.findElement(By.cssSelector("[name='datepick_out']"));
findElement7.click();
findElement7.clear();
findElement7.sendKeys("14/01/2023");
Actions a=new Actions(d);

WebElement findElement5 = d.findElement(By.cssSelector("#adult_room"));
findElement5.click();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
WebElement findElement51 = d.findElement(By.cssSelector("#child_room"));
findElement51.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
WebElement findElement511 = d.findElement(By.cssSelector("#Submit"));
findElement511.click();
TakesScreenshot screen=(TakesScreenshot) d;
File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
File f=new File("C:\\Users\\Dell\\eclipse-workspace\\adactin_hotel_res\\screen.s0.png");
FileHandler.copy(screenshotAs, f);
d.findElement(By.cssSelector("#radiobutton_0")).click();
WebElement findElement5111 = d.findElement(By.cssSelector("#continue"));
findElement5111.click();
d.findElement(By.cssSelector("#first_name")).sendKeys("umasakthi");

d.findElement(By.cssSelector("#last_name")).sendKeys("m");

d.findElement(By.cssSelector("#address")).sendKeys("a.n.pettai,east street,jayagondam(t.k)");
d.findElement(By.cssSelector("#cc_num")).sendKeys("4641180003400501");
WebElement findElement8 = d.findElement(By.cssSelector("#cc_type"));
findElement8.click();
Select sq=new Select(findElement8);
sq.selectByIndex(1);
WebElement findElement9 = d.findElement(By.cssSelector("#cc_exp_month"));
findElement9.click();
Select sw=new Select(findElement9);
sw.selectByIndex(11);
WebElement findElement10 = d.findElement(By.cssSelector("#cc_exp_year"));findElement10.click();
Select se=new Select(findElement10);
se.selectByValue("2022");
d.findElement(By.cssSelector("#cc_cvv")).sendKeys("231");
d.findElement(By.cssSelector("#book_now")).click();
TakesScreenshot screen1=(TakesScreenshot) d;
File screenshotAs2 = screen1.getScreenshotAs(OutputType.FILE);
File ff=new File("C:\\Users\\Dell\\eclipse-workspace\\adactin_hotel_res\\screen.s1.png");
FileHandler.copy(screenshotAs2, ff);
d.findElement(By.cssSelector("#my_itinerary")).click();
TakesScreenshot screen2=(TakesScreenshot) d;
File screenshotAs3 = screen2.getScreenshotAs(OutputType.FILE);
File fff=new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\adactin_hotel_res\\\\screen.s2.png");
FileHandler.copy(screenshotAs3, fff);
d.findElement(By.cssSelector("#logout")).click();

TakesScreenshot screen3=(TakesScreenshot) d;
File screenshotAs34 = screen2.getScreenshotAs(OutputType.FILE);
File ffff=new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\adactin_hotel_res\\\\screen.s23.png");
FileHandler.copy(screenshotAs34, ffff);


	}

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\adactin_hotel_res\\chrome\\chromedriver.exe");
		
		hotel_reservation obj=new hotel_reservation();
		obj.new_user_register();
		WebDriver d2 = obj.d;
	}

}
