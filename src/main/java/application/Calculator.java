package application;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean Stop = false;
            boolean Add = false;
            boolean Sub = false;
            boolean Mult = false;
            boolean Div = false;
            double a = 0;
            System.out.println("INFO:\nType 'Stop' anytime to end the calculator.\nRemember to only type in one number or symbol. Not both or any letter.\nEND OF INFO");
            String b;
            System.out.println(a);
        try {
            while (!Stop) {
                b = scan.nextLine();
                if (a != 0) {
                    if (b.equals("+")) {
                        System.out.println(a + " +");
                        Add = true;
                    }
                    if (b.equals("-")) {
                        System.out.println(a + " -");
                        Sub = true;
                    }
                    if (b.equals("*")) {
                        System.out.println(a + " *");
                        Mult = true;
                    }
                    if (b.equals("/")) {
                        System.out.println(a + " /");
                        Div = true;
                    }
                }
                if (!b.equals("+") && !b.equals("-") && !b.equals("*") && !b.equals("/") && !b.equals("Stop") && !b.equals("stop")) {
                    if (Add) {
                        a = a + Double.parseDouble(b);
                        System.out.println(a);
                        Add = false;
                    } else if (Sub) {
                        a = a - Double.parseDouble(b);
                        System.out.println(a);
                        Sub = false;
                    } else if (Mult) {
                        a = a * Double.parseDouble(b);
                        System.out.println(a);
                        Mult = false;
                    } else if (Div) {
                        a = a / Double.parseDouble(b);
                        System.out.println(a);
                        Div = false;
                    } else if (a == 0) {
                        a = Double.parseDouble(b);
                        System.out.println(a);
                    }
                }
                if (b.equals("Stop") || b.equals("stop")) {
                    Stop = true;
                }
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}