public class Demo31 {


        int age ;
        String name ;
        Demo31(){    //constructor
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
            Demo31 d  = new Demo31();
            d.disp();


            //guess the output reference to demo 29.
            Demo31 d1 = new Demo31();
            d1.disp();

        }
    }


/**
 * initialize the data member of the class
 * create the object of a class
 * constructoe is the first thing call in the program
 */

