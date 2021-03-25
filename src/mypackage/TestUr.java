package mypackage;

public class TestUr {
       public static void main(String[] args) {
        int privet = getSum(10, 20);
        System.out.println(privet);



        String[] names = new String[2];
        names[0] = "Lena";
        names[1] = "Vasya";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }


    }
    public static int getSum(int a, int b){
        return a + b;

    }
}

