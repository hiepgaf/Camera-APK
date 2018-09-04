package p000;

/* compiled from: PG */
/* renamed from: dmi */
final class dmi implements dob {
    /* renamed from: a */
    public final /* synthetic */ dmf f21108a;

    dmi(dmf dmf) {
        this.f21108a = dmf;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dlo dlo = (dlo) obj;
        bfe bfe = dlo.f3127a;
        iwl iwl = dlo.f3128b;
        bug bug = this.f21108a;
        if (bug.f21100g) {
            bfe.close();
            return new dlx(this.f21108a);
        }
        ((doa) bug.m991d()).f13610c.execute(new dmj(this));
        doc doc = this.f21108a;
        return new dnt(doc, bfe, doc.f21098e, doc.f21097d, doc.f21099f, doc.f21101h, iwl);
    }
}
