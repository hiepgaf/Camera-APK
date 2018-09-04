package p000;

/* compiled from: PG */
/* renamed from: dec */
final class dec implements dbw {
    /* renamed from: a */
    public final /* synthetic */ ddu f20959a;

    dec(ddu ddu) {
        this.f20959a = ddu;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dba dba = (dba) obj;
        dbx dbx = this.f20959a;
        if (dbx.f20953g) {
            return new deh(dbx, dba.f2923a);
        }
        if ((dbx.f20952f.mo2084b() ^ 1) != 0) {
            ((dbu) this.f20959a.m991d()).mo2933i().post(new ded(this, dba.f2923a, dba.f2924b));
        }
        return null;
    }
}
