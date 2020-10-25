
public class Main {

    public static void main(String[] args) {
        // Test your class here

        Room r = new Room();
        System.out.println(r.isEmpty());
        Person person = new Person("ada", 168);
        r.add(person);
    }
}
