package com.practice.learning_springboot;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    int id ;
    String brand ;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void show(){
        System.out.println("Hello,I'm laptop.");
    }
}
