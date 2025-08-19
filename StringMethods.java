public class StringMethods {
    public static void main(String[] args) {
        String str = "How are you?";
        String str1 = "gooooooooooooooooooooo?";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        for(int i = 0 ; i<=str.length()-1;i++){
            System.out.println(str.charAt(i));
        }
        char[] ch =  str.toCharArray();

        System.out.println(ch);
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));

          System.out.println(str.indexOf("you"));
          System.out.println(str.indexOf('y'));
        System.out.println(str.lastIndexOf('y'));
        System.out.println(str.startsWith("how"));
             System.out.println(str.endsWith("u?"));
             System.out.println(str.contains("re"));
               System.out.println(str.substring(1,6));
               System.out.println(str.substring(1,6));
               ;
               System.out.println(str.replace("H","k"));
               System.out.println(str1.replaceAll("o",""));
               String str2="gob-gob-gob";

                String[] arrstr=str2.split("-");
                System.out.println(arrstr[0]);
                String res = String.join("-", arrstr);
                System.out.println(res);

                String whiteSpaces =  "   bsfubefubu jenehfb enfesufb hbe   cea  ";
                String concatoo =  "noice ";

                System.out.println(whiteSpaces.trim());
                System.out.println(whiteSpaces.trim().concat(concatoo));

                System.out.println(concatoo.toUpperCase());

    }
}
