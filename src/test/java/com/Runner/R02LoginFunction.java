package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberPorject/CucumberPorject/F02LoginFunction.feature"},
                 glue = {"com.StepDef"},
                  publish =true)
public class R02LoginFunction {

}
