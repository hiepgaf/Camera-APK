package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dsz */
public final class dsz extends imq implements ilp {
    /* renamed from: b */
    private final fwl f23014b;
    /* renamed from: c */
    private final fwl f23015c;

    public dsz(ilp ilp, ilp ilp2, fwl fwl, fwl fwl2) {
        super(ilq.m3822a(ilp, ilp2));
        this.f23014b = fwl;
        this.f23015c = fwl2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        List list = (List) obj;
        fxi fxi = (fxi) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        if (fxi == fxi.ON) {
            return this.f23014b;
        }
        if (fxi == fxi.AUTO && booleanValue) {
            return this.f23014b;
        }
        return this.f23015c;
    }
}
