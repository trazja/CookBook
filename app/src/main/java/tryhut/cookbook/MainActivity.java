package tryhut.cookbook;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecipeDetailsFragment frag1 = (RecipeDetailsFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag1.setRecipe(1);

    }
}
