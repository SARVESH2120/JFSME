//Method Contains
//Elements of meths -->
// access specifier ,
// access modifier ,
// return type ,
// identifier ,
// arg list and body
// public static void main (String[] args){}
 //
public class Calculator {
    int add(int a , int b){
        return  a + b ;
    }

String myReplace(String input , char oldchar , char newchar ){
        char[] inputArray = input.toCharArray();
        for(int i = 0 ; i<inputArray.length; i++){
            if(inputArray[i] == oldchar){
                inputArray[i] = newchar;
            }
        }
        String outputSTring = new String(inputArray);
        return outputSTring;
}


}
