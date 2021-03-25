package mypackage;

public class TestRevertedArray {
    public static void main(String[] args) {
        int[] test1 = new int[] {10, 11, 12};
        revertTest1(test1);
    }

        public static int[] revertTest1(int[] inputArray){
        int[] tmp = new int[inputArray.length];
        int c = 0;
        for( int i = inputArray.length-1; i > -1; --i){
            tmp[c] = inputArray[i];
            c++;
        }
        return tmp;
        }
}



