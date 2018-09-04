package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* renamed from: aqt */
public abstract class aqt extends aql {
    /* renamed from: a */
    public final View f22601a;
    /* renamed from: b */
    private final aza f22602b;

    public aqt(View view) {
        this.f22601a = (View) aqe.m585a((Object) view, "Argument must not be null");
        this.f22602b = new aza(view);
    }

    /* renamed from: a */
    public final aqb mo2628a() {
        Object tag = this.f22601a.getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof aqb) {
            return (aqb) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    public final void mo3363a(aqr aqr) {
        aza aza = this.f22602b;
        int c = aza.m7195c();
        int b = aza.m7194b();
        if (aza.m7191a(c, b)) {
            aqr.mo320a(c, b);
            return;
        }
        if (!aza.f10557b.contains(aqr)) {
            aza.f10557b.add(aqr);
        }
        if (aza.f10558c == null) {
            ViewTreeObserver viewTreeObserver = aza.f10556a.getViewTreeObserver();
            aza.f10558c = new aqu(aza);
            viewTreeObserver.addOnPreDrawListener(aza.f10558c);
        }
    }

    /* renamed from: a */
    public void mo2629a(Drawable drawable) {
        super.mo2629a(drawable);
        this.f22602b.m7193a();
    }

    /* renamed from: b */
    public final void mo3367b(aqr aqr) {
        this.f22602b.f10557b.remove(aqr);
    }

    /* renamed from: a */
    public final void mo2630a(aqb aqb) {
        this.f22601a.setTag(aqb);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f22601a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("Target for: ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
