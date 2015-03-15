package smartmedi.org.smartmediapp;

import android.app.Activity;
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
    EditText mobile_number;

    @ViewById
    TextView move_to_next;


    @AfterViews
    public void init(){
        Typeface fonts=Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");
        move_to_next.setTypeface(fonts);

    }
}
