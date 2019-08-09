package antra;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps fox fox over the lazy dog brown";
        Map<String,Integer> result = WordsCount(text);
        for(String key : result.keySet()) {
            System.out.println(key + " " + result.get(key));
        }
    }
    public static Map<String,Integer> WordsCount(String input) {
        Map<String,Integer> hashMap = new HashMap<>();
        if (input == null) {
             hashMap.put(null,0);
             return hashMap;
        }
        String[] splitString = input.split(" ");
        for(String string : splitString) {
            if(!hashMap.containsKey(string)) {
                hashMap.put(string,1);
            } else {
                int count = hashMap.get(string);
                count++;
                hashMap.put(string,count);

            }
        }
        return hashMap;
    }
}
