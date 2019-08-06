package string;

public class GeekStringSet1 {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        System.out.println("Character at 3rd position = "
                + s.charAt(3));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));

        System.out.println(s.concat("empre"));

        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Learn"));

        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);

        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);

       // int out1 = s1.compareTo(s2);
        System.out.println("If s1 = s2 " + s.compareTo("hahaha"));

        /*bad examples above*/


    }
}
