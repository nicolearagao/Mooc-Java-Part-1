
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class UserInterface {
    
    private JokeManager jokes;
    private Scanner scan;
    
    public UserInterface(){
        this.jokes = new JokeManager();
        this.scan = new Scanner(System.in);
       
    }
    public UserInterface(JokeManager jokes, Scanner scan){
        this.jokes = jokes;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scan.nextLine();
            
            if(command.equals("X")){
                break;
            }
            
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                jokes.addJoke(joke);
                continue;
            }
            if(command.equals("2")){
                String randomJoke = jokes.drawJoke();
                System.out.println(randomJoke);
                continue;
            }
            
            if(command.equals("3")){
                System.out.println("Printing the jokes.");
                jokes.printJokes();
                continue;
            }
            
        }
    }
}
