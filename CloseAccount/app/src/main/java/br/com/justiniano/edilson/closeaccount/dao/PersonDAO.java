package br.com.justiniano.edilson.closeaccount.dao;

import java.util.Set;

import br.com.justiniano.edilson.closeaccount.model.Person;

/**
 * Created by edilson on 10/19/15.
 */
public interface PersonDAO {

    void savePersons(Set<Person> persons);
}
