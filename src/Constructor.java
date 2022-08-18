public class Constructor {
    public static void main(String[] args) {
        // constructor is a special method that is called when an object is instantiated (created)
    Human human1 = new Human("Ambus", 65, 70);
    Human human2 = new Human("Essoko", 1, 7);

    System.out.println(human1.name);
    System.out.println(human2.name);

    human2.eat();

    }
}
