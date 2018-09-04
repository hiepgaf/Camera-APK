package p000;

/* compiled from: PG */
/* renamed from: def */
final class def implements dbw {
    /* renamed from: a */
    private final /* synthetic */ ddu f20961a;

    def(ddu ddu) {
        this.f20961a = ddu;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dau dau = (dau) obj;
        switch (dau.f2915a) {
            case 23:
                if (dau.f2916b.getRepeatCount() == 0) {
                    dbx dbx = this.f20961a;
                    if (!dbx.f20952f.mo2084b()) {
                        dbx.f20953g = true;
                        break;
                    }
                    return new deh(dbx, (byte[]) dbx.f20952f.mo2081a());
                }
                break;
        }
        return null;
    }
}
