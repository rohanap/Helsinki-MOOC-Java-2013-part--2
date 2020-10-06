
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Hand implements Comparable<Hand>{

    private ArrayList<Card> c = new ArrayList<Card>();

    public void add(Card card) {
        c.add(card);
    }

    public void print() {
        for (Card print : c) {
            System.out.println(c);
        }
    }
    
    public void sort(){
        Collections.sort(c);
    }

    @Override
    public int compareTo(Hand h) {
       int thisValue  = 0;
       int hValue = 0;
       
       for(Card cards : c ){
          thisValue+=cards.getValue();
       }
       
       for (Card hand : h.c){
          hValue += hand.getValue();
       }
       return thisValue - hValue;
    }
    
    
    public void sortAgainstSuit(){
       Collections.sort(c, new SortAgainstSuitAndValue());
    }
    
}
