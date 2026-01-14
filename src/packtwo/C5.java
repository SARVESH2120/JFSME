package packtwo;
import packone.C1;
public class C5 extends C1{

    public static void main(String[] args) {
        C5 c5  = new C5();
        c5.disp();
        System.out.println(c5.x);  // protected can be accessed because c5 is the child
         }
}


//package my.new.abc  -- this will create a new folders and inside this the package should be there
