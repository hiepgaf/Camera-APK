package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gbs */
public final class gbs extends TextView {
    /* renamed from: a */
    private final Typeface f5030a = Typeface.defaultFromStyle(0);
    /* renamed from: b */
    private final Typeface f5031b = Typeface.create("sans-serif-medium", 0);
    /* renamed from: c */
    private boolean f5032c;
    /* renamed from: d */
    private hil f5033d;
    /* renamed from: e */
    private int f5034e;

    public gbs(Context context, int i, int i2) {
        super(context, null, 0, R.style.detailed_expanded_option);
        CharSequence string = context.getResources().getString(i2);
        if (string != null) {
            setText(string);
        }
        if (i != 0) {
            Drawable drawable = getResources().getDrawable(i, null);
            this.f5034e = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setCompoundDrawablesRelative(null, drawable, null, null);
        }
    }

    public final boolean isSelected() {
        return this.f5032c;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5033d = new hil(this);
        this.f5033d.m3179a();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5033d.m3180b();
    }

    protected final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        if (getLineHeight() > 0 && size > 0) {
            setMaxLines((size - this.f5034e) / getLineHeight());
        }
        super.onMeasure(i, i2);
        size = ((MeasureSpec.getSize(i2) - ((getLineCount() * getLineHeight()) + this.f5034e)) / 2) - 5;
        setPadding(0, size, 0, size);
    }

    public final void setSelected(boolean z) {
        this.f5032c = z;
        if (z) {
            setAlpha(1.0f);
            setTypeface(this.f5031b);
            return;
        }
        setAlpha(0.5f);
        setTypeface(this.f5030a);
    }
}
