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
public class Plane {
    private String id;
    private int capicity;

    public Plane(String id, int capicity) {
        this.id = id;
        this.capicity = capicity;
    }

    public String getId() {
        return id;
    }

  

    @Override
    public String toString() {
        return  id + " ("+capicity+" ppl)";
    }

   
    
    
    
}
