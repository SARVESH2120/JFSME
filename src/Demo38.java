public class Demo38 {

    int age ;
    String name ;

    public Demo38(){
        age = 19;
        name = "Virat";
    }

    public Demo38(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void disp(){
        System.out.println(age);
        System.out.println(name);

    }

    public static void main(String[] args) {
        new Demo38().disp();
        new Demo38(25 , "Sarvesh").disp();
    }

}
