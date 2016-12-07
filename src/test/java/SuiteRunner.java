/**
 * Created by Vinod on 27/10/2016.
 */

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = false,
        detailedAggregatedReport = false,
        overviewReport = true,
        coverageReport = false,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        //excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@Test" },
        outputFolder = "target/extended_report")

@CucumberOptions(
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags={"@Test"}
        )
public class SuiteRunner {



}


