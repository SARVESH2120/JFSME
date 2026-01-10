import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int pin = -1;
//        while(pin != 111){
//            System.out.println("Enter pin");
//            pin = sc.nextInt();
//
//        }
//        System.out.println("valid pin");


        int pin;
        do{
            System.out.println("enter pin");
            pin = sc.nextInt();

        }while(pin!=111);
        System.out.println("valid user");
        //in do while we can save one attempt
    }
}
