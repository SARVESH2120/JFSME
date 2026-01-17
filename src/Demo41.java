public class Demo41 {
    public static void main(String[] args) {
        System.out.println("this is main");
        main();
        main("String");
    }

    public static void main() {
        System.out.println("main withour args");

    }

    public static void main(String name) {
        System.out.println("main with args");

    }
}
