package com.despegar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/despegar.feature",
        glue = "com.learningscreenplay.screenplaydespegar.stepdefinitions",
        snippets = SnippetType.UNDERSCORE)
public class despegarRunner {
}
