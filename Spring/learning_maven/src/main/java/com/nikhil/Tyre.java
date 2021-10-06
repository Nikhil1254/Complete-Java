package com.nikhil;

import org.springframework.stereotype.Component;

public class Tyre {
    String brand;


    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Its working..." + brand;
    }

}
