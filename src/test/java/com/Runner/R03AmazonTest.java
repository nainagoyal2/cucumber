package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberPorject/CucumberPorject/F03AmazonTest.feature"},
                 glue= {"com.StepDef"},
                 tags ="@Amazonlinks")

public class R03AmazonTest {
	
	//single scenario > tags ="@BestSeller"
	//Multiple scenario > tags ="@Mobile or @Electronic"
	// Skip scenario > tags ="not @Electronic"
}
