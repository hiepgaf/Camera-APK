package p000;

/* renamed from: hvr */
public abstract class hvr {
    /* renamed from: a */
    public Object f6740a;
    /* renamed from: b */
    public boolean f6741b = false;
    /* renamed from: c */
    private final /* synthetic */ hvm f6742c;

    public hvr(hvm hvm, Object obj) {
        this.f6742c = hvm;
        this.f6740a = obj;
    }

    /* renamed from: a */
    protected abstract void mo1779a();

    /* renamed from: a */
    protected abstract void mo1780a(Object obj);

    /* renamed from: c */
    public final void m3533c() {
        m3534d();
        synchronized (this.f6742c.f6723h) {
            this.f6742c.f6723h.remove(this);
        }
    }

    /* renamed from: d */
    public final void m3534d() {
        synchronized (this) {
            this.f6740a = null;
        }
    }
}
