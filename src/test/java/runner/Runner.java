package runner;

import cucumber.api.CucumberOptions;


import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.WebHelper;




@CucumberOptions(features = "src/test/resources/Feature/", glue = { "stepdef" },tags = {"@parallal"},
        plugin = { "pretty",
                "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.JSON" },monochrome = true)




public class Runner extends AbstractTestNGCucumberTests {



    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass
    public void setUpClass() throws Exception{

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")
    public void feature(PickleEventWrapper eventWrapper, CucumberFeatureWrapper cucumberFeatureWrapper) throws Throwable {

        testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
    }

    @DataProvider(parallel = true)
    public Object[][] features(){

        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownclass() throws Throwable {

        testNGCucumberRunner.finish();


    }









}