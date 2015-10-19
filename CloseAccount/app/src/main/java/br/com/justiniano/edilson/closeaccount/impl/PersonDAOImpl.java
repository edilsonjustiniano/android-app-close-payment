package br.com.justiniano.edilson.closeaccount.impl;

import java.util.Set;

import br.com.justiniano.edilson.closeaccount.dao.PersonDAO;
import br.com.justiniano.edilson.closeaccount.model.Person;
import br.com.justiniano.edilson.closeaccount.repository.PersonRepository;

/**
 * Created by edilson on 10/19/15.
 */
public class PersonDAOImpl implements PersonDAO {

    private PersonRepository personRepository;

    public PersonDAOImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void savePersons(Set<Person> persons) {
        personRepository.savePersons(persons);
    }
}
