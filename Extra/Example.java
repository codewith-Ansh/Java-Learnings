public class Example {
    public static void main(String[] args) {
        String str1 = "Ansh Darji";
        String str2 = new String(str1);
        String str3 = "ansh darji";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.indexOf('s'));
        System.out.println(str1.lastIndexOf('s'));
        System.out.println(str1.substring(0, 2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str3.trim());
        System.out.println(str1.replace('s', 'x'));
        System.out.println(str1.contains("Darji"));

        String[] str4 = str1.split(" ");
        for(String word: str4){
            System.out.println(word);
        }
        System.out.println(str1.intern() == str2.intern());

        StringBuilder str1Builder = new StringBuilder();
        StringBuffer str1Buffer = new StringBuffer();

        System.out.println(str1Buffer.append("Ansh Darji"));
        System.out.println(str1Builder.append("Ansh Darji"));
    }
}