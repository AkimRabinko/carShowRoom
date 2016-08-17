package com.mycompany.carshowroom.controller;

import com.mycompany.carshowroom.entity.Buyer;
import com.mycompany.carshowroom.handler.BuyerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by AkimPC on 15.08.2016.
 */

@Controller
@RequestMapping("buyer")
public class BuyerController {

    @Autowired
    private BuyerHandler buyerHandler;

    @RequestMapping(value = "/addnew" , method = RequestMethod.POST)
    public @ResponseBody Buyer addNewBuyer(@RequestBody Buyer buyer) {
        return buyerHandler.addNewBuyer(buyer);
    }

    @RequestMapping(value = "/{id}/edit" , method = RequestMethod.PUT)
    public @ResponseBody Buyer EditBuyer(@PathVariable("id") int buyerId,
                                         @RequestBody Buyer buyer) {
        Date date;
        date = Date.valueOf(LocalDate.now());
        buyer.setDateOfSell(date);
        buyer.setYearOfBuyerBirth(date);
        return buyerHandler.editBuyer(buyerId, buyer);
    }

    @RequestMapping(value = "/{id}/remove" , method = RequestMethod.DELETE)
    public String removeBuyer(@PathVariable("id") int buyerId) {
        return buyerHandler.removeBuyer(buyerId);
    }

    @RequestMapping(value = "/getall" , method = RequestMethod.GET)
    public @ResponseBody List<Buyer> getAllBuyers() {
        return buyerHandler.getAllBuyers();
    }

    @RequestMapping(value = "/{id}/get" , method = RequestMethod.GET)
    public @ResponseBody Buyer getSingleBuyer(@PathVariable("id") int buyerId) {
        return buyerHandler.getSingleBuyer(buyerId);
    }
}
