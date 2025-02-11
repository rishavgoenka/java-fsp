package com.fsp.fsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FspApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FspApplication.class, args);

        // Correct usage of context
        Student student = context.getBean(Student.class);

        student.setStudentName("Promod");
        student.setStudentRollNo("101");

        System.out.println("Name => " + student.getStudentName());
        System.out.println("Roll No => " + student.getStudentRollNo());
    }
}