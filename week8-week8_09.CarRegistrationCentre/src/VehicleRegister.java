
import java.util.ArrayList;
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
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {

        
       if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        } 
        
        return false;
       
       // return owners.put(plate, owner) == null;
    }

    public String get(RegistrationPlate plate) {
       
            return owners.get(plate);
        
    }

    public boolean delete(RegistrationPlate plate) {
     
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } 
        return false; 
        
        //return owners.remove(plate) !=null;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate p : owners.keySet()) {
            System.out.println(p);
        }

    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();

        for (String p : owners.values()) {
            if (!ownerList.contains(p)) {
                ownerList.add(p);
                System.out.println(p);
            }

        }
    }
}
