
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class Reader {
  private Scanner scan = new Scanner(System.in);
    
    public  String readString(){
        String name = scan.nextLine();
        return name;
        
    }
    
    public int readInteger(){
      
      return Integer.parseInt(readString());
    }
}
