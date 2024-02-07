package com.despegar.tasks;

import com.despegar.actions.ChooseTheDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;



public class SelectFlightDates implements Task {

    private String initialDate;
    private String endDate;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ChooseTheDate.beetween(initialDate,endDate));

    }


    public static SelectFlightDates InitialAndEndDates(String initialDate, String endDate) {
        return Tasks.instrumented(SelectFlightDates.class,initialDate,endDate);
    }

    public SelectFlightDates(String initialDate,String endDate) {
        this.initialDate=initialDate;
        this.endDate=endDate;

    }
}
