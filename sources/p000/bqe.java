package p000;

import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqe */
class bqe extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f20158a;

    bqe(bqb bqb) {
        this.f20158a = bqb;
        super('\u0000');
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f20158a.f20146a.m1229b(true);
        this.f20158a.f20146a.m1228a(false);
        this.f20158a.f20146a.m1227a();
        this.f20158a.f20148c.reverse();
    }

    /* renamed from: a */
    public void mo2702a(float f) {
        bqb bqb = this.f20158a;
        float f2 = bqb.f20150e;
        EvCompView evCompView = bqb.f20146a;
        bqb.f20150e = f2 + ((f / ((float) evCompView.f2279a.m934a(evCompView.getHeight()))) / 2.0f);
        if (bqb.f20150e > 1.0f) {
            bqb.f20150e = 1.0f;
        }
        if (bqb.f20150e <= 0.0f) {
            bqb.f20150e = 0.0f;
        }
        bqb.a_();
    }
}
