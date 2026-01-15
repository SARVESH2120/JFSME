public class Demo30 {
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
            Demo30 d  = new Demo30();
            d.init();
            d.disp();
            d.init(45, "Sarvesh");
            d.disp();


            //guess the output reference to demo 29.
            Demo30 d1 = new Demo30();
            d1.disp();
            d1.init();
        }
    }


