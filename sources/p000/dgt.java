package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dgt */
final class dgt implements fbl {
    /* renamed from: a */
    public final /* synthetic */ dgl f13181a;

    dgt(dgl dgl) {
        this.f13181a = dgl;
    }

    /* renamed from: s */
    public final void mo1136s() {
    }

    /* renamed from: t */
    public final void mo1137t() {
        this.f13181a.f21002d.execute(new dgu(this));
    }

    /* renamed from: a */
    public final void mo1135a(float f) {
        if (f == 0.0f) {
            this.f13181a.f21001c.mo2757l().m9626r();
        } else if (f == 1.0f) {
            this.f13181a.f21001c.mo2757l().m9627s();
            this.f13181a.f21004f.mo1548a(R.raw.camera_shutter);
        }
    }
}
