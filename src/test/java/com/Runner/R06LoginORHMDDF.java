package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberPorject/CucumberPorject/F06LoginORHMDDF.feature"},
                 glue = {"com.StepDef"},
                  publish =true)
public class R06LoginORHMDDF {

}
