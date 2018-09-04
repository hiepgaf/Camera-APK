package p000;

/* compiled from: PG */
/* renamed from: bbm */
public final class bbm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bbi f1064a;
    /* renamed from: b */
    private final /* synthetic */ bcp f1065b;
    /* renamed from: c */
    private final /* synthetic */ kaw f1066c;

    public bbm(bbi bbi, bcp bcp, kaw kaw) {
        this.f1064a = bbi;
        this.f1065b = bcp;
        this.f1066c = kaw;
    }

    public final void run() {
        if (this.f1064a.mo2654a() != null) {
            this.f1065b.m14754a(this.f1064a.mo2654a());
            return;
        }
        iqo c = this.f1064a.mo2657c();
        if (c == null) {
            this.f1065b.close();
            return;
        }
        c = (iqo) this.f1066c.mo370a(c);
        jri.m13152b((Object) c);
        this.f1065b.m14753a(c);
    }
}
