package smartmedi.org.smartmediapp;

import android.app.Activity;
import android.content.Intent;
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
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.io.IOException;
import java.lang.reflect.Type;

@EActivity(R.layout.activity_register_screen)
public class RegisterScreen extends Activity {

    @ViewById
    EditText mobile_number;

    @ViewById
    TextView  logo_title,registration_icon,move_to_next;

    @AfterViews
    public void init() {

        Typeface font=Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
        Typeface fontforlogo=Typeface.createFromAsset(getAssets(),"GrandHotel-Regular.ttf");
        /*move_to_next.setTypeface(font);*/
        registration_icon.setTypeface(font);
        move_to_next.setTypeface(font);
        mobile_number.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        logo_title.setTypeface(fontforlogo);
    }


    @Click(R.id.settings)
    public void verifyPin(){
        Intent intent=new Intent(this,RegistrationVerificationScreen_.class);
        startActivity(intent);
        finishActivity(200);
    }
}
