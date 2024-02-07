package com.despegar.tasks;

import com.despegar.userinterfaces.DespegarHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {


    @Override
    @Step("{0} open the browser on Despegar home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(DespegarHomePage.now()));
        actor.attemptsTo(Open.browserOn().the(DespegarHomePage.now()));
    }

    public static OpenTheBrowser on() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

}
