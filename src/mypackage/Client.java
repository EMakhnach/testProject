package mypackage;

public class Client {
    public String name;
    private int age;
    int cardSum;


    protected void setAge(int val){
        int date = 2021;
        date=98;
        this.age = val;
    }

    public int getAge(){
        return age;
    }
    int count;

    public void cycle( int counter){
        for(int f = 0; f <3 ; f++){
            System.out.println("hello");
        }
        while (counter  < 5){
            System.out.println("hello two");
            //counter++;
        }
        do {
            System.out.println("hello 3");
        }while (counter<5);
    }
}
