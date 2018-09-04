package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: frd */
final class frd implements gfn {
    /* renamed from: a */
    private final gkr f16434a;
    /* renamed from: b */
    private final iqm f16435b;
    /* renamed from: c */
    private final fbm f16436c;

    frd(gkr gkr, iqm iqm, fbm fbm) {
        this.f16434a = gkr;
        this.f16435b = iqm;
        this.f16436c = fbm;
    }

    /* renamed from: a */
    public final void mo1417a(ggu ggu, ggs ggs) {
        if (ggu.f5173a == go.aX) {
            this.f16434a.mo2875b(95);
            this.f16436c.mo1124a(ggs.f5169a);
        }
    }

    /* renamed from: a */
    public final void mo1418a(ggu ggu, ggv ggv) {
        int[] iArr;
        switch (ggu.f5173a - 1) {
            case 0:
                iArr = ggv.f5176a;
                ggt ggt = ggu.f5175c;
                this.f16434a.mo2864a(Bitmap.createBitmap(iArr, ggt.f5172c, ggt.f5171b, Config.ARGB_8888), this.f16435b.f7326e);
                return;
            case 1:
                iArr = ggv.f5176a;
                ggt ggt2 = ggu.f5175c;
                Bitmap createBitmap = Bitmap.createBitmap(iArr, ggt2.f5172c, ggt2.f5171b, Config.ARGB_8888);
                Matrix matrix = new Matrix();
                matrix.postRotate((float) this.f16435b.f7326e);
                this.f16434a.mo2863a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
                this.f16434a.mo2871a(hci.m11749a((int) R.string.session_saving_image, new Object[0]));
                this.f16434a.mo2875b(25);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo1416a(ggu ggu, Uri uri) {
    }

    /* renamed from: a */
    public final void mo1415a(ggu ggu) {
        switch (ggu.f5173a - 1) {
            case 0:
                this.f16434a.mo2875b(0);
                return;
            default:
                return;
        }
    }
}
