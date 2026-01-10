import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        boolean tested = false ;
//        if(age > 18 && (tested = true) ){
//            System.out.println("selcted");
//        }else{
//            System.out.println("rejected");
//        }
//        System.out.println(tested);


        if(age > 18 & (tested = true) ){
            System.out.println("selcted");
        }else{
            System.out.println("rejected");
        }
        System.out.println(tested);
    }
}
