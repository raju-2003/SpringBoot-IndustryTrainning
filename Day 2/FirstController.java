package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @Value("${sample.name}")
    private String a;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + a + "!";
    }
    
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Spring Boot";
    }

    @RequestMapping(value = "/welcomename/{welcomename}", method = RequestMethod.GET)
    public String welcomename(@PathVariable String welcomename){
        return "Welcome " + welcomename;
    }

    @RequestMapping("/name" )
    public String getName(@RequestBody String studentName) {
        return "Welcome " + studentName + "!";
    }
    
    @RequestMapping("/printname")
    public String getprintName(@RequestParam("name") String name){
        return "Welcome " + name;
    }

    @RequestMapping("/favColor")
    public String getMyFav(@RequestBody String yourFavColor) {
        return "My favorite color is " + yourFavColor;
    }
}
