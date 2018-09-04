package p000;

/* compiled from: PG */
/* renamed from: etw */
public final class etw implements jgx {
    /* renamed from: a */
    private final jgx f15539a;

    public etw(jgx jgx) {
        this.f15539a = jgx;
    }

    /* renamed from: a */
    public final jhf mo1292a(jhe jhe) {
        Object obj = 1;
        jhf a = this.f15539a.mo1292a(jhe);
        String string = jhe.f7833b.getString("mime");
        if (!(string.startsWith("video/") || string.startsWith("audio/"))) {
            obj = null;
        }
        return obj != null ? jgn.m12825a(a) : a;
    }

    /* renamed from: a */
    public final void mo1293a() {
        this.f15539a.mo1293a();
    }

    /* renamed from: b */
    public final kpk mo1294b() {
        return this.f15539a.mo1294b();
    }
}
