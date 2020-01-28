package error;

public class CheckErrors {


    public static boolean check36 (int a, int b) {

        if (a < 0 || a > 10 || b < 0 || b > 10)  return true;
        else return false;

    }
    public static boolean check7 (String a) {

        if (a.equals("+") || a.equals("-") ||a.equals("*") ||a.equals("/"))  return false;
        else return true;

    }
    public static boolean check4 (int a, int b) {

        if (a % 1 == 0 && b % 1 == 0) return false;
        else return true;

    }

    public static void main(String[] args) throws Exception {

    }

}
