package p000;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxz */
public final class gxz {
    /* renamed from: a */
    public long f5784a;
    /* renamed from: b */
    public Resources f5785b;
    /* renamed from: c */
    public TextView f5786c;

    /* renamed from: a */
    public final void m2908a(boolean z) {
        if (z) {
            this.f5786c.animate().setDuration(200).alpha(0.0f).withEndAction(new gws(this));
            return;
        }
        this.f5786c.setAlpha(0.0f);
        this.f5786c.setVisibility(8);
    }

    /* renamed from: a */
    public final void m2905a() {
        this.f5786c.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
    }

    /* renamed from: b */
    public final void m2909b() {
        m2906a(0);
        m2905a();
        this.f5786c.animate().setDuration(200).alpha(1.0f).withStartAction(new gwr(this));
    }

    /* renamed from: a */
    public final void m2906a(long j) {
        this.f5784a = j;
        this.f5786c.setText(hkd.m3220a(this.f5784a));
    }

    /* renamed from: a */
    public final void m2907a(TextView textView) {
        hkd hkd = new hkd();
        this.f5785b = textView.getResources();
        this.f5786c = textView;
        this.f5786c.setCompoundDrawablePadding(this.f5785b.getDimensionPixelSize(R.dimen.indicator_padding));
    }
}
