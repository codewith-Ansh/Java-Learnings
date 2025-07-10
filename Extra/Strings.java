public class Strings {
     public static void main(String[] args) {

        // -------- STRINGS -------- 
        //  basic declaration of string
        String str = "Ansh";
        System.out.println(str);    // Ansh

        // length
        System.out.println(str.length());   // 4

        // concatenation
        String firstName = "Ansh";
        String lastName = " Darji";
        System.out.println(firstName + lastName);   // Ansh Darji

        // charAt
        System.out.println(str.charAt(1));  // n

        // replace
        String newStr = str.replace('h', 's');
        System.out.println(newStr); // Anss

        // substring
        String str1 = "Good morning";
        String subStr = str1.substring(0,6);
        System.out.println(subStr); // Good m
        /* NOTE: substring(start, end), end index will not get included */
     }
}
