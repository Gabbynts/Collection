/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.set;
import java.util.HashSet;

/**
 *
 * @author Gabriella Natasya
 */
public class CoinTestDriver {
    public static void main(String[] args){
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin3 = new Coin(3);
        Coin coin5 = new Coin(5);
        Coin coin100 = new Coin(100);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin3);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin100);
        
        bagOfCoins.contains(coin5);
        
        findCoin(bagOfCoins, coin100);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if(bagOfCoins.contains(coin)) System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        else System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
    }
    
    static void displayBagContents(HashSet<Coin> bagOfCoins){
        for(Coin coin : bagOfCoins) System.out.print(coin.getDenomination() + " ");
    }
    
    static void displayBagDetails(HashSet<Coin> bagOfCoins){
        if(bagOfCoins.isEmpty()) System.out.println("There is no coins in the bag");
        else System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }
}
