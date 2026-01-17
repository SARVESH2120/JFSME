public class Demo42 {
    int add(String b , int... a){
        System.out.println(a[0]);
        System.out.println("add method");
        return  0;
    }

    public static void main(String[] args) {
        Demo42 d = new Demo42();
        d.add("10",34);
        d.add("44",34);
        d.add("33",32,45);
    }
}

//varargs - must be the last arg in an arg list