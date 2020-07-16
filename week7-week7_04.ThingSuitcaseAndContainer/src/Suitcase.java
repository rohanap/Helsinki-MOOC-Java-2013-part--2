
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Suitcase {

    private ArrayList<Thing> thing;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.thing = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {

        if (!(total() + thing.getWeight() > this.maxWeight)) {
            this.thing.add(thing);
        }
    }

    public int total() {
        int currentWeight = 0;
        for (Thing t : thing) {
            currentWeight += t.getWeight();
        }
        return currentWeight;
    }

    public String toString() {
        if (this.thing.isEmpty()) {
            return " empty" + " (" + total() + " kg)";
        } else if (this.thing.size() == 1) {
            return this.thing.size() + " thing" + " (" + total() + " kg)";
        } else {
            return this.thing.size() + " things" + " (" + total() + " kg)";
        }
    }
    
    public void printThings(){
        for(Thing t : thing){
            System.out.println(t);
        }
    }
    
    public int totalWeight(){
      return total();
        
    }
    
    public Thing heaviestThing(){
       if(this.thing.isEmpty()){
         return null;
       }else{
         Thing hevey = this.thing.get(0);
         for(Thing t : thing){
             if(t.getWeight()>hevey.getWeight()){
                  hevey=t;
             }
         }
         return hevey;
       }
    }

}
