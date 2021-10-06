package com.practice.learning_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    int aId ;
    String aName ;
    String tech ;

    @Autowired
    Laptop laptop;

    public Alien() {
        System.out.println("Object created.");
    }

    public int getaId() {
        return aId;
    }
    public void setaId(int aId) {
        this.aId = aId;
    }
    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("Hello,I'm Alien object.");
        laptop.show();
    }
    
}
