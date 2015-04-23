package smartmedi.org.smartmediapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by prashanth on 4/23/15.
 */
public class CustomFontAwesomeTextView extends TextView {

    public CustomFontAwesomeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomFontAwesomeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomFontAwesomeTextView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.IconTextView);
            String fontName = a.getString(R.styleable.IconTextView_fontAwesome);
            if (fontName!=null) {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(),fontName);
                setTypeface(myTypeface);
            }
            a.recycle();
        }
    }
}
