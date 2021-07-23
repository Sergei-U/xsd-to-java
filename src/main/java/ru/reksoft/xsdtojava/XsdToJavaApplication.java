package ru.reksoft.xsdtojava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class XsdToJavaApplication implements CommandLineRunner {
    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    public static void main(String[] args) {
        SpringApplication.run(XsdToJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
