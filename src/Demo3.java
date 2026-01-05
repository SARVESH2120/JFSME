public class Demo3 {
    //local variable
    //instance variable
    //class variable  -- static variable



    int instVar =10 ; // instance variable
    static int statVar = 100;

     void disp(){
         int test = 9 ; //local var
        System.out.println(test);
        System.out.println(instVar);
         System.out.println(statVar);
    }

    static void abcd(){
        System.out.println("Static function calls a static variable but not called non-static "+statVar);
    }


    void abc(){
//        System.out.println(test);  // local var's can only be called within the function where they are declared
        System.out.println("abc" +instVar);
        System.out.println("abc" + statVar);
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.disp();
        demo3.abc();
        abcd();
    }
}


/**
 * local variable doesn't have default value
 * local variable must be initialized before it used
 * local var cannot be static
 *
 * instance variable have default value (depends on type of data type)
 *
 * int test; declaration part
 * test = 90;  initialization part
 *
 */