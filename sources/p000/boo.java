package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: boo */
public final class boo implements boi {
    /* renamed from: a */
    private final Context f11148a;
    /* renamed from: b */
    private final ilp f11149b;
    /* renamed from: c */
    private final ilp f11150c;
    /* renamed from: d */
    private final irs f11151d;
    /* renamed from: e */
    private final bmb f11152e;
    /* renamed from: f */
    private final iqz f11153f;

    static {
        keu.m13472a(hhx.PHOTO);
        keu.m13472a(hhx.SETTINGS);
    }

    public boo(Context context, ilp ilp, ilp ilp2, irs irs, ira ira, bmb bmb) {
        this.f11148a = context;
        this.f11149b = ilp;
        this.f11150c = ilp2;
        this.f11151d = irs;
        this.f11152e = bmb;
        this.f11153f = ira.mo511a("ElmyraGestureL");
        this.f11153f.mo518d("ElmyraGestureL created.");
    }

    /* renamed from: a */
    public final void mo557a() {
        this.f11151d.mo1567a(10);
        this.f11153f.mo518d("ElmyraEvent received: Gesture Detected");
        iqz iqz = this.f11153f;
        String valueOf = String.valueOf(this.f11149b.mo2860b());
        String valueOf2 = String.valueOf(this.f11150c.mo2860b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length());
        stringBuilder.append("Invalid state detected. GCA Mode: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", AGSA available: ");
        stringBuilder.append(valueOf2);
        iqz.mo516c(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo558b() {
    }
}
