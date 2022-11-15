/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.LinkedList;

/**
 *
 * @author Gabriella Natasya
 */
public class Queue {
    public static void main(String[] args){
        LinkedList<String> lettersQ = new LinkedList<String>();
        
        lettersQ.add("P");
        lettersQ.add("Q");
        lettersQ.add("R");
        lettersQ.add("S");
        lettersQ.add("T");
        
        System.out.println("Linked list " + lettersQ);
        System.out.println("Linked size " + lettersQ.size());
        
        while(!lettersQ.isEmpty()){
            System.out.println(lettersQ.removeFirst());
        }
        
        System.out.println("Linked list " + lettersQ);
        System.out.println("Linked size " + lettersQ.size());
        
    }
}
