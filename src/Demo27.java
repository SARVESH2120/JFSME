import javax.swing.*;

public class Demo27 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10,20);
        System.out.println(sum);
//        JOptionPane.showMessageDialog(null , sum);

        String x = "hello" ;
//        String res = x.replace('l' , 'k');
//        System.out.println(res);

        String result = calculator.myReplace(x, 'l' , 'k');
        System.out.println(result);

        String y  = "Testing" ;
        String res1 = calculator.myReplace(y , 'T' , 'R');
        System.out.println(res1);

    }

}

//array is a class type data type if nothing initialized then default value will be zero
// int - 0 , float - 0.0 , string - null , b

//Write a java method that counts a small case character in a give strings
//ex heLLo  -- > 2
//HelLo --> 3
//countSmallcaseChar
//guess return type
