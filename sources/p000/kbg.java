package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbg */
public abstract class kbg implements Serializable {
    public static final long serialVersionUID = 0;

    kbg() {
    }

    /* renamed from: a */
    public abstract Object mo2081a();

    /* renamed from: a */
    public abstract Object mo2082a(Object obj);

    /* renamed from: a */
    public abstract kbg mo2083a(kaw kaw);

    /* renamed from: b */
    public abstract boolean mo2084b();

    /* renamed from: c */
    public abstract Object mo2085c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* renamed from: b */
    public static kbg m4744b(Object obj) {
        if (obj != null) {
            return new kbm(obj);
        }
        return kau.f19138a;
    }

    /* renamed from: c */
    public static kbg m4745c(Object obj) {
        return new kbm(jri.m13152b(obj));
    }
}
