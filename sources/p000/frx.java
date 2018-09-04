package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: frx */
final class frx implements kaw {
    /* renamed from: a */
    private final /* synthetic */ List f16483a;

    frx(List list) {
        this.f16483a = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        boolean z;
        boolean z2 = true;
        Iterable iterable = (Set) obj;
        jri.m13152b((Object) iterable);
        if (iterable.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        gfw gfw = (gfw) khb.m4861a(iterable, 0);
        long f = gfw.f5149b.mo2719f();
        gfw.f5149b.close();
        List arrayList = new ArrayList();
        for (iwz f2 : this.f16483a) {
            arrayList.add(Long.valueOf(f2.mo2719f()));
        }
        int indexOf = arrayList.indexOf(Long.valueOf(f));
        if (indexOf < 0) {
            z2 = false;
        }
        jri.m13153b(z2);
        return Integer.valueOf(indexOf);
    }
}
