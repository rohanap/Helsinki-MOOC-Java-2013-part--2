
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
public class TextUserInterface {

    private Scanner scan = new Scanner(System.in);
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {

        scan = reader;
        this.dict = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Statement: ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("translate")) {
                translate();
            } else if (input.equals("add")) {
                add();
            } else {
                System.out.println("Unknown statement");
            }

        }
    }

    public void add() {
        //dict = new Dictionary();
        System.out.print("In Finnish: ");
        String finnish = scan.nextLine();
        System.out.print("Translation: ");
        String translate = scan.nextLine();

        dict.add(finnish, translate);
        System.out.println("");
    }

    public void translate() {

        System.out.print("Give a word: ");
        String word = scan.nextLine();
        System.out.print("Translation: ");
        String translate = dict.translate(word);
        System.out.println(translate);

    }

}
