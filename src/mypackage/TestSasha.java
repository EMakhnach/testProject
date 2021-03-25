package mypackage;
//создать строку с предложением
//заменить все "а" на "о"
//перевести все буквы в верхний регистр
//заменить предпоследний символ на две цифры
//вернуть из строки массив, который состоит из слов предложения

//написать метод, который принимает строку и вывдоит
//  5 раз эту строку, если ее длина больше 5
public class TestSasha {
    public static void main(String[] args) {
        String rule = "Коллекции. Привет";
        String ruleUpper = rule.toUpperCase();
        System.out.println("c маленькой буквы: " + rule);
        System.out.println("С большой буквы: " + ruleUpper);

        String rule2 = rule.replace("о", "a");
        System.out.println(rule2);

        int a = rule.length();
        System.out.println(a);


        rule = "Коллекции. Привет!";
        System.out.println();
        String[] array = rule.split(" ");
        System.out.println(array[0] + array[1]);
        System.out.println(array[0]);
        System.out.println(array[1]);


        String[] rule3 = rule.split(" ");
        for (String stop : rule3)
        {
            System.out.println(stop);
        }

        int l = rule.length();
        System.out.println(l);
        String rule4 = rule.substring(0,l/2);
        System.out.println(rule4);

        String  arr = rule.substring(0, l-2);
        System.out.println(arr);
        String arr2 = rule.substring(l-1);
        System.out.println(arr2);

        System.out.println(arr + "55" + arr2);


    }

}