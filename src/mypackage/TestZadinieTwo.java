package mypackage;


public class TestZadinieTwo {

    public static void main(String[] args) {
        String mainStr = "Word";
        String sepStr = "Separator";
        int n = 3;
        String res = makeString(mainStr, sepStr, n);
        System.out.println(res);
    }
    public static String makeString(String inputStr, String inputSepStr, int num) {
        String res = inputStr;
        res = res.concat(inputSepStr);
        String repeated = res.repeat(num);
        int lengthSepStr = inputSepStr.length();

        int length = repeated.length();
        String str1 = repeated.substring(0, length - lengthSepStr);


        return str1;
    }
}




