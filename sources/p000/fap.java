package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fap */
public final class fap extends imq {
    public fap(ilp ilp, ilp ilp2) {
        super(ilq.m3822a(ilp, ilp2));
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        boolean z;
        boolean z2 = false;
        List list = (List) obj;
        if (list.size() == 2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        Boolean bool = (Boolean) list.get(0);
        if (((Boolean) list.get(1)).booleanValue() && bool.booleanValue()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
