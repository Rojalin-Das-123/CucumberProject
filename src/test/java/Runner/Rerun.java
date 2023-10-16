package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "@target/Rerun.txt",
        glue ={"Steps"},
        plugin = {"rerun:target/Rerun.txt"}
)
public class Rerun extends AbstractTestNGCucumberTests {


    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
