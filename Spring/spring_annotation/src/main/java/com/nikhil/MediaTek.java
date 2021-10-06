package com.nikhil;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
    public void process(){
        System.out.println("i'm MediaTek processor.")
    }
}
