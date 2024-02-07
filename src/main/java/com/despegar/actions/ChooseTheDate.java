package com.despegar.actions;

import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;

import static com.despegar.userinterfaces.DespegarSearchFlightsWidget.END_DAY_TARGET;
import static com.despegar.userinterfaces.DespegarSearchFlightsWidget.START_DATE;
import static com.despegar.userinterfaces.DespegarSearchFlightsWidget.START_DATE_TARGET;


public class ChooseTheDate implements Action {

    private String InitialDate;
    private String EndDate;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(START_DATE),
                Click.on(START_DATE_TARGET(getDateValues(InitialDate).get(0)))
        );

        actor.attemptsTo(
                Click.on(END_DAY_TARGET(getDateValues(EndDate).get(0)))
        );

    }

    public ChooseTheDate(String initialDate, String endDate) {
        InitialDate = initialDate;
        EndDate = endDate;
    }

    public static ChooseTheDate beetween(String initialDate, String endDate) {
        return Tasks.instrumented(ChooseTheDate.class, initialDate, endDate);
    }

    private ArrayList<String> getDateValues(String date){
        String[] arrayStartDate;
        String realDate;
        String[] dateElements;

        arrayStartDate=date.split(", ",2);
        realDate=arrayStartDate[1];
        dateElements=realDate.split(" ",3);

        String Day=dateElements[0];
        String Month=dateElements[1];
        String Year=dateElements[2];


        ArrayList<String> dateValues = new ArrayList<String>();

        dateValues.add(Day);
        dateValues.add(Month);
        dateValues.add(Year);

        return dateValues;
    }

}
