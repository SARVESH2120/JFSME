public class Demo36 {
    int age =100;  //instance variable
    String name ;

    void abc(){
        int age =  50 ; //local variable
        System.out.println("local variable" + age);
        System.out.println("instance variable by this " + this.age); // if you want to access current instance there is a key word available is this to get the current instance
    //same as  System.out.println("instance variable" +d.age);

    }

    void disp(){
        System.out.println(age);

    }

    public static void main(String[] args) {
        Demo36 d = new Demo36();
        System.out.println("instance variable" +d.age);
//        System.out.println("instance var " + this.age);
        // cannot use this keyword in static blocks
        d.abc();
        d.disp();
    }
}


//local variable does not travel outside the function where they are
// this keyword can't use in static context