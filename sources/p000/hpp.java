package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpp */
class hpp extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f23324a;

    hpp(hpf hpf) {
        this.f23324a = hpf;
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z;
        if (this.f23324a.f23317t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "max zoom value hasn't been initialized properly");
    }

    /* renamed from: e */
    public void mo2701e() {
        this.f23324a.f23316s.reverse();
        this.f23324a.f23311n.reverse();
    }

    /* renamed from: g */
    public void mo2704g() {
        this.f23324a.f23316s.reverse();
        hpf hpf = this.f23324a;
        hpf.f23305h.announceForAccessibility(hpf.f23305h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f23308k.mo2860b()}));
    }
}
