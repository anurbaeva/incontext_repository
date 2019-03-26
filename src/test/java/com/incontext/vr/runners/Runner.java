package com.incontext.vr.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "src/test/resources/features",
        glue = "com/incontext/vr/stepDefs",
        tags = "@SearchFeature",
        dryRun = false

)
public class Runner {
}
