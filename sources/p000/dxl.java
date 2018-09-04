package p000;

/* compiled from: PG */
/* renamed from: dxl */
public final class dxl extends Thread {
    /* renamed from: a */
    private final /* synthetic */ aas f3338a;
    /* renamed from: b */
    private final /* synthetic */ aaf f3339b = null;
    /* renamed from: c */
    private final /* synthetic */ aaf f3340c;
    /* renamed from: d */
    private final /* synthetic */ dxj f3341d;

    public dxl(dxj dxj, aas aas, aaf aaf) {
        this.f3341d = dxj;
        this.f3338a = aas;
        this.f3340c = aaf;
    }

    public final void run() {
        synchronized (this.f3341d.f14695i) {
            dxj dxj = this.f3341d;
            dxj.f14690d = false;
            dxj.f14688b.mo2564b(null, null);
            dxj = this.f3341d;
            dxj.f14688b.mo2557a(dxj.f14694h, this.f3338a, null, this.f3340c);
        }
    }
}
