package p000;

import android.graphics.SurfaceTexture;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cje */
public final class cje implements kwk {
    /* renamed from: a */
    private final kwk f12065a;
    /* renamed from: b */
    private final kwk f12066b;
    /* renamed from: c */
    private final kwk f12067c;
    /* renamed from: d */
    private final kwk f12068d;
    /* renamed from: e */
    private final kwk f12069e;
    /* renamed from: f */
    private final kwk f12070f;

    private cje(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f12065a = kwk;
        this.f12066b = kwk2;
        this.f12067c = kwk3;
        this.f12068d = kwk4;
        this.f12069e = kwk5;
        this.f12070f = kwk6;
    }

    /* renamed from: a */
    public static cje m8246a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new cje(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f12065a;
        kwk kwk2 = this.f12066b;
        kwk kwk3 = this.f12067c;
        kwk kwk4 = this.f12068d;
        kwk kwk5 = this.f12069e;
        kwk kwk6 = this.f12070f;
        chu chu = (chu) kwk.mo345a();
        ffc ffc = (ffc) kwk2.mo345a();
        bkw bkw = (bkw) kwk3.mo345a();
        kwk4.mo345a();
        bmb bmb = (bmb) kwk5.mo345a();
        fyy fyy = (fyy) kwk6.mo345a();
        if (bmb.m886d() || bmb.m885c() || bmb.m883a()) {
            obj = kgn.f22045a;
        } else {
            if (bkw.m856h()) {
                chu.mo691a(new SurfaceTexture(0), ffc.mo1920b(35), fyy);
                if (chu.mo688a() != null) {
                    obj = keu.m13472a(chu.mo688a());
                }
            }
            obj = Collections.emptySet();
        }
        return (Set) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
