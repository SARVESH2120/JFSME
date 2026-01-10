import java.util.Scanner;
public class Demo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
//        if(ch == 'A' ||ch == 'E' ||ch == 'I' || ch == 'O' || ch == 'U' ){
//            System.out.println("Vowles");
//        }else {
//            System.out.println("Not Vowels");
//        }

        switch (ch){
            case 'A' :System.out.println("vowel" + ch); break;
            case 'E' :System.out.println("vowel" + ch); break;
            case 'I' :System.out.println("vowel" + ch); break;
            case 'O' :System.out.println("vowel" + ch); break;
            case 'U' :System.out.println("vowel" + ch);
            default:
                System.out.println( "no vowel" + ch);
        }

    }
}


/**
 * Switch works on integral value
 * cases cannot be duplicated
 * switch works on integral constant
 * not work with expressions
 * only integral and string constant are allowed (after java 1.8)
 *
 */