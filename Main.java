//*1. Создать массив объектов с полями: Фамилия и инициалы, Должность, Год поступления на работу, Зарплата.
// Вывести: а) список работников, зарплата которых больше заданной;
// б) список работников, занимающих заданную должность.*//
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner ok= new Scanner(System.in);
    System.out.println("введите искомую должность");
    String dolznost=ok.next();
    System.out.println("введите зпшечку)");
    double zppshka=ok.nextDouble();
    Raby [] rab= new Raby[5];
        rab[0]=new Raby("Уханов А.А", "начальник отдела", "19.02.2022", 40000);
        rab[1]=new Raby("Парвадов П.Ю", "директор", "11.09.2017", 80000);
        rab[2]=new Raby("Фетисов С.Г", "уборщик", "19.02.2022", 2000);
        rab[3]=new Raby("Лапицкий Д.В", "создатель феррари", "11.03.2001", 500000);
        rab[4]=new Raby("Дулатов И.И", "колодцекопатель", "27.02.2024", 6000);
        for(int i=0;i<rab.length;i++)
        {
            if (zppshka < rab[i].zpshka) {
                System.out.println("вор в законе с зарплатой больше "+zppshka+" "+rab[i].fio);
            }
            if (dolznost == rab[i].dolzhnost) {
                System.out.println("работники занимающие должность "+ dolznost+" "+rab[i].dolzhnost);
            }
        }
    }
}
class  Raby{
    String fio;
    String dolzhnost;
    String gotpostuprab;
    double zpshka;
    public Raby(String fio,String dolzhnost,String gotpostuprab,double zpshka){
        this.fio=fio;
        this.dolzhnost=dolzhnost;
        this.gotpostuprab=gotpostuprab;
        this.zpshka=zpshka;
    }
}