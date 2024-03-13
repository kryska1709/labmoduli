//*Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
// Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
// Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
// Dog, Cat, Horse переопределяют методы makeNoise, eat.
// Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
// Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного.

public class Main {
    public static void main(String[] args) {
    Dog bady=new Dog("косточку","на лежаке","проси");
    Cat rizik=new Cat("сметану","на диване","мышкой");
    Horse kometa= new Horse("морковь","в деннике","вальтрап, уздечка");
    bady.makeNoise();
    rizik.makeNoise();
    kometa.makeNoise();
    bady.eat();
    rizik.eat();
    kometa.eat();
    Veterinar vet=new Veterinar();
    vet.treatAnimal(bady);
    vet.treatAnimal(rizik);
    vet.treatAnimal(kometa);
    }
}
class Animal{
String food;
String location;
public Animal(String food,String location){
    this.food=food;
    this.location=location;
}
    public void makeNoise(){
    System.out.println("животное спит ");
    }
    public void eat(){
    System.out.println("животное ест "+food);
    }
    public void sleep(){
    System.out.println("животное спит "+location);
    }
}
class Dog extends Animal{
public String command;//команда
public Dog(String food,String location,String command){
    super(food, location);
    this.command=command;
    }

    @Override
    public void makeNoise() {
        System.out.println("собака выполняет команду "+command);
    }

    @Override
    public void eat() {
        System.out.println("собака ест "+food);
    }
}
class Cat extends Animal{
    public String plays;//игрушка
    public Cat(String food,String location,String plays){
        super(food, location);
        this.plays=plays;
    }

    @Override
    public void makeNoise() {
        System.out.println("кошка играет с "+plays);
    }

    @Override
    public void eat() {
        System.out.println("кошка ест "+food);
    }
}
class Horse extends Animal{
    public String amunice;//амуниция
    public Horse(String food,String location,String amunice){
        super(food, location);
        this.amunice=amunice;
    }

    @Override
    public void makeNoise() {
        System.out.println("на лошади сейчас "+amunice);
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест "+food);
    }
}
class Veterinar{
    public void treatAnimal(Animal animal){
        System.out.println("животное ело "+animal.food+", отдыхало "+ animal.location);
    }
}