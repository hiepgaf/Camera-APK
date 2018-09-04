package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: him */
public class him extends ImageButton {
    public hil smoothRotator;

    public him(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public him(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.smoothRotator = new hil(this);
        this.smoothRotator.m3179a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.smoothRotator.m3180b();
    }
}
