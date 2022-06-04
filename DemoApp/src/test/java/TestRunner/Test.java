package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\703317451\\Downloads\\New folder\\DemoApp\\src\\test\\FeatureFile\\BillPay.feature", glue="Stepdefination",
plugin= {"pretty","html:test-output"})

public class Test {
	

	public static void main(String[] args) {
	

	}
	


}
