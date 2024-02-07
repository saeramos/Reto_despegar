package com.despegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.despegar.userinterfaces.DespegarSearchFlightsWidget.SEARCH_FLIGHTS;

public class SearchFlights implements Task {
    public static SearchFlights now() {
        return Tasks.instrumented(SearchFlights.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SEARCH_FLIGHTS)
        );
    }





}
