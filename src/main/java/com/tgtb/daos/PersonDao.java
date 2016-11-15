package com.tgtb.daos;

import com.tgtb.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

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
      * @param personName the person's name
      * @return list of {@link Person} objects
      */
    @RestResource(path="byName")
     public List<Person> findByPersonName(@Param("name") String personName);
}
