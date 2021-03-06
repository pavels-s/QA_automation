package lecture11.finalTask;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (plugin = "pretty",
        features = {"src\\test\\resources\\features\\1a"},
        glue = {"lecture11/finalTask/steps"},
        tags = "@1aFinalTask"

)

public class TestRunner {


}
