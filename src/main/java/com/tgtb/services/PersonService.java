package com.tgtb.services;

import com.tgtb.daos.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Person Service.
 *
 * Created by dqromney on 11/14/16.
 */
@Component
public class PersonService {

    @Autowired
    private PersonDao personDao;

    // TODO Implement as needed
}
