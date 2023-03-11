package com.example.esercizioSpring1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NameController {
    String name = "Chris";

    @GetMapping("/name")
    public String getName(){
        return "Il mio nome è " + name;
    }


    // non funziona il post errore 500 Internal server error
    @PostMapping("/name")
    public String reverseName(@RequestBody String name){
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }


}
