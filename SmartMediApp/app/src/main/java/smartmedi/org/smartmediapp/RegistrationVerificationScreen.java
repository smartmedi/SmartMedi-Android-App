package smartmedi.org.smartmediapp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_registration_verification_screen)
public class RegistrationVerificationScreen extends Activity {


    @ViewById
    EditText pin;

    @ViewById
    TextView logo_title;

    @AfterViews
    public void init(){
        Typeface fonts=Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");

        pin.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        Typeface fontforlogo=Typeface.createFromAsset(getAssets(),"GrandHotel-Regular.ttf");
        logo_title.setTypeface(fontforlogo);
    }
}
