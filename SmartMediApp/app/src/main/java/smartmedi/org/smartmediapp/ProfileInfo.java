package smartmedi.org.smartmediapp;

import android.app.Activity;

import android.graphics.Typeface;
import android.view.LayoutInflater;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_profile_info)
public class ProfileInfo extends Activity {



    @ViewById
    RelativeLayout profile_view;


    @AfterViews
    public  void init(){

    Typeface typeface = Typeface.createFromAsset(getAssets(),"fontello.ttf");


        /*example using inflator */
    LayoutInflater layoutInflater = getLayoutInflater();
    View view = layoutInflater.inflate(R.layout.header_profile_info, null);
    TextView image_upload= (TextView) view.findViewById(R.id.image_upload);
    image_upload.setTypeface(typeface);

    profile_view.addView(view);

}

}
