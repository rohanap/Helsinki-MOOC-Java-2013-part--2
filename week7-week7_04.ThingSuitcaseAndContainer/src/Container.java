
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
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
if(!(totalWeight()+suitcase.totalWeight()>this.maxWeight))
        container.add(suitcase);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase a : this.container) {
            totalWeight += a.totalWeight();
        }

        return totalWeight;
    }

    public String toString() {

        return this.container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printThings(){
       
       for(Suitcase  a:this.container){
            a.printThings();
       }
    }
    
    
}
