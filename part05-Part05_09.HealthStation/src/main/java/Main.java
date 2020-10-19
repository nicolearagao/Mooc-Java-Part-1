
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        
        Person jade = new Person("Jade", 1,110,7);
        HealthStation saoVicente = new HealthStation();
        
        saoVicente.weigh(jade);
        saoVicente.feed(jade);
        System.out.println(saoVicente.weigh(jade));
        saoVicente.weigh(jade);
        saoVicente.weigh(jade);
        
        System.out.println(saoVicente.weighings());
}
}
