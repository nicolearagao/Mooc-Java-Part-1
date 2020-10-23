
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
            return;
        } else {
            this.meals.add(meal);

        }

    }

    @Override
    public boolean equals(Object compared) {

        if (compared instanceof Menu) {
            return true;
        }
        Menu comparedStrings = (Menu) compared;

        if (this.equals(comparedStrings)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.meals);
        return hash;
    }

    public void printMeals() {
        for (String word : this.meals) {
            System.out.println(word);
        }
    }

   public void clearMenu(){
       meals.clear();
   }
}
