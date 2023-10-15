package Runner;

import io.cucumber.testng.*;
import org.testng.annotations.Test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.LogManager.*;

@CucumberOptions(
        features = "src/test/resources/feature/",
        glue ={"Steps"},
        plugin = {"rerun:target/Rerun.txt","pretty", "html:target/cucumber"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    private static String name;
    //private static final Logger LOGGER = LogManager.getLogger(TestRunner.class);
    private TestNGCucumberRunner testNGCucumberRunner;
    //CucumberReporter cucumberReporter = CucumberReporter.getCucumberReporterInstance();
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }

//    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
//    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper)  {
//        // the 'featureWrapper' parameter solely exists to display the feature file in a test report
//        String currentFeature = featureWrapper.toString().substring(1, featureWrapper.toString().length() - 1);
//        name = currentFeature;
////        if (!currentFeature.equals(cucumberReporter.getFeatureName()) || (cucumberReporter.getFeatureName() == null)) {
////            cucumberReporter.setFeature(cucumberReporter.getExtent().createTest(Feature.class, currentFeature));
////            cucumberReporter.setFeatureName(cucumberReporter.getFeature().getModel().getName().trim());
////        }
//
//      //  LOGGER.info("Feature Name : " + currentFeature);
//        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
//    }
}
