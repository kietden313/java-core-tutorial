

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Kiet", 22,57);
        Human human2 = new Human("Ngoc", 24,62);


        System.out.println(human2.name);
        System.out.println(human1.name);
        human1.eat();
        human2.drink();
    }
}