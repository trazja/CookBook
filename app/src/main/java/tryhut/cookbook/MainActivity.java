package tryhut.cookbook;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements RecipesListFragment.RecipesListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        @Override
                public void itemClicked(int id){


}}
