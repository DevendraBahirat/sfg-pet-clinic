package com.udemy.tutorial.sfgpetclinic.services;

import com.udemy.tutorial.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
