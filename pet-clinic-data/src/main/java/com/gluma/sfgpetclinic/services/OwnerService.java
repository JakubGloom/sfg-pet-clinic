package com.gluma.sfgpetclinic.services;

import com.gluma.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
