package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: jqu */
public class jqu implements jqt {
    /* renamed from: a */
    private final jrj f18962a;
    /* renamed from: b */
    private final jqo f18963b;

    public jqu(jqo jqo, jrj jrj) {
        jri.m13152b((Object) jqo);
        jri.m13152b((Object) jrj);
        this.f18963b = jqo;
        this.f18962a = jrj;
    }

    /* renamed from: a */
    public final void mo2040a(long j, Bitmap bitmap, boolean z) {
        jri.m13152b((Object) bitmap);
        this.f18962a.m4622a(j, new jqx(this.f18963b.mo2042a("summary", bitmap)), z);
    }

    /* renamed from: a */
    public final void mo2039a() {
    }
}
