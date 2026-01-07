public class Demo14 {
    //StringBuffer & String Builder

    public static void main(String[] args) {
        String str = new String("hello");
        str.concat("world");
        System.out.println(str);  // hello


        StringBuffer strB = new StringBuffer("hello");
        strB.append(" world");
        System.out.println(strB);  // helloworld

        StringBuilder strBuild = new StringBuilder("hello");
        strBuild.append(" world");
        System.out.println(strBuild);  // hello world


        //StringBuffer vs StringBuilder

        System.out.println(strB.charAt(1));
        System.out.println(strBuild.charAt(1));



    }
}


/**
 * StringBuilder and StringBuffer are both mutable
 * it holds the refrence
 * it doesn't lost in memory as String
 *  StringBuffer is thread safe
 *          StringBuilder is thread unsafe
 * FOr manupulation use any of them
 *
 * Multithreading means many user used a resource at a same time
 *
 * In StringBuffer [use for Multi Threaded Application] only one user at a time can access [washroom]
 * -- compare to SBuild it is slow
 *
 * StringBuilder is fast [use for Single Threaded Application]
 *
 *
 */