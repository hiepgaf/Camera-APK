package p000;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: amz */
public final class amz implements adq {
    /* renamed from: a */
    private final amm f9897a;
    /* renamed from: b */
    private final agu f9898b;

    public amz(amm amm, agu agu) {
        this.f9897a = amm;
        this.f9898b = agu;
    }

    /* renamed from: a */
    private final agn m6665a(InputStream inputStream, int i, int i2, adp adp) {
        if (inputStream instanceof amw) {
            inputStream = (amw) inputStream;
            Object obj = null;
        } else {
            int i3 = 1;
            inputStream = new amw(inputStream, this.f9898b);
        }
        InputStream a = arl.m627a(inputStream);
        try {
            agn a2 = this.f9897a.m351a(new aro(a), i, i2, adp, new ana(inputStream, a));
            return a2;
        } finally {
            a.m628a();
            if (obj != null) {
                inputStream.m361b();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo102a(Object obj, adp adp) {
        return amm.m344a();
    }
}
