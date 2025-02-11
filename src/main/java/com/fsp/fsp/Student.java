package com.fsp.fsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String studentRollNo;
    private String studentName;

    @Autowired
    private StudentAddress address;

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }
    

    
}
