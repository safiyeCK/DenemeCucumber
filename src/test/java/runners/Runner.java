package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
                           "html:target/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber1.json",
                           "junit:target/xml-report/cucumber1.xml"
                                                                    },
                           features = "src/test/resources/features",
                           glue = "stepdefinitions",
                           tags = "@kitap",
                           dryRun = false,
                           monochrome = false
)


public class Runner {
}
