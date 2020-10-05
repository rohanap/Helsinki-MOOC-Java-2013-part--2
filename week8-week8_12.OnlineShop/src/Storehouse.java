
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Storehouse {

    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Storehouse() {
        price = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {

        if (price.containsKey(product)) {
            return this.price.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (stock(product) > 0) {
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
       
       return  stock.keySet();
    
    }
}
