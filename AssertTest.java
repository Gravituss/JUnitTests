import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssertTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://sinoptik.ua");
		
		// Waiting for web element to be loaded
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("otherCity")));
		
		String expected = "выбрать другой город";
		WebElement other = driver.findElement(By.className("otherCity"));
		String actual = other.getText();
		
		assert(expected.equals(actual));
	}
}
