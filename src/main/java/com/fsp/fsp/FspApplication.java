package com.fsp.fsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FspApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FspApplication.class, args);

        // Getting Student bean (which now includes StudentAddress)
        Student student = context.getBean(Student.class);
        
        student.setStudentName("Promod");
        student.setStudentRollNo("101");

        // Setting address details via injected StudentAddress bean
        student.getAddress().setCity("California");
        student.getAddress().setCountry("USA");
        student.getAddress().setState("Texas");
        student.getAddress().setStreetNo("123");

        // Output details
        System.out.println("Name => " + student.getStudentName());
        System.out.println("Roll No => " + student.getStudentRollNo());

        System.out.println("Address => " + student.getAddress().getStreetNo() + ", "
                + student.getAddress().getCity() + ", "
                + student.getAddress().getState() + ", "
                + student.getAddress().getCountry());
    }
}