package p000;

import java.util.Iterator;

/* renamed from: fye */
final /* synthetic */ class fye implements kaw {
    /* renamed from: a */
    private final fyd f16639a;

    fye(fyd fyd) {
        this.f16639a = fyd;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        fyd fyd = this.f16639a;
        obj = (bbo) obj;
        jri.m13152b(obj);
        bbo bbo = new bbo();
        Iterator it = obj.iterator();
        while (it.hasNext()) {
            bbo.add(new fyh(fyd, (fyr) it.next()));
        }
        return bbo;
    }
}
