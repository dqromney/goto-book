package com.tgtb.controllers;

import com.tgtb.daos.PersonDao;
import com.tgtb.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Person controller.
 * <p>
 * Created by dqromney on 11/14/16.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/persons", produces = "application/json")
public class Persons {

    @Autowired
    private PersonDao personDao;

    /**
     * Retrieves all of the different persons
     *
     * @return Iterable<Person>
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public HttpEntity<Iterable<Person>> getAllPersons() {
        return new ResponseEntity<Iterable<Person>>(personDao.findAll(), HttpStatus.OK);
    }
}

