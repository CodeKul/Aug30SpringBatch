package com.codekul.Aug24Batch.onetomany.service;

import com.codekul.Aug24Batch.onetomany.entity.MobileNumber;
import com.codekul.Aug24Batch.onetomany.entity.Person;
import com.codekul.Aug24Batch.onetomany.repository.MobileNumberRepo;
import com.codekul.Aug24Batch.onetomany.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonImpl implements PersonService {

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private MobileNumberRepo mobileNumberRepo;

    @Override
    public String persistPerson(Person person) {
        personRepo.save(person);
        return "person saved";
    }

    @Override
    public String persistPerson1(Person person) {
        var per = new Person();
        per.setFirstName(person.getFirstName());
        per.setLastName(person.getLastName());
        personRepo.save(per);

        person.getMobileNumber().forEach(m -> {
            var mobileNumber = new MobileNumber();
            mobileNumber.setNumber(m.getNumber());
            mobileNumber.setType(m.getType());
            mobileNumber.setPerson(per);
            mobileNumberRepo.save(mobileNumber);
        });
        return "person saved";
    }

    @Override
    public String deletePersonById(Long id) {
        personRepo.deleteById(id);
        return "person deleted";
    }

    @Override
    public String deleteMobileNumber(Long id) {
        mobileNumberRepo.deleteById(id);
        return "mobileNumber deleted";
    }
}
