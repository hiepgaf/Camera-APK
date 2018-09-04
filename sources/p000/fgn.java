package p000;

import android.annotation.TargetApi;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fgn */
public final class fgn extends imq {
    /* renamed from: b */
    private final int f23182b;

    public fgn(ilp ilp, ilp ilp2, ffc ffc) {
        super(ilq.m3822a(ilp, ilp2));
        this.f23182b = ffc.mo1934p();
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        List list = (List) obj;
        Boolean bool = (Boolean) list.get(0);
        ius ius = (ius) list.get(1);
        if (this.f23182b == go.bO && bool.booleanValue()) {
            return Integer.valueOf(18);
        }
        if (ius == ius.FULL || ius == ius.SIMPLE) {
            return Integer.valueOf(1);
        }
        return Integer.valueOf(0);
    }
}
