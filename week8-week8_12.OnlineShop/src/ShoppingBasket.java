
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
public class ShoppingBasket {

   private Map<String, Purchase> products;

    public ShoppingBasket() {
        products = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.products.containsKey(product)) {
            this.products.get(product).increaseAmount();
        } else {
            this.products.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Purchase p : products.values()) {
            price += p.price();
        }
        return price;
    }
    
    public void print(){
      for(Purchase p : products.values()){
          System.out.println(p.toString());
      }
    }
}
