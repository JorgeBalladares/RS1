package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class Controlador1 {

    @PostMapping("control1/usersID")
    public Greeting addUser (@RequestBody Greeting gret){
        return gret;
    }

    @GetMapping("/control2/user/{id}")
    public String obtenPam (@PathVariable String id){
        return "Hola: " +  id;
    }
    /*@PutMapping("/post?var1=1&var2=2")
    public Greeting putVar (@RequestParam ("var1") String id, @RequestParam ("var2") String content,
                            @PathVariable ("var1") String var1, @PathVariable ("var2") String var2){

        return  grett;

    } */


}
