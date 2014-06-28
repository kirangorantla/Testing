package testing.testing;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},features="src/test/resources/google.features")

public class RunCukesTest {
	
	public static void main(String[] args){
	GoogleStep gs = new GoogleStep();
	gs.The_user_is_on_google_search_page();
	}

}