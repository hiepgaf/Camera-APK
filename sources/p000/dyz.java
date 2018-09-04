package p000;

import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dyz */
public final class dyz implements kwk {
    /* renamed from: a */
    private final kwk f14757a;
    /* renamed from: b */
    private final kwk f14758b;
    /* renamed from: c */
    private final kwk f14759c;
    /* renamed from: d */
    private final kwk f14760d;
    /* renamed from: e */
    private final kwk f14761e;

    private dyz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f14757a = kwk;
        this.f14758b = kwk2;
        this.f14759c = kwk3;
        this.f14760d = kwk4;
        this.f14761e = kwk5;
    }

    /* renamed from: a */
    public static dyz m9561a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new dyz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14757a;
        kwk kwk2 = this.f14758b;
        kwk kwk3 = this.f14759c;
        kwk kwk4 = this.f14760d;
        kwk kwk5 = this.f14761e;
        kwk.mo345a();
        epc epc = (epc) kwk2.mo345a();
        eio eio = (eio) kwk3.mo345a();
        PackageInfo packageInfo = (PackageInfo) kwk5.mo345a();
        return (irs) ktm.m13963a(new grx(ept.m1984a(), new iya(), new Random().nextInt(), TimeZone.getDefault().getID(), Build.DISPLAY, Executors.newSingleThreadScheduledExecutor(iel.m3721c("UsageStatEx", 10)), (bku) kwk4.mo345a(), ActivityManager.isRunningInTestHarness(), epc, eio, packageInfo.versionName), "Cannot return null from a non-@Nullable @Provides method");
    }
}
