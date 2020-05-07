package com.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:test-output"},dryRun= false,features="C:\\Users\\senthil_rishma\\eclipse-workspace\\Sample-BDD\\src\\test\\resources\\com\\cucumber\\Demo.feature")
public class TestRunner {

}
