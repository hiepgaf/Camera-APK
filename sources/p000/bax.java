package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bax */
public final class bax {
    /* renamed from: a */
    public final Executor f1051a;
    /* renamed from: b */
    public ird f1052b;
    /* renamed from: c */
    public iqz f1053c;
    /* renamed from: d */
    public iks f1054d;
    /* renamed from: e */
    private final kpw f1055e = kpw.m18056d();
    /* renamed from: f */
    private kpk f1056f = this.f1055e;

    private bax(Executor executor) {
        this.f1051a = executor;
    }

    /* renamed from: a */
    public final kpk m782a() {
        boolean z = false;
        if (!(this.f1055e.isDone() || this.f1055e.isCancelled())) {
            z = true;
        }
        jri.m13153b(z);
        if (!(this.f1054d == null && this.f1053c == null)) {
            kow.m13622a(this.f1056f, new bba(this), kpq.f8410a);
        }
        this.f1055e.mo3557a(Boolean.valueOf(true));
        return this.f1056f;
    }

    /* renamed from: a */
    public final bax m781a(kwk kwk, String str) {
        iqz iqz = this.f1053c;
        if (iqz != null) {
            String valueOf = String.valueOf(str);
            String str2 = "Futures.transform: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            iqz.mo514b(valueOf);
        }
        this.f1056f = kny.m18046a(this.f1056f, new bay(this, str, kwk), this.f1051a);
        iqz iqz2 = this.f1053c;
        if (iqz2 != null) {
            bbz.m787a(iqz2, this.f1056f, String.valueOf(str).concat(" complete."), String.valueOf(str).concat(" failed!"));
        }
        return this;
    }

    /* renamed from: b */
    public final bax m783b(kwk kwk, String str) {
        kow.m13622a(this.f1056f, new baz(this, str, kwk), this.f1051a);
        return this;
    }

    /* renamed from: a */
    public static bax m780a(Executor executor) {
        return new bax(executor);
    }
}
