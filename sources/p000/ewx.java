package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ewx */
public final class ewx implements kwk {
    /* renamed from: a */
    private final kwk f15694a;
    /* renamed from: b */
    private final kwk f15695b;
    /* renamed from: c */
    private final kwk f15696c;

    private ewx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15694a = kwk;
        this.f15695b = kwk2;
        this.f15696c = kwk3;
    }

    /* renamed from: a */
    public static ewx m10027a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ewx(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15694a;
        kwk kwk2 = this.f15695b;
        hjf hjf = (hjf) kwk2.mo345a();
        iqp iqp = (iqp) this.f15696c.mo345a();
        bsn bsn = ((bmb) kwk.mo345a()).f1307a;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", iqp.f7329a, iqp.f7330b);
        createVideoFormat.setInteger("bitrate", 12000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("color-format", 2135033992);
        createVideoFormat.setInteger("color-standard", 4);
        createVideoFormat.setInteger("color-range", 1);
        createVideoFormat.setFloat("i-frame-interval", 0.23333333f);
        createVideoFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        if (hjf.m3195c()) {
            createVideoFormat.setInteger("profile", 8);
            createVideoFormat.setInteger("level", 32768);
        }
        return (MediaFormat) ktm.m13963a(createVideoFormat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
