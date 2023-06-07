//java program to check wheather no is consonent or vowel.
import java.util.*;
public class VowelConsonant {


 public static void main(String[] args)

        {
 	char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
}

   
   
 
}