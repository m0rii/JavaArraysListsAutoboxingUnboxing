package array;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,11,9,15,80};


        System.out.println("Array = " + Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("Reversed Array = " + Arrays.toString(myArray));

    }

    private static void reverse(int[] array){
        int maxindex = array.length-1;
        int halfLenght = array.length /2;


        for (int i =0; i<halfLenght ;i++){
            int temp = array[i];
            array[i] = array[maxindex-i];
            array[maxindex-i] = temp;

        }
    }
}
