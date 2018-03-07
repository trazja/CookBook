package tryhut.cookbook;


import android.os.Bundle;
import android.app.Fragment;
import android.app.ListFragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class BreakfastFragment extends ListFragment {


    public BreakfastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        BreakfastAdapter adapter = new BreakfastAdapter(
                inflater.getContext(),
                R.layout.card_view_image,
                Breakfast.breakfasts);

        setListAdapter(adapter);

        View view = super.onCreateView(inflater, container, savedInstanceState);

        ButterKnife.bind(this, view);

        return view;
    }
}
