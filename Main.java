//*Создать три класса первый описывает человека. У него есть поля:
//Имя, Фамилия, год рождения
//Второй описывает автомобиль. У него есть поля:
//Марка, Год выпуска, Объем двигателя
//Третий описывает книгу. У него есть поля:
//Название, Автор, Год выпуска.
//В каждом классе создать конструктор и метод, который выводит значения всех полей.
//В одном классе создать метод, который принимает в качестве параметра два других объекта и выводит строку в формате:
//<Имя человека> читает книгу <Название книги> про машину <Название машины>
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner ok=new Scanner(System.in);
    Person Leo= new Person("Leo ","Keleds  ","19.03.2001");
    Avto leos=new Avto("Maserati ","2023",2992 );

    Kniga leono=new Kniga("руководство для чайников","lalala", "2016");

    Leo.displayinfo();
    leos.displayinfo1();
    leono.displayinfo2();
    Person.displayinfo3(Leo,leos,leono);
    }
}
class Person{
    String name;
    String familia;
    String godrozhd;
    public Person(String name,String familia,String godrozhd){
        this.name=name;
        this.familia=familia;
        this.godrozhd=godrozhd;
    }


    public void displayinfo(){
        System.out.println(name+" "+ familia+" родившийся "+ godrozhd);
    }
    public static void displayinfo3(Person person, Avto avto, Kniga kniga){
        System.out.println(person.name+ " читает книгу " + kniga.nazv+ " про машину "+ avto.marka);
    }
}
class Avto{
    String marka;
    String godvipuska;
    double obiomdvig;
    public Avto(String marka,String godvipuska,double obiomdvig){
        this.marka=marka;
        this.godvipuska=godvipuska;
        this.obiomdvig=obiomdvig;
    }
    public void displayinfo1(){
        System.out.println(marka+" "+ godvipuska+" года выпуска с объемом двигателя(cm³) "+ obiomdvig);
    }
}
class Kniga{
    String nazv;
    String avtor;
    String godvipuskaa;
    public Kniga(String nazv,String avtor,String godvipuskaa){
        this.nazv=nazv;
        this.avtor=avtor;
        this.godvipuskaa=godvipuskaa;
    }
    public void displayinfo2(){
        System.out.println("книга "+nazv+" написанная "+ avtor +" выпущенная в "+ godvipuskaa+" году");
    }
}