package p000;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: age */
public final class age implements agn {
    /* renamed from: a */
    public final boolean f9743a;
    /* renamed from: b */
    public final agn f9744b;
    /* renamed from: c */
    private final boolean f9745c;
    /* renamed from: d */
    private agf f9746d;
    /* renamed from: e */
    private adl f9747e;
    /* renamed from: f */
    private int f9748f;
    /* renamed from: g */
    private boolean f9749g;

    public age(agn agn, boolean z, boolean z2) {
        this.f9744b = (agn) aqe.m585a((Object) agn, "Argument must not be null");
        this.f9743a = z;
        this.f9745c = z2;
    }

    /* renamed from: a */
    public final void m6399a() {
        if (this.f9749g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f9748f++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* renamed from: b */
    public final Object mo55b() {
        return this.f9744b.mo55b();
    }

    /* renamed from: c */
    public final Class mo56c() {
        return this.f9744b.mo56c();
    }

    /* renamed from: d */
    public final int mo57d() {
        return this.f9744b.mo57d();
    }

    /* renamed from: e */
    public final void mo58e() {
        if (this.f9748f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f9749g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f9749g = true;
            if (this.f9745c) {
                this.f9744b.mo58e();
            }
        }
    }

    /* renamed from: f */
    final void m6405f() {
        if (this.f9748f <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f9748f - 1;
            this.f9748f = i;
            if (i == 0) {
                this.f9746d.mo47a(this.f9747e, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    /* renamed from: a */
    final void m6400a(adl adl, agf agf) {
        this.f9747e = adl;
        this.f9746d = agf;
    }

    public final String toString() {
        boolean z = this.f9743a;
        String valueOf = String.valueOf(this.f9746d);
        String valueOf2 = String.valueOf(this.f9747e);
        int i = this.f9748f;
        boolean z2 = this.f9749g;
        String valueOf3 = String.valueOf(this.f9744b);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 101) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("EngineResource{isCacheable=");
        stringBuilder.append(z);
        stringBuilder.append(", listener=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", key=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", acquired=");
        stringBuilder.append(i);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(z2);
        stringBuilder.append(", resource=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
