public class Demo37 {
    int age ;
    String name ;
    public Demo37(){
        System.out.println("const");
        age =19;
        name = "virat";

    }
    public Demo37(int age , String name){
        System.out.println("const");
        this.age = age;  //take the local variable and initialize the instance variable
        this.name = name;

    }

    void disp(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Demo37().disp();
        new Demo37(45 , "Rohit").disp();
    }
}
