public class DogApp {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.bark();

        System.out.println("=============================");

        Dog d2=new Dog("Rockey");
        d2.eat();
        d2.sleep();
        d2.bark();
        System.out.println("=============================");

        Dog d3=new Dog("Goldy","GR");
        d3.eat();
        d3.sleep();
        d3.bark();
        System.out.println("=============================");

        Dog d4=new Dog("Whity","GR",10,"White");
        d4.eat();
        d4.sleep();
        d4.bark();
        System.out.println("=============================");

        Dog d6=new Dog();
        d6.eat();
        d6.sleep();
        d6.bark();
    }
}


