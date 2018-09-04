package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.graphics.Point;
import android.provider.Settings.System;
import android.view.Display;
import android.view.WindowManager;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gcj */
public final class gcj implements eoj, eok, eol, gci {
    /* renamed from: a */
    private final gcm f16741a;
    /* renamed from: b */
    private final gbv f16742b;
    /* renamed from: c */
    private final ContentResolver f16743c;
    /* renamed from: d */
    private final WindowManager f16744d;
    /* renamed from: e */
    private final boolean f16745e;
    /* renamed from: f */
    private final iqz f16746f;
    /* renamed from: g */
    private boolean f16747g = false;

    public gcj(gcm gcm, ContentResolver contentResolver, gbv gbv, WindowManager windowManager, ira ira) {
        boolean z;
        this.f16741a = (gcm) jri.m13152b((Object) gcm);
        this.f16743c = (ContentResolver) jri.m13152b((Object) contentResolver);
        this.f16742b = (gbv) jri.m13152b((Object) gbv);
        this.f16744d = (WindowManager) jri.m13152b((Object) windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int rotation = defaultDisplay.getRotation();
        iqp a = iqp.m4044a(point);
        if (rotation == 1 || rotation == 3) {
            a = a.m4052f();
        }
        if (a.f7329a <= a.f7330b) {
            z = true;
        } else {
            z = false;
        }
        this.f16745e = z;
        this.f16746f = ira.mo511a("OrientMgrImpl");
    }

    /* renamed from: a */
    public final void mo1442a(gbw gbw) {
        this.f16742b.m2467a(gbw);
    }

    /* renamed from: a */
    public final iqm mo1441a() {
        return this.f16742b.f5045e;
    }

    /* renamed from: b */
    public final boolean mo1444b() {
        return this.f16745e;
    }

    /* renamed from: h */
    private final boolean m10952h() {
        return System.getInt(this.f16743c, "accelerometer_rotation", 0) != 1;
    }

    /* renamed from: c */
    public final void mo1445c() {
        if (!this.f16747g && !m10952h()) {
            this.f16747g = true;
            this.f16741a.m2481a(14);
        }
    }

    /* renamed from: d */
    public final int mo1446d() {
        return gcb.m2470a(mo1441a(), this.f16745e);
    }

    /* renamed from: e */
    public final int mo1447e() {
        return gcb.m2470a(mo1448f(), this.f16745e);
    }

    /* renamed from: i */
    public final void mo381i() {
        gbv gbv = this.f16742b;
        synchronized (gbv.f5044d) {
            gbv.f5047g++;
            gbv.f5042b.enable();
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        gbv gbv = this.f16742b;
        synchronized (gbv.f5044d) {
            int i = gbv.f5047g;
            if (i > 0) {
                gbv.f5047g = i - 1;
            }
            if (gbv.f5047g == 0) {
                gbv.f5042b.disable();
            }
        }
    }

    /* renamed from: b */
    public final void mo1443b(gbw gbw) {
        this.f16742b.m2468b(gbw);
    }

    /* renamed from: f */
    public final iqm mo1448f() {
        return iqm.m4038a(this.f16744d.getDefaultDisplay());
    }

    /* renamed from: g */
    public final void mo1449g() {
        if (this.f16747g && !m10952h()) {
            this.f16747g = false;
            this.f16746f.mo514b("Unlocked Orientation");
            this.f16741a.m2481a(2);
        }
    }
}
