package p000;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

/* compiled from: PG */
/* renamed from: cef */
public class cef extends eoq {
    /* renamed from: d */
    private static final String f11737d = bli.m862a("GcaActivity");
    /* renamed from: a */
    public ird f11738a;
    /* renamed from: b */
    public ivw f11739b;
    /* renamed from: c */
    public enf f11740c;
    /* renamed from: e */
    private final Object f11741e = new Object();
    /* renamed from: f */
    private boolean f11742f = false;
    /* renamed from: g */
    private cbh f11743g;
    /* renamed from: h */
    private ceg f11744h;
    /* renamed from: i */
    private awt f11745i;

    /* renamed from: d */
    private final aws mo2797d() {
        m8065e();
        return this.f11745i;
    }

    /* renamed from: a */
    public final cbh mo657a() {
        if (this.f11743g == null) {
            synchronized (this.f11741e) {
                if (this.f11743g == null) {
                    this.f11743g = new cbh(this);
                }
            }
        }
        return this.f11743g;
    }

    /* renamed from: b */
    public final ceg mo658b() {
        m8065e();
        if (this.f11744h == null) {
            synchronized (this.f11741e) {
                if (this.f11744h == null) {
                    this.f3991t.m1906a(this.f11740c);
                    this.f11744h = new ceg(this, this.t, mo2797d());
                }
            }
        }
        return this.f11744h;
    }

    /* renamed from: e */
    private final void m8065e() {
        if (!this.f11742f) {
            synchronized (this.f11741e) {
                if (!this.f11742f) {
                    ((CameraApp) getApplicationContext()).mo751a().mo3389a(this);
                    this.f11745i = awt.m7100a(this.f11739b);
                    this.f11742f = true;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m8063a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f11737d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 3) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m869c(str2, stringBuilder.toString());
    }

    public void onCreate(Bundle bundle) {
        m8065e();
        m8063a("GcaActivity#onCreate");
        this.f11738a.mo1903a("GcaActivity#onCreate");
        awt awt = this.f11745i;
        synchronized (awt.f10450b) {
            bli.m863a(awt.f10449a, "onCreate()");
            if (awt.f10457i.f10662a.get()) {
                awt.f10454f = awt.f10451c.mo412a();
                awt.f10457i = (bcl) awt.f10454f.mo1879a(new bcl());
                awt.f10453e = awt.f10451c.mo415b(awt.f10454f);
                awt.f10456h = (bcl) awt.f10453e.mo1879a(new bcl());
                awt.f10452d = awt.f10451c.mo413a(awt.f10453e);
                awt.f10455g = (bcl) awt.f10452d.mo1879a(new bcl());
            }
        }
        super.onCreate(bundle);
        this.f11738a.mo1904b();
    }

    public void onDestroy() {
        m8063a("GcaActivity#onDestroy");
        this.f11738a.mo1903a("GcaActivity#onDestroy");
        super.onDestroy();
        this.f11745i.mo378f();
        this.f11738a.mo1904b();
    }

    public void onPause() {
        m8063a("GcaActivity#onPause");
        this.f11738a.mo1903a("GcaActivity#onPause");
        super.onPause();
        this.f11745i.mo379g();
        this.f11738a.mo1904b();
    }

    public void onResume() {
        m8063a("GcaActivity#onResume");
        this.f11738a.mo1903a("GcaActivity#onResume");
        this.f11745i.mo380h();
        super.onResume();
        this.f11738a.mo1904b();
    }

    public void onStart() {
        m8063a("GcaActivity#onStart");
        this.f11738a.mo1903a("GcaActivity#onStart");
        this.f11745i.mo381i();
        super.onStart();
        this.f11738a.mo1904b();
    }

    protected void onStop() {
        m8063a("GcaActivity#onStop");
        this.f11738a.mo1903a("GcaActivity#onStop");
        super.onStop();
        this.f11745i.mo382j();
        this.f11738a.mo1904b();
    }

    /* renamed from: c */
    public final ird m8068c() {
        m8065e();
        return this.f11738a;
    }
}
