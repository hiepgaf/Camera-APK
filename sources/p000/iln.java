package p000;

/* compiled from: PG */
/* renamed from: iln */
final class iln implements iqt {
    /* renamed from: a */
    public final /* synthetic */ ilm f18350a;
    /* renamed from: b */
    private final int f18351b;

    iln(ilm ilm, int i) {
        this.f18350a = ilm;
        this.f18351b = i;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        this.f18350a.f7081a.set(this.f18351b, obj);
        ilm ilm = this.f18350a;
        if (!ilm.f7082b) {
            boolean z;
            for (Object obj2 : ilm.f7081a) {
                if (obj2 == null) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                this.f18350a.f7082b = true;
            }
        }
        ilm = this.f18350a;
        if (ilm.f7082b) {
            this.f18350a.f7084d.execute(new ilo(this, ken.m13458a(ilm.f7081a)));
        }
    }
}
