package main;

import model.Student;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Student student = new Student();
            System.out.println("Student Id ni daxil edin");
            student.setId(scan.nextInt());
            System.out.println("Student Name ni daxil edin");
            String name = scan.next();
            student.setName(name);
            System.out.println("Student Surname ni daxil edin");
            student.setSurname(scan.next());
            System.out.println("Student Age i daxil edin");
            student.setAge(scan.nextInt());
            student.add();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
