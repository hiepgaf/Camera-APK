package p000;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: hbz */
public final class hbz {
    /* renamed from: a */
    public final Animator f5950a;
    /* renamed from: b */
    public final /* synthetic */ hbh f5951b;

    hbz(hbh hbh, Animator animator) {
        this.f5951b = hbh;
        this.f5950a = animator;
    }

    /* renamed from: a */
    public final hbz m3015a() {
        this.f5950a.setStartDelay(150);
        return this;
    }

    /* renamed from: b */
    public final hbz m3017b() {
        this.f5950a.addListener(new hcb(this));
        return this;
    }

    /* renamed from: c */
    public final hbz m3018c() {
        this.f5950a.addListener(new hcc(this));
        return this;
    }

    /* renamed from: a */
    public final hbz m3016a(int i) {
        this.f5950a.setDuration((long) i);
        return this;
    }

    /* renamed from: d */
    public final hbz m3019d() {
        this.f5950a.setInterpolator(hbh.f5906a);
        return this;
    }

    /* renamed from: e */
    public final hbz m3020e() {
        this.f5950a.addListener(new hca(this));
        return this;
    }
}
