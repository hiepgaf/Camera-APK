package p000;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: crt */
public final class crt {
    /* renamed from: a */
    public final ProgressBar f2602a;
    /* renamed from: b */
    public boolean f2603b = false;
    /* renamed from: c */
    private final Resources f2604c;
    /* renamed from: d */
    private final LinearLayout f2605d;
    /* renamed from: e */
    private final ImageView f2606e;
    /* renamed from: f */
    private final TextView f2607f;
    /* renamed from: g */
    private boolean f2608g = true;
    /* renamed from: h */
    private int f2609h = go.f5545I;
    /* renamed from: i */
    private int f2610i;
    /* renamed from: j */
    private CharSequence f2611j = new cru();

    public crt(ctw ctw, Resources resources) {
        this.f2604c = resources;
        this.f2605d = ctw.f2731c;
        this.f2606e = ctw.f2732d;
        this.f2607f = ctw.f2733e;
        this.f2602a = ctw.f2734f;
        this.f2602a.setMax(100);
    }

    /* renamed from: a */
    public final void m1441a(boolean z) {
        this.f2608g = z;
        m1438a();
    }

    /* renamed from: a */
    public final void m1440a(CharSequence charSequence) {
        this.f2611j = charSequence;
        m1438a();
    }

    /* renamed from: a */
    public final void m1438a() {
        if (this.f2608g) {
            this.f2605d.setVisibility(0);
            if (this.f2603b) {
                this.f2602a.setVisibility(0);
                this.f2606e.setVisibility(8);
                this.f2607f.setText(this.f2611j);
                return;
            }
            this.f2602a.setVisibility(8);
            this.f2606e.setVisibility(0);
            switch (this.f2609h - 1) {
                case 0:
                    this.f2605d.setVisibility(8);
                    return;
                case 1:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_photosphere_normal));
                    this.f2607f.setText(this.f2604c.getText(R.string.mode_photosphere));
                    return;
                case 2:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_panorama_normal));
                    this.f2607f.setText(this.f2604c.getText(R.string.mode_panorama));
                    return;
                case 3:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_refocus));
                    this.f2607f.setText(this.f2604c.getText(R.string.mode_refocus));
                    return;
                case 4:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_slow_motion_video));
                    this.f2607f.setText(this.f2604c.getText(R.string.mode_video_slomo));
                    return;
                case 5:
                    this.f2606e.setVisibility(8);
                    this.f2607f.setText(hci.m11748a(R.plurals.burst, this.f2610i, Integer.valueOf(this.f2610i)).mo1726a(this.f2604c));
                    return;
                case 6:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_auto_awesome_white_36dp));
                    this.f2607f.setText(this.f2604c.getText(R.string.animation));
                    return;
                case 7:
                    this.f2606e.setImageDrawable(this.f2604c.getDrawable(R.drawable.ic_auto_awesome_white_36dp));
                    this.f2607f.setText(this.f2604c.getText(R.string.collage));
                    return;
                default:
                    return;
            }
        }
        this.f2605d.setVisibility(8);
    }

    /* renamed from: a */
    public final void m1439a(err err) {
        if (err == null) {
            this.f2609h = go.f5545I;
            m1438a();
            return;
        }
        if (err.mo1037k().f4114b.f4129o) {
            this.f2609h = go.f5546J;
        } else if (err.mo1037k().f4114b.f4120f) {
            this.f2609h = go.f5547K;
        } else if (err.mo1037k().f4114b.f4123i) {
            this.f2609h = go.f5548L;
        } else if (err.mo1037k().f4114b.f4119e > 60) {
            this.f2609h = go.f5549M;
        } else if (err.mo1037k().f4114b.f4124j) {
            this.f2609h = go.f5550N;
            this.f2610i = err.mo1037k().f4114b.f4125k;
        } else if (err.mo1037k().f4114b.f4126l) {
            this.f2609h = go.f5551O;
        } else if (err.mo1037k().f4114b.f4127m) {
            this.f2609h = go.f5552P;
        } else {
            this.f2609h = go.f5545I;
        }
        m1438a();
    }
}
