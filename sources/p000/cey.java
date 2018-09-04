package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cey */
public final class cey implements ijk {
    /* renamed from: a */
    private final ikq f11769a;
    /* renamed from: b */
    private final kwk f11770b;
    /* renamed from: c */
    private final kwk f11771c;
    /* renamed from: d */
    private final kwk f11772d;
    /* renamed from: e */
    private final kwk f11773e;
    /* renamed from: f */
    private final kwk f11774f;
    /* renamed from: g */
    private final Executor f11775g;
    /* renamed from: h */
    private final AtomicBoolean f11776h = new AtomicBoolean(false);
    /* renamed from: i */
    private final iks f11777i;
    /* renamed from: j */
    private final ird f11778j;
    /* renamed from: k */
    private final iqz f11779k;
    /* renamed from: l */
    private kpk f11780l;

    cey(ikq ikq, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, Executor executor, ira ira, iks iks, ird ird) {
        this.f11769a = ikq;
        this.f11770b = kwk;
        this.f11771c = kwk2;
        this.f11772d = kwk3;
        this.f11774f = kwk5;
        this.f11773e = kwk4;
        this.f11775g = executor;
        this.f11777i = iks;
        this.f11778j = ird;
        this.f11779k = ira.mo511a("ActivityStartup");
    }

    /* renamed from: a */
    public final kpk mo385a() {
        if (this.f11776h.getAndSet(true)) {
            return this.f11780l;
        }
        this.f11778j.mo1903a("ActivityStartup");
        this.f11769a.m12263a();
        bax a = bax.m780a(this.f11775g);
        a.f1054d = this.f11777i;
        a.f1052b = this.f11778j;
        a.f1053c = this.f11779k;
        this.f11780l = a.m781a(this.f11771c, "PermissionsStartup").m781a(this.f11772d, "DcimFolderStart").m781a(this.f11770b, "WaitForCameraDevices").m783b(this.f11773e, "ActivityBehaviors").m781a(this.f11774f, "ModeStartup").m782a();
        this.f11778j.mo1904b();
        return this.f11780l;
    }
}
