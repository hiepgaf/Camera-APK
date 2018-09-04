package p000;

import android.view.KeyEvent;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hny */
public final class hny implements emp, emq, eol {
    /* renamed from: a */
    public int f17952a;
    /* renamed from: b */
    private final gpf f17953b;
    /* renamed from: c */
    private Set f17954c = khb.m4903e();
    /* renamed from: d */
    private boolean f17955d;

    public hny(gpf gpf) {
        this.f17953b = gpf;
    }

    /* renamed from: a */
    public final void m11922a(hnz hnz) {
        this.f17954c.add(hnz);
    }

    /* renamed from: a */
    private final boolean m11920a(int i, boolean z) {
        switch (((gpe) this.f17953b.mo2860b()).ordinal()) {
            case 0:
                for (hnz a : this.f17954c) {
                    a.mo1115a(z);
                }
                return true;
            case 1:
                if (i == 25) {
                    for (hnz a2 : this.f17954c) {
                        a2.mo1117c(z);
                    }
                } else {
                    for (hnz a22 : this.f17954c) {
                        a22.mo1116b(z);
                    }
                }
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final boolean mo1748a(int i, KeyEvent keyEvent) {
        if ((i != 24 && i != 25) || this.f17952a == go.bI) {
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            this.f17955d = false;
        }
        if (this.f17952a == go.bH || this.f17955d) {
            return true;
        }
        return m11920a(i, true);
    }

    /* renamed from: b */
    public final boolean mo1749b(int i, KeyEvent keyEvent) {
        if ((i != 24 && i != 25) || this.f17952a == go.bI) {
            return false;
        }
        if (this.f17952a == go.bH || this.f17955d) {
            return true;
        }
        return m11920a(i, false);
    }

    /* renamed from: b */
    public final void m11924b(hnz hnz) {
        this.f17954c.remove(hnz);
    }

    /* renamed from: a */
    public final void m11921a(int i) {
        int i2;
        this.f17952a = i;
        boolean z = this.f17955d;
        if (i == go.bH) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.f17955d = i2 | z;
    }
}
