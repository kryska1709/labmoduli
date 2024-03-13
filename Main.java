//*Создать класс Person с private полем возраст и public полями ФИО, Телефон.
// Создать класс-наследник Student с дополнительными public полями - Курс, Факультет и private полем дата поступления.
// Создать массив из трех объектов класса Student. Вывести: а) ФИО и возраст всех студентов
// б) список студентов заданного факультета; в) список студентов, поступивших после заданного года.
import java.util.Scanner;
class Person {
    private int age;
    public String fio;
    public String phone;

    Person(String fio, int age, String phone) {
        this.fio = fio;
        this.age = age;
        this.phone = phone;
    }

    public int getAge() {
        return this.age;
    }
}
class Student extends Person{
    public int kyrs;
    public String facult;
    private int datapostup;
    public int getDatapostup(){
        return datapostup;
    }
    Student(String fio,int age,String phone,int kyrs,String facult,int datapostup){
    super(fio,age,phone);
    this.kyrs=kyrs;
    this.facult=facult;
    this.datapostup=datapostup;
    }
}

public class Main {
    public static void main(String[] args) {
    Scanner ok=new Scanner(System.in);
    Student[] stud=new Student[3];
    stud[0]=new Student("Шастун Антон Михайлович",19,"89371872632",2,"грифиндор",2021);
    stud[1]=new Student("Попов Арсений Сергеевич",20,"89379582732",3,"слизерин",2020);
    stud[2]=new Student("Позов Дмитрий Тимурович",21,"89379482632",4,"пуфендуй",2019);
    for (Student st: stud){
    System.out.println("фио студента: "+st.fio);}
        for (Student st: stud) {
            System.out.println("возраст студента: "+st.getAge());}
    System.out.println("введите факультет, студентов которого  хотите узнать ");
        String facul = ok.next();

        for (Student stu : stud) {
            if (facul.equals(stu.facult)) {
                System.out.println(stu.fio);
            }
        }

        System.out.println("введите год");
        int god = ok.nextInt();

        for (Student stude : stud) {
            if (god<stude.getDatapostup()) {
                System.out.println(stude.fio);
            }
        }
    }
}