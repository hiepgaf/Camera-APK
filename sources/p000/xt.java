package p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: xt */
final class xt extends aah {
    /* renamed from: a */
    public final abh f19696a;
    /* renamed from: b */
    public boolean f19697b = true;
    /* renamed from: c */
    public final /* synthetic */ xq f19698c;
    /* renamed from: d */
    private final xq f19699d;
    /* renamed from: e */
    private final int f19700e;
    /* renamed from: f */
    private final ym f19701f;
    /* renamed from: g */
    private abo f19702g = null;

    public xt(xq xqVar, xq xqVar2, int i, abh abh, CameraCharacteristics cameraCharacteristics) {
        this.f19698c = xqVar;
        this.f19699d = xqVar2;
        this.f19700e = i;
        this.f19696a = abh;
        this.f19701f = new ym(cameraCharacteristics);
    }

    /* renamed from: a */
    public final void mo2561a(byte[] bArr) {
    }

    /* renamed from: a */
    public final boolean mo2562a(abo abo) {
        if (abo == null) {
            abx.m91e(xq.f19682a, "null parameters in applySettings()");
            return false;
        } else if (!(abo instanceof yn)) {
            abx.m87b(xq.f19682a, "Provided settings not compatible with the backing framework API");
            return false;
        } else if (!m13a(abo, -2)) {
            return false;
        } else {
            this.f19702g = abo;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo2558a(Handler handler, zw zwVar) {
        try {
            this.f19698c.f19685d.m80a(new xu(this, zwVar, handler));
        } catch (RuntimeException e) {
            this.f19699d.f19688g.mo2579a(e);
        }
    }

    /* renamed from: a */
    public final void mo2560a(boolean z) {
        this.f19697b = z;
    }

    /* renamed from: a */
    public final zs mo2554a() {
        return this.f19699d;
    }

    /* renamed from: b */
    public final Handler mo2563b() {
        return this.f19698c.f19683b;
    }

    /* renamed from: c */
    public final int mo2565c() {
        return this.f19700e;
    }

    /* renamed from: d */
    public final abq mo2566d() {
        return this.f19698c.f19684c;
    }

    /* renamed from: e */
    public final aaz mo2567e() {
        return this.f19701f;
    }

    /* renamed from: f */
    public final abh mo2568f() {
        return this.f19696a;
    }

    /* renamed from: g */
    public final abs mo2569g() {
        return this.f19698c.f19685d;
    }

    /* renamed from: h */
    public final Parameters mo2570h() {
        return null;
    }

    /* renamed from: i */
    public final abo mo2571i() {
        if (this.f19702g == null) {
            this.f19702g = this.f19698c.f19683b.m14565a();
        }
        return this.f19702g;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final void mo2559a(Handler handler, zx zxVar) {
        try {
            this.f19698c.f19685d.m80a(new xx(this, zxVar, handler));
        } catch (RuntimeException e) {
            this.f19699d.f19688g.mo2579a(e);
        }
    }

    /* renamed from: a */
    public final void mo2556a(Handler handler, aag aag) {
    }

    /* renamed from: b */
    public final void mo2564b(Handler handler, aag aag) {
    }

    /* renamed from: a */
    public final void mo2555a(SurfaceTexture surfaceTexture) {
        mo2571i().f140f = true;
        super.mo2555a(surfaceTexture);
    }

    /* renamed from: j */
    public final void mo2572j() {
        mo2571i().f140f = true;
        super.mo2555a(null);
    }

    /* renamed from: a */
    public final void mo2557a(Handler handler, aas aas, aaf aaf, aaf aaf2) {
        try {
            this.f19698c.f19685d.m80a(new yd(this, new ya(this, aas, handler, aaf2)));
        } catch (RuntimeException e) {
            this.f19699d.f19688g.mo2579a(e);
        }
    }
}
