package p000;

import com.google.googlex.gcam.GoudaCompleteCallback;

/* compiled from: PG */
/* renamed from: gdb */
final class gdb extends GoudaCompleteCallback {
    /* renamed from: a */
    private final /* synthetic */ kpw f16801a;
    /* renamed from: b */
    private final /* synthetic */ gdv f16802b;

    gdb(kpw kpw, gdv gdv) {
        this.f16801a = kpw;
        this.f16802b = gdv;
    }

    public final void Run(long j) {
        String str = gcv.f16763a;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Gouda complete: id = ");
        stringBuilder.append(j);
        bli.m863a(str, stringBuilder.toString());
        this.f16801a.mo3557a(Boolean.valueOf(true));
        gdv gdv = this.f16802b;
        if (gdv != null) {
            kln kln = gdv.f5100b.f22626b;
            long currentTimeMillis = System.currentTimeMillis();
            cau cau = gdv.f5100b;
            kln.f22372b = (int) (currentTimeMillis - cau.f22633i);
            cau.f22635k = true;
            cau.m16918a(j);
        }
    }
}
