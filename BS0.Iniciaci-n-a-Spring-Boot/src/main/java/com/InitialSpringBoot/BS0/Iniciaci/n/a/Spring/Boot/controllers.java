package com.InitialSpringBoot.BS0.Iniciaci.n.a.Spring.Boot;


import org.springframework.web.bind.annotation.*;

@RestController
public class controllers {

    @GetMapping("/user/{name}")
    public String greeting (@PathVariable String name){
        return "Hello "+ name;
    }

    @PostMapping("/useradd")
    public Person postPerson (@RequestBody Person person){
        person.setAge(person.getAge()+1);
                return person;
    }


}
