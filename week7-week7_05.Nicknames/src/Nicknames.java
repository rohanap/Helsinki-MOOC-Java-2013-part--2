
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        
        HashMap<String,String>friends = new HashMap<String, String>();
        
        friends.put("matti", "mage");
        friends.put("mikael", "mixu");
        friends.put("arto", "arppa");
        
        System.out.println(friends.get("mikael"));
       
    }

}
