package p000;

import android.annotation.TargetApi;
import android.hardware.Camera.Parameters;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yu */
final class yu extends aah {
    /* renamed from: a */
    public final /* synthetic */ yo f19755a;
    /* renamed from: b */
    private final zs f19756b;
    /* renamed from: c */
    private final int f19757c;
    /* renamed from: d */
    private final abh f19758d;
    /* renamed from: e */
    private final zo f19759e;

    private yu(yo yoVar, zs zsVar, int i, abh abh, zo zoVar, byte b) {
        this.f19755a = yoVar;
        this.f19756b = zsVar;
        this.f19757c = i;
        this.f19758d = abh;
        this.f19759e = zoVar;
    }

    /* renamed from: a */
    public final boolean mo2562a(abo abo) {
        return m13a(abo, 6);
    }

    /* renamed from: a */
    public final void mo2558a(Handler handler, zw zwVar) {
        this.f19755a.f19749f.m80a(new za(this, new yy(this, handler, zwVar)));
    }

    /* renamed from: a */
    public final zs mo2554a() {
        return this.f19756b;
    }

    /* renamed from: b */
    public final Handler mo2563b() {
        return this.f19755a.f19747d;
    }

    /* renamed from: c */
    public final int mo2565c() {
        return this.f19757c;
    }

    /* renamed from: d */
    public final abq mo2566d() {
        return this.f19755a.f19748e;
    }

    /* renamed from: e */
    public final aaz mo2567e() {
        return new zo(this.f19759e);
    }

    /* renamed from: f */
    public final abh mo2568f() {
        return this.f19758d;
    }

    /* renamed from: g */
    public final abs mo2569g() {
        return this.f19755a.f19749f;
    }

    @Deprecated
    /* renamed from: h */
    public final Parameters mo2570h() {
        aaw aaw = new aaw();
        Parameters[] parametersArr = new Parameters[1];
        try {
            this.f19755a.f19749f.m81a(new yw(this, parametersArr, aaw), aaw.f39b, "get parameters");
        } catch (RuntimeException e) {
            this.f19756b.mo2544b().mo2579a(e);
        }
        return parametersArr[0];
    }

    /* renamed from: i */
    public final abo mo2571i() {
        return new zr(this.f19759e, mo2570h());
    }

    @TargetApi(16)
    /* renamed from: a */
    public final void mo2559a(Handler handler, zx zxVar) {
        try {
            this.f19755a.f19749f.m80a(new zb(this, handler, zxVar));
        } catch (RuntimeException e) {
            this.f19756b.mo2544b().mo2579a(e);
        }
    }

    /* renamed from: a */
    public final void mo2556a(Handler handler, aag aag) {
        this.f19755a.f19749f.m80a(new yv(this, handler, aag));
    }

    /* renamed from: b */
    public final void mo2564b(Handler handler, aag aag) {
        this.f19755a.f19749f.m80a(new yx(this, handler, aag));
    }

    /* renamed from: a */
    public final void mo2557a(Handler handler, aas aas, aaf aaf, aaf aaf2) {
        try {
            this.f19755a.f19749f.m80a(new ze(this, handler, aas, aaf, new zc(this, handler, aaf2)));
        } catch (RuntimeException e) {
            this.f19756b.mo2544b().mo2579a(e);
        }
    }
}
