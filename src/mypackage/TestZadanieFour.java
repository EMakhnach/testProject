package mypackage;

import java.util.*;

public class TestZadanieFour {
    public static void main(String[] args) {
        char[] arr = new char[] {'a', 's', 'a', 'c', 'c'};
        System.out.println(someMethod(arr));
    }

    private static Map<Character, Boolean> someMethod(char[] inputArr) {
        HashMap<Character, Boolean> output = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (Character c: inputArr) {
            set.add(c);
        }
        set.forEach(el -> {
            boolean res;
            int i = 0;
            for (char c: inputArr) {
                if(el == c) {
                    i=i+1;
                }
            }
            res = i > 1;
            output.put(el, res);
        });
        return output;
    }
}
