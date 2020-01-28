package arabic;

public class AraCalc {



    public static int AraRoma ( String a){
        if (a.equals("I")) return 1;
        else {
            if (a.equals("II")) return 2;
            else {
                if (a.equals("III")) return 3;
                else {
                    if (a.equals("IV")) return 4;
                    else {
                        if (a.equals("V")) return 5;
                        else {
                            if (a.equals("VI")) return 6;
                            else {
                                if (a.equals("VII")) return 7;
                                else {
                                    if (a.equals("VIII")) return 8;
                                    else {
                                        if (a.equals("IX")) return 9;
                                        else {
                                            if (a.equals("X")) return 10;
                                            else {
                                                return 999;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {

    }


}
