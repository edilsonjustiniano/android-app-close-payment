package br.com.justiniano.edilson.closeaccount.controller;

import java.util.Set;

import br.com.justiniano.edilson.closeaccount.model.Person;
import br.com.justiniano.edilson.closeaccount.service.AccountService;

/**
 * Created by edilson on 10/19/15.
 */
public class AccountController {

    private AccountService accountService = new AccountService();

    public void createAccount(Set<Person> persons) {
        accountService.createAccount(persons);
    }
}
