package DFSI;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetI {

    public static void main(String[] args) {
        List<String> result = subSets("ABC");
        System.out.println(result);
       // result.contains()
    }
    public static List<String> subSets(String set) {
        List<String> result = new ArrayList<>();
        if (set == null) {
            return result;
        }
        char [] arraySet = set.toCharArray();
        //String Method toCharArray() return char array
        StringBuilder sb = new StringBuilder();
        helper(arraySet, sb, 0, result);

        // Write your solution here.
        return result;
    }
    private static void helper(char [] set, StringBuilder sb, int index, List<String> result) {
        if(index == set.length) {
            result.add(sb.toString());
            return;
        }
        helper(set,sb,index + 1,result);
        helper(set,sb.append(set[index]),index+1, result);
        sb.deleteCharAt(sb.length() - 1);

    }

}
