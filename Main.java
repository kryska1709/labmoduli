import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = 12;
        System.out.println("Введите целые положительные элементы массива");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            array[i] = scan.nextInt();
        }
    }
}