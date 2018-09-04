package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cfb */
public final class cfb implements ijk {
    /* renamed from: a */
    private final kwk f11791a;
    /* renamed from: b */
    private final kwk f11792b;
    /* renamed from: c */
    private final kwk f11793c;
    /* renamed from: d */
    private final kwk f11794d;
    /* renamed from: e */
    private final Executor f11795e;
    /* renamed from: f */
    private final AtomicBoolean f11796f = new AtomicBoolean(false);
    /* renamed from: g */
    private final iks f11797g;
    /* renamed from: h */
    private final ird f11798h;
    /* renamed from: i */
    private final iqz f11799i;
    /* renamed from: j */
    private final gvt f11800j;
    /* renamed from: k */
    private kpk f11801k;

    cfb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, Executor executor, ira ira, iks iks, ird ird, gvt gvt) {
        this.f11791a = kwk;
        this.f11792b = kwk2;
        this.f11793c = kwk3;
        this.f11795e = executor;
        this.f11797g = iks;
        this.f11798h = ird;
        this.f11800j = gvt;
        this.f11794d = kwk4;
        this.f11799i = ira.mo511a("ActivityUiStartup");
    }

    /* renamed from: a */
    public final kpk mo385a() {
        if (this.f11796f.getAndSet(true)) {
            return this.f11801k;
        }
        this.f11798h.mo1903a("ActivityUiStartup");
        bax a = bax.m780a(this.f11795e);
        a.f1054d = this.f11797g;
        a.f1052b = this.f11798h;
        a.f1053c = this.f11799i;
        this.f11801k = a.m781a(this.f11791a, "ActivityStartup").m781a(this.f11792b, "ModeUiStartup").m781a(this.f11793c, "CameraActivityController").m783b(this.f11794d, "PostUiBehaviors").m782a();
        this.f11798h.mo1902a();
        this.f11798h.mo1904b();
        this.f11800j.mo1657a();
        return this.f11801k;
    }
}
