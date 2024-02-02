import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("введите х ,чтобы оно было больше 0.5");
        double x= scan.nextDouble();
        double sum=0;
        if (x > 0.5) {
            for (int n = 0; n < 9; n++) {
                double chislitel = Math.pow((x - 1), (n + 1));
                double znamenatel = (n + 1) * (Math.pow((x + 1), (n + 1)));
                double drobb = chislitel / znamenatel;
                sum += drobb;
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("некорректное число,введите число удовлетворяющее условию");
        }
    }
}