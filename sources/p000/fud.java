package p000;

/* compiled from: PG */
/* renamed from: fud */
public final class fud implements iqo {
    /* renamed from: a */
    public final /* synthetic */ fub f16526a;
    /* renamed from: b */
    public final /* synthetic */ fuc f16527b;

    fud(fuc fuc, fub fub) {
        this.f16527b = fuc;
        this.f16526a = fub;
    }

    public final void close() {
        fuc fuc = this.f16527b;
        fub fub = this.f16526a;
        synchronized (fuc.f4726d) {
            for (Long remove : fub.f4718e) {
                fuc.f4727e.remove(remove);
            }
            fuc.f4725c.mo1424a(fub);
        }
    }
}
