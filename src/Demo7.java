public class Demo7 {

    public static void main(String[] args) {
        byte a = 90;  //8bits
        int b =a ;  //implicit  //32 bits

        System.out.println(b);

        int c = 80;  //32bits
        byte d = (byte) c;  // explicit  // 8bits
        System.out.println(d);

        int e = 200;  //& 256 number
        byte f = (byte)e;
        System.out.println(f); // limitation of explicit cast --> Chance of loss of data



    }
}
