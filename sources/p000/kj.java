package p000;

import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: kj */
public final class kj {
    /* renamed from: a */
    private final Object f8326a;

    private kj(Object obj) {
        this.f8326a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kj kjVar = (kj) obj;
        Object obj2 = this.f8326a;
        if (obj2 != null) {
            return obj2.equals(kjVar.f8326a);
        }
        if (kjVar.f8326a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int m4976a() {
        return ((WindowInsets) this.f8326a).getSystemWindowInsetBottom();
    }

    /* renamed from: b */
    public final int m4978b() {
        return ((WindowInsets) this.f8326a).getSystemWindowInsetLeft();
    }

    /* renamed from: c */
    public final int m4979c() {
        return ((WindowInsets) this.f8326a).getSystemWindowInsetRight();
    }

    /* renamed from: d */
    public final int m4980d() {
        return ((WindowInsets) this.f8326a).getSystemWindowInsetTop();
    }

    public final int hashCode() {
        Object obj = this.f8326a;
        return obj != null ? obj.hashCode() : 0;
    }

    /* renamed from: e */
    public final boolean m4981e() {
        return ((WindowInsets) this.f8326a).isConsumed();
    }

    /* renamed from: a */
    public final kj m4977a(int i, int i2, int i3, int i4) {
        return new kj(((WindowInsets) this.f8326a).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    /* renamed from: a */
    static Object m4974a(kj kjVar) {
        return kjVar != null ? kjVar.f8326a : null;
    }

    /* renamed from: a */
    static kj m4975a(Object obj) {
        return obj != null ? new kj(obj) : null;
    }
}
