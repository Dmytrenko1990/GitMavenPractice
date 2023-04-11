package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",
        glue = "StepDefenition",
        dryRun = false,
        tags =  "@smoke",
        plugin = {"pretty"}
)
//tags option will execute only
public class Runner {
}

