package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ya */
final class ya extends yl {
    /* renamed from: a */
    public final /* synthetic */ aas f19705a;
    /* renamed from: b */
    public final /* synthetic */ aaf f19706b;
    /* renamed from: c */
    public final /* synthetic */ xt f19707c;
    /* renamed from: d */
    private final /* synthetic */ Handler f19708d;

    ya(xt xtVar, aas aas, Handler handler, aaf aaf) {
        this.f19707c = xtVar;
        this.f19705a = aas;
        this.f19708d = handler;
        this.f19706b = aaf;
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.f19705a != null) {
            this.f19708d.post(new yb(this));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onImageAvailable(android.media.ImageReader r5) {
        /*
        r4 = this;
        r1 = r5.acquireNextImage();
        r0 = r4.f19706b;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0026;
    L_0x0008:
        r0 = r1.getPlanes();	 Catch:{ all -> 0x002c }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ all -> 0x002c }
        r0 = r0.getBuffer();	 Catch:{ all -> 0x002c }
        r2 = r0.remaining();	 Catch:{ all -> 0x002c }
        r2 = new byte[r2];	 Catch:{ all -> 0x002c }
        r0.get(r2);	 Catch:{ all -> 0x002c }
        r0 = r4.f19708d;	 Catch:{ all -> 0x002c }
        r3 = new yc;	 Catch:{ all -> 0x002c }
        r3.<init>(r4, r2);	 Catch:{ all -> 0x002c }
        r0.post(r3);	 Catch:{ all -> 0x002c }
    L_0x0026:
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r1.close();
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        r1.close();	 Catch:{ all -> 0x0035 }
    L_0x0034:
        throw r2;
    L_0x0035:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.onImageAvailable(android.media.ImageReader):void");
    }
}
