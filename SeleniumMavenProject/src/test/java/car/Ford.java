package car;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	public class Ford {


		@Test(groups = "smoke")
		public void launch() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.india.ford.com/");
			Reporter.log("Ford launched successfully", true);
		}


}
