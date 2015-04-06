package smartmedi.org.smartmediapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import smartmedi.org.smartmediapp.model.SearchModel;

@EActivity(R.layout.activity_search_screen)
public class SearchScreen extends Activity {

    @ViewById
    TextView location_icon,medikit_icon,pharmacy_search,medicine_search,pharmacy_icon,medicine_icon;

    @ViewById
    Spinner location_selection;

    @ViewById
    ImageView pharmacy_selection,search_selection;

    @ViewById
    RelativeLayout pharmacy_selected,medicine_selected;

    @ViewById
    EditText name;




    private Bundle savedValues=new Bundle();

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

        LayerDrawable shapeDrawable = (LayerDrawable) pharmacy_selection.getBackground();
        GradientDrawable gradientDrawable=(GradientDrawable) shapeDrawable.findDrawableByLayerId(R.id.shape_circle);
        gradientDrawable.setColor(getResources().getColor(R.color.newBg));
        pharmacy_icon.setTextColor(getResources().getColor(R.color.white));
    }

    @Click(R.id.pharmacy_selected)
    public void selectPharmacy(){
        LayerDrawable shapeDrawable = (LayerDrawable) pharmacy_selection.getBackground();
        GradientDrawable gradientDrawable=(GradientDrawable) shapeDrawable.findDrawableByLayerId(R.id.shape_circle);
        gradientDrawable.setColor(getResources().getColor(R.color.newBg));
        pharmacy_icon.setTextColor(getResources().getColor(R.color.white));

        LayerDrawable medicineshapeDrawable = (LayerDrawable) search_selection.getBackground();
        GradientDrawable medicinegradientDrawable=(GradientDrawable) medicineshapeDrawable.findDrawableByLayerId(R.id.shape_circle);
        medicinegradientDrawable.setColor(getResources().getColor(R.color.white));
        medicine_icon.setTextColor(getResources().getColor(R.color.newBg));

        savedValues.putString("selectedType","pharmacy");
    }

    @Click(R.id.search_selection)
    public void selectMedicine(){
        LayerDrawable shapeDrawable = (LayerDrawable) pharmacy_selection.getBackground();
        GradientDrawable gradientDrawable=(GradientDrawable) shapeDrawable.findDrawableByLayerId(R.id.shape_circle);
        gradientDrawable.setColor(getResources().getColor(R.color.white));
        pharmacy_icon.setTextColor(getResources().getColor(R.color.newBg));

        LayerDrawable medicineshapeDrawable = (LayerDrawable) search_selection.getBackground();
        GradientDrawable medicinegradientDrawable=(GradientDrawable) medicineshapeDrawable.findDrawableByLayerId(R.id.shape_circle);
        medicinegradientDrawable.setColor(getResources().getColor(R.color.newBg));
        medicine_icon.setTextColor(getResources().getColor(R.color.white));

        savedValues.putString("selectedType","medicine");
    }


    @Click(R.id.search)
    public void search(){
        String search_type=savedValues.getString("selectedType");
        String location=location_selection.getSelectedItem().toString();
        String search_type_name=name.getText().toString();
        SearchModel searchModel=new SearchModel();
        searchModel.saveData(search_type,location,search_type_name);
        searchModel.save();
    }
}

