package com.codekul.Aug24Batch.onetomany.controller;

import com.codekul.Aug24Batch.onetomany.entity.Person;
import com.codekul.Aug24Batch.onetomany.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("save")
    public String savePerson(@RequestBody Person person) {
        return personService.persistPerson(person);
    }

    @PostMapping("save1")
    public String savePerson1(@RequestBody Person person) {
        return personService.persistPerson1(person);
    }

    @DeleteMapping("delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        return personService.deletePersonById(id);
    }

    @DeleteMapping("deleteMobileNumber/{id}")
    public String deleteMobileNumber(@PathVariable Long id) {
        return personService.deleteMobileNumber(id);
    }

}
