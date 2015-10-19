package br.com.justiniano.edilson.closeaccount.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.justiniano.edilson.closeaccount.model.Account;

/**
 * Created by edilson on 10/19/15.
 */
public class FactoryDAO {

    private static FactoryDAO instance = null;
    private static List<Account> entities = null;

    private FactoryDAO() {
    }

    public static FactoryDAO getInstance() {
        if (instance == null) {
            instance = new FactoryDAO();
        }
        return instance;
    }

    public static List<Account> getEntities() {
        getInstance();
        if (entities == null) {
            entities = new ArrayList<Account>();
        }
        return entities;
    }
}
