/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.LinkedList;

/**
 *
 * @author Gabriella Natasya
 */
public class Stack {
    public static void main(String[] args){
    LinkedList<String> letterS = new LinkedList<String>();
    
    letterS.push("P");
    letterS.push("Q");
    letterS.push("R");
    letterS.push("S");
    letterS.push("T");
    
    System.out.println("Linked list : " + letterS);
    System.out.println("Stack size : " + letterS.size());
    
    while(!letterS.isEmpty()){
            System.out.println(letterS.pop());
        }
    System.out.println("Linked list : " + letterS);
    }
}
