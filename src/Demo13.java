public class Demo13 {
    public static void main(String[] args) {
        String a1 = new String("java");
        String b1 = new String("JAVA");
        boolean result2 = a1.equals(b1) ;
        System.out.println(result2);  // false

        boolean result3 = a1.equalsIgnoreCase(b1) ;
        System.out.println(result3);  // false



    }
}
