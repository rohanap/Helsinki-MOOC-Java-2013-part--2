
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class PromissoryNote {

    private HashMap<String,Double> names;
    
    public PromissoryNote() {
        this.names = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
         this.names.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
       
        if(this.names.containsKey(whose)){
        return this.names.get(whose);
        }
        return 0;
            }
    
}
