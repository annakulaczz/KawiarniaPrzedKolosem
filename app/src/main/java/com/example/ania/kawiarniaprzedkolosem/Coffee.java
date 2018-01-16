package com.example.ania.kawiarniaprzedkolosem;

/**
 * Created by Ania on 2018-01-16.
 */

public class Coffee {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Coffee(String name, String price)
    {
        this.name=name;
        this.price=price;
    }
}
