package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: fqa */
final class fqa implements gfn {
    /* renamed from: a */
    private final gkr f16361a;
    /* renamed from: b */
    private final fbm f16362b;

    fqa(gkr gkr, fbm fbm) {
        this.f16361a = gkr;
        this.f16362b = fbm;
    }

    /* renamed from: a */
    public final void mo1417a(ggu ggu, ggs ggs) {
        if (ggu.f5173a == go.aX) {
            Options options = new Options();
            options.inSampleSize = 4;
            byte[] bArr = ggs.f5169a;
            this.f16361a.mo2864a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), isx.m4158a(isx.m4161a(ggs.f5169a)).f7326e);
            this.f16362b.mo1124a(ggs.f5169a);
        }
    }

    /* renamed from: a */
    public final void mo1418a(ggu ggu, ggv ggv) {
    }

    /* renamed from: a */
    public final void mo1416a(ggu ggu, Uri uri) {
    }

    /* renamed from: a */
    public final void mo1415a(ggu ggu) {
    }
}
