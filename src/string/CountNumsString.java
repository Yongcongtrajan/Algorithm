package string;

import java.util.HashMap;
import java.util.Map;

public class CountNumsString {

    public static void main(String[] args) {
        String text = "the quick brown fox jumps fox fox over the lazy dog brown";
        String [] keys= text.split(" ");

        Map<String,Integer> hm = new HashMap<>();
       /* for (String i : keys) {
            Integer n = hm.get(i);
            if (n == null) {
                hm.put(i,1);
            } else {
                hm.put(i,hm.get(i)+1);
            }
        }*/

        for (String i : keys) {
            //hm.merge(i, 1, Integer::sum);
          //  int count = (hm.containsKey(i) ? hm.get(i) : 0);
          //  count++;
           // hm.put(i, count);
            hm.put(i,hm.getOrDefault(i,0) + 1);

        }

        //Set<Entry<String,Integer>> hash

        //  Iterator<Integer> itr = hm.keySet().iterator();
        for(String key: hm.keySet()) {
            System.out.println(key + " :" + hm.get(key));
            // System.out.println(hm.get(key));
        }



    }
}
