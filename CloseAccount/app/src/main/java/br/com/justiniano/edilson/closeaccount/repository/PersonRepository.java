package br.com.justiniano.edilson.closeaccount.repository;

import java.util.List;
import java.util.Set;

import br.com.justiniano.edilson.closeaccount.dao.FactoryDAO;
import br.com.justiniano.edilson.closeaccount.model.Account;
import br.com.justiniano.edilson.closeaccount.model.Person;

/**
 * Created by edilson on 10/19/15.
 */
public class PersonRepository implements AppRepository<Account>{

    @Override
    public void save(Account entity) {
        // TODO: implement
    }

    @Override
    public List<Account> findAll() {
        return FactoryDAO.getEntities();
    }

    public void savePersons(Set<Person> entities) {
        Account account = new Account();
        account.setPersons(entities);
        FactoryDAO.getEntities().add(account);
    }
}
