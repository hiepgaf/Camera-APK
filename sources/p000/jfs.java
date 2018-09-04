package p000;

import android.media.Image;

/* compiled from: PG */
/* renamed from: jfs */
public final class jfs implements jfx {
    /* renamed from: a */
    private kbg f18755a = kau.f19138a;
    /* renamed from: b */
    private final /* synthetic */ Image f18756b;
    /* renamed from: c */
    private final /* synthetic */ int f18757c;
    /* renamed from: d */
    private final /* synthetic */ int f18758d;
    /* renamed from: e */
    private final /* synthetic */ jfw f18759e;

    public jfs(jfw jfw, Image image, int i, int i2) {
        this.f18759e = jfw;
        this.f18756b = image;
        this.f18757c = i;
        this.f18758d = i2;
    }

    public final void close() {
        int i;
        if (this.f18755a.mo2084b()) {
            i = this.f18757c;
        } else {
            i = 0;
        }
        this.f18759e.f7781a.queueInputBuffer(this.f18758d, 0, i, ((Long) this.f18755a.mo2082a(Long.valueOf(0))).longValue(), 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1990a() {
        return this.f18756b;
    }

    /* renamed from: a */
    public final void mo1991a(long j) {
        this.f18755a = kbg.m4745c(Long.valueOf(j));
    }
}
