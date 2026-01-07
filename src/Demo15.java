public class Demo15 {
    public static void main(String[] args) {
        StringBuffer strB1 = new StringBuffer("hello");
        strB1.append(" world");
        System.out.println(strB1);


        StringBuffer strB2 = new StringBuffer("hello");
        strB2.append(" world");
        System.out.println(strB2);

        System.out.println(strB1.equals(strB2));  //false

        String str1 = strB1.toString();
        String str2 = strB2.toString();
        System.out.println(str1.equals(str2));
        //true -->  equals method is overridden in string buffer class


    }
}

//
//equals method is not overridden in string buffer class
