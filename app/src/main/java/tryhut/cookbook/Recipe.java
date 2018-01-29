package tryhut.cookbook;

/**
 * Created by tryhu on 2018-01-29.
 */

public class Recipe {


    private String name;
    private String ingredients;
    private String description;
    private String calories;

    public static final Recipe[] recipes = {
            new Recipe("GULASZOLECZO", "Oliwa z oliwek - 10 g (1 x Łyżka), \nKukurydza (konserwowa) - 75 g (5 x Łyżka) \nKoncentrat pomidorowy (30%) - 25 g (1 x Łyżka) \nPapryka czerwona (świeża) - 70 g (0.5 x Sztuka) \nPieczarki - 200 g (10 x Sztuka) \nCzosnek - 30 g (6 x Ząbek) \nCebula - 100 g (1 x Sztuka) \nMarchew - 90 g (2 x Sztuka) \nPomidory krojone w soku pomidorowym - 200 g (0.51 x Opakowanie) \nPolędwica wieprzowa (surowa) - 200 g (2 x Porcja)"
                    ,"Wymieszaj składniki bla bla bla"
                    , "672.1 kcal")

    };

    private Recipe(String name, String ingredients, String description, String calories){
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", description='" + description + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }
}
