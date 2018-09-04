package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* renamed from: re */
final class re extends ra {
    /* renamed from: b */
    public final SeekBar f19555b;
    /* renamed from: c */
    public Drawable f19556c;
    /* renamed from: d */
    private ColorStateList f19557d = null;
    /* renamed from: e */
    private Mode f19558e = null;
    /* renamed from: f */
    private boolean f19559f = false;
    /* renamed from: g */
    private boolean f19560g = false;

    re(SeekBar seekBar) {
        super(seekBar);
        this.f19555b = seekBar;
    }

    /* renamed from: a */
    private final void m14331a() {
        Drawable drawable = this.f19556c;
        if (drawable == null) {
            return;
        }
        if (this.f19559f || this.f19560g) {
            this.f19556c = drawable.mutate();
            if (this.f19559f) {
                this.f19556c.setTintList(this.f19557d);
            }
            if (this.f19560g) {
                this.f19556c.setTintMode(this.f19558e);
            }
            if (this.f19556c.isStateful()) {
                this.f19556c.setState(this.f19555b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    final void mo2451a(AttributeSet attributeSet, int i) {
        super.mo2451a(attributeSet, i);
        vk a = vk.m6047a(this.f19555b.getContext(), attributeSet, ni.f8886N, i, 0);
        Drawable c = a.m6054c(ni.f8887O);
        if (c != null) {
            this.f19555b.setThumb(c);
        }
        c = a.m6052b(ni.f8888P);
        Drawable drawable = this.f19556c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f19556c = c;
        if (c != null) {
            c.setCallback(this.f19555b);
            c.setLayoutDirection(jm.m4576j(this.f19555b));
            if (c.isStateful()) {
                c.setState(this.f19555b.getDrawableState());
            }
            m14331a();
        }
        this.f19555b.invalidate();
        if (a.m6060f(ni.f8890R)) {
            this.f19558e = sg.m5804a(a.m6055d(ni.f8890R, -1), this.f19558e);
            this.f19560g = true;
        }
        if (a.m6060f(ni.f8889Q)) {
            this.f19557d = a.m6049a(ni.f8889Q);
            this.f19559f = true;
        }
        a.f9419b.recycle();
        m14331a();
    }
}
