//package :  Collection of related classes -- layman -- floders

class demoClass{
    protected   void disp(){

    }
}

public class Demo28 {

    public static void main(String[] args) {
        demoClass d= new demoClass();
        d.disp();
//        new demoClass().disp();

    }

}


//in java, it is possible parent class can be another package and child class can be other package
/**
 * based on access specifier the method class visible ot other classes =...
 *
 * public  -- visible everywhere
 * private -- available only within the class where it is declared
 * default  -- visible to only package members(even child outside the package can not access it)
 * protected  -- visible within the package and the child even if the child is outside  the package
 *
 *
 *
 * class can't be declared as  private or protected unless it is INNER class
 * two public class can not be in same file.
 *
 * package name can't contains number as well as capital case character
 */