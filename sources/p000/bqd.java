package p000;

import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqd */
class bqd extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f20157a;

    bqd(bqb bqb) {
        this.f20157a = bqb;
        super('\u0000');
    }

    /* renamed from: a */
    public final void mo1562a() {
        bqb bqb = this.f20157a;
        bqb.f20146a.postDelayed(bqb.f20155j, (long) bqb.f20154i);
        this.f20157a.f20146a.m1229b(false);
        this.f20157a.f20146a.m1227a();
        this.f20157a.f20146a.m1228a(true);
        bqb = this.f20157a;
        bqb.f20150e = 0.5f;
        bqb.a_();
    }

    /* renamed from: b */
    public final void mo1563b() {
        bqb bqb = this.f20157a;
        bqb.f20146a.removeCallbacks(bqb.f20155j);
    }

    /* renamed from: f */
    public void mo2703f() {
    }

    /* renamed from: a */
    public void mo2702a(float f) {
        bqb bqb = this.f20157a;
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
