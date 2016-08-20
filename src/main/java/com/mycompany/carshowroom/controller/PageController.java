package com.mycompany.carshowroom.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Akim_Rabinko on 17.08.2016.
 */

@Controller
@RequestMapping(value = "main")
public class PageController {

    @RequestMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String getMainPage(ModelMap map) {
        return "mainPage";
    }

    @RequestMapping(value = "/manager/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public String getManagerPage(@PathVariable int id, ModelMap map) {
        return "managerPage";
    }

    @RequestMapping(value = "/cars", produces = MediaType.TEXT_HTML_VALUE)
    public String getCarsPage(ModelMap map) {
        return "carsPage";
    }

    @RequestMapping(value = "/manager/{id}/testdrive", produces = MediaType.TEXT_HTML_VALUE)
    public String getTestDrivePage(@PathVariable int id, ModelMap map) {
        return "testDrivePage";
    }

    @RequestMapping(value = "/cars/add", produces = MediaType.TEXT_HTML_VALUE)
    public String getAddCarPage(ModelMap map) {
        return "addCarPage";
    }

    @RequestMapping(value = "/add/manager", produces = MediaType.TEXT_HTML_VALUE)
    public String getAddManagerPage(ModelMap map) {
        return "addManagerPage";
    }

    @RequestMapping(value = "/add/buyer", produces = MediaType.TEXT_HTML_VALUE)
    public String getAddBuyerPager(ModelMap map) {
        return "addBuyerPage";
    }

    @RequestMapping(value = "/buyer/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public String getBuyerPage(@PathVariable int id, ModelMap map) {
        return "buyerPage";
    }
}
