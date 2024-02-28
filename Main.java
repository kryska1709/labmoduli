import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.println("введите число х");
        double x = ok.nextDouble();
        System.out.println("введите число a");
        double a = ok.nextDouble();
        System.out.println("введите число b");
        double b = ok.nextDouble();
            Calc calculate = new Calc();
            System.out.println("y=3x+5 , будет равен: " + calculate.summa(x));
            System.out.println("y=(a+b)/(a-b) , будет равен: " + calculate.del(a, b));
            System.out.println("y=(ax/b)! , будет равен: " + calculate.fact(x, a, b));
            Calc leo = new Calc();
            System.out.println("введите число х");
            x=ok.nextDouble();
            System.out.println("введите число a");
            a=ok.nextDouble();
            System.out.println("введите число b");
            b=ok.nextDouble();
            System.out.println("y=3x+5 , будет равен: " + leo.summa(x));
            System.out.println("y=(a+b)/(a-b) , будет равен: " + leo.del(a, b));
            System.out.println("y=(ax/b)! , будет равен: " + leo.fact(x, a, b));
            Calc rio = new Calc();
            System.out.println("введите число х");
            x=ok.nextDouble();
            System.out.println("введите число a");
            a=ok.nextDouble();
            System.out.println("введите число b");
            b=ok.nextDouble();
            System.out.println("введите число b");
            System.out.println("y=3x+5 , будет равен: " + rio.summa(x));
            System.out.println("y=(a+b)/(a-b) , будет равен: " + rio.del(a, b));
            System.out.println("y=(ax/b)! , будет равен: " + rio.fact(x, a, b));
        }
    }
    class Calc {
        public double summa(double x) {
            double result = 3 * x + 5;
            return result;
        }

        public double del(double a, double b) {
            if (b == a) {
                System.out.println("недопустимые значения, на ноль делить нельзя");
                return 0;
            } else {
                double result = (a + b) / (a - b);
                return result;

            }
        }

        public double fact(double a, double x, double b) {
            if (b == 0) {
                System.out.println("недопустимые значения,  на ноль делить нельзя");
                return 0;
            } else {
                double result = 1;
                for (int i = 1; i <= (a * x) / b; i++) {
                    result *= i;
                }
                return result;
            }
        }
    }



