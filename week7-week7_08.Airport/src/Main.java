
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
         Scanner scan = new Scanner(System.in);
         
         Uinterface ui = new Uinterface(scan);
         ui.airportService();
         ui.flightService();
    }
}
