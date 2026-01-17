public class Demo35 {

    int age;
    String name;
    public Demo35(){
        System.out.println("const");
        age = 19;
        name = "Virat";
    }

    public Demo35(int ageVar , String nameVar){
        System.out.println("const");
        age = ageVar;
        name = nameVar;

    }

    void disp(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Demo35().disp();
        new Demo35(25 , "Sarvesh").disp();
    }

}



//overload the constructor
// dynamic polymorphism