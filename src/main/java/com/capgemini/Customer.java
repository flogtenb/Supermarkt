package com.capgemini;

import java.util.ArrayList;

public abstract class Customer implements IRegister {

    private String name;

    public String getName() {
        return name;
    }

    public abstract void setName(String name);

    public abstract String greeting();

    ArrayList<Basket> products = new ArrayList<Basket>();

    public ArrayList<Basket> getProducts() {
        return products;
    }

   // public void setProducts(ArrayList<Basket> products) {
   //     this.products = products;
   // }

    public abstract void addToBasket(Product product);

}
