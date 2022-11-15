/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gabriella Natasya
 * 
 * implement add, remove, add with idx
 */
public class Student {

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();
        
        addStudents(studentNames);
        displayStudents(studentNames);
    }
    
    static void addStudents(ArrayList<String> studentNames){
       studentNames.add("Gaby");
       studentNames.add("Tasya");
    }
    
    static void displayStudents(ArrayList<String> studentNames){
        for(String student: studentNames)
            System.out.println("Student Name : " + student);
    }
}
