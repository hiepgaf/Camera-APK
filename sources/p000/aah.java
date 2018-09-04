package p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: aah */
public abstract class aah {
    /* renamed from: a */
    public abstract zs mo2554a();

    /* renamed from: a */
    public abstract void mo2556a(Handler handler, aag aag);

    /* renamed from: a */
    public abstract void mo2557a(Handler handler, aas aas, aaf aaf, aaf aaf2);

    /* renamed from: a */
    public abstract void mo2558a(Handler handler, zw zwVar);

    @TargetApi(16)
    /* renamed from: a */
    public abstract void mo2559a(Handler handler, zx zxVar);

    /* renamed from: a */
    public abstract boolean mo2562a(abo abo);

    /* renamed from: b */
    public abstract Handler mo2563b();

    /* renamed from: b */
    public abstract void mo2564b(Handler handler, aag aag);

    /* renamed from: c */
    public abstract int mo2565c();

    /* renamed from: d */
    public abstract abq mo2566d();

    /* renamed from: e */
    public abstract aaz mo2567e();

    /* renamed from: f */
    public abstract abh mo2568f();

    /* renamed from: g */
    public abstract abs mo2569g();

    @Deprecated
    /* renamed from: h */
    public abstract Parameters mo2570h();

    /* renamed from: i */
    public abstract abo mo2571i();

    /* renamed from: a */
    public void mo2561a(byte[] bArr) {
        try {
            mo2569g().m80a(new aaj(this, bArr));
        } catch (RuntimeException e) {
            mo2554a().mo2544b().mo2579a(e);
        }
    }

    /* renamed from: a */
    protected final boolean m13a(abo abo, int i) {
        if (abo != null) {
            Object obj;
            int i2;
            aaz e = mo2567e();
            float f = abo.f148n;
            if (e.m32a(aba.ZOOM)) {
                if (abo.f148n > e.f66t) {
                    aby aby = aaz.f47a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Zoom ratio is not supported: ratio = ");
                    stringBuilder.append(abo.f148n);
                    abx.m90d(aby, stringBuilder.toString());
                    obj = null;
                } else {
                    i2 = 1;
                }
            } else if (f != 1.0f) {
                abx.m90d(aaz.f47a, "Zoom is not supported");
                obj = null;
            } else {
                i2 = 1;
            }
            if (obj == null) {
                obj = null;
            } else {
                aby aby2;
                StringBuilder stringBuilder2;
                i2 = abo.f149o;
                if (i2 <= e.f61o && i2 >= e.f60n) {
                    i2 = 1;
                } else {
                    aby2 = aaz.f47a;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Exposure compensation index is not supported. Min = ");
                    stringBuilder2.append(e.f60n);
                    stringBuilder2.append(", max = ");
                    stringBuilder2.append(e.f61o);
                    stringBuilder2.append(",");
                    stringBuilder2.append(" setting = ");
                    stringBuilder2.append(i2);
                    abx.m90d(aby2, stringBuilder2.toString());
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                } else {
                    String str;
                    abc abc = abo.f151q;
                    if (e.m34a(abc)) {
                        i2 = 1;
                    } else if (e.m34a(abc.FIXED)) {
                        abx.m91e(aaz.f47a, "Focus mode not supported... trying FIXED");
                        abo.f151q = abc.FIXED;
                        obj = 1;
                    } else {
                        aby2 = aaz.f47a;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Focus mode not supported:");
                        if (abc == null) {
                            str = "null";
                        } else {
                            str = abc.name();
                        }
                        stringBuilder2.append(str);
                        abx.m90d(aby2, stringBuilder2.toString());
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    } else {
                        abb abb = abo.f150p;
                        if (e.m33a(abb)) {
                            i2 = 1;
                        } else {
                            aby2 = aaz.f47a;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Flash mode not supported:");
                            if (abb == null) {
                                str = "null";
                            } else {
                                str = abb.name();
                            }
                            stringBuilder2.append(str);
                            abx.m90d(aby2, stringBuilder2.toString());
                            obj = null;
                        }
                        if (obj == null) {
                            obj = null;
                        } else {
                            abw b = abo.m68b();
                            if (e.f52f.contains(b)) {
                                i2 = 1;
                            } else {
                                aby2 = aaz.f47a;
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Unsupported photo size:");
                                stringBuilder2.append(b);
                                abx.m90d(aby2, stringBuilder2.toString());
                                obj = null;
                            }
                            if (obj == null) {
                                obj = null;
                            } else {
                                b = abo.m70c();
                                if (e.f49c.contains(b)) {
                                    i2 = 1;
                                } else {
                                    aby2 = aaz.f47a;
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Unsupported preview size:");
                                    stringBuilder2.append(b);
                                    abx.m90d(aby2, stringBuilder2.toString());
                                    obj = null;
                                }
                                if (obj == null) {
                                    obj = null;
                                } else {
                                    if (!abo.f154t) {
                                        i2 = 1;
                                    } else if (e.m32a(aba.VIDEO_STABILIZATION)) {
                                        i2 = 1;
                                    } else {
                                        abx.m90d(aaz.f47a, "Video stabilization is not supported");
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        i2 = 1;
                                    } else {
                                        obj = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (obj != null) {
                try {
                    mo2569g().m80a(new aal(this, i, abo.mo2576a()));
                } catch (RuntimeException e2) {
                    mo2554a().mo2544b().mo2579a(e2);
                }
                return true;
            }
            abx.m91e(zs.f9591i, "Unsupported settings in applySettings()");
            return false;
        }
        abx.m90d(zs.f9591i, "null argument in applySettings()");
        return false;
    }

    /* renamed from: a */
    public void mo2560a(boolean z) {
        try {
            mo2569g().m80a(new aam(this, z));
        } catch (RuntimeException e) {
            mo2554a().mo2544b().mo2579a(e);
        }
    }

    /* renamed from: a */
    public final void m3a(int i) {
        try {
            mo2569g().m80a(new aak(this, i));
        } catch (RuntimeException e) {
            mo2554a().mo2544b().mo2579a(e);
        }
    }

    /* renamed from: a */
    public void mo2555a(SurfaceTexture surfaceTexture) {
        try {
            mo2569g().m80a(new aan(this, surfaceTexture));
        } catch (RuntimeException e) {
            mo2554a().mo2544b().mo2579a(e);
        }
    }

    /* renamed from: j */
    public void mo2572j() {
        if (!mo2566d().m78c()) {
            aaw aaw = new aaw();
            try {
                mo2569g().m81a(new aao(this, aaw), aaw.f39b, "set preview texture");
            } catch (RuntimeException e) {
                mo2554a().mo2544b().mo2579a(e);
            }
        }
    }

    /* renamed from: a */
    public final void m7a(Handler handler, aat aat) {
        try {
            mo2569g().m80a(new aaq(this, handler, aat));
        } catch (RuntimeException e) {
            mo2554a().mo2544b().mo2579a(e);
        }
    }

    /* renamed from: k */
    public final void m24k() {
        if (!mo2566d().m78c()) {
            aaw aaw = new aaw();
            try {
                mo2569g().m81a(new aar(this, aaw), aaw.f39b, "stop preview");
            } catch (RuntimeException e) {
                mo2554a().mo2544b().mo2579a(e);
            }
        }
    }
}
