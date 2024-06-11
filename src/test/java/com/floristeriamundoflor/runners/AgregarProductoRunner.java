package com.floristeriamundoflor.runners;


import com.floristeriamundoflor.utils.BeforeSuite;
import com.floristeriamundoflor.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features = "src/test/resources/",
        tags="@Agregar",
        glue = "com.floristeriamundoflor.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class AgregarProductoRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/agregarProducto.feature");
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/agregarProducto2.feature");
    }
}
