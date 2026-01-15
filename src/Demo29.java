public class Demo29 {
    int age ;
    String name ;
    void init(){
        age =19;
        name = "virat";
    }
    void init(int ageVar , String nameVar){
        age =ageVar;
        name = nameVar;
    }
    void disp(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Demo29 d  = new Demo29();
        d.init();
        d.disp();
        d.init(45, "Sarvesh");
        d.disp();
    }
}
