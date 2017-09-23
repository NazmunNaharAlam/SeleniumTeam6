package page;

import base.CommonAPI;

public class Searchinfo extends CommonAPI {
    public void searchItems() {
        System.out.println(driver.getTitle());
        typeByCss("#nav-search-query", "mobile banking");
        clickByCss(".submit.track-me");
        clearInput("#nav-search-query");
        typeByCss("#nav-search-query", "credit card");
        clickByCss(".submit.track-me");
        clearInput("#nav-search-query");
        System.out.println(driver.getCurrentUrl());
    }
}
