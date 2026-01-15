public class Demo34 {

        //wher we should be used a one liners



        int age ;
        String name ;
        Demo34(){
            System.out.println("const");
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
            new Demo34();
            new Demo34().disp();

        }
    }



//We used one liners there only wherever we don't  need the reference to the object before
