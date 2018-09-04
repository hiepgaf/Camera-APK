package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: aqo */
public abstract class aqo extends aqt implements arb {
    /* renamed from: b */
    private Animatable f23450b;

    public aqo(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    protected abstract void mo3602a(Object obj);

    /* renamed from: e */
    public final Drawable mo3555e() {
        return ((ImageView) this.a).getDrawable();
    }

    /* renamed from: b */
    private final void m17836b(Object obj) {
        if (obj instanceof Animatable) {
            this.f23450b = (Animatable) obj;
            this.f23450b.start();
            return;
        }
        this.f23450b = null;
    }

    /* renamed from: a */
    public final void mo2629a(Drawable drawable) {
        super.mo2629a(drawable);
        Animatable animatable = this.f23450b;
        if (animatable != null) {
            animatable.stop();
        }
        m17837c(null);
        mo3554d(drawable);
    }

    /* renamed from: b */
    public final void mo2631b(Drawable drawable) {
        super.mo2631b(drawable);
        m17837c(null);
        mo3554d(drawable);
    }

    /* renamed from: c */
    public final void mo2632c(Drawable drawable) {
        super.mo2632c(drawable);
        m17837c(null);
        mo3554d(drawable);
    }

    /* renamed from: a */
    public final void mo3364a(Object obj, ara ara) {
        if (ara == null || !ara.mo339a(obj, this)) {
            m17837c(obj);
        } else {
            m17836b(obj);
        }
    }

    /* renamed from: c */
    public final void mo9c() {
        Animatable animatable = this.f23450b;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: d */
    public final void mo10d() {
        Animatable animatable = this.f23450b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: d */
    public final void mo3554d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    private final void m17837c(Object obj) {
        mo3602a(obj);
        m17836b(obj);
    }
}
