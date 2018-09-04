package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: cyk */
final class cyk implements kaw {
    /* renamed from: a */
    private final /* synthetic */ cyd f12853a;

    cyk(cyd cyd) {
        this.f12853a = cyd;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        boolean z;
        boolean z2 = false;
        obj = (List) obj;
        jri.m13152b(obj);
        if (obj.size() == 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        boolean booleanValue = ((Boolean) obj.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) obj.get(1)).booleanValue();
        z = ((Boolean) obj.get(2)).booleanValue();
        if (!(booleanValue || booleanValue2 || z || this.f12853a.f22753d.mo2860b() != fxj.ON)) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
