package mypackage;

import java.util.Arrays;

public class TestZadanieThree {
    public static void main(String[] args) {
        int[] array = makeArray(4);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static int[] makeArray(int i) {
        int arrLength = i*(i + 1) / 2;
        int[] tmpArray = new int[arrLength];
        //3 length = 6
        //(1), (1, 2), (1, 2, 3)
        for (int a = 0 ; a < i; a++){
            int[] subArr =new int[a+1];
            for(int c = 0; c < a+1; c++){
                subArr[c] = c+1;
            }
            System.arraycopy(subArr, 0, tmpArray, a*(a + 1) / 2, subArr.length);
        }
        return tmpArray;
    }
}

