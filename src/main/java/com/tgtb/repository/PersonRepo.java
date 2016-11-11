package com.tgtb.repository;

import com.tgtb.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Person repository.
 * <p>
 * Created by dqromney on 11/10/16.
 */
@RepositoryRestResource
public interface PersonRepo extends CrudRepository<Person, Long> {

    @RestResource(path = "byName")
    public List findByPersonName(@Param("name") String personName);
}