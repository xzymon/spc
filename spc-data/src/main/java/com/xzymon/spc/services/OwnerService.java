package com.xzymon.spc.services;

import com.xzymon.spc.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
