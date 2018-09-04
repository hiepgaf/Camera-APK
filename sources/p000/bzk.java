package p000;

import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzk */
final class bzk extends EncodedBlobCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f11539a;
    /* renamed from: b */
    private final /* synthetic */ bze f11540b;

    bzk(bze bze, bzx bzx) {
        this.f11540b = bze;
        this.f11539a = bzx;
    }

    public final void Run(int i, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i2, int i3) {
        boolean z;
        bli.m863a(bze.f1734a, String.format(null, "Gcam merged DNG data ready: %d bytes, shotId = %d", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
        if (this.f11540b.f1752s == go.f5588z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        jri.m13154b(this.f11539a.mo596b().mo2084b(), (Object) "Got merged DNG callback but no callback present");
        cag cag = (cag) this.f11539a.mo596b().mo2081a();
        iqo bzw = new bzw(sWIGTYPE_p_unsigned_char, j, i2, i3);
        if (cag.f1792a.f4753b.mo2883k() == glw.RAW) {
            fqv a = cag.f1793b.m7836a();
            jri.m13152b((Object) a);
            ByteBuffer duplicate = bzw.f11554a.duplicate();
            iqp a2 = iqp.m4043a(bzw.f11555b, bzw.f11556c);
            iqm a3 = iqm.m4037a(cag.f1794c);
            ikb ikb = cag.f1792a.f4752a.f4451g;
            String str = fqu.f16401a;
            String valueOf = String.valueOf(a.f21403b);
            int capacity = duplicate.capacity();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
            stringBuilder.append("Called addDngImage with burstId ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" and file size ");
            stringBuilder.append(capacity);
            bli.m869c(str, stringBuilder.toString());
            try {
                byte[] bArr = new byte[duplicate.capacity()];
                duplicate.get(bArr);
                long l = a.f21402a.mo2884l();
                gkr gkr = a.f21402a;
                gkr gkr2 = gkr;
                gkr2.mo2868a(new bnm(gkr.mo2886n(), 0, l, l, a.f21403b, a3, a2.f7329a, a2.f7330b, bArr, null, gdy.m2498c().m2501a(), bve.DNG, false, "DNG"));
                a.f21406e.f16403c.m4331a(0.0f, a.f21402a.mo2884l());
                synchronized (a) {
                    a.f21405d = true;
                    a.m15719a(ikb);
                }
            } finally {
                bzw.close();
            }
        } else {
            cag.f1795d.f11686h.mo516c("Got onDngReady() callback with raw data but did not request it");
        }
    }
}
