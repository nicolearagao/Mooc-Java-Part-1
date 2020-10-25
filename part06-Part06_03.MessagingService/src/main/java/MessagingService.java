
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class MessagingService {
    
    private ArrayList <Message> messageService;
    
    public MessagingService(){
    this.messageService = new ArrayList<>();
}
    
    public void add(Message message){
        if(message.getLength() <= 280){
    this.messageService.add(message);
}
    }
    
public ArrayList<Message> getMessages(){
        return messageService;
    }
}
