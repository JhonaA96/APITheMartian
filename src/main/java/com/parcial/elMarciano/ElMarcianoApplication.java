package com.parcial.elMarciano;

import com.parcial.elMarciano.service.ActorService;
import com.parcial.elMarciano.serviceImpl.ActorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElMarcianoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElMarcianoApplication.class, args);
    }

}
