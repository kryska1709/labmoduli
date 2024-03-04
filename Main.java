//*Разработать класс для объекта Student с private полями ФИО(чтение и запись),
// дата поступления(запись), Адрес(чтение), Телефон(чтение и запись), Курс(запись),
// Факультет(чтение). Создать массив из трех объектов. Вывести: а) ФИО всех студентов
// б) список студентов заданного факультета; в) список студентов, поступивших после заданного года.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
    Student [] Stud = new Student[3];
        Stud[0]= new Student("Лапицкий Даниил Владимирович","16.08.2022","Вяземкка","89273487563",2,"программист");
        Stud[1]= new Student("Ермохин Дмитрий Евгенньевич","16.08.2021","Чаадаевка","89929387263",2,"программист");
        Stud[2]= new Student("Морозик","16.08.2020","Чаадаевка","89872836152",2,"электрик");
        System.out.println("ФИО всех студентов:");
        for (Student student : Stud) {
            System.out.println(student.getFio());
        }
        System.out.println("введите факультет,чтобы узнать кто на нем обучается");
        String facult= ok.next();
        for (Student student : Stud) {
        if(facult.equals(student.getFacultet())){
            System.out.println(student.getFio());
            }
        }
        System.out.println("введите дату поступления,чтобы узнать,кто поступил после этого числа");
        String datapost=ok.next();
        for (Student student : Stud) {
            if(datapost.compareTo(student.getDatapostup()) < 0){
                System.out.println(student.getFio());
            }
        }
    }
}
class Student{
    private String fio;
    private String datapostup;
    private String adres;
    private String phone;
    private int kyrs;
    private String facultet;
    public Student(String fio,String datapostup,String adres,String phone,int kyrs,String facultet){
        this.fio=fio;
        this.datapostup=datapostup;
        this.adres=adres;
        this.phone=phone;
        this.kyrs=kyrs;
        this.facultet=facultet;
    }
    public String getFio(){
        return fio;
    }
    public void setFio(String fio)
    {
        this.fio=fio;
    }
    public String getDatapostup(){
        return datapostup;
    }
    public void setAdres(String adres)
    {
        this.adres=adres;
    }
    public String getPhone(){

        return phone;
    }
    public void setPhone(String phone){

        this.phone=phone;
    }
    public void setKyrs(int kyrs){

        this.kyrs=kyrs;
    }

    public String getFacultet() {
        return facultet;
    }
}