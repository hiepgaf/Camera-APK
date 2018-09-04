package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bqf */
class bqf extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bqb f20159a;

    bqf(bqb bqb) {
        this.f20159a = bqb;
        super('\u0000');
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f20159a.f20146a.m1229b(true);
        this.f20159a.f20146a.m1228a(false);
        this.f20159a.f20146a.m1227a();
        this.f20159a.f20148c.start();
        this.f20159a.f20149d.mo348a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f20159a.f20149d.mo348a(Boolean.valueOf(false));
    }

    /* renamed from: g */
    public void mo2704g() {
        EvCompView evCompView = this.f20159a.f20146a;
        String a = EvCompView.m1226a(evCompView.f2283e);
        evCompView.announceForAccessibility(evCompView.getContext().getResources().getString(R.string.ev_announcement, new Object[]{a}));
    }

    /* renamed from: a */
    public final void mo2702a(float f) {
        bqb bqb = this.f20159a;
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
