package com.despegar.tasks;

import com.despegar.userinterfaces.DespegarSearchFlightsWidget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import org.openqa.selenium.Keys;


public class SelectDestination implements Task {

    private String firstCity;
    private String secondCity;

    public static SelectDestination OriginAndDestination(String firstCity, String secondCity) {
        return Tasks.instrumented(SelectDestination.class,firstCity,secondCity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DespegarSearchFlightsWidget.TAKEOFF_CITY),
                Enter.theValue(firstCity).into(DespegarSearchFlightsWidget.TAKEOFF_CITY_INPUT).thenHit(Keys.ENTER),
                Hit.the(Keys.ENTER).into(DespegarSearchFlightsWidget.TAKEOFF_CITY_INPUT)
        );

        actor.attemptsTo(
                Click.on(DespegarSearchFlightsWidget.DESTINATION_CITY),
                Enter.theValue(secondCity).into(DespegarSearchFlightsWidget.DESTINATION_CITY_INPUT).thenHit(Keys.ENTER),
                Hit.the(Keys.ENTER).into(DespegarSearchFlightsWidget.DESTINATION_CITY_INPUT)
        );


    }


    public SelectDestination(String firstCity, String secondCity) {
        this.firstCity=firstCity;
        this.secondCity=secondCity;
    }
}
