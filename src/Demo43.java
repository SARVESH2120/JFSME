public class Demo43 {

    int add(int... a ){
        int sum = 0;
        for(int x:a) {
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Demo43 d = new Demo43();
        int result   = d.add(12,12,12,12);
        System.out.println(result);
    }
}
