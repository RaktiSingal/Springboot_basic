package com.test.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // field injection
    public Laptop laptop;


    public void build() {
        System.out.println("Welcome to spring");

        // using autowired to call object
        laptop.print();
    }
}
