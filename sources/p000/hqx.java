package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hqx */
public final class hqx extends hqb implements ServiceConnection, hqv {
    /* renamed from: a */
    public final Context f21609a;
    /* renamed from: b */
    public int f21610b;
    /* renamed from: c */
    private final Handler f21611c = new Handler(Looper.getMainLooper());
    /* renamed from: d */
    private final hqw f21612d;
    /* renamed from: e */
    private final hqq f21613e;
    /* renamed from: f */
    private int f21614f = 1;
    /* renamed from: g */
    private hpw f21615g;
    /* renamed from: h */
    private hpy f21616h;

    public hqx(Context context, hqw hqw, hqq hqq) {
        this.f21609a = context;
        this.f21612d = hqw;
        this.f21613e = hqq;
    }

    /* renamed from: a */
    public final void mo3098a() {
        int i = 1;
        hhz.m3157a();
        int i2 = this.f21614f;
        if (!(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6)) {
            i = 0;
        }
        hhz.m3159a(i ^ 1, "Attempting to bind service when already bound.");
        this.f21613e.m3286a(new hqy(this));
    }

    /* renamed from: b */
    public final int mo3101b() {
        boolean z = true;
        hhz.m3157a();
        int i = this.f21614f;
        if (!(i == 3 || i == 6)) {
            z = false;
        }
        hhz.m3159a(z, "Attempted to use lensServiceSession before ready.");
        return this.f21610b;
    }

    /* renamed from: g */
    final boolean m15931g() {
        int i = this.f21614f;
        return i == 2 || i == 3 || i == 5 || i == 6;
    }

    /* renamed from: c */
    public final boolean mo3103c() {
        hhz.m3157a();
        return hqx.m15919b(this.f21614f);
    }

    /* renamed from: d */
    public final boolean mo3104d() {
        hhz.m3157a();
        return hqx.m15920c(this.f21614f);
    }

    /* renamed from: b */
    private static boolean m15919b(int i) {
        return i == 4 || i == 5 || i == 6;
    }

    /* renamed from: c */
    private static boolean m15920c(int i) {
        return i == 3;
    }

    /* renamed from: b */
    public final void mo3102b(byte[] bArr) {
        hhz.m3157a();
        hhz.m3159a(mo3104d(), "Attempted to use lensServiceSession before ready.");
        ((hpy) hhz.m3155a(this.f21616h)).mo1768a(bArr);
    }

    /* renamed from: a */
    public final void mo3100a(byte[] bArr, hqc hqc) {
        hhz.m3157a();
        hhz.m3159a(mo3104d(), "Attempted to use lensServiceSession before ready.");
        ((hpy) hhz.m3155a(this.f21616h)).mo1769a(bArr, hqc);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hpw hpx;
        Throwable e;
        hhz.m3157a();
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            hpx = queryLocalInterface instanceof hpw ? (hpw) queryLocalInterface : new hpx(iBinder);
        } else {
            hpx = null;
        }
        this.f21615g = hpx;
        hqg hqg = (hqg) ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.START_CLIENT.f18032h).m17813b();
        ksa a = ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.LENS_SERVICE_TARGET_API_VERSION.f18032h);
        krl krl = hqh.f6446a;
        krz krz = (krz) hqi.f23510c.mo3571a(go.bZ, null);
        krz.mo3601h();
        hqi hqi = (hqi) krz.f23441b;
        hqi.f23512a |= 1;
        hqi.f23513b = 1;
        hqg hqg2 = (hqg) a.m18000a(krl, (hqi) krz.m17813b()).m17813b();
        try {
            this.f21616h = ((hpw) hhz.m3155a(this.f21615g)).mo1767a("LENS_SERVICE_SESSION", this);
            Object obj = this.f21616h;
            if (obj == null) {
                Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                m15922a(5);
                return;
            }
            ((hpy) hhz.m3155a(obj)).mo1768a(hqg.m16620b());
            ((hpy) hhz.m3155a(this.f21616h)).mo1768a(hqg2.m16620b());
        } catch (RemoteException e2) {
            e = e2;
            Log.e("LensServiceConnImpl", "Unable to begin Lens service session.", e);
            if (this.f21616h != null) {
                m15922a(5);
            } else {
                m15922a(6);
            }
        } catch (SecurityException e3) {
            e = e3;
            Log.e("LensServiceConnImpl", "Unable to begin Lens service session.", e);
            if (this.f21616h != null) {
                m15922a(6);
            } else {
                m15922a(5);
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        hhz.m3157a();
        m15922a(5);
    }

    /* renamed from: a */
    public final void mo3099a(byte[] bArr) {
        this.f21611c.post(new hqz(this, bArr));
    }

    /* renamed from: e */
    public final void mo3105e() {
        Throwable e;
        hhz.m3157a();
        hhz.m3159a(mo3104d(), "Attempted to handover when not ready.");
        ksa a = ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.STOP_CLIENT.f18032h);
        krl krl = hql.f6448a;
        krz krz = (krz) hqm.f23518c.mo3571a(go.bZ, null);
        krz.mo3601h();
        hqm hqm = (hqm) krz.f23441b;
        hqm.f23520a |= 1;
        hqm.f23521b = true;
        try {
            ((hpy) hhz.m3155a(this.f21616h)).mo1768a(((hqg) a.m18000a(krl, (hqm) krz.m17813b()).m17813b()).m16620b());
        } catch (RemoteException e2) {
            e = e2;
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
            m15922a(6);
        } catch (SecurityException e3) {
            e = e3;
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
            m15922a(6);
        }
        m15922a(6);
    }

    /* renamed from: a */
    final void m15922a(int i) {
        Log.d("LensServiceConnImpl", String.format("Transitioning from state %s to %s.", new Object[]{Integer.valueOf(this.f21614f), Integer.valueOf(i)}));
        int i2 = this.f21614f;
        this.f21614f = i;
        if (hqx.m15920c(i) && !hqx.m15920c(i2)) {
            hqw hqw = this.f21612d;
            hhz.m3157a();
            hqw.m3298a();
        }
        if (hqx.m15919b(i) && !hqx.m15919b(i2)) {
            hqw hqw2 = this.f21612d;
            hhz.m3157a();
            hqw2.m3298a();
        }
    }

    /* renamed from: f */
    public final void mo3106f() {
        Throwable e;
        hhz.m3157a();
        int i = this.f21614f;
        if (i == 3) {
            i = 1;
        } else if (i != 6) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            try {
                ((hpy) hhz.m3155a(this.f21616h)).mo1768a(((hqg) ((ksa) ((krz) hqg.f23583c.mo3571a(go.bZ, null))).m17999a(hqe.END_SESSION.f18032h).m17813b()).m16620b());
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
                this.f21616h = null;
                this.f21610b = 0;
                if (m15931g()) {
                    this.f21609a.unbindService(this);
                    this.f21615g = null;
                }
                m15922a(1);
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
                this.f21616h = null;
                this.f21610b = 0;
                if (m15931g()) {
                    this.f21609a.unbindService(this);
                    this.f21615g = null;
                }
                m15922a(1);
            }
            this.f21616h = null;
            this.f21610b = 0;
        }
        if (m15931g()) {
            this.f21609a.unbindService(this);
            this.f21615g = null;
        }
        m15922a(1);
    }
}
