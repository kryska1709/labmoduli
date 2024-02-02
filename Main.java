//Дан одномерный массив из 12 элементов. Отсортировать положительные элементы по возрастанию быстрой сортировкой
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = 5;
        System.out.println("Введите целые положительные элементы массива");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            array[i] = scan.nextInt();
        }
        int low = 0;// min
        int high = array.length - 1;
        quickSort(array, low, high);//вызов быстрой сортировки(метод)
        System.out.println(Arrays.toString(array));
    }

        public static void quickSort(int[] array, int low, int high) {
            if (array.length == 0)
                return;//завершить выполнение, если длина массива равна 0

            if (low >= high)
                return;//завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
        }
    }