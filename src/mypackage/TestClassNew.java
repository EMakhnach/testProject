package mypackage;

import java.util.ArrayList;
import java.util.List;

public class TestClassNew {

        public TestClassNew() {

    }
private void my(){
    System.out.println("Privet, Lena");
}
    public static void main(String[] args) {
        TestClassNew lena = new TestClassNew();
        lena.my();

        int b = 10;

        System.out.println(b);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println(list.get(0));
        System.out.println();


    }





}
