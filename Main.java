//*Определить класс Reader, хранящий информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон.
//В программе создается массив из пяти объектов данного класса. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".*//
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner ok = new Scanner(System.in);
    int kolvoknig;
    String [] nameKnig=new String[6];
    nameKnig[0]="приключения тома сойера";
    nameKnig[1]="все ради игры";
    nameKnig[2]="буратино";
    nameKnig[3]="сильнее страха";
    nameKnig[4]="незнайка";
    nameKnig[5]="изумрудный город";
    Reader [] reads= new Reader[5];
    reads[0]=new Reader("Иванов А.Б.",834792,"психология","17.09.2003","89263746215");
    reads[1]=new Reader("Лисов И.В.",892637,"Физика","11.12.2004","89253236135");
    reads[2]=new Reader("Кириллов А.И.",283716,"Экономика","13.01.2005","8926293215");
    reads[3]=new Reader("Росик Д.Д.",928374,"Математика","23.04.2002","89263020915");
    reads[4]=new Reader("Староверов Д.Л.",162734,"Медицинский","29.02.2004","8920900215");
    reads[0].takeBook(6);
    reads[1].takeBook(nameKnig[1], nameKnig[2], nameKnig[3]);
    reads[2].returnBook(5);
    reads[3].returnBook(nameKnig[0], nameKnig[1]);
    reads[4].takeBook(1);
    }
}
class Reader{
    private String Name;
    private int Nomerbil;
    private String Facultet;
    private String Daterozh;
    private String Phone;
    public Reader(String Name, int Nomerbil,String Facultet,String Daterozh,String Phone){
        this.Name=Name;
        this.Nomerbil=Nomerbil;
        this.Facultet=Facultet;
        this.Daterozh=Daterozh;
        this.Phone=Phone;
    }
    public void takeBook(int kolvoknig){
        System.out.println(this.Name+"взял "+kolvoknig+" книг");
    }
    public void takeBook(String... nameKnig){
        System.out.println(this.Name+"взял ");
        for (String knigi :nameKnig ) {
            System.out.print("\"" + knigi + "\""  + ", ");
        }
        System.out.println();
    }
    public void returnBook(int kolvoknig){
        System.out.println(this.Name+"вернул "+kolvoknig+" книг");
    }
    public void returnBook(String... nameKnig){
        System.out.println(this.Name+"вернул ");
            for (String knigi : nameKnig) {
                System.out.print("\"" + knigi + "\""  + ", ");
            }
        System.out.println();
        }
    }
//"\"" + nameKnig[0] + "\""  + ", " + "\"" + nameKnig[3] + "\""
//"\"" + nameKnig[1] + "\""  + ", " + "\"" + nameKnig[2] +  "\"" + ", " + "\""+ nameKnig[0] + "\"" + ", " + "\""+ nameKnig[4]+"\"" + ", " + "\""+nameKnig[5]+"\""