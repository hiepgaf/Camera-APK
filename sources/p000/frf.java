package p000;

import android.annotation.TargetApi;
import java.util.Collection;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: frf */
public final class frf implements fre {
    /* renamed from: a */
    private final fre f16437a;
    /* renamed from: b */
    private final Collection f16438b;

    private frf(fre fre) {
        this.f16437a = fre;
    }

    public frf(fre fre, Collection collection) {
        this(fre);
        this.f16438b = collection;
    }

    /* renamed from: b */
    public final ilp mo1413b() {
        return this.f16437a.mo1413b();
    }

    /* renamed from: a */
    public final kpk mo1412a(Object obj) {
        boolean z;
        fre fre = this.f16437a;
        obj = (gfw) obj;
        jri.m13152b(obj);
        if (obj.f5149b.mo2716c() == 35) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Invalid image format.");
        frj a = fri.m10698a(obj.f5149b, obj.f5151d).m2364a(this.f16438b);
        a.f4666a = obj.f5150c;
        return fre.mo1412a(a.m2363a());
    }
}
