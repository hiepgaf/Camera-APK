package p000;

/* compiled from: PG */
/* renamed from: brv */
final class brv {
    /* renamed from: a */
    public final iwc f1503a;

    brv(iwc iwc) {
        jri.m13152b((Object) iwc);
        this.f1503a = iwc;
    }

    /* renamed from: a */
    public final String m951a(bry bry) {
        jri.m13152b((Object) bry);
        String a = this.f1503a.m4274a(bry.f1504b);
        if (a != null) {
            return a;
        }
        iwc iwc = this.f1503a;
        String valueOf = String.valueOf("persist.");
        a = String.valueOf(bry.f1504b);
        return iwc.m4274a(a.length() == 0 ? new String(valueOf) : valueOf.concat(a));
    }
}
