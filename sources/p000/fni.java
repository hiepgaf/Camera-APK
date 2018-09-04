package p000;

import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: fni */
public final class fni implements kaw {
    /* renamed from: a */
    private final /* synthetic */ int f16224a;
    /* renamed from: b */
    private final /* synthetic */ fnh f16225b;

    public fni(fnh fnh, ixf ixf, int i) {
        this.f16225b = fnh;
        this.f16224a = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        obj = (Surface) obj;
        jri.m13152b(obj);
        Object ivj = new ivj(new fnc(new iub(ImageWriter.newInstance(obj, this.f16224a)), this.f16225b.f4634b));
        this.f16225b.f4633a.mo1879a(ivj);
        fnh fnh = this.f16225b;
        return new fmw(ivj, fnh.f4633a, fnh.f4635c);
    }
}
