package tryhut.cookbook;

/**
 * Created by tryhu on 2018-03-06.
 */

public class Breakfast {

    private String name;
    private int imageResourceId;

    public static final Breakfast[] breakfasts = {
            new Breakfast("Jajecznica z pieczarkami", R.drawable.eggs),
            new Breakfast("Tosty z łososiem", R.drawable.sandwiches),
            new Breakfast("Czekoladowa owsianka z bananem", R.drawable.oatmeal),
    };

    private Breakfast(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


}
