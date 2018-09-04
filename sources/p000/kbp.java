package p000;

/* compiled from: PG */
/* renamed from: kbp */
public final class kbp implements kbn {
    /* renamed from: a */
    private volatile kbn f19152a;
    /* renamed from: b */
    private volatile boolean f19153b;
    /* renamed from: c */
    private Object f19154c;

    public kbp(kbn kbn) {
        this.f19152a = (kbn) jri.m13152b((Object) kbn);
    }

    /* renamed from: b */
    public final Object mo605b() {
        if (!this.f19153b) {
            synchronized (this) {
                if (!this.f19153b) {
                    Object b = this.f19152a.mo605b();
                    this.f19154c = b;
                    this.f19153b = true;
                    this.f19152a = null;
                    return b;
                }
            }
        }
        return this.f19154c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object obj = this.f19152a;
        if (obj == null) {
            valueOf = String.valueOf(this.f19154c);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            obj = stringBuilder.toString();
        }
        valueOf = String.valueOf(obj);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
