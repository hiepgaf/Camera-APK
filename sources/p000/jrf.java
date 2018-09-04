package p000;

import android.annotation.TargetApi;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jrf */
public final class jrf implements jqs {
    /* renamed from: a */
    private final jqz f21889a;
    /* renamed from: b */
    private final int f21890b;
    /* renamed from: c */
    private final int f21891c;
    /* renamed from: d */
    private final float f21892d;
    /* renamed from: e */
    private final float f21893e;

    public jrf(jqz jqz, int i, int i2) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) jqz);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Target width must be positive.");
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "Target height must be positive.");
        this.f21889a = jqz;
        this.f21890b = i;
        this.f21891c = i2;
        jqz jqz2 = this.f21889a;
        this.f21892d = ((float) jqz2.f21886a) / ((float) this.f21890b);
        this.f21893e = ((float) jqz2.f21887b) / ((float) this.f21891c);
    }

    public final void close() {
        this.f21889a.close();
    }

    /* renamed from: a */
    public final int mo703a() {
        return this.f21891c;
    }

    /* renamed from: b */
    public final int mo704b() {
        return this.f21890b;
    }

    /* renamed from: a */
    public final jqr mo3173a(jqo jqo) {
        return mo3174b(jqo);
    }

    /* renamed from: b */
    public final jqr mo3174b(jqo jqo) {
        return mo3171a(this.f21890b, this.f21891c, jqo);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.jqr mo3172a(android.graphics.Rect r7, p000.jqo r8) {
        /*
        r6 = this;
        r0 = new android.graphics.Rect;
        r1 = r7.left;
        r1 = (float) r1;
        r2 = r6.f21892d;
        r1 = r1 * r2;
        r1 = java.lang.Math.round(r1);
        r2 = r7.top;
        r2 = (float) r2;
        r3 = r6.f21893e;
        r2 = r2 * r3;
        r2 = java.lang.Math.round(r2);
        r3 = r7.right;
        r3 = (float) r3;
        r4 = r6.f21892d;
        r3 = r3 * r4;
        r3 = java.lang.Math.round(r3);
        r4 = r7.bottom;
        r4 = (float) r4;
        r5 = r6.f21893e;
        r4 = r4 * r5;
        r4 = java.lang.Math.round(r4);
        r0.<init>(r1, r2, r3, r4);
        r1 = r6.f21889a;
        r1 = r1.mo3172a(r0, r8);
        r0 = "rescale-region";
        r2 = r7.width();	 Catch:{ all -> 0x0047 }
        r3 = r7.height();	 Catch:{ all -> 0x0047 }
        r0 = p000.jqp.m4611a(r8, r0, r1, r2, r3);	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0046;
    L_0x0043:
        r1.close();
    L_0x0046:
        return r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r2 = move-exception;
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r1.close();	 Catch:{ all -> 0x0050 }
    L_0x004f:
        throw r2;
    L_0x0050:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: jrf.a(android.graphics.Rect, jqo):jqr");
    }

    /* renamed from: a */
    public final jqr mo3171a(int i, int i2, jqo jqo) {
        return this.f21889a.mo3171a(i, i2, jqo);
    }
}
