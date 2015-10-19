package br.com.justiniano.edilson.closeaccount.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by edilson on 10/19/15.
 */
public class Account implements Serializable {

    private Set<Person> persons;
    private List<Product> products;
    private Date date;

    public Account() {
    }

    public Account(Set<Person> persons, List<Product> products, Date date) {
        this.persons = persons;
        this.products = products;
        this.date = date;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
