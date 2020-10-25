
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        Message oe = new Message("Nicole", "OI, tudo bem?");
        MessagingService fedex = new MessagingService();
        
       fedex.add(oe);
        
        System.out.println(fedex.getMessages());
    }
}
