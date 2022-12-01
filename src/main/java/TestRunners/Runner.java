package TestRunners;

import Util.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = {"src/test/java/Features"},
            glue = {"StepDefinitions","Util"},
            tags = "@n11",
            plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
            }

)
public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();


}
