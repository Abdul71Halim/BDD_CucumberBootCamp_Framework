package runner_files;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/test/resources/feature_files" },
        glue     = {"step_definitions", "com.bdd.learning.Hooks"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsninjaAddToCart or @TutorialsNinjaLogout",
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

   )

public class Runner_JUNIT {

}
//@TutorialsninjaAddToCart