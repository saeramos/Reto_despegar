package com.despegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/vuelos/")
public class DespegarHomePage extends PageObject {


    public static final Target FLIGHTS_BUTTTON_CUADRADITO= Target.the("Vuelos").locatedBy("//li[@data-code='FLIGHTS']");
    public static final Target FLIGHTS_BUTTTON_REDONDITO= Target.the("Vuelos").locatedBy("//a[@href='/vuelos/']");


    public static DespegarHomePage now(){
        return new DespegarHomePage();
    }

}
