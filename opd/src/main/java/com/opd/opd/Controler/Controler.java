package com.opd.opd.Controler;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pdata")
@CrossOrigin(origins = "*")
public class Controler {

    @GetMapping("/{id}")
    public String pdata(@PathVariable int id) {
        return "this is id number"+id + "";
    }
}
