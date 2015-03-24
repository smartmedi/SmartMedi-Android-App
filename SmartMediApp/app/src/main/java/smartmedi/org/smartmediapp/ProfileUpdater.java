package smartmedi.org.smartmediapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_profile_updater)
public class ProfileUpdater extends Activity {

    @ViewById
    RelativeLayout profile_updater;

    @ViewById
    TextView userIcon ,calenderIcon ;


    @AfterViews
    public   void init(){
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.profile_image_screen, null);
        TextView image_upload= (TextView) view.findViewById(R.id.image_upload);
        image_upload.setTypeface(typeface);
        userIcon.setTypeface(typeface);
        calenderIcon.setTypeface(typeface);
        profile_updater.addView(view);
    }


}
