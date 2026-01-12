//collection of elements of same type
public class Demo24 {

//    int [] marks = new int[5]; //allocates 5 memory position in heap

    int[] marks = {3,4,5,6,7};



    void disp(){

        marks[0] = 89;
        marks[1] = 78;

//        System.out.println(marks[0]);
//        System.out.println(marks[2]);


//        System.out.println(marks.length); //these length prop belong to array

//        for(int i=0; i<marks.length; i++){
//            System.out.println("i" + i);
//        }

        //enhanced for loop
        for(int a :marks){
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
//        Demo1 d1 = new Demo1();
//        d1.disp();

        new Demo24().disp();  //one liner

    }
}



//Null pointer exception --> If array is not define and we can access the value
// Array Out of Bound -->  when we want to take value beyond the  array size.
//arrays can't be resized