package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: flu */
final class flu implements fjm {
    /* renamed from: a */
    public final fjv f16167a;
    /* renamed from: b */
    public final fyk f16168b;
    /* renamed from: c */
    public final int f16169c;
    /* renamed from: d */
    public final Surface f16170d;
    /* renamed from: e */
    public final ikb f16171e;
    /* renamed from: f */
    private final fxr f16172f;
    /* renamed from: g */
    private final ikv f16173g;

    flu(ikb ikb, ikv ikv, ixb ixb, fjv fjv) {
        boolean z;
        if (ixb.mo3153f() > 2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f16171e = ikb;
        this.f16173g = ikv;
        iqp iqp = new iqp(ixb.mo3155h(), ixb.mo3151d());
        ixb.mo3152e();
        this.f16167a = fjv;
        this.f16169c = ixb.mo3153f() - 2;
        this.f16172f = new fxr(this.f16169c);
        this.f16168b = new fyk(this.f16172f);
        this.f16171e.mo1879a(this.f16172f);
        this.f16170d = ixb.mo3154g();
    }

    /* renamed from: a */
    public final fjk mo1397a(fjm... fjmArr) {
        Collection hashSet = new HashSet();
        hashSet.add(this);
        for (fjm fjm : fjmArr) {
            jri.m13144a(fjm instanceof flu, (Object) "ImageReader ImageSources can only be combined with other ImageReaderImageSources of the same type");
            hashSet.add((flu) fjm);
        }
        return new flv(new ArrayList(hashSet), this.f16173g);
    }

    /* renamed from: a */
    public final int mo1396a() {
        return this.f16169c;
    }
}
