package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ash */
final class ash {
    /* renamed from: a */
    public final fhg f933a;
    /* renamed from: b */
    public final kpk f934b;
    /* renamed from: c */
    public final asg f935c;
    /* renamed from: d */
    public final kpw f936d = kpw.m18056d();
    /* renamed from: e */
    public final fdl f937e;
    /* renamed from: f */
    private final ffe f938f = new asj(this);

    static {
        bli.m862a("AeAfActiveScanner");
    }

    ash(fhg fhg, kpk kpk, asg asg, fdl fdl) {
        this.f933a = fhg;
        this.f934b = kpk;
        this.f935c = asg;
        this.f937e = fdl;
    }

    /* renamed from: a */
    public final kpk m680a() {
        return iel.m3718a(this.f936d, this.f937e.m2260a(), new asi());
    }

    /* renamed from: a */
    public final kpk m681a(fff fff) {
        fdl fdl = this.f937e;
        synchronized (fdl.f4484a) {
            knk knk = fdl.f4487d;
            fdl.f4487d = kpw.m18056d();
            fdl.f4485b = false;
        }
        if (knk != null) {
            knk.m17780a(new InterruptedException());
        }
        return fff.m2273a(this.f938f);
    }

    public final String toString() {
        return "AeAfActiveScanner";
    }
}
