
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product,int amount,int unitPrice) {
        this.product=product;
        this.amount=amount;
        this.unitPrice=unitPrice;
        
    }
    public int price(){
       return amount * unitPrice;
    }
    
    public void increaseAmount() {
       amount++;
    }

    @Override
    public String toString() {
        return  product + ": " + amount ;
    }
    
    
    
}
