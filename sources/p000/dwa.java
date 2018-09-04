package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;

/* compiled from: PG */
/* renamed from: dwa */
public final class dwa implements kwk {
    /* renamed from: a */
    private final kwk f14641a;
    /* renamed from: b */
    private final kwk f14642b;
    /* renamed from: c */
    private final kwk f14643c;

    private dwa(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f14641a = kwk;
        this.f14642b = kwk2;
        this.f14643c = kwk3;
    }

    /* renamed from: a */
    public static dwa m9484a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new dwa(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f14641a;
        kwk kwk2 = this.f14642b;
        kpk kpk = (kpk) kwk.mo345a();
        iqp iqp = (iqp) kwk2.mo345a();
        this.f14643c.mo345a();
        if (iqp.m4046a() <= 0) {
            String a2 = bli.m862a("ViewfinderModule");
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
            stringBuilder.append("Preview size is invalid (");
            stringBuilder.append(valueOf);
            stringBuilder.append("). using non-deferred config.");
            bli.m873e(a2, stringBuilder.toString());
            a = ivs.m4261a(kpk);
        } else {
            boolean z;
            Class cls = SurfaceTexture.class;
            if (iqp.m4046a() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13144a(z, (Object) "Cannot create a deferred configuration if the size is null.");
            OutputConfiguration a3 = hsx.m3352a(ion.m3939a(iqp), cls);
            if (a3 != null) {
                Object iws = new iws(a3);
                a = new ivs(kow.m13617a(iws), kny.m18045a(kpk, new ivt(iws), kpq.f8410a));
            } else {
                a = ivs.m4261a(kpk);
            }
        }
        return (ivs) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
