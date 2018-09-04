package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbo */
public final class kbo implements Serializable, kbn {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kbn f19149a;
    /* renamed from: b */
    private volatile transient boolean f19150b;
    /* renamed from: c */
    private transient Object f19151c;

    public kbo(kbn kbn) {
        this.f19149a = (kbn) jri.m13152b((Object) kbn);
    }

    /* renamed from: b */
    public final Object mo605b() {
        if (!this.f19150b) {
            synchronized (this) {
                if (!this.f19150b) {
                    Object b = this.f19149a.mo605b();
                    this.f19151c = b;
                    this.f19150b = true;
                    return b;
                }
            }
        }
        return this.f19151c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object stringBuilder2;
        if (this.f19150b) {
            valueOf = String.valueOf(this.f19151c);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = this.f19149a;
        }
        valueOf = String.valueOf(stringBuilder2);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
