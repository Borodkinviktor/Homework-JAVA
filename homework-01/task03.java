import java.util.Scanner;
    //  Реализовать простой калькулятор

public class task03{
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число = ");
        double a = iScanner.nextDouble();

        System.out.print("Введите знак операции (*, /, -, +): ");
        String sym = iScanner.next();

        System.out.print("Bведите второе число = ");
        double b = iScanner.nextDouble();
        iScanner.close();


        switch (sym) {
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", a, b, a*b);
                break;
            case "/":
                if (b==0) System.out.println("На ноль делить нельзя!");
                else System.out.printf("%.2f / %.2f = %.2f", a, b, a/b);
                break;
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", a, b, a+b);
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", a, b, a-b);
                break;
        }
    }
}

