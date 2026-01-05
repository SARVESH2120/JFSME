public class Demo5 {

    int instVar = 10;
    static int statVar = 100;

    public static void main(String[] args) {
        System.out.println(statVar);  //100

        statVar = 900;
        System.out.println(statVar);  //900

        Demo5 demo5 = new Demo5();
        demo5.instVar = 600;
        demo5.statVar = 800 ;   // illegal

        System.out.println("demo5Instance Another Memory One " + demo5.instVar); //600
        System.out.println("demo5 " + statVar);

        Demo5 demoFive = new Demo5();
        System.out.println("demoFiveInstance Another Memory Two " + demoFive.instVar); //10
        System.out.println("demoFive " + statVar);

        //above output comes because we a lot a seprate memory like demo5 & demoFive


    }
}

//the moment when we create a instance a there is a new copy created
// static maintains the same copy across the instance