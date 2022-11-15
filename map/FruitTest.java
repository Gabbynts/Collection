/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.map;
import java.util.HashMap;

/**
 *
 * @author Gabriella Natasya
 * 
 * implemet add, getkey, getvalue, find value based on key
 */
public class FruitTest {
    public static void main(String[] args){
        HashMap<String, String> fruitBowl = new HashMap<String, String>();
        
        addElements(fruitBowl);
        displayElements(fruitBowl);
        findElement(fruitBowl,"Strawberry");
        findElement(fruitBowl,"Banana");
        
    }
    
    static void addElements(HashMap<String, String> fruitBowl){
        fruitBowl.put("Strawberry", "Green");
        fruitBowl.put("Grape", "Purple");
        fruitBowl.put("Mango", "Orange");
        fruitBowl.put("Strawberry", "Red");
    }
    
    static void displayElements(HashMap<String, String> fruitBowl){
        //System.out.println(fruitBowl);
        for(HashMap.Entry<String, String> fruit : fruitBowl.entrySet()){
            System.out.println("Fruit: " + fruit.getKey() + " with Color " + fruit.getValue());
        }
    }
    
    static void findElement(HashMap<String, String> fruitBowl, String fruit){
        if(fruitBowl.containsKey(fruit))
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        else
            System.out.println("There is no " + fruit + " in the bowl");
    }
}
