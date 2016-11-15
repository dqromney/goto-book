package com.tgtb.configuration;

import com.tgtb.controllers.Persons;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * Controller Resource Processor.
 *
 * Created by dqromney on 11/14/16.
 */
@Component
public class ControllerResourceProcessor implements ResourceProcessor<RepositoryLinksResource> {

    @Override
    public RepositoryLinksResource process(RepositoryLinksResource repositoryLinksResource) {
        repositoryLinksResource.add(ControllerLinkBuilder.linkTo(Persons.class).withRel("persons"));
        return repositoryLinksResource;
    }
}
