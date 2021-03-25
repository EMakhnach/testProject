package mypackage;

public class TestMetody {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int sum;
 //       int result;

 //       result = getSum(1,10);
 //       System.out.println(result);

 //       result  = getSum(5,10,66);


        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));

        shouSum(10, 51, 77);
        shouSum(5, 12, 14);
        saysomething();
        sayHello("Maria");
        String name = "Vasya";
        sayHello(name);
        showSumToPersen("Petya", 15, 11, 33);

        sayHello("Lena");
        sayHello("Lena", "Alesya");
        sayHello();


    }
    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }



     static void shouSum(int x, int y, int z){
       int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }

    static void saysomething(){
        System.out.println();
        System.out.println("Hello");
        System.out.println("I'm running");
        System.out.println("You see me?");
    }

    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }

    static void showSumToPersen(String name, int a, int b, int c){
        System.out.println("Start of program!");
        sayHello(name);
        shouSum(a, b, c);
        System.out.println("End of program!");
    }

    static void sayHello(String name1, String name2){
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }
    static void sayHello(){
        System.out.println();
        System.out.println("Hello ");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }


}
        




