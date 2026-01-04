
public class Demo1 {
    void disp(){
        System.out.println("disp is called by instance");
    }
    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();
        System.out.println("hello");
        demo1.disp();

        String name  = Thread.currentThread().getName();
        System.out.println("Name of current thread is " + name);
    }
}
