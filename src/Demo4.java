public class Demo4 {
    int inst=90;
    static int stat;

    void test(){
        System.out.println(inst); // Here it is valid because test is only called after the object is created and the memory is allocated to that be creating a new object like demo4.test()
        System.out.println(stat);
    }

    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        System.out.println(stat);
//        System.out.println(inst); // error
        System.out.println(demo4.inst);

        demo4 = null; // Memory allocated to object is gone and got NPE --> Memory is deallocated
        System.out.println(demo4.inst);   // null pointer exception [npe]
    }
}
// Static variable appear to exist even before the creation of the object
// Instance variable depends on the creation of the object for it's existence
