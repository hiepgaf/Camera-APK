package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: ql */
final class ql {
    /* renamed from: a */
    public vi f9050a;
    /* renamed from: b */
    private final View f9051b;
    /* renamed from: c */
    private final qq f9052c;
    /* renamed from: d */
    private int f9053d = -1;
    /* renamed from: e */
    private vi f9054e;
    /* renamed from: f */
    private vi f9055f;

    ql(View view) {
        this.f9051b = view;
        this.f9052c = qq.m5725a();
    }

    /* renamed from: a */
    final void m5713a() {
        boolean z = false;
        Drawable background = this.f9051b.getBackground();
        if (background != null) {
            if (this.f9054e != null) {
                if (this.f9055f == null) {
                    this.f9055f = new vi();
                }
                vi viVar = this.f9055f;
                viVar.f9414a = null;
                viVar.f9417d = false;
                viVar.f9415b = null;
                viVar.f9416c = false;
                ColorStateList b = jm.m4563b(this.f9051b);
                if (b != null) {
                    viVar.f9417d = true;
                    viVar.f9414a = b;
                }
                Mode c = jm.m4567c(this.f9051b);
                if (c != null) {
                    viVar.f9416c = true;
                    viVar.f9415b = c;
                }
                if (viVar.f9417d || viVar.f9416c) {
                    qq.m5727a(background, viVar, this.f9051b.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            vi viVar2 = this.f9050a;
            if (viVar2 != null) {
                qq.m5727a(background, viVar2, this.f9051b.getDrawableState());
                return;
            }
            viVar2 = this.f9054e;
            if (viVar2 != null) {
                qq.m5727a(background, viVar2, this.f9051b.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    final void m5715a(AttributeSet attributeSet, int i) {
        vk a = vk.m6047a(this.f9051b.getContext(), attributeSet, ni.cE, i, 0);
        try {
            if (a.m6060f(0)) {
                this.f9053d = a.m6061g(0, -1);
                ColorStateList a2 = this.f9052c.m5731a(this.f9051b.getContext(), this.f9053d);
                if (a2 != null) {
                    m5712a(a2);
                }
            }
            if (a.m6060f(1)) {
                jm.m4552a(this.f9051b, a.m6049a(1));
            }
            if (a.m6060f(2)) {
                jm.m4553a(this.f9051b, sg.m5804a(a.m6055d(2, -1), null));
            }
            a.f9419b.recycle();
        } catch (Throwable th) {
            a.f9419b.recycle();
        }
    }

    /* renamed from: b */
    final void m5716b() {
        this.f9053d = -1;
        m5712a(null);
        m5713a();
    }

    /* renamed from: a */
    final void m5714a(int i) {
        ColorStateList a;
        this.f9053d = i;
        qq qqVar = this.f9052c;
        if (qqVar != null) {
            a = qqVar.m5731a(this.f9051b.getContext(), i);
        } else {
            a = null;
        }
        m5712a(a);
        m5713a();
    }

    /* renamed from: a */
    private final void m5712a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9054e == null) {
                this.f9054e = new vi();
            }
            vi viVar = this.f9054e;
            viVar.f9414a = colorStateList;
            viVar.f9417d = true;
        } else {
            this.f9054e = null;
        }
        m5713a();
    }
}
