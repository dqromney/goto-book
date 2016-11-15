package com.tgtb.daos;

import com.tgtb.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Person Repository.
 *
 * Created by dqromney on 11/14/16.
 */
public interface PersonDao extends CrudRepository<Person, Long> {

    /**
     * Finds the practice by the practice name
     *
     * @param name {@link String}
     * @return {@link Person} object
     */
    public Person findByName(String name);
}
