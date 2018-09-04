package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: euj */
public final class euj implements eux {
    /* renamed from: a */
    public final evo f15563a;
    /* renamed from: b */
    public volatile jga f15564b;
    /* renamed from: c */
    public final Executor f15565c;
    /* renamed from: d */
    private final MediaFormat f15566d;
    /* renamed from: e */
    private final kpk f15567e;
    /* renamed from: f */
    private eva f15568f;

    public euj(MediaFormat mediaFormat, evo evo, kpk kpk, Executor executor) {
        this.f15566d = mediaFormat;
        this.f15563a = evo;
        this.f15567e = kpk;
        this.f15565c = executor;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final void mo1297a(jgd jgd, euz euz, eva eva) {
        this.f15568f = eva;
        if (this.f15567e.isDone() && ((Boolean) kow.m13625c(this.f15567e)).booleanValue()) {
            jga jfz = new jfz(jgd.f7797b.mo1292a(jhe.m4489a(this.f15566d)));
            jgd.f7796a.add(jfz);
            this.f15564b = jfz;
        }
    }

    /* renamed from: b */
    public final void mo1298b() {
    }

    /* renamed from: c */
    public final void mo1299c() {
        this.f15568f.m2142a();
    }
}
