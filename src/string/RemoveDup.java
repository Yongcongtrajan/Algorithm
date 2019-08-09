package string;

import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        System.out.println(removeDuplicated("lILLY"));
    }
    public static String removeDuplicated(String string) {
        if (string == null || string.length() == 1) {
            return string;
        }
        char [] input = string.toCharArray();
       // Map<Character> hm = new HashMap<>();
        Set<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char i : input) {
            if(!hashSet.contains(i)) {
                hashSet.add(i);
                hashSet.add(Character.toUpperCase(i));
                sb.append(i);

            }
        }



        return sb.toString();

    }
}
