public class Demo32 {


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
           new Demo32().init();  // every one liner create a seprate instance
           new Demo32().disp();
           //see soln in next demo
        }
    }



