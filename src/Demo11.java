public class Demo11 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" world"); // this is point to the same address but in behind concat do his work
        System.out.println(str);


        String str1 = "hello";
        str1 = str1.concat(" world");  // this will change the reference in String Constant Pool
        System.out.println(str1);



        String str2 = "Hello";
         str2.toUpperCase();
        System.out.println(str2);


        String str3 = "Hello";
        str3 = str3.toUpperCase();
        System.out.println(str3);
    }
}

//Object Immutability
/**
 * String Objects are immutable
 * If we perform any manupulation on string it will create a new String Constant Pool
 * String a = "Hello" ;
 * String b = "Hello" ;
 * refer to the same object both reference variable a and b
 * it doesn't duplicate the object  -- String Constant Pool
 * Saves Memory
 *
 *
 *
 * Whenever we do manupulation we use a String alternative class
 * see in Demo 12
 *
 *
 *
 *
 *
 */

