
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
public class Calculator {

   private Reader reader;
   private int count;

    public Calculator() {
        this.reader = new Reader();
        this.count=0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                this.count++;
            } else if (command.equals("product")) {
                product();
                this.count++;
            } else if (command.equals("difference")) {
                 difference();
                 this.count++;
            }
        }
        
        statistics();
        
    }

    private void sum() {
        System.out.print("value1: ");
        int num1 = reader.readInteger();
        System.out.print("value2: ");
        int num2 = reader.readInteger();
        int sum = num1 + num2;
        System.out.println("Sum of the values " + sum);
    }

    private void difference() {
        System.out.print("value1: ");
        int num1 = reader.readInteger();
        System.out.print("value2: ");
        int num2 = reader.readInteger();
        int diff = num1 - num2;
        System.out.println("difference of the value " + diff);
    }
    
    private void product(){
        System.out.print("value1: ");
                int num1 = reader.readInteger();
                System.out.print("value2: ");
                int num2 = reader.readInteger();
                int mul = num1 * num2;
                System.out.println("product of the values " + mul);
    }
    
    private void statistics(){
      System.out.println("Calculation done "+this.count);
    }
}
