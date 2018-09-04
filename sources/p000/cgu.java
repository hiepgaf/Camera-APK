package p000;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: cgu */
public final class cgu implements bah, zy {
    /* renamed from: a */
    public static final String f11914a = bli.m862a("CameraController");
    /* renamed from: b */
    public final Handler f11915b;
    /* renamed from: c */
    public final zs f11916c;
    /* renamed from: d */
    public final zs f11917d;
    /* renamed from: e */
    public final ire f11918e;
    /* renamed from: f */
    public zy f11919f;
    /* renamed from: g */
    public abg f11920g;
    /* renamed from: h */
    public aah f11921h;
    /* renamed from: i */
    public int f11922i = -1;
    /* renamed from: j */
    public boolean f11923j = false;
    /* renamed from: k */
    public HashSet f11924k;
    /* renamed from: l */
    private final irh f11925l;
    /* renamed from: m */
    private final DevicePolicyManager f11926m;
    /* renamed from: n */
    private final Executor f11927n;
    /* renamed from: o */
    private final Semaphore f11928o;
    /* renamed from: p */
    private abn f11929p = new cgx(this);

    public cgu(Handler handler, zs zsVar, irh irh, ire ire, DevicePolicyManager devicePolicyManager, Executor executor, Semaphore semaphore) {
        this.f11915b = handler;
        this.f11916c = zsVar;
        this.f11926m = devicePolicyManager;
        this.f11917d = null;
        this.f11918e = ire;
        this.f11925l = irh;
        this.f11927n = executor;
        this.f11928o = semaphore;
        this.f11920g = this.f11916c.mo2542a();
        if (this.f11920g == null) {
            zy zyVar = this.f11919f;
            if (zyVar != null) {
                zyVar.mo673a(-1, "GETTING_CAMERA_INFO");
            }
        }
        this.f11924k = new HashSet();
        this.f11916c.mo2543a(new abi(this.f11929p, this.f11915b));
    }

    /* renamed from: a */
    public final void mo675a(abi abi) {
        if (abi != null) {
            this.f11924k.add(abi);
        }
    }

    /* renamed from: a */
    final void m8171a(zs zsVar, int i, Handler handler, zy zyVar) {
        bli.m871d(f11914a, "checkAndOpenCamera");
        try {
            if (this.f11926m.getCameraDisabled(null)) {
                throw new box();
            }
            bli.m871d(f11914a, "Trying to acquire camera semaphore");
            this.f11928o.acquire();
            bli.m871d(f11914a, "Acquired camera semaphore");
            try {
                zsVar.mo2547e().m80a(new zt(zsVar, i, handler, zyVar));
            } catch (RuntimeException e) {
                zsVar.mo2544b().mo2579a(e);
            }
        } catch (box e2) {
            handler.post(new cgy(this, zyVar, i));
        }
    }

    /* renamed from: a */
    public final void m8173a(boolean z) {
        bli.m871d(f11914a, "Closing camera");
        this.f11921h = null;
        this.f11916c.m6258a(z);
        this.f11922i = -1;
        this.f11923j = false;
        m8178c();
    }

    /* renamed from: b */
    public final abh mo677b(int i) {
        abg abg = this.f11920g;
        if (abg == null) {
            return null;
        }
        return abg.mo2550a(i);
    }

    /* renamed from: a */
    public final int mo671a() {
        abg abg = this.f11920g;
        if (abg == null) {
            return -1;
        }
        return abg.mo2549a();
    }

    /* renamed from: a */
    public final void mo672a(int i) {
        zy zyVar = this.f11919f;
        if (zyVar != null) {
            zyVar.mo672a(i);
        }
        m8178c();
    }

    /* renamed from: a */
    public final void mo674a(aah aah) {
        bli.m871d(f11914a, "onCameraOpened");
        if (this.f11922i == aah.mo2565c() && aah.mo2566d().m74a() != 1) {
            this.f11921h = aah;
            this.f11922i = -1;
            zy zyVar = this.f11919f;
            if (zyVar != null) {
                zyVar.mo674a(aah);
            }
        }
    }

    /* renamed from: a */
    public final void mo673a(int i, String str) {
        zy zyVar = this.f11919f;
        if (zyVar != null) {
            zyVar.mo673a(i, str);
        }
        m8178c();
    }

    /* renamed from: b */
    public final void mo678b(int i, String str) {
        zy zyVar = this.f11919f;
        if (zyVar != null) {
            zyVar.mo678b(i, str);
        }
        m8178c();
    }

    /* renamed from: a */
    public final void mo676a(zs zsVar, String str) {
        zy zyVar = this.f11919f;
        if (zyVar != null) {
            zyVar.mo676a(zsVar, str);
        }
        m8178c();
    }

    /* renamed from: c */
    public final void mo681c(int i) {
        aah aah = this.f11921h;
        if (aah == null) {
            if (this.f11922i == -1) {
                bli.m873e(f11914a, "Trying to release the camera before requesting");
            }
            this.f11922i = -1;
            return;
        }
        int c = aah.mo2565c();
        if (c != i) {
            int i2 = this.f11922i;
            if (i2 == i) {
                String str = f11914a;
                StringBuilder stringBuilder = new StringBuilder(100);
                stringBuilder.append("Releasing camera which was requested but not yet opened (current:requested): ");
                stringBuilder.append(c);
                stringBuilder.append(":");
                stringBuilder.append(i);
                bli.m873e(str, stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(ScriptIntrinsicBLAS.RsBlas_dtrmm);
                stringBuilder2.append("Trying to release a camera neither openednor requested (current:requested:for-release): ");
                stringBuilder2.append(c);
                stringBuilder2.append(":");
                stringBuilder2.append(i2);
                stringBuilder2.append(":");
                stringBuilder2.append(i);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        this.f11918e.mo522a(iur.m4253a(String.valueOf(i)));
        this.f11922i = -1;
    }

    /* renamed from: c */
    final void m8178c() {
        if (this.f11928o.availablePermits() == 0) {
            bli.m871d(f11914a, "Trying to release the camera semaphore");
            this.f11928o.release();
            bli.m871d(f11914a, "Semaphore released");
        }
    }

    /* renamed from: b */
    public final void mo679b(abi abi) {
        if (abi != null) {
            this.f11924k.remove(abi);
        }
    }

    /* renamed from: d */
    public final void mo682d(int i) {
        bli.m871d(f11914a, "requestCamera");
        int i2 = this.f11922i;
        if (i2 == -1 && i2 != i && this.f11920g != null) {
            this.f11925l.m4082a(false);
            this.f11927n.execute(new cgv(this, i));
        }
    }

    /* renamed from: b */
    public final boolean mo680b() {
        return this.f11922i != -1;
    }
}
