
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
public class Box implements ToBeStored {

    private ArrayList<ToBeStored> save;
    private double capicity;
    //private int thing = 0;
    // private double weight;

    public Box(double size) {
        capicity = size;
        save = new ArrayList<ToBeStored>();
    }

    /*public void add(Book b) {
        save.add(b);
        //capicity -= save.size();
        if (thing < capicity) {
            thing++;
        }
        weight += b.weight();
    }

    public void add(CD c) {
        save.add(c);
        //capicity -= save.size();
        if (thing < capicity) {
            thing++;
        }
        weight += 0.1;
    }*/
    public void add(ToBeStored things) {
        if (weight() + things.weight() <= this.capicity) {
            save.add(things);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing : save) {
            weight += thing.weight();
        }
        return weight;
    }

    /* @Override
    public String toString() {
        return "Box: " + this.thing + " things, " + "total weight " + this.weight + " kg";
    }*/
    @Override
    public String toString() {
        return "Box: " + save.size() + " things, total weight " + weight() + " kg";
    }

}
