package p000;

import android.annotation.TargetApi;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.OutputStream;
import java.util.UUID;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnm */
public final class bnm implements bnl {
    /* renamed from: a */
    private static final String f11077a = bli.m862a("BurstMemoryImage");
    /* renamed from: b */
    private final String f11078b;
    /* renamed from: c */
    private final UUID f11079c;
    /* renamed from: d */
    private final iqm f11080d;
    /* renamed from: e */
    private final int f11081e;
    /* renamed from: f */
    private final int f11082f;
    /* renamed from: g */
    private final int f11083g;
    /* renamed from: h */
    private final long f11084h;
    /* renamed from: i */
    private final long f11085i;
    /* renamed from: j */
    private final bve f11086j;
    /* renamed from: k */
    private final boolean f11087k;
    /* renamed from: l */
    private final String f11088l;
    /* renamed from: m */
    private final gdy f11089m;
    /* renamed from: n */
    private byte[] f11090n;
    /* renamed from: o */
    private ExifInterface f11091o;
    /* renamed from: p */
    private File f11092p;

    /* renamed from: a */
    private static /* synthetic */ void m7601a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        outputStream.close();
    }

    public bnm(String str, int i, long j, long j2, UUID uuid, iqm iqm, int i2, int i3, byte[] bArr, ExifInterface exifInterface, gdy gdy, bve bve, boolean z, String str2) {
        this.f11078b = str;
        this.f11083g = i;
        this.f11084h = j;
        this.f11085i = j2;
        this.f11079c = uuid;
        this.f11080d = iqm;
        this.f11081e = i2;
        this.f11082f = i3;
        this.f11090n = bArr;
        this.f11091o = exifInterface;
        this.f11089m = gdy;
        this.f11086j = bve;
        this.f11087k = z;
        this.f11088l = str2;
    }

    /* renamed from: a */
    public final synchronized void mo537a() {
        jri.m13153b(ikd.m12260b() ^ 1);
        this.f11090n = null;
        this.f11091o = null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bnm) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ixx mo538b() {
        return this.f11086j != bve.DNG ? ixx.JPEG : ixx.DNG;
    }

    /* renamed from: c */
    public final iqm mo539c() {
        return this.f11080d;
    }

    /* renamed from: d */
    public final File mo540d() {
        return null;
    }

    /* renamed from: e */
    public final long mo541e() {
        return this.f11085i;
    }

    public final int hashCode() {
        return String.format("%d_%dx%d_%d", new Object[]{Long.valueOf(this.f11085i), Integer.valueOf(this.f11081e), Integer.valueOf(this.f11082f), Integer.valueOf(this.f11083g)}).hashCode();
    }

    /* renamed from: f */
    public final int mo542f() {
        return this.f11082f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.boe mo535a(p000.gsl r7, java.io.File r8, boolean r9, boolean r10) {
        /*
        r6 = this;
        r0 = r6.f11092p;
        if (r0 != 0) goto L_0x00b6;
    L_0x0004:
        r0 = r6.f11086j;
        r1 = p000.bve.DNG;
        if (r0 != r1) goto L_0x002b;
    L_0x000a:
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00bb }
        r1.<init>(r8);	 Catch:{ IOException -> 0x00bb }
        r0 = r6.f11090n;	 Catch:{ all -> 0x00e2 }
        r1.write(r0);	 Catch:{ all -> 0x00e2 }
        r1.close();	 Catch:{ IOException -> 0x00bb }
    L_0x0017:
        r0 = new boe;
        r1 = r6.f11080d;
        r2 = r6.f11081e;
        r3 = r6.f11082f;
        r2 = p000.iqp.m4043a(r2, r3);
        r3 = r6.mo536a(r9, r10);
        r0.<init>(r8, r1, r2, r3);
        return r0;
    L_0x002b:
        r2 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x009d }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x009d }
        r0.<init>(r8);	 Catch:{ IOException -> 0x009d }
        r2.<init>(r0);	 Catch:{ IOException -> 0x009d }
        r0 = r6.f11091o;	 Catch:{ all -> 0x00e9 }
        r0 = p000.jri.m13152b(r0);	 Catch:{ all -> 0x00e9 }
        r0 = (com.google.android.libraries.camera.exif.ExifInterface) r0;	 Catch:{ all -> 0x00e9 }
        r3 = r0.m8481a(r2);	 Catch:{ all -> 0x00e9 }
        r0 = r6.f11087k;	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00ae;
    L_0x0045:
        if (r9 != 0) goto L_0x00ae;
    L_0x0047:
        r0 = p000.bve.NONE;	 Catch:{ all -> 0x00f0 }
        r0 = r0.m1007d();	 Catch:{ all -> 0x00f0 }
        r1 = r0;
    L_0x004e:
        r0 = r6.f11089m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo1465b();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo2084b();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00a4;
    L_0x005a:
        r4 = r6.f11079c;	 Catch:{ all -> 0x00f0 }
        r5 = r9 ^ 1;
        r0 = r6.f11089m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo1465b();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo2081a();	 Catch:{ all -> 0x00f0 }
        r0 = (p000.wd) r0;	 Catch:{ all -> 0x00f0 }
        r0 = p000.bbz.m789a(r4, r9, r1, r5, r0);	 Catch:{ all -> 0x00f0 }
        r1 = r0;
    L_0x006f:
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x00f0 }
        r4.<init>();	 Catch:{ all -> 0x00f0 }
        r5 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x00f0 }
        r0 = r6.f11090n;	 Catch:{ all -> 0x00f0 }
        r5.<init>(r0);	 Catch:{ all -> 0x00f0 }
        r0 = r6.f11089m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo1464a();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo2085c();	 Catch:{ all -> 0x00f0 }
        r0 = (p000.wd) r0;	 Catch:{ all -> 0x00f0 }
        com.google.android.apps.camera.metadata.refocus.XmpUtil.writeXMPMeta(r5, r4, r1, r0);	 Catch:{ all -> 0x00f0 }
        r0 = r4.toByteArray();	 Catch:{ all -> 0x00f0 }
        r3.write(r0);	 Catch:{ all -> 0x00f0 }
        r6.f11092p = r8;	 Catch:{ all -> 0x00f0 }
        r0 = 0;
        p000.bnm.m7601a(r0, r3);	 Catch:{ all -> 0x00e9 }
        r0 = 0;
        p000.bnm.m7601a(r0, r2);	 Catch:{ IOException -> 0x009d }
        goto L_0x0017;
    L_0x009d:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x00a4:
        r0 = r6.f11079c;	 Catch:{ all -> 0x00f0 }
        r4 = r9 ^ 1;
        r0 = p000.bbz.m788a(r0, r9, r1, r4);	 Catch:{ all -> 0x00f0 }
        r1 = r0;
        goto L_0x006f;
    L_0x00ae:
        r0 = r6.f11086j;	 Catch:{ all -> 0x00f0 }
        r0 = r0.m1007d();	 Catch:{ all -> 0x00f0 }
        r1 = r0;
        goto L_0x004e;
    L_0x00b6:
        r7.mo1617a(r0, r8);
        goto L_0x0017;
    L_0x00bb:
        r0 = move-exception;
        r1 = f11077a;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 26;
        r3.<init>(r2);
        r2 = "Could not write DNG file: ";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        p000.bli.m866b(r1, r0);
        goto L_0x0017;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r2 = move-exception;
        p000.bnm.m7601a(r0, r1);	 Catch:{ IOException -> 0x00bb }
        throw r2;	 Catch:{ IOException -> 0x00bb }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r1 = move-exception;
        p000.bnm.m7601a(r0, r2);	 Catch:{ IOException -> 0x009d }
        throw r1;	 Catch:{ IOException -> 0x009d }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r1 = move-exception;
        p000.bnm.m7601a(r0, r3);	 Catch:{ all -> 0x00e9 }
        throw r1;	 Catch:{ all -> 0x00e9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: bnm.a(gsl, java.io.File, boolean, boolean):boe");
    }

    /* renamed from: h */
    public final boolean mo543h() {
        return this.f11087k;
    }

    /* renamed from: a */
    public final String mo536a(boolean z, boolean z2) {
        if (this.f11086j == bve.DNG || this.f11086j == bve.NONE) {
            return this.f11078b;
        }
        Object obj;
        boolean z3;
        if (!z) {
            obj = null;
        } else if (this.f11087k) {
            obj = 1;
        } else {
            obj = null;
        }
        if (this.f11086j != bve.PORTRAIT) {
            z3 = false;
        } else if (obj == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return jxr.m4676a(this.f11083g, this.f11084h, this.f11088l, z, z2, z3, "yyyyMMddHHmmssSSS");
    }

    public final String toString() {
        long j = this.f11085i;
        String valueOf = String.valueOf(this.f11086j);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append("BurstMemoryImage[");
        stringBuilder.append(j);
        stringBuilder.append("][");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    public final int mo544i() {
        return this.f11081e;
    }
}
