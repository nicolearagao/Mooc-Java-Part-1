
import java.util.ArrayList;
import java.util.Random;
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
public class JokeManager {

    private ArrayList<String> listOfJokes;

    public JokeManager() {

        this.listOfJokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        listOfJokes.add(joke);
    }

    public String drawJoke() {

        if (!listOfJokes.isEmpty()) {
            Random draw = new Random();
            int index = draw.nextInt(listOfJokes.size());
            return listOfJokes.get(index);
        }

        return "Jokes are in short supply.";

    }

    public void printJokes() {
        for (String i : listOfJokes) {
            System.out.println(i);
        }
    }
}
