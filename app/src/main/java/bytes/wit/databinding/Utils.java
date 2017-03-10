package bytes.wit.databinding;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Md. Sifat-Ul Haque on 3/8/2017.
 */

public class Utils {

    public static ArrayList<PlaceModel> getPlaceInfo(Context context){
        ArrayList<PlaceModel> placeModels = new ArrayList<>();

        placeModels.add(new PlaceModel(context.getString(R.string.place_name_1), context.getString(R.string.place_description_1), context.getString(R.string.place_url_1)));
        placeModels.add(new PlaceModel(context.getString(R.string.place_name_2), context.getString(R.string.place_description_2), context.getString(R.string.place_url_2)));
        placeModels.add(new PlaceModel(context.getString(R.string.place_name_3), context.getString(R.string.place_description_3), context.getString(R.string.place_url_3)));
        placeModels.add(new PlaceModel(context.getString(R.string.place_name_4), context.getString(R.string.place_description_4), context.getString(R.string.place_url_4)));
        placeModels.add(new PlaceModel(context.getString(R.string.place_name_5), context.getString(R.string.place_description_5), context.getString(R.string.place_url_5)));

        return placeModels;
    }

}
