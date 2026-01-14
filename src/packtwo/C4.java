package packtwo;

import packone.C1;

//public class C4 {
//    public static void main(String[] args) {
//        C1 c1 = new C1();
//        c1.disp();
//        System.out.println("c1 called in c4");
////        System.out.println(c1.x);
//    }
//}




//public class C4 {
//    public static void main(String[] args) {
//        C1 c1 = new C1();
//        c1.disp();
//        System.out.println("c1 called in c4");
////        System.out.println(c1.x);  //error x is default cannot acess it here because c4 is not the same package member
//
//
//    }
//}



public class C4 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.disp();
        System.out.println("c1 called in c4");
//        System.out.println(c1.x);  //error x is protected cannot access it here because c4 is not the same package member and not even te child


    }
}