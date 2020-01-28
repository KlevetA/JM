package roman;

public class RomaCalc {


    private static String MensheDesyati (int t) {
        String y = "";
        if (t == 1) {return "I";
        }
        else if (t == 2) {return "II";
        }
        else if (t ==3) {return "III";
        }
        else if (t == 4) {return "IV";
        }
        else if (t == 5) {return "V";
        }
        else if (t == 6) {return "VI";
        }
        else if (t == 7) {return "VII";
        }
        else if (t == 8) {return "VIII";
        }
        else if (t == 9) {return "IX";
        }
        else if (t == 10) {return "X";
        }
        else {return "qqqweqwewqeqweqw";
        }
    }

    public static String convert ( int a) {

    int temp = 0;

        if (a <= 10) {
          return  MensheDesyati(a);
        }
        else if (a < 20) {
            temp = a % 10;
            return  "X" + MensheDesyati(temp);
        }
        else if (a == 20) {
            return  "XX";
        }
        else if (a < 30) {
            temp = a % 10;
            return  "XX" + MensheDesyati(temp);
        }
        else if (a == 30) {
            return  "XXX";
        }
        else if (a < 40) {
            temp = a % 10;
            return  "XXX" + MensheDesyati(temp);
        }
        else if (a == 40) {
            return  "XL";
        }
        else if (a < 50) {
            temp = a % 10;
            return  "L" + MensheDesyati(temp);
        }
        else if (a == 60) {
            return  "LX";
        }
        else if (a < 60) {
            temp = a % 10;
            return  "LX" + MensheDesyati(temp);
        }
        else if (a == 70) {
            return  "LXX";
        }
        else if (a < 70) {
            temp = a % 10;
            return  "LXX" + MensheDesyati(temp);
        }
        else if (a == 80) {
            return  "LXXX";
        }
        else if (a < 80) {
            temp = a % 10;
            return  "LXXX" + MensheDesyati(temp);
        }
        else if (a == 90) {
            return  "XC";
        }
        else if (a < 90) {
            temp = a % 10;
            return  "XC" + MensheDesyati(temp);
        }
        else if (a == 100) {
            return  "C";
        }
        else return "Ошибка, либо <0 либо > 100";
    }

    public static void main(String[] args) throws Exception {

    }
}
