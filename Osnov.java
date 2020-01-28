import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Osnov {

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String qq = reader.readLine();
        String delimeter = " ";

        String[] subStr;
        subStr = qq.split(delimeter);
//разбили на массив subStr, пробел разделитель
        for(int i = 0; i < subStr.length; i++) {
           // System.out.println(subStr[i]);
//проверяем числа там или буквы
            if (checkString(subStr[0]) && checkString(subStr[2])){
                    //значит в обоих случаях это int
                   // System.out.println("значит в обоих случаях это int");






             //тут надо проверить 3 и 6
                 if (error.CheckErrors.check36(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2]))){
                     System.out.println("Исключение по п.3.6           не пдоходящие входные числа");
                     break;
                 }
             //тут надо проверить 7
                if (error.CheckErrors.check7(subStr[1])){
                    System.out.println("Исключение по п.7           калькулятор такого не умеет");
                    break;
                }
             //тут надо проверить 4
                // ---------------------------четне работает


                if (error.CheckErrors.check4(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2]))){
                    System.out.println("Исключение по п.4          целове число или нет");
                    break;
                }


                    if (subStr[1].equals("+")) {
                        System.out.println(calc.Calculation.plus(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2])));
                        } else {
                            if (subStr[1].equals("-")) {
                                System.out.println(calc.Calculation.minus(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2])));
                            } else {
                                if (subStr[1].equals("*")) {
                                    System.out.println(calc.Calculation.multiply(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2])));
                                } else if (subStr[1].equals("/")) {
                                    System.out.println(calc.Calculation.division(Integer.parseInt(subStr[0]), Integer.parseInt(subStr[2])));
                                }
                            }
                        }
            }
            else {
                if (!checkString(subStr[0]) && !checkString(subStr[2])) {
                //значит в обоих случаях string
                    //System.out.println("значит в обоих случаях string");

                    if (subStr[1].equals("+")) {
                        System.out.println( roman.RomaCalc.convert( calc.Calculation.plus(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]))));

                    } else {
                        if (subStr[1].equals("-")) {
                            //calc.Calculation.minus(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]));
                            System.out.println( roman.RomaCalc.convert( calc.Calculation.minus(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]))));
                        } else {
                            if (subStr[1].equals("*")) {
                                //calc.Calculation.multiply(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]));
                                System.out.println( roman.RomaCalc.convert( calc.Calculation.multiply(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]))));
                            } else if (subStr[1].equals("/")) {
                                //calc.Calculation.division(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]));
                                System.out.println(roman.RomaCalc.convert(calc.Calculation.division(arabic.AraCalc.AraRoma(subStr[0]),arabic.AraCalc.AraRoma(subStr[2]))));
                            }
                        }
                    }
                   // arabic.AraCalc.AraRoma(subStr[0]);
                }
                else {
                    System.out.println("исключение по п.5           одновременно пытаются и арабские и римские...");
                }
            }
        }





    }

}
