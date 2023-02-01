package PR1.KA4_Uebung.A08_Palindrom;

public class Starter {

    public static boolean palindrome(int i){

        boolean equal = true;
        String s = Integer.toString(i);

        if (s.length() <= 2)
            if (s.charAt(0) == s.charAt(s.length()-1)) palindrome(Integer.parseInt(s.substring(1, s.length()-2)));
            else equal = false;

        return equal;
    }

    public static void main(String[] args) {

        System.out.println(palindrome(1));

    }

}
