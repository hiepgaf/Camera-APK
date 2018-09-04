package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: baz */
final class baz implements kov {
    /* renamed from: a */
    private final /* synthetic */ String f10637a;
    /* renamed from: b */
    private final /* synthetic */ kwk f10638b;
    /* renamed from: c */
    private final /* synthetic */ bax f10639c;

    baz(bax bax, String str, kwk kwk) {
        this.f10639c = bax;
        this.f10637a = str;
        this.f10638b = kwk;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ird ird = this.f10639c.f1052b;
            Set<gqd> set;
            if (ird != null) {
                ird.mo1903a(String.valueOf(this.f10637a).concat("#get-all"));
                set = (Set) this.f10638b.mo345a();
                this.f10639c.f1052b.mo1905b(String.valueOf(this.f10637a).concat("#start-all"));
                if (!(set == null || set.isEmpty())) {
                    for (gqd execute : set) {
                        this.f10639c.f1051a.execute(execute);
                    }
                }
                this.f10639c.f1052b.mo1904b();
                return;
            }
            set = (Set) this.f10638b.mo345a();
            if (set != null && !set.isEmpty()) {
                for (gqd execute2 : set) {
                    this.f10639c.f1051a.execute(execute2);
                }
            }
        }
    }
}
