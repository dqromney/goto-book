package com.tgtb.controllers;

import com.tgtb.daos.PersonDao;
import com.tgtb.dtos.NewPerson;
import com.tgtb.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositorySearchesResource;
import org.springframework.hateoas.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Person controller.
 * <p>
 * Created by dqromney on 11/14/16.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/persons", produces = "application/json")
public class Persons implements ResourceProcessor<RepositorySearchesResource>, ResourceAssembler<Person, Resource<Person>> {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private EntityLinks entityLinks;

    /**
     * Retrieves all of the different persons
     *
     * @return Iterable<Person>
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public HttpEntity<Iterable<Person>> getAllPersons() {
        return new ResponseEntity<Iterable<Person>>(personDao.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Resource<Person>> getAllUsers(@RequestBody NewPerson newPerson) throws Exception {
        // TODO Implement
//        if ((newUser == null) || (newUser.getEmail() == null) || newUser.getEmail().trim().equals("")) {
//      			throw new InvalidParameterException("Must pass in email");
//      		}
//
//      		// Create the user
//      		User user = userService.createUser(newUser);
//
//      		// Send the response back to the client
//      		try {
//      			Resource<User> resource = toResource(user);
//      			return new ResponseEntity<>(resource, HttpStatus.OK);
//      		} catch (Exception e) {
//      			log.error("Failure in Users.getAllUsers", e);
//
//      			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//      		}

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public Resource<Person> toResource(Person person) {
        Resource<Person> resource = new Resource<>(person);

       	return resource;
    }

    @Override
    public RepositorySearchesResource process(RepositorySearchesResource repositorySearchesResource) {
        LinkBuilder link = this.entityLinks.linkFor(Person.class, "add");
        repositorySearchesResource.add(new Link(link.toString() + "/add", "add"));

       	return repositorySearchesResource;
    }
}

