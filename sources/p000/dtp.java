package p000;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtp */
public final class dtp implements fwl {
    /* renamed from: a */
    private final iqz f14510a;
    /* renamed from: b */
    private final ird f14511b;
    /* renamed from: c */
    private final fhg f14512c;
    /* renamed from: d */
    private final kpk f14513d;
    /* renamed from: e */
    private final fmg f14514e;
    /* renamed from: f */
    private final fuw f14515f;

    /* renamed from: a */
    private static /* synthetic */ void m9374a(Throwable th, fhh fhh) {
        if (th != null) {
            try {
                fhh.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fhh.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9375a(Throwable th, fko fko) {
        if (th != null) {
            try {
                fko.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fko.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9376a(Throwable th, fux fux) {
        if (th != null) {
            try {
                fux.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fux.close();
    }

    public dtp(ira ira, ird ird, fhg fhg, kpk kpk, fmg fmg, fuw fuw) {
        this.f14511b = ird;
        this.f14512c = fhg;
        this.f14513d = kpk;
        this.f14514e = fmg;
        this.f14515f = fuw;
        this.f14510a = ira.mo511a("SimpleImgCaptureCmd");
    }

    /* renamed from: a */
    public final ilp mo1170a() {
        return ilq.m3834b(this.f14512c.mo1383b(), ilq.m3832b(this.f14514e.m2337a(), Integer.valueOf(1)));
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        return ilq.m3818a(fds.m10234a());
    }

    /* renamed from: a */
    public final void mo1171a(fwm fwm, fwa fwa) {
        Throwable th;
        boolean z;
        this.f14510a.mo518d("Executing simple capture command.");
        this.f14511b.mo1903a("SimpleImageCapture");
        this.f14511b.mo1903a("AcquireResources");
        try {
            fux a = this.f14515f.mo404a(fwa);
            try {
                fhh a2 = this.f14512c.mo1382a();
                try {
                    fko a3 = this.f14514e.m2336a(1);
                    try {
                        this.f14511b.mo1905b("submitRequest");
                        iqt bcq = new bcq();
                        fio a4 = new fio((fim) ((ffw) isr.m4143a(this.f14513d)).mo2860b()).m2302a(2);
                        a4.m2304a((fhy) a3);
                        fiw fwn = new fwn();
                        a4.m2307a(fwn);
                        a4.m2307a(fds.m10249b(fwa.f4754c.m2406b()));
                        a4.m2307a(fds.m10249b(bcq));
                        a2.mo1381a(Arrays.asList(new fim[]{a4.m2301a()}), fiv.NON_REPEATING);
                        this.f14511b.mo1905b("exposureLatch#await");
                        bcq.await();
                        a2.close();
                        this.f14511b.mo1905b("getImage");
                        a.mo2642a((iwz) a3.mo2649a(), fwn.f16576a);
                        try {
                            this.f14510a.mo518d("Payload succeeded. Shot is not yet saved.");
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    try {
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (!z) {
                                            this.f14510a.mo516c("Failed to expose an image. Aborting capture!");
                                            fwa.f4753b.mo1481a(hci.m11747a(), true, "Simple image capture failed to expose an image. Aborting capture!");
                                        }
                                        this.f14511b.mo1904b();
                                        this.f14511b.mo1904b();
                                        throw th;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        z = false;
                        throw th;
                    }
                    try {
                        dtp.m9375a(null, a3);
                        if (a2 != null) {
                            try {
                                dtp.m9374a(null, a2);
                            } catch (Throwable th222) {
                                th = th222;
                                z = true;
                                throw th;
                            }
                        }
                        if (a != null) {
                            try {
                                dtp.m9376a(null, a);
                            } catch (Throwable th6) {
                                th = th6;
                                z = true;
                                if (z) {
                                    this.f14510a.mo516c("Failed to expose an image. Aborting capture!");
                                    fwa.f4753b.mo1481a(hci.m11747a(), true, "Simple image capture failed to expose an image. Aborting capture!");
                                }
                                this.f14511b.mo1904b();
                                this.f14511b.mo1904b();
                                throw th;
                            }
                        }
                        this.f14511b.mo1904b();
                        this.f14511b.mo1904b();
                    } catch (Throwable th2222) {
                        th = th2222;
                        z = true;
                        throw th;
                    }
                } catch (Throwable th22222) {
                    th = th22222;
                    z = false;
                    throw th;
                }
            } catch (Throwable th222222) {
                th = th222222;
                z = false;
                throw th;
            }
        } catch (Throwable th2222222) {
            th = th2222222;
            z = false;
            if (z) {
                this.f14510a.mo516c("Failed to expose an image. Aborting capture!");
                fwa.f4753b.mo1481a(hci.m11747a(), true, "Simple image capture failed to expose an image. Aborting capture!");
            }
            this.f14511b.mo1904b();
            this.f14511b.mo1904b();
            throw th;
        }
    }
}
