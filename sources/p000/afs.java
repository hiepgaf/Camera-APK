package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: afs */
public final class afs implements agb, agf, ahx {
    /* renamed from: a */
    public static final boolean f9700a = Log.isLoggable("Engine", 2);
    /* renamed from: b */
    public final agj f9701b;
    /* renamed from: c */
    public final ahw f9702c;
    /* renamed from: d */
    public final afv f9703d;
    /* renamed from: e */
    public final aft f9704e;
    /* renamed from: f */
    public final aet f9705f;
    /* renamed from: g */
    private final agq f9706g;
    /* renamed from: h */
    private final afg f9707h;

    private afs(ahw ahw, ahn ahn, aie aie, aie aie2, aie aie3, aie aie4, boolean z) {
        this.f9702c = ahw;
        this.f9707h = new afg(ahn);
        aet aet = new aet(false);
        this.f9705f = aet;
        aet.f357c = this;
        agd agd = new agd();
        this.f9701b = new agj();
        this.f9703d = new afv(aie, aie2, aie3, aie4, this);
        this.f9704e = new aft(this.f9707h);
        this.f9706g = new agq();
        ahw.mo85a((ahx) this);
    }

    public afs(ahw ahw, ahn ahn, aie aie, aie aie2, aie aie3, aie aie4) {
        this(ahw, ahn, aie, aie2, aie3, aie4, false);
    }

    /* renamed from: a */
    public static void m6383a(String str, long j, adl adl) {
        double a = arm.m629a(j);
        String valueOf = String.valueOf(adl);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(a);
        stringBuilder.append("ms, key: ");
        stringBuilder.append(valueOf);
        Log.v("Engine", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo48a(afy afy, adl adl) {
        arq.m653a();
        this.f9701b.m241a(adl, afy);
    }

    /* renamed from: a */
    public final void mo49a(afy afy, adl adl, age age) {
        arq.m653a();
        if (age != null) {
            age.m6400a(adl, this);
            if (age.f9743a) {
                this.f9705f.m196a(adl, age);
            }
        }
        this.f9701b.m241a(adl, afy);
    }

    /* renamed from: a */
    public final void mo47a(adl adl, age age) {
        arq.m653a();
        aex aex = (aex) this.f9705f.f356b.remove(adl);
        if (aex != null) {
            aex.m198a();
        }
        if (age.f9743a) {
            this.f9702c.mo83a(adl, age);
        } else {
            this.f9706g.m248a(age);
        }
    }

    /* renamed from: a */
    public final void mo50a(agn agn) {
        arq.m653a();
        this.f9706g.m248a(agn);
    }

    /* renamed from: b */
    public static void m6384b(agn agn) {
        arq.m653a();
        if (agn instanceof age) {
            ((age) agn).m6405f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
