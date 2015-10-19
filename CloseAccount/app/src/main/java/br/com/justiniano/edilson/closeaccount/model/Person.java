package br.com.justiniano.edilson.closeaccount.model;

import java.io.Serializable;

/**
 * Created by edilson on 10/19/15.
 */
public class Person implements Serializable{

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
