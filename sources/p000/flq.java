package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: flq */
final class flq implements fjm {
    /* renamed from: a */
    public final fjv f16151a;
    /* renamed from: b */
    public final fyk f16152b;
    /* renamed from: c */
    public final int f16153c;
    /* renamed from: d */
    public final Surface f16154d;
    /* renamed from: e */
    public final ikb f16155e;
    /* renamed from: f */
    private final ikv f16156f;

    flq(ikb ikb, ikv ikv, ixb ixb, fjv fjv) {
        this.f16155e = ikb;
        this.f16156f = ikv;
        this.f16151a = fjv;
        iqp iqp = new iqp(ixb.mo3155h(), ixb.mo3151d());
        ixb.mo3152e();
        this.f16153c = ixb.mo3153f();
        this.f16154d = ixb.mo3154g();
        this.f16152b = new fyk((fyt) ikb.mo1879a(new fxr(this.f16153c)));
    }

    /* renamed from: a */
    public final fjk mo1397a(fjm... fjmArr) {
        Collection hashSet = new HashSet();
        hashSet.add(this);
        for (fjm fjm : fjmArr) {
            jri.m13144a(fjm instanceof flq, (Object) "ImageReader ImageSources can only be combined with other ImageReaderImageSources of the same type");
            hashSet.add((flq) fjm);
        }
        return new flr(new ArrayList(hashSet), this.f16156f);
    }

    /* renamed from: a */
    public final int mo1396a() {
        return this.f16153c;
    }
}
