package com.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarSearchResults {
    public static Target CLUSTERS
            = Target.the("List of search results")
            .locatedBy("//div[@id='clusters']//span[@class='cluster-wrapper']//span[@class='amount price-amount']");
}
