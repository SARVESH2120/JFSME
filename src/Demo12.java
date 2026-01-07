public class Demo12 {
    public static void main(String[] args) {

        String a = "java";
        String b = "java";
        boolean result = a.equals(b);
        System.out.println(result); //true

        boolean result1 = a==b;
        System.out.println(result1); //true

        String a1 = new String("java");
        String b1 = new String("java");
        boolean result2 = a1 == b1 ;
        System.out.println(result2);  // false

        boolean result3 = a1.equals(b1);
        System.out.println(result3); //true

    }
}


/**
 * equals() method doesn't belong to the string class.
 * it a method of the object class
 *
 *
 *  String a1 = new String("java");  an object is created (new String("java"))  --> Memory address X1
 *   String b1 = new String("java");  an object is created (new String("java"))   --> Memory address X2
 * It only checks the value equality
 *   eg:  Web page -->  forget password &  New Password .equals() because of two different memory
 *
 *
 *
  *
 *
 *
 */