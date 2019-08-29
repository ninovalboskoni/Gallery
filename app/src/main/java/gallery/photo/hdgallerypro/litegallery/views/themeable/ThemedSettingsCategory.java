package gallery.photo.hdgallerypro.litegallery.views.themeable;

import android.content.Context;
import androidx.annotation.Nullable;
import android.util.AttributeSet;

import org.horaapps.liz.ThemeHelper;
import org.horaapps.liz.Themed;

/**
 * Created by darken (darken@darken.eu) on 04.03.2017.
 */
public class ThemedSettingsCategory extends androidx.appcompat.widget.AppCompatTextView implements Themed {

    public ThemedSettingsCategory(Context context) {
        this(context, null);
    }

    public ThemedSettingsCategory(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedSettingsCategory(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        themeHelper.setTextViewColor(this, themeHelper.getAccentColor());
    }
}