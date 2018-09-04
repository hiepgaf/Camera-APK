package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: hod */
public final class hod implements hoc, igl {
    /* renamed from: a */
    public static final String f21599a = bli.m862a("WearRmtShttrLstnr");
    /* renamed from: e */
    public static hod f21600e;
    /* renamed from: b */
    public final Context f21601b;
    /* renamed from: c */
    public kpk f21602c;
    /* renamed from: d */
    public boolean f21603d;
    /* renamed from: f */
    private hob f21604f;
    /* renamed from: g */
    private final HandlerThread f21605g = new HandlerThread("camera.wearable");
    /* renamed from: h */
    private final Handler f21606h;
    /* renamed from: i */
    private final Handler f21607i;
    /* renamed from: j */
    private hji f21608j = new hji(new hur(this.f21601b).m3486a(igq.f7002a).m3485a());

    public hod(Context context) {
        this.f21601b = context.getApplicationContext();
        this.f21605g.start();
        this.f21606h = new Handler(this.f21605g.getLooper());
        this.f21607i = new Handler(this.f21601b.getMainLooper());
    }

    public final void close() {
        this.f21605g.quitSafely();
        kpk kpk = this.f21602c;
        if (kpk != null) {
            kow.m13622a(kpk, new hol(), kpq.f8410a);
        }
        this.f21608j = null;
    }

    /* renamed from: a */
    public final void mo3096a(igm igm) {
        if ("/takePicture".equals(igm.mo2805a())) {
            bli.m871d(f21599a, "Received remote shutter from Wear device");
            this.f21604f.mo3406u();
            return;
        }
        String str = f21599a;
        String valueOf = String.valueOf(igm.mo2805a());
        String str2 = "Unable to handle unknown message: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m873e(str, valueOf);
    }

    /* renamed from: a */
    public final void mo3094a() {
        this.f21604f = null;
        if (this.f21603d && this.f21602c != null) {
            bli.m863a(f21599a, "onModuleExit. Shutting down wearable connection");
            kow.m13622a(this.f21602c, new hof(this), kpq.f8410a);
        }
        this.f21603d = false;
    }

    /* renamed from: a */
    public final void mo3095a(hob hob) {
        this.f21604f = hob;
        this.f21603d = true;
        try {
            this.f21602c = this.f21608j.m11858a();
            kow.m13622a(this.f21602c, new hoe(this), kpq.f8410a);
        } catch (SecurityException e) {
            bli.m873e(f21599a, "Bad install order on GmsCore and Camera - remote shutter will not work, reinstall the same GoogleCamera.apk");
            this.f21608j = null;
            this.f21603d = false;
        } catch (Throwable e2) {
            bli.m867b(f21599a, "Exception when connecting to wear", e2);
            this.f21608j = null;
            this.f21603d = false;
        }
    }

    /* renamed from: a */
    public final void mo3097a(byte[] bArr) {
        try {
            if (this.f21603d && this.f21608j != null) {
                this.f21607i.post(new hoi(this, bArr, new hoh(this)));
            }
        } catch (Throwable e) {
            bli.m867b(f21599a, "error processing photo for wear", e);
        }
    }

    /* renamed from: a */
    final void m15911a(igo igo, Runnable runnable) {
        this.f21606h.post(new hoj(this, igo, runnable));
    }
}
