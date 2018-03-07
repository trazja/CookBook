package tryhut.cookbook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mohru on 07.03.2018.
 */

public class BreakfastAdapter extends ArrayAdapter<Breakfast> {

    private Breakfast[] breafasts;

    public BreakfastAdapter(@NonNull Context context, int resource, Breakfast[] items) {
        super(context, resource, items);
        breafasts = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(parent.getContext()).inflate( R.layout.card_view_image, null);

        ((TextView)convertView.findViewById(R.id.info_text)).setText(breafasts[position].getName());
        ((ImageView)convertView.findViewById(R.id.info_image)).setImageResource(breafasts[position].getImageResourceId());

        return convertView;
    }
}
