public class Demo33 {
    //wher we should not used a one liners



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
            new Demo32().init();
            new Demo32().disp();
            //see soln in next demo

            Demo33 d1 = new Demo33();
            d1.init();

            Demo33 d2 = new Demo33();
            d2.disp();
        }
    }




