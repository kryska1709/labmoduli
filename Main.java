//Дан одномерный массив из 12 элементов. Отсортировать положительные элементы по возрастанию быстрой сортировкой
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = 12;
        System.out.println("Введите целые положительные элементы массива");
        int[] sortArr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            sortArr[i] = scan.nextInt();
        }
        combSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
    public static void combSort(int[] sortArr) {
       double factor=1.247;
       int step=sortArr.length-1;
       while(step>=1){
           for(int i=0;i+step<sortArr.length;++i) {
               if (sortArr[i] > sortArr[i + step]) {
                   swap(sortArr, i, i + step);
               }}
           step /= factor;
           }
        }
        public static void swap(int[] sortArr,int i,int j){
        int swap=sortArr[i];
        sortArr[i]=sortArr[j];
        sortArr[j]=swap;
        }
    }