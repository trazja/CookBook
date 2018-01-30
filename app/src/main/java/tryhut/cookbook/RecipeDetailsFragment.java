package tryhut.cookbook;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeDetailsFragment extends Fragment {


    private int recipeId;

    public RecipeDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe_details, container, false);
    }

    public void setRecipe(int id) {
        this.recipeId = id;
    }

    //pobieram główny widok fragmentu
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {

            Recipe recipe = Recipe.recipes[recipeId];

            TextView title = (TextView) view.findViewById(R.id.textTitle);

            title.setText(recipe.getName());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(recipe.getDescription());

            TextView ingridients = (TextView) view.findViewById(R.id.textIngridients);
            ingridients.setText(recipe.getIngredients());

            TextView calories = (TextView) view.findViewById(R.id.textCalories);
            calories.setText(recipe.getCalories());

        }

    }

}
