public class Demo39 {
    //overloading  --> if functions perform closely related task we give it the same name
    // ensure number , type or sequence of args is different
    // return type can be same or different

    void add(int a  , int b){
        System.out.println("int,int");
    }
    int add(int a , int b , int z){
        System.out.println("int,int,int");
        return a+b+z;
    }

    void add(float a, float b){
        System.out.println("float,float");

    }
    void add(float a, int b){
        System.out.println("float, int");

    }

    public static void main(String[] args) {
        new Demo39().add(10,20);
        new Demo39().add(10f,20f);

    }
}
