package com.nikhil;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    MobileProcessor cpu;
    
    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("Octa core,4GB ram ,12MP camera");
        cpu.process();
    }
}
