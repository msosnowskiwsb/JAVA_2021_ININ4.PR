package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal1 = new Animal("mouse","Jerry",0.8);
        Animal animal2 = new Animal("lion","Mufasa",123.5);

        Human human1 = new Human("Jan","Nowak","UX Designer");
        Human human2 = new Human("Janusz","Kowalski","Manual Tester");

        Phone phone1 = new Phone("Samsung","S10",8.5);
        Phone phone2 = new Phone("Nokia","5.1",7.0);

        System.out.println(animal1);
        System.out.println(animal1.name);
    }
}
