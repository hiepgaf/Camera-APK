package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: fse */
final class fse implements gfn {
    /* renamed from: a */
    private final /* synthetic */ kpw f16492a;
    /* renamed from: b */
    private final /* synthetic */ iqm f16493b;
    /* renamed from: c */
    private final /* synthetic */ kpw f16494c;

    fse(kpw kpw, iqm iqm, kpw kpw2) {
        this.f16492a = kpw;
        this.f16493b = iqm;
        this.f16494c = kpw2;
    }

    /* renamed from: a */
    public final void mo1417a(ggu ggu, ggs ggs) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }

    /* renamed from: a */
    public final void mo1418a(ggu ggu, ggv ggv) {
        int[] iArr = ggv.f5176a;
        ggt ggt = ggu.f5175c;
        Object createBitmap = Bitmap.createBitmap(iArr, ggt.f5172c, ggt.f5171b, Config.ARGB_8888);
        if (ggu.f5173a == go.aV) {
            this.f16492a.mo3557a(createBitmap);
        } else if (ggu.f5173a == go.aW) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) this.f16493b.f7326e);
            this.f16494c.mo3557a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
        }
    }

    /* renamed from: a */
    public final void mo1416a(ggu ggu, Uri uri) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }

    /* renamed from: a */
    public final void mo1415a(ggu ggu) {
    }
}
