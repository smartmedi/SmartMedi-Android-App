package smartmedi.org.smartmediapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.lang.reflect.Type;

@EActivity(R.layout.activity_search_screen)
public class SearchScreen extends Activity {

    @ViewById
    TextView location_icon,medikit_icon,pharmacy_search,medicine_search,pharmacy_icon,medicine_icon;

    @ViewById
    Spinner location_selection;

    @ViewById
    ImageView pharmacy_selection;

    @ViewById
    RelativeLayout pharmacy_selected,medicine_selected;


    @AfterViews
    public void init() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        Typeface fontforlogo=Typeface.createFromAsset(getAssets(),"GrandHotel-Regular.ttf");
        location_icon.setTypeface(font);
        pharmacy_icon.setTypeface(font);
        medicine_icon.setTypeface(font);
        medikit_icon.setTypeface(font);
        pharmacy_search.setTypeface(fontforlogo);
        medicine_search.setTypeface(fontforlogo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cities, android.R.layout.simple_spinner_item);
        location_selection.setAdapter(adapter);
    }

    @Click(R.id.pharmacy_selected)
    public void selectPharmacy(){
        GradientDrawable shapeDrawable = (GradientDrawable)getResources().getDrawable(R.drawable.circle_button);
        shapeDrawable.setStroke(2,R.color.newBg);
        pharmacy_icon.setTextColor(getResources().getColor(R.color.newBg));

    }
}
