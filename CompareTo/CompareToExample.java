/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompareTo;

/**
 *
 * @author Gabriella Natasya
 */
public class CompareToExample {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        
        System.out.println(s1.compareTo(s2)); // -15 because "H" is 15 times lower than "W"
        System.out.println(s1.compareTo(s3)); // 0 because both are equal
        System.out.println(s2.compareTo(s3)); // 15 because "W" is 15 times higher than "H"
    }
}
