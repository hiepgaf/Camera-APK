package p000;

import android.media.MediaFormat;

/* renamed from: jge */
final /* synthetic */ class jge implements kaw {
    /* renamed from: a */
    private final jgd f18767a;
    /* renamed from: b */
    private final MediaFormat f18768b;
    /* renamed from: c */
    private final kpw f18769c;

    jge(jgd jgd, MediaFormat mediaFormat, kpw kpw) {
        this.f18767a = jgd;
        this.f18768b = mediaFormat;
        this.f18769c = kpw;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        jgd jgd = this.f18767a;
        MediaFormat mediaFormat = this.f18768b;
        kpw kpw = this.f18769c;
        jgb jgb = (jgb) obj;
        jgd.f7796a.add(jgb);
        kpw.mo3616b(kny.m18045a(jgb.f18766b, new jgf(mediaFormat), kpq.f8410a));
        return jgb;
    }
}
