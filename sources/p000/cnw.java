package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cnw */
final class cnw extends izy {
    /* renamed from: a */
    private final /* synthetic */ gkr f20346a;
    /* renamed from: b */
    private final /* synthetic */ cnv f20347b;

    cnw(cnv cnv, gkr gkr) {
        this.f20347b = cnv;
        this.f20346a = gkr;
    }

    public final /* synthetic */ void a_(Object obj) {
        anq anq = (anq) obj;
        glw glw = glw.RENDER_PHOTO;
        if (this.f20347b.f2216a.f18840a.equals("Video_VFR")) {
            glw = glw.RENDER_VIDEO;
        }
        this.f20347b.f2217b.f.mo1504a(this.f20346a);
        this.f20346a.mo2867a(anq, hci.m11749a((int) R.string.burst_process_creation, new Object[0]), glw);
    }
}
