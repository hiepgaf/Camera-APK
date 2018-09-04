package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpl */
class hpl extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f23320a;

    hpl(hpf hpf) {
        this.f23320a = hpf;
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z;
        float f;
        if (this.f23320a.f23317t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "max zoom value hasn't been initialized properly");
        hpf hpf = this.f23320a;
        if (hpf.f23315r) {
            f = hpf.f23317t;
        } else {
            f = hpf.f23318u;
        }
        hpf.f23313p.setFloatValues(new float[]{((Float) hpf.f23308k.mo2860b()).floatValue(), f});
        float abs = Math.abs(f - ((Float) this.f23320a.f23308k.mo2860b()).floatValue());
        hpf hpf2 = this.f23320a;
        hpf2.f23313p.setDuration((long) ((int) ((abs / (hpf2.f23317t - hpf2.f23318u)) * 1500.0f)));
        this.f23320a.f23313p.start();
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f23320a.f23313p.cancel();
    }

    /* renamed from: e */
    public void mo2701e() {
        this.f23320a.f23311n.reverse();
    }

    public void am() {
        hpf hpf = this.f23320a;
        hpf.f23305h.announceForAccessibility(hpf.f23305h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f23308k.mo2860b()}));
    }
}
