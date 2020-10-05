/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class CivilService implements NationalService{
     int dayLeft;

    public CivilService() {
        dayLeft = 362;
    }

    @Override
    public int getDaysLeft() {
      return dayLeft;
       
    }

    @Override
    public void work() {
        if(dayLeft > 0){
          dayLeft--;
        }
    }
    
   
     
}
