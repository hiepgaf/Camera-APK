package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bhj */
public final class bhj implements iqo {
    /* renamed from: a */
    public static final String f10875a = bli.m862a("CdrReqPro");
    /* renamed from: b */
    public final AtomicInteger f10876b = new AtomicInteger(0);
    /* renamed from: c */
    public final ivx f10877c;
    /* renamed from: d */
    private final fje f10878d = new fje();
    /* renamed from: e */
    private final iwg f10879e;

    public bhj(iwg iwg) {
        this.f10879e = iwg;
        this.f10877c = ivx.m4268a();
    }

    /* renamed from: a */
    public final void m7381a() {
        this.f10879e.mo2980a();
    }

    public final void close() {
        this.f10879e.close();
    }

    /* renamed from: a */
    public final iwn m7380a(int i) {
        return this.f10879e.mo2983b().mo2986a(i);
    }

    /* renamed from: a */
    public final synchronized void m7382a(fiv fiv, iwn iwn, bhu bhu, fiw fiw) {
        try {
            Map hashMap = new HashMap();
            Object a = this.f10878d.m2320a();
            hashMap.put(a, fiw);
            iwn.m4294a(a);
            List a2 = bhu.mo457a(this.f10879e, iwn);
            if (!a2.isEmpty()) {
                if (fiv == fiv.REPEATING) {
                    this.f10879e.mo2982b(a2, new bhk(this, hashMap), null);
                } else {
                    this.f10879e.mo2979a(a2, new bhk(this, hashMap), null);
                }
            }
        } catch (Throwable e) {
            throw new isr(e);
        }
    }
}
