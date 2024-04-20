package hashmap;

import java.util.ArrayList;

public class HashMap {

    public static void main(String[] args) {

        HashMapImp<String,Integer> playerRuns = new HashMapImp<>();
        playerRuns.put("Virat Kohli",100);
        playerRuns.put("Rohit Sharma",83);
        playerRuns.put("MS Dhoni",126);

        ArrayList<String> keys = playerRuns.keySet();
        for(int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i)+" "+playerRuns.get(keys.get(i)));
        }


    }
}
