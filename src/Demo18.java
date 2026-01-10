import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age   = 17;
        int rating = 3;
        if(age > 18 || rating >4){
            System.out.println("selected");
        }else{
            System.out.println("rejected");
        }
        boolean x = true;
        boolean y = false;
        System.out.println(x^y);



        int marks = sc.nextInt();
        if(marks > 80 && marks < 100){
            System.out.println("A");
        }else if(marks > 70 && marks < 80){
            System.out.println("B");
        }else if(marks >=  60 && marks < 70){
            System.out.println("C");
        }else{
            System.out.println("fail");
        }

    }
}
