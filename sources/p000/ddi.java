package p000;

/* compiled from: PG */
/* renamed from: ddi */
final class ddi implements dbw {
    /* renamed from: a */
    private final /* synthetic */ dcr f20941a;

    ddi(dcr dcr) {
        this.f20941a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dbi dbi = (dbi) obj;
        bug bug = this.f20941a;
        ((dbu) bug.m991d()).mo2913L().mo1445c();
        if (bug.f20929e) {
            bug.mo2954f();
        } else {
            int c = ((dbu) bug.m991d()).mo2920S().mo1541c("default_scope", "pref_camera_countdown_duration_key");
            dbn dbn = new dbn(dbi, c);
            if (c > 0) {
                bug.f20929e = true;
                ((dbu) bug.m991d()).mo2908G().execute(new ddg(bug, dbn, c));
            } else {
                bug.m15352a(dbn);
            }
        }
        return null;
    }
}
