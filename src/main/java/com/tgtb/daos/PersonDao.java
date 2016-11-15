package com.tgtb.daos;

import com.tgtb.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Person Repository.
 *
 * Created by dqromney on 11/14/16.
 */
@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonDao extends CrudRepository<Person, Long> {

    /**
     * Finds the person by the person name
     *
     * @param personName {@link String}
     * @return {@link Person} object
     */
    @RestResource(path = "byName")
    public Person findByPersonName(@Param("name") String personName);
}
