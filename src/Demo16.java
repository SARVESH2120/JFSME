import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to print");
        String str = sc.next();
        System.out.println(str);

        System.out.println("Enter Two Numbers to add");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + n2);

        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age>18 && age <50){
            System.out.println("selected");
        }else{
            System.out.println("rejected");
        }




    }
}
