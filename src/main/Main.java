package main;

import student.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        
        student.setFirstName("Milica");
        student.setLastName("Radifković");
        student.setYearOfBirth(1988);
        student.getCourse().setName("QA");
        student.getCourse().setNumberOfClasses(32);
        student.getComputer().setProcessTact(4.0);
        student.getComputer().setMemory(16.0);
        student.getComputer().setHardDrive(500);
        
        student.info();
        
    }
    
}
