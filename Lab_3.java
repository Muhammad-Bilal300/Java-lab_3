/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

import java.util.Scanner;

/**
 *
 * @author computer clinic
 */
class course {

    String name;
    String students[];
    int number_of_students;

    course(String courseName) {
        name = courseName;
        students = new String[20];
        number_of_students = 0;
    }

    public String course_name() {
        return name;
    }

    public void addStudents(String student) {
        students[number_of_students] = student;
        number_of_students++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return number_of_students;
    }

}

public class Lab_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Course");
        String userInput = sc.nextLine();
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        
        course obj1 = new course(userInput);

//        
//       
        obj1.addStudents("Muhammad Bilal");
        obj1.addStudents("Faizan");
        obj1.addStudents("Salman");
        obj1.addStudents("Muhammad DAnish");

        System.out.println("The name of the Course is : " + obj1.course_name());
        System.out.println("Number of Students who are enroll in the " + obj1.course_name() + " course are : " + obj1.getNumberOfStudents());
        System.out.println("The name of students who are enroll in " + obj1.course_name() + " course are given below : ");

        for (int i = 0; i < obj1.getNumberOfStudents(); i++) {
            System.out.println((i+1) + ") " + obj1.getStudents()[i]);
        }
        System.out.println();
    }

}
