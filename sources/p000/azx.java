package p000;

import com.google.googlex.gcam.FloatDeque;

/* compiled from: PG */
/* renamed from: azx */
public final class azx implements azw {
    /* renamed from: a */
    public FloatDeque f10587a;

    public azx() {
        this.f10587a = new FloatDeque();
    }

    public azx(FloatDeque floatDeque) {
        this.f10587a = floatDeque;
    }

    /* renamed from: a */
    public final float mo408a(int i) {
        return this.f10587a.getitem(i);
    }

    /* renamed from: a */
    public final void mo410a(float f) {
        this.f10587a.push_back(f);
    }

    /* renamed from: a */
    public final long mo409a() {
        return this.f10587a.size();
    }
}
