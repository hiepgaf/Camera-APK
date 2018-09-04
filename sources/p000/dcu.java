package p000;

/* compiled from: PG */
/* renamed from: dcu */
final class dcu implements dbw {
    /* renamed from: a */
    private final /* synthetic */ dcr f20938a;

    dcu(dcr dcr) {
        this.f20938a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dau dau = (dau) obj;
        switch (dau.f2915a) {
            case 27:
                dcr dcr = this.f20938a;
                if (!dcr.f20929e) {
                    if (dau.f2916b.getRepeatCount() == 0) {
                        bug bug = this.f20938a;
                        dbi dbi = new dbi(null, false);
                        ((dbu) bug.m991d()).mo2913L().mo1445c();
                        if (!bug.f20929e) {
                            int c = ((dbu) bug.m991d()).mo2920S().mo1541c("default_scope", "pref_camera_countdown_duration_key");
                            dbn dbn = new dbn(dbi, c);
                            if (c <= 0) {
                                bug.m15352a(dbn);
                                break;
                            }
                            bug.f20929e = true;
                            ((dbu) bug.m991d()).mo2908G().execute(new ddg(bug, dbn, c));
                            break;
                        }
                        bug.mo2954f();
                        break;
                    }
                }
                dcr.mo2954f();
                break;
                break;
        }
        return null;
    }
}
