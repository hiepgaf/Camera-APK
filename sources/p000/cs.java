package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: cs */
public class cs extends ImageButton {
    /* renamed from: d */
    public int f2634d;

    public cs(Context context) {
        this(context, null);
    }

    public cs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2634d = getVisibility();
    }

    /* renamed from: a */
    public final void m1452a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f2634d = i;
        }
    }

    public void setVisibility(int i) {
        m1452a(i, true);
    }
}
