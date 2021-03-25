package mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAleks {
    public static void main(String[] args) {

        int[] arr = new int[]{45, 33, 50};

        reverse(arr);
        for (int i: arr
        ) {
            System.out.println(i);
        }

    }

    public static int[] reverse(int[] arr){

        for(int i = 0; i < arr.length/2 ; i++ ){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
        return arr;
    }



    public void invertUsingCollectionsReverse(Object[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
    }
}

