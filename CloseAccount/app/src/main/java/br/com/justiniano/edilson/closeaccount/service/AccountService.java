package br.com.justiniano.edilson.closeaccount.service;

import java.util.Set;

import br.com.justiniano.edilson.closeaccount.dao.PersonDAO;
import br.com.justiniano.edilson.closeaccount.impl.PersonDAOImpl;
import br.com.justiniano.edilson.closeaccount.model.Person;
import br.com.justiniano.edilson.closeaccount.repository.PersonRepository;

/**
 * Created by edilson on 10/19/15.
 */
public class AccountService {

    private PersonDAOImpl personDAOImpl;

    public void createAccount(Set<Person> persons) {
        getPersonDAOImpl().savePersons(persons);
    }

    public PersonDAOImpl getPersonDAOImpl() {
        if (personDAOImpl == null) {
            personDAOImpl = new PersonDAOImpl(new PersonRepository());
        }
        return personDAOImpl;
    }
}
