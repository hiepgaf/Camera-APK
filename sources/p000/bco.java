package p000;

/* compiled from: PG */
/* renamed from: bco */
public final class bco implements iqo {
    /* renamed from: a */
    public final iqo f10663a;
    /* renamed from: b */
    private final Object f10664b;
    /* renamed from: c */
    private int f10665c;
    /* renamed from: d */
    private boolean f10666d;

    public bco(iqo iqo) {
        this(iqo, (byte) 0);
    }

    private bco(iqo iqo, byte b) {
        jri.m13154b(true, (Object) "initialReferenceCount is not greater than 0.");
        this.f10664b = new Object();
        this.f10663a = iqo;
        this.f10665c = 1;
        this.f10666d = false;
    }

    public final void close() {
        synchronized (this.f10664b) {
            if (this.f10666d) {
                return;
            }
            this.f10665c--;
            if (this.f10665c > 0) {
                return;
            }
            this.f10666d = true;
            this.f10663a.close();
        }
    }
}
