package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.utils.MathUtils;

/* compiled from: PG */
/* renamed from: jsz */
final class jsz implements izi {
    /* renamed from: a */
    private final jqo f19018a;
    /* renamed from: b */
    private final long f19019b;
    /* renamed from: c */
    private final /* synthetic */ jsw f19020c;

    public jsz(jsw jsw, long j, jqo jqo) {
        this.f19020c = jsw;
        this.f19018a = jqo;
        this.f19019b = j;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        jqs jqs = (jqs) obj;
        jzp a = jzp.m4714a(jqs);
        int i = this.f19020c.f7956f;
        a = MathUtils.fitSizeInside(a, new jzp(i, i));
        jqr a2 = jqs.mo3171a(a.f8149a, a.f8150b, this.f19018a);
        this.f19020c.f7955e.m4673a(this.f19020c.f7951a.mo2043a(this.f19019b, (Bitmap) a2.mo3191e()));
        return new jsx(this.f19019b, a2, this.f19020c.f7953c.mo2048a((Bitmap) a2.mo3191e()));
    }
}
