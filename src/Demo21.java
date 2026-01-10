public class Demo21 {
    public static void main(String[] args) {

        //continue

//        for(int i = 0 ; i<10 ; i++){
//            System.out.println( i + "before");
//            if(i==4)
//                continue; //skips the loops
//
//            System.out.println(i + "after");
//    }


        //break

//        for(int i = 0 ; i<10 ; i++){
//            System.out.println( i + "before");
//            if(i==4)
//                break; //skips the loops
//
//            System.out.println(i + "after");
//        }

//        int counter = 0 ;
        for(int i = 0 ; i<5 ; i++){
            for (int j = 0 ; j<3 ; j++){
//                counter++;
//                System.out.println(i + " " + j);

                if(i==1)
                    break;
                System.out.println(i + " " + j);
            }
            System.out.println("outer");

        }
//        System.out.println(counter);


    }
}



