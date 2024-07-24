package Intro;

public class Methods {

    public static void main(String[] args) {

        // 1. Existing methods:

        String title = "Text";
       // System.out.println(title.toUpperCase());


        // 2. Custom methods:
        // Ex.1
        //print(title);
        print("Hello","Text");

        // Ex.2
        sum(3,4);

        // Ex.3
        int result = sum2(2,4);
        System.out.println(result);

        // Ex.4 - Calculate the sum of the elements of an array
        int[] grades = {5,6,8,7,9,10};

        int sumArr = addingArr(grades);
        System.out.println(sumArr);
        System.out.println(addingArr(grades));
        //print("The sum of the array is ",sumArr);     // Change parameter type to use

    }

    // Ex.1 - Print a string
    static void print(String word, String word2){    // String word, int nr
        System.out.println(word + word2);            // System.out.println(word + nr);
    }

    // Ex.2 -  Sum of 2 numbers
    static void sum(int nr1, int nr2){
        System.out.println(nr1+nr2);
    }

    // Ex.3 - Return a value
    static int sum2(int nr1, int nr2){
        int sum = nr1 + nr2;
        //System.out.println(sum);
        return sum;
    }

    // Ex.4 - Sum of array elements
    /**
     * Function for adding the elements of an Array
     *
     * @param arr
     * @return sum of elements
     */
    static int addingArr(int[] arr){
        int add=0;
        for (int i=0; i<arr.length; i++){
            add += arr[i];
        }
        return add;
    }


}
