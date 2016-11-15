package com.tgtb.configuration;

import com.tgtb.entity.Person;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Repository Configuration.
 *
 * Created by dqromney on 11/14/16.
 */
public class RepositoryConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
   	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
   		config.exposeIdsFor(Person.class);
   	}

}
