package com.codekul.Aug24Batch.onetomany.service;

import com.codekul.Aug24Batch.onetomany.entity.Person;

public interface PersonService {

    String persistPerson(Person person);

    String persistPerson1(Person person);

    String deletePersonById(Long id);

    String deleteMobileNumber(Long id);
}
