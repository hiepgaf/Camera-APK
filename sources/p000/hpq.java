package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpq */
class hpq extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f23325a;

    hpq(hpf hpf) {
        this.f23325a = hpf;
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z;
        boolean z2 = true;
        if (this.f23325a.f23317t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "max zoom value hasn't been initialized properly");
        if (this.f23325a.f23318u < 1.0f) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "min zoom value hasn't been initialized properly");
    }

    public void ai() {
        hpf hpf = this.f23325a;
        hpf.f23305h.announceForAccessibility(hpf.f23305h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f23308k.mo2860b()}));
    }

    /* renamed from: g */
    public void mo2704g() {
        hpf hpf = this.f23325a;
        hpf.f23305h.announceForAccessibility(hpf.f23305h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f23308k.mo2860b()}));
    }

    /* renamed from: b */
    public void mo3464b(float f) {
        float floatValue = ((Float) this.f23325a.f23308k.mo2860b()).floatValue();
        hpf hpf = this.f23325a;
        float f2 = -0.33f + (((floatValue + 0.33f) * f) * f);
        floatValue = hpf.f23317t;
        if (f2 <= floatValue) {
            floatValue = hpf.f23318u;
            if (f2 >= floatValue) {
                floatValue = f2;
            }
        }
        hpf.f23308k.mo348a(Float.valueOf(floatValue));
    }
}
