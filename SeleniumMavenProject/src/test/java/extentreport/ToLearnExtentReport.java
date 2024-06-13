package extentreport;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Test
public class ToLearnExtentReport 
{
	public void report() 
	{
		//Step 01: create ExtentSparkReporterobject
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReports.html");
		
		//Step 02: create ExtentReports object
		ExtentReports extReport = new ExtentReports();
		
		//Step 03: attach spark reporter to ExtentReports
		extReport.attachReporter(spark);
		
		//Step 04: create ExtentTest object
		ExtentTest test = extReport.createTest("report");
		
		//Step 05: call log() to provide status and message
		test.log(Status.PASS,"log message added into extent reports");
		extReport.flush();

}
}
