package com.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DespegarSearchFlightsWidget {
    public static final Target TAKEOFF_CITY = Target.the("Origen").located(By.xpath("//div[@class='sbox-3-input -md -no-border sbox-3-validation -top-right sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//parent::div[@class='sbox-input-container']"));

    public static final Target DESTINATION_CITY = Target.the("Destino").locatedBy("//div[@class='sbox-3-input -md -no-border sbox-3-validation -top-right sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//parent::div[@class='sbox-input-container']");

    public static final Target TAKEOFF_CITY_INPUT = Target.the("Origen Input").located(By.xpath("//input[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline']"));

    public static final Target DESTINATION_CITY_INPUT = Target.the("Destino Input").locatedBy("//input[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']");

    public static final Target START_DATE = Target.the("Fecha de inicio").locatedBy("//input[@class='input-tag sbox-bind-disable-start-date sbox-bind-value-start-date-segment-1 sbox-bind-reference-flight-start-date-input -sbox-3-no-radius-right']");

    public static final Target START_DATE_TARGET(String day) {

        final Target DATE_DAY = Target.the("Dia inicial").locatedBy("//div[@data-month='2018-07']//div[@class='_dpmg2--dates']//span[" + day + "]");

        return DATE_DAY;
    }

    public static final Target END_DAY_TARGET(String day) {

        final Target DATE_DAY = Target.the("Dia final").locatedBy("//div[@data-month='2018-08']//div[@class='_dpmg2--dates']//span[" + day + "]");

        return DATE_DAY;
    }

    public static final Target SEARCH_FLIGHTS = Target.the("Buscar button").locatedBy("//div[@class='sbox-button-default']//a");

}
