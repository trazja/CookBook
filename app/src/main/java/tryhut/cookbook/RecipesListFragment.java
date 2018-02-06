package tryhut.cookbook;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class RecipesListFragment extends ListFragment {

    public interface RecipesListListener {
        void itemClicked(int id);
    }

    public RecipesListListener listener;

    public RecipesListFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Recipe.recipes.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Recipe.recipes[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override

    public void onAttach (Activity activity){
        super.onAttach(activity);
        this.listener = (RecipesListListener)activity;
    }


    public void onListItemClick(ListView l, View v, int position, int id){
        if (listener !=null) {
            listener.itemClicked(id);
        }
    }


}
