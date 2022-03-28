package oi.Intellisense.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.lang.annotation.Target;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        glue = "oi/Intellisense/stepDefs",
        features = "src/test/resources",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
