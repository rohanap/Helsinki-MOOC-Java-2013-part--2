/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public char getFromCharacter() {
        return fromCharacter;
    }

    public char getToCharacter() {
        return toCharacter;
    }

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {

        String change = characterString.replace(getFromCharacter(), getToCharacter());
        return change;

    }

}
