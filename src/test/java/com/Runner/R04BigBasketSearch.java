package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberPorject/CucumberPorject/F04BigBasketSearch.feature"},
                glue= {"com.StepDef", "com.forhook"})
public class R04BigBasketSearch {

}
