public class Demo25 {
//arrays can nto be resized  -->  but the same ref var can be used to ref to an entirely new array
    int [] marks = new int[]{3,6,8,7,9};

    void disp(){
        System.out.println("old length " + marks.length);
        for(int a:marks){
            System.out.println("old array " + a);
        }
        marks = new int[7];
        System.out.println("new lenght " + marks.length);
        for(int a:marks){
            System.out.println("new array" + a);
        }
    }

    public static void main(String[] args) {
        new Demo25().disp();

    }
}
