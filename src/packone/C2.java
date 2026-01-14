package packone;
//
//public class C2 {
//    public static void main(String[] args) {
//       C1 c1 = new C1();
//       c1.disp();
//        System.out.println(c1.x);
//    }
//}




//public class C2 {
//    public static void main(String[] args) {
//        C1 c1 = new C1();
//        c1.disp(); //we are able to access the private value of x because of disp methnod b/c it acess the private method x
//
////        System.out.println(c1.x);
//    }
//}



//public class C2 {
//    public static void main(String[] args) {
//        C1 c1 = new C1();
//        c1.disp();
//        System.out.println(c1.x); // visible cause x is default now and c2 and c1 are in same package
//
//    }
//}


public class C2 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.disp();
        System.out.println(c1.x); // visible cause x is default now and c2 and c1 are in same package

    }
}