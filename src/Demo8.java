public class Demo8 {
    public static void main(String[] args) {
        float a = 10.5f;
        //compiler reads all decimal values as double by default

        float b = (float)10.5;  // both above statement are same

        double d = 10.5;
        float f = (float) d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(f);

        char y = 'A';
        char x = 65; // implicit cast from byte to char
        System.out.println(x); // in this case ascii equivalent character prints

        boolean bool = false;
        System.out.println(bool);



    }
}
