package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: qw */
public final class qw {
    /* renamed from: a */
    private final ImageView f9089a;

    public qw(ImageView imageView) {
        this.f9089a = imageView;
    }

    /* renamed from: a */
    final void m5742a() {
        Drawable drawable = this.f9089a.getDrawable();
        if (drawable != null) {
            sg.m5805a();
        }
        if (drawable == null) {
        }
    }

    /* renamed from: b */
    final boolean m5745b() {
        if (this.f9089a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m5744a(AttributeSet attributeSet, int i) {
        vk a = vk.m6047a(this.f9089a.getContext(), attributeSet, ni.f8885M, i, 0);
        try {
            Drawable drawable = this.f9089a.getDrawable();
            if (drawable == null) {
                int g = a.m6061g(1, -1);
                if (g != -1) {
                    drawable = nj.m5620b(this.f9089a.getContext(), g);
                    if (drawable != null) {
                        this.f9089a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                sg.m5805a();
            }
            if (a.m6060f(2)) {
                this.f9089a.setImageTintList(a.m6049a(2));
            }
            if (a.m6060f(3)) {
                this.f9089a.setImageTintMode(sg.m5804a(a.m6055d(3, -1), null));
            }
            a.f9419b.recycle();
        } catch (Throwable th) {
            a.f9419b.recycle();
        }
    }

    /* renamed from: a */
    public final void m5743a(int i) {
        if (i != 0) {
            Drawable b = nj.m5620b(this.f9089a.getContext(), i);
            if (b != null) {
                sg.m5805a();
            }
            this.f9089a.setImageDrawable(b);
        } else {
            this.f9089a.setImageDrawable(null);
        }
        m5742a();
    }
}
