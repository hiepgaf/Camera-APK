package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fqx */
public final class fqx implements fre, iqo {
    /* renamed from: a */
    public final Executor f16406a;
    /* renamed from: b */
    public final hju f16407b;
    /* renamed from: c */
    private final ghf f16408c;
    /* renamed from: d */
    private final fov f16409d;
    /* renamed from: e */
    private final ird f16410e;
    /* renamed from: f */
    private final ilp f16411f;
    /* renamed from: g */
    private final AtomicBoolean f16412g = new AtomicBoolean(false);

    public fqx(Executor executor, hju hju, ird ird) {
        jri.m13152b((Object) executor);
        this.f16406a = executor;
        this.f16411f = new ilb(Integer.valueOf(2));
        this.f16407b = hju;
        this.f16410e = ird;
        this.f16408c = new ghc();
        this.f16409d = new fov(2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final byte[] m10677a(p000.gfw r8, int r9) {
        /*
        r7 = this;
        r0 = r7.f16410e;
        r1 = "allocateAndCompressJpeg";
        r0.mo1903a(r1);
        r0 = r8.f5153f;
        r0 = r0.width();
        r0 = r0 * 3;
        r1 = r8.f5153f;
        r1 = r1.height();
        r2 = r0 * r1;
        r3 = r2 / 2;
        r0 = r7.f16408c;
        r1 = java.lang.Integer.valueOf(r3);
        r4 = r0.m2551c(r1);
        r0 = r4.m11082a();	 Catch:{ all -> 0x0049 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x0050;
    L_0x002b:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r2 = 53;
        r1.<init>(r2);	 Catch:{ all -> 0x0049 }
        r2 = "Failed to allocate buffer for JPEG: ";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1.append(r3);	 Catch:{ all -> 0x0049 }
        r2 = " bytes";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1 = r1.toString();	 Catch:{ all -> 0x0049 }
        r0.<init>(r1);	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r1 = move-exception;
        r4.close();	 Catch:{ all -> 0x00d2 }
    L_0x004f:
        throw r1;
    L_0x0050:
        r1 = r8.f5149b;	 Catch:{ all -> 0x0049 }
        r5 = r8.f5153f;	 Catch:{ all -> 0x0049 }
        r1 = com.google.android.libraries.camera.jpegutil.JpegUtilNative.m1353a(r1, r0, r9, r5);	 Catch:{ all -> 0x0049 }
        if (r1 <= r3) goto L_0x00ce;
    L_0x005a:
        r4.close();	 Catch:{ all -> 0x0049 }
        r0 = r7.f16408c;	 Catch:{ all -> 0x0049 }
        r1 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0049 }
        r0.m2551c(r1);	 Catch:{ all -> 0x0049 }
        r0 = r4.m11082a();	 Catch:{ all -> 0x0049 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x008c;
    L_0x006e:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r3 = 53;
        r1.<init>(r3);	 Catch:{ all -> 0x0049 }
        r3 = "Failed to allocate buffer for JPEG: ";
        r1.append(r3);	 Catch:{ all -> 0x0049 }
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r2 = " bytes";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1 = r1.toString();	 Catch:{ all -> 0x0049 }
        r0.<init>(r1);	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x008c:
        r1 = r8.f5149b;	 Catch:{ all -> 0x0049 }
        r2 = r8.f5153f;	 Catch:{ all -> 0x0049 }
        r1 = com.google.android.libraries.camera.jpegutil.JpegUtilNative.m1353a(r1, r0, r9, r2);	 Catch:{ all -> 0x0049 }
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x0097:
        if (r0 > 0) goto L_0x00b2;
    L_0x0099:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r3 = 57;
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        r3 = "Error compressing jpeg: num bytes written was ";
        r2.append(r3);	 Catch:{ all -> 0x0049 }
        r2.append(r0);	 Catch:{ all -> 0x0049 }
        r0 = r2.toString();	 Catch:{ all -> 0x0049 }
        r1.<init>(r0);	 Catch:{ all -> 0x0049 }
        throw r1;	 Catch:{ all -> 0x0049 }
    L_0x00b2:
        r2 = 0;
        r1.position(r2);	 Catch:{ all -> 0x0049 }
        r1.limit(r0);	 Catch:{ all -> 0x0049 }
        r2 = java.nio.ByteOrder.nativeOrder();	 Catch:{ all -> 0x0049 }
        r1.order(r2);	 Catch:{ all -> 0x0049 }
        r0 = new byte[r0];	 Catch:{ all -> 0x0049 }
        r1.get(r0);	 Catch:{ all -> 0x0049 }
        r1 = r7.f16410e;	 Catch:{ all -> 0x0049 }
        r1.mo1904b();	 Catch:{ all -> 0x0049 }
        r4.close();
        return r0;
    L_0x00ce:
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0097;
    L_0x00d2:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fqx.a(gfw, int):byte[]");
    }

    public final void close() {
        if (this.f16412g.compareAndSet(false, true)) {
            this.f16409d.close();
            this.f16411f.mo348a(Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public final ilp mo1413b() {
        return this.f16411f;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo1412a(Object obj) {
        gfw gfw = (gfw) obj;
        if (gfw.f5149b.mo2716c() == 35) {
            return this.f16409d.m10590a(new fqy(this, gfw));
        }
        gfw.f5149b.close();
        return kow.m13618a(new isr("Only YUV_420_888 images are supported"));
    }
}
