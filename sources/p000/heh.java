package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: heh */
public final class heh {
    /* renamed from: a */
    private final ffc f6088a;
    /* renamed from: b */
    private final heq f6089b;

    public heh(ffc ffc, heq heq) {
        jri.m13152b((Object) ffc);
        jri.m13152b((Object) heq);
        this.f6088a = ffc;
        this.f6089b = heq;
    }

    /* renamed from: a */
    public final iqp m3094a(ipz ipz, inc inc, ine ine) {
        if (inc.m3876d()) {
            return ine.m3881c();
        }
        iut c = this.f6088a.mo1921c();
        List arrayList = new ArrayList();
        for (iqp iqp : this.f6088a.mo1935q()) {
            if (iqp.m4046a() <= ine.m3880b()) {
                arrayList.add(iqp);
            }
        }
        jri.m13143a(arrayList.isEmpty() ^ 1);
        return this.f6089b.m3098a(arrayList, ipz, c, true);
    }
}
