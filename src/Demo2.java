public class Demo2 {

    static void myFunction(){
        System.out.println("Hello world this is myFunction");
    }

    void disp(){
        System.out.println("disp method");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();  // in this reference variable (Demo2 demo2) created and object (new Demo2()) created
       // new keyword allocates a memory

        myFunction();
        demo2.disp(); // disp function takes a memory from demo2
    }
}


// Non static method require a object reference but static method doesn't why?
// stattic exist before object --> they are independent of object  --> not depend on object because they have it's owm memory
//
