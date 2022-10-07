package com.knf.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class PersonController {
    @Autowired

    private PersonService person_service;

    public PersonController(PersonService person_service){
        this.person_service=person_service;
    }

    @GetMapping("/person_list")
    public List<PersonData2015> list(){
        return person_service.getPersonList();
    }


}


