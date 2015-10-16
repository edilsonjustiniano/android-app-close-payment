package br.com.justiniano.edilson.closeaccount.model;

import java.io.Serializable;

/**
 * Created by edilson on 10/15/15.
 */
public class Product implements Serializable{

    private String name;
    private double value;
    private int quantity;

    public Product(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
