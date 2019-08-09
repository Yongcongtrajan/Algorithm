package antra;

import java.util.HashSet;
import java.util.Set;

public class DeDup {
    public static void main(String[] args) {
        System.out.println(deDuplicate("LILLiYl"));
    }
    private static String deDuplicate(String input) {
        if( input == null || input.length() < 2) {
            return input;
        }
        Set<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char [] chars = input.toCharArray();
        for(char i : chars) {
            if(!hashSet.contains(i)) {
               // hashSet.add(i);
                hashSet.add(Character.toUpperCase(i));
                hashSet.add(Character.toLowerCase(i));
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
