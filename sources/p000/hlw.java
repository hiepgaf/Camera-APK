package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: hlw */
class hlw extends gqj {
    /* renamed from: a */
    public final /* synthetic */ hls f21591a;

    hlw(hls hls) {
        this.f21591a = hls;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        hls hls = this.f21591a;
        Uri uri = hls.f21584h;
        if (uri != null) {
            hls.f21582f.setVideoURI(uri);
        }
        this.f21591a.f21582f.setOnCompletionListener(new hlx(this));
        this.f21591a.f21582f.setOnPreparedListener(new hly(this));
    }

    /* renamed from: V */
    public void mo3089V() {
        hls hls = this.f21591a;
        hls.f21581e.m3243a(hls.f21582f.getDuration());
        hls = this.f21591a;
        hls.f21582f.seekTo(hls.f21585i);
        hls = this.f21591a;
        hls.f21581e.m3244b(hls.f21585i);
    }

    /* renamed from: X */
    public void mo3090X() {
        hls hls = this.f21591a;
        hls.f21581e.m3243a(hls.f21582f.getDuration());
        hls = this.f21591a;
        hls.f21582f.seekTo(hls.f21585i);
        hls = this.f21591a;
        hls.f21581e.m3244b(hls.f21585i);
    }
}
