package p000;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fze */
public final class fze extends imq {
    /* renamed from: b */
    private static final String f23223b = bli.m862a("MultiCropRegion");
    /* renamed from: c */
    private final List f23224c;
    /* renamed from: d */
    private final float f23225d = ((Float) Collections.min(this.f23224c)).floatValue();
    /* renamed from: e */
    private final double f23226e;
    /* renamed from: f */
    private final int f23227f;
    /* renamed from: g */
    private final int f23228g;

    public fze(ilp ilp, iun iun) {
        super(ilp);
        String str = f23223b;
        String valueOf = String.valueOf(iun.mo1922d());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("current camera id =  ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        this.f23224c = iun.mo1925g();
        this.f23226e = ion.m3935a(iun);
        Rect n = iun.mo1932n();
        this.f23227f = n.width() / 2;
        this.f23228g = n.height() / 2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        boolean z;
        boolean z2 = false;
        float floatValue = ((Float) obj).floatValue();
        double a = ion.m3934a(this.f23225d, this.f23226e / ((double) floatValue));
        double d = this.f23226e;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (a > 0.0d && a < 6.283185307179586d) {
            z2 = true;
        }
        jri.m13143a(z2);
        double tan = Math.tan(a / 2.0d);
        List list = this.f23224c;
        d = (double) ((float) (d / (tan + tan)));
        for (int size = list.size() - 1; size >= 0; size--) {
            floatValue = ((Float) list.get(size)).floatValue();
            double d2 = (double) floatValue;
            if (d2 < d || Math.abs(d - d2) < 9.999999747378752E-6d) {
                double a2 = ion.m3933a(a, floatValue) / this.f23226e;
                size = this.f23227f;
                int i = (int) (((double) size) * a2);
                int i2 = this.f23228g;
                int i3 = (int) (a2 * ((double) i2));
                return new fzd(new Rect(size - i, i2 - i3, size + i, i3 + i2), floatValue);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("focal length needed = ");
        stringBuilder.append(d);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
