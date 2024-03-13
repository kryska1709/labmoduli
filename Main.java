//*Создать интерфейс "Пользователь"с методами, работающие с логином и паролем.
// Создать абстрактный класс People, применяющий этот интерфейс, с полями "ФИО",
// "возраст", "должность". Создать два класса-наследника - "Преподаватель" и "Студент". Создать по два объекта данных классов.
interface Polzovatel{
    void login();
    void passvord();
}
abstract class People implements Polzovatel {
    public String fio;
    public int age;
    public String dolznost;
    public String pass;
    public String log;

    public abstract void login();

    public abstract void passvord();

    public People(String fio, int age, String dolznost, String pass, String log) {
        this.fio = fio;
        this.age = age;
        this.dolznost = dolznost;
        this.log = log;
        this.pass = pass;
    }
}
    class Teacher extends People{
    public Teacher(String fio,int age, String dolznost, String pass,String log){
        super(fio,age,dolznost,pass,log);
    }
        public void login(){
            System.out.println("Логин преподавателя: " + log );

        }
        public void passvord(){
            System.out.println("Пароль преподавателя: " + pass );

        }
    }
    class Student extends People{
        public Student(String fio,int age, String dolznost, String pass,String log){
            super(fio,age,dolznost,pass,log);
        }
        public void login(){
            System.out.println("Логин cудента: " + log );

        }
        public void passvord(){
            System.out.println("Пароль студента: " + pass );

        }
    }

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Матвиенко Сергей Васильевич", 10, "Студент", "serezamolodes", "7162534");
        student1.passvord();
        student1.login();
        Student student2 = new Student("Попов Арсений Сергеевич", 21, "Студент", "popopupop", "ponkping");
        student2.passvord();
        student2.login();
        Teacher teacher1 = new Teacher("Позов Дмитрий Тимурович", 32, "Преподаватель математики", "pozlalala", "lasral");
        teacher1.login();
        teacher1.passvord();
        Teacher teacher2 = new Teacher("Шастун Антон Евгеньевич", 27, "Преподаватель физики", "shast", "braslet");
        teacher2.login();
        teacher2.passvord();
    }
}