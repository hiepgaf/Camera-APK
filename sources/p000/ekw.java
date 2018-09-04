package p000;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ekw */
public final class ekw implements geu {
    /* renamed from: c */
    private static final String f15248c = bli.m862a("LightCycleStTask");
    /* renamed from: a */
    public final eln f15249a;
    /* renamed from: b */
    public final AtomicBoolean f15250b = new AtomicBoolean();
    /* renamed from: d */
    private final String f15251d;
    /* renamed from: e */
    private final File f15252e;
    /* renamed from: f */
    private final String f15253f;
    /* renamed from: g */
    private final int f15254g;
    /* renamed from: h */
    private final Semaphore f15255h = new Semaphore(0);
    /* renamed from: i */
    private volatile boolean f15256i = false;
    /* renamed from: j */
    private final List f15257j;
    /* renamed from: k */
    private final irs f15258k;
    /* renamed from: l */
    private final bvm f15259l;
    /* renamed from: m */
    private final bus f15260m;

    public ekw(eln eln, irs irs, bvm bvm, bus bus) {
        this.f15249a = eln;
        this.f15258k = irs;
        this.f15251d = eln.f3937c;
        this.f15252e = eln.f3936b.mo2885m().m2653a();
        this.f15253f = eln.f3936b.mo2886n();
        this.f15254g = eln.f3941g;
        this.f15259l = bvm;
        this.f15260m = bus;
        this.f15257j = new ArrayList();
    }

    public final void addFinishedCallback(iqb iqb) {
        jri.m13152b((Object) iqb);
        this.f15257j.add(iqb);
    }

    public final get getSession() {
        return this.f15249a.f3936b;
    }

    public final void process(Context context) {
        int c;
        int i = 11;
        boolean z = true;
        int i2 = 0;
        this.f15250b.set(false);
        Object obj;
        try {
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            m9740a();
            c = LightCycle.m1302c();
            File file = this.f15252e;
            long length = file.length();
            this.f15249a.f3936b.mo2875b(0);
            LightCycle.f2378c.put(Integer.valueOf(c), new ekq(this, length, file));
            long uptimeMillis = SystemClock.uptimeMillis();
            String str2 = f15248c;
            String valueOf = String.valueOf(this.f15251d);
            String str3 = "Rendering panorama from source images at ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m863a(str2, valueOf);
            LightCycle.m1300b(c);
            Map a = emd.m1871a(this.f15249a.f3939e);
            float a2 = emd.m1867a(a);
            if (this.f15254g != go.ah) {
                z2 = false;
            } else if (a2 == 360.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f15254g == go.ag && a2 >= 70.0f) {
                z3 = true;
            } else if (z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
            valueOf = f15248c;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("stitch time (milliseconds) = ");
            stringBuilder.append(uptimeMillis);
            bli.m871d(valueOf, stringBuilder.toString());
            if (this.f15254g == go.ah) {
                c = 1;
            } else if (this.f15254g == go.ai) {
                c = 2;
            } else if (this.f15254g == go.ak) {
                c = 4;
            } else if (this.f15254g == go.aj) {
                c = 3;
            } else {
                i = 5;
                c = 0;
            }
            this.f15258k.mo1572a(i, c, String.valueOf(this.f15253f).concat(".jpg"), ((float) uptimeMillis) * 0.001f, a2);
            if (this.f15254g == go.ag) {
                z4 = true;
            } else if (z2) {
                z4 = true;
            } else {
                z4 = false;
            }
            Uri o = this.f15249a.f3936b.mo2887o();
            kbg a3 = this.f15260m.mo577a(o);
            kbg kbg = kau.f19138a;
            StringBuilder stringBuilder2;
            if (a3.mo2084b()) {
                long b = ((buo) a3.mo2081a()).mo2708b().mo1263b();
                kbg a4 = this.f15259l.mo590a(b);
                if (a4.mo2084b()) {
                    kbg = kbg.m4745c(((bve) a4.mo2081a()).m1007d());
                } else {
                    str = f15248c;
                    stringBuilder2 = new StringBuilder(63);
                    stringBuilder2.append("special type not found for mediastore id = ");
                    stringBuilder2.append(b);
                    bli.m866b(str, stringBuilder2.toString());
                }
            } else {
                String str4 = f15248c;
                valueOf = String.valueOf(o);
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder2.append("no processing media found for Uri ");
                stringBuilder2.append(valueOf);
                bli.m866b(str4, stringBuilder2.toString());
            }
            valueOf = this.f15252e.getPath();
            str = this.f15251d;
            if (this.f15254g != go.ag) {
                z = false;
            }
            emd.m1872a(valueOf, a, str, z3, z4, kbg, z);
            synchronized (this.f15250b) {
                this.f15250b.set(true);
                this.f15249a.f3936b.mo2879f();
                this.f15249a.f3936b.mo2869a(new gfu(this.f15249a.f3936b));
                ken a5 = ken.m13458a(this.f15257j);
                int size = a5.size();
                while (i2 < size) {
                    obj = a5.get(i2);
                    i2++;
                    ((iqb) obj).mo369a(this);
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            synchronized (this.f15250b) {
                this.f15250b.set(true);
                this.f15249a.f3936b.mo2879f();
                this.f15249a.f3936b.mo2869a(new gfu(this.f15249a.f3936b));
                ken a6 = ken.m13458a(this.f15257j);
                int size2 = a6.size();
                c = 0;
                while (c < size2) {
                    obj = a6.get(c);
                    c++;
                    ((iqb) obj).mo369a(this);
                }
            }
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        jri.m13152b((Object) iqb);
        this.f15257j.remove(iqb);
    }

    public final synchronized void resume() {
        this.f15256i = false;
        this.f15255h.release();
    }

    public final synchronized void suspend() {
        this.f15255h.drainPermits();
        this.f15256i = true;
    }

    /* renamed from: a */
    public final void m9740a() {
        if (this.f15256i) {
            try {
                this.f15255h.acquire();
            } catch (InterruptedException e) {
                bli.m873e(f15248c, e.getMessage());
            }
        }
    }
}
