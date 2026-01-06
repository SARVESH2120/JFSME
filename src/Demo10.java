public class Demo10 {
    //Wrapper class  -- Act as bridge between primitive type and class type

    // Conversion of data from primitive type to Class type  is called boxing.
    // Conversion of data from Class type to primitive type  is called unboxing.

    /** **
     * Byte
     * Short
     * Integer
     * Long
     * Character
     * Boolean
     * Float
     * Double
     *
     */

    public static void main(String[] args) {
        String t = "test";
        System.out.println(t);

        String strNum = "10";
        System.out.println(strNum + 90);
//        int num = (int)strNum; //cannot be converted without a wrapper class coz string is class type and int is primitive type

        int num = Integer.parseInt(strNum);
        System.out.println(num);
        System.out.println(num + 90);
    }
}
