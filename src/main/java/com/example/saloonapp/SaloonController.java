package com.example.saloonapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaloonController {

    @RequestMapping(method = RequestMethod.GET, value = "/slot")
    public String index() {
        return "slot";
    }

}
