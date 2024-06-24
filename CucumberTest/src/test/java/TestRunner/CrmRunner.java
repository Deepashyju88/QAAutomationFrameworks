package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//single scenario tags = @mobile
//multiple scenario : test = @test1 or @test2
//skip any scenario : tags = not @mobile
//skip multiple scenario by adding @Ignore in the feature file 
//                  and add not @Ignore in tags in run file

//to excecute all senario we have to add @All at the top of feature file then tags ="@All"
//have to add publish=true get a report
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatursFile/Crm.feature",
					glue = {"Stepdef", "HooksDemo"})
public class CrmRunner {

}
