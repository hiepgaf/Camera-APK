package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;

/* compiled from: PG */
/* renamed from: hpo */
class hpo extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f23323a;

    hpo(hpf hpf) {
        this.f23323a = hpf;
    }

    public void ag() {
    }

    /* renamed from: a */
    public final void mo1562a() {
        hpf hpf = this.f23323a;
        if (!hpf.f23312o) {
            if (((Float) hpf.f23308k.mo2860b()).floatValue() == hpf.f23318u) {
                hpf.f23307j.postDelayed(hpf.f23319v, ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS);
            } else {
                hpf.f23307j.removeCallbacks(hpf.f23319v);
            }
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        hpf hpf = this.f23323a;
        hpf.f23307j.removeCallbacks(hpf.f23319v);
    }

    /* renamed from: e */
    public void mo2701e() {
        this.f23323a.f23311n.reverse();
    }

    public void ak() {
        this.f23323a.f23316s.start();
    }

    /* renamed from: b */
    public void mo3461b(boolean z) {
        float floatValue = ((Float) this.f23323a.f23308k.mo2860b()).floatValue();
        hpf hpf = this.f23323a;
        float pow = (float) Math.pow((double) (hpf.f23317t / hpf.f23318u), 0.10000000149011612d);
        if (z) {
            floatValue *= pow;
        } else {
            floatValue /= pow;
        }
        hpf hpf2 = this.f23323a;
        pow = hpf2.f23317t;
        if (floatValue <= pow) {
            pow = hpf2.f23318u;
            if (floatValue >= pow) {
                pow = floatValue;
            }
        }
        hpf2.f23310m.setFloatValues(new float[]{((Float) hpf2.f23308k.mo2860b()).floatValue(), pow});
        this.f23323a.f23310m.start();
    }

    /* renamed from: c */
    public void mo3462c(boolean z) {
        this.f23323a.f23315r = z;
    }

    public void an() {
    }
}
