package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gug */
public final class gug implements guf {
    /* renamed from: a */
    public static final String f17355a = bli.m862a("StorageSpaceCheck");
    /* renamed from: b */
    public final long f17356b = 10485760;
    /* renamed from: c */
    public final long f17357c = 52428800;
    /* renamed from: d */
    public final gsx f17358d;
    /* renamed from: e */
    public final gub f17359e;
    /* renamed from: f */
    private final Executor f17360f;

    public gug(gsx gsx, Executor executor, gub gub) {
        this.f17358d = gsx;
        this.f17360f = executor;
        this.f17359e = gub;
    }

    /* renamed from: a */
    public final kpk mo1650a(boolean z) {
        kpk d = kpw.m18056d();
        this.f17360f.execute(new guh(this, d, z));
        return d;
    }
}
