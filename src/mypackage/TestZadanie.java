package mypackage;

public class TestZadanie {
    public static void main(String[] args) {
        int[] array = {9, 4, 5, 6};
        boolean res;
        res = method(array);
        System.out.println(res);
    }

    static boolean method(int[] array) {
        int maxFindCount = 0;
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > maxFindCount) {
                maxFindCount = counter;
            }
        }
        if (maxFindCount >= 2) {
            return true;
        } else {
            return false;
        }
    }

}