package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: irl */
public final class irl implements iqo {
    /* renamed from: a */
    public final String f18523a;
    /* renamed from: b */
    public final ird f18524b;
    /* renamed from: c */
    public final Object f18525c;
    /* renamed from: d */
    public final irx f18526d;
    /* renamed from: e */
    private final CameraManager f18527e;
    /* renamed from: f */
    private final irs f18528f;
    /* renamed from: g */
    private final Executor f18529g;
    /* renamed from: h */
    private final Handler f18530h;
    /* renamed from: i */
    private final iya f18531i;
    /* renamed from: j */
    private final Object f18532j;
    /* renamed from: k */
    private boolean f18533k = false;
    /* renamed from: l */
    private boolean f18534l = false;

    public irl(Handler handler, Executor executor, CameraManager cameraManager, irs irs, ird ird, iya iya, String str) {
        this.f18523a = str;
        this.f18527e = cameraManager;
        this.f18531i = iya;
        this.f18524b = ird;
        this.f18528f = irs;
        this.f18530h = handler;
        this.f18529g = executor;
        this.f18526d = new irx();
        this.f18532j = new Object();
        this.f18525c = new Object();
    }

    public final void close() {
        synchronized (this.f18532j) {
            this.f18534l = true;
        }
        synchronized (this.f18525c) {
            this.f18525c.notify();
        }
    }

    /* renamed from: a */
    private final void m12416a(String str, Exception exception, boolean z) {
        Log.e("CAM_CameraOpener", str, exception);
        if (z) {
            this.f18528f.mo1583a(irt.FAIL_EXCEPTION);
        }
    }

    /* renamed from: a */
    private final void m12417a(boolean z) {
        String str = this.f18523a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
        stringBuilder.append("Failed to open camera ");
        stringBuilder.append(str);
        stringBuilder.append(" after timeout.");
        Log.e("CAM_CameraOpener", stringBuilder.toString());
        if (z) {
            this.f18528f.mo1583a(irt.FAIL_TIMEOUT);
        }
    }

    /* renamed from: a */
    private final irp m12415a(irx irx, boolean z, long j, long j2) {
        irp a;
        StringBuilder stringBuilder;
        String valueOf = String.valueOf(this.f18523a);
        String str = "cameraManager#openCamera ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        Log.d("CAM_CameraOpener", valueOf);
        iri iro = new iro(this.f18524b);
        irx.m12431a(iro);
        this.f18524b.mo1903a("CameraDeviceOpener#open");
        try {
            CameraManager cameraManager = this.f18527e;
            String str2 = this.f18523a;
            cameraManager.openCamera(str2, new irf(irx, str2), this.f18530h);
            a = iro.m12420a((7000 + j) - j2);
        } catch (Exception e) {
            switch (e.getReason()) {
                case 1:
                    str = this.f18523a;
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 53);
                    stringBuilder.append("Camera device ");
                    stringBuilder.append(str);
                    stringBuilder.append(" failed to open because it is disabled!");
                    m12416a(stringBuilder.toString(), e, z);
                    irx.mo1151a(3);
                    a = irp.ERROR;
                    this.f18524b.mo1904b();
                    break;
                case 2:
                case 3:
                    a = irp.RETRY;
                    this.f18524b.mo1904b();
                    break;
                case 4:
                    str = this.f18523a;
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 87);
                    stringBuilder.append("Camera device ");
                    stringBuilder.append(str);
                    stringBuilder.append(" failed to open because it is currently in use by another app or process.");
                    m12416a(stringBuilder.toString(), e, z);
                    irx.mo1151a(1);
                    a = irp.ERROR;
                    this.f18524b.mo1904b();
                    break;
                case 5:
                    str = this.f18523a;
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 100);
                    stringBuilder.append("Camera device ");
                    stringBuilder.append(str);
                    stringBuilder.append(" failed to open because the maximum number of cameras on this device are already open.");
                    m12416a(stringBuilder.toString(), e, z);
                    irx.mo1151a(2);
                    a = irp.ERROR;
                    this.f18524b.mo1904b();
                    break;
                default:
                    str = this.f18523a;
                    int reason = e.getReason();
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 67);
                    stringBuilder2.append("Camera device ");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" failed to open due to an unknown reason: ");
                    stringBuilder2.append(reason);
                    m12416a(stringBuilder2.toString(), e, z);
                    irx.mo1151a(5);
                    a = irp.ERROR;
                    break;
            }
        } catch (Exception e2) {
            str = this.f18523a;
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 58);
            stringBuilder.append("Camera device ");
            stringBuilder.append(str);
            stringBuilder.append(" failed to open due to a security exception!");
            m12416a(stringBuilder.toString(), e2, z);
            irx.mo1151a(3);
            a = irp.ERROR;
        } catch (InterruptedException e3) {
            a = irp.ERROR_TIMEOUT;
        } finally {
            this.f18524b.mo1904b();
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final p000.irx m12418a() {
        /*
        r15 = this;
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r4 = android.os.SystemClock.elapsedRealtime();
        r0 = p000.irp.RETRY;
        r2 = new irx;
        r2.<init>();
        r8 = new irn;	 Catch:{ all -> 0x016a }
        r8.<init>(r15);	 Catch:{ all -> 0x016a }
        r1 = r15.f18527e;	 Catch:{ all -> 0x016a }
        r3 = r15.f18530h;	 Catch:{ all -> 0x016a }
        r1.registerAvailabilityCallback(r8, r3);	 Catch:{ all -> 0x016a }
        r1 = r15.f18532j;	 Catch:{ all -> 0x00ad }
        monitor-enter(r1);	 Catch:{ all -> 0x00ad }
        r3 = r15.f18534l;	 Catch:{ all -> 0x0171 }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r2.close();	 Catch:{ all -> 0x0171 }
        monitor-exit(r1);	 Catch:{ all -> 0x0171 }
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
    L_0x0029:
        return r2;
    L_0x002a:
        monitor-exit(r1);	 Catch:{ all -> 0x0171 }
        r3 = 0;
        r6 = r4;
    L_0x002d:
        r1 = p000.irp.RETRY;	 Catch:{ all -> 0x00ad }
        if (r0 != r1) goto L_0x0163;
    L_0x0031:
        r1 = r15;
        r1 = r1.m12415a(r2, r3, r4, r6);	 Catch:{ all -> 0x00ad }
        r0 = p000.irp.ERROR;	 Catch:{ all -> 0x00ad }
        if (r1 == r0) goto L_0x015c;
    L_0x003a:
        r0 = p000.irp.ERROR_TIMEOUT;	 Catch:{ all -> 0x00ad }
        if (r1 != r0) goto L_0x004b;
    L_0x003e:
        r15.m12417a(r3);	 Catch:{ all -> 0x00ad }
        r0 = 5;
        r2.mo1151a(r0);	 Catch:{ all -> 0x00ad }
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x004b:
        r0 = p000.irp.CONNECTED;	 Catch:{ all -> 0x00ad }
        if (r1 != r0) goto L_0x00b8;
    L_0x004f:
        if (r3 == 0) goto L_0x0085;
    L_0x0051:
        r0 = "CAM_CameraOpener";
        r1 = r15.f18523a;	 Catch:{ all -> 0x00ad }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ad }
        r3 = r3.length();	 Catch:{ all -> 0x00ad }
        r3 = r3 + 53;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ad }
        r4.<init>(r3);	 Catch:{ all -> 0x00ad }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x00ad }
        r4.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = " was opened successfully after a retry.";
        r4.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = r4.toString();	 Catch:{ all -> 0x00ad }
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x00ad }
        r0 = r15.f18528f;	 Catch:{ all -> 0x00ad }
        r1 = p000.irt.SUCCESS;	 Catch:{ all -> 0x00ad }
        r0.mo1583a(r1);	 Catch:{ all -> 0x00ad }
    L_0x007f:
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x0085:
        r0 = "CAM_CameraOpener";
        r1 = r15.f18523a;	 Catch:{ all -> 0x00ad }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ad }
        r3 = r3.length();	 Catch:{ all -> 0x00ad }
        r3 = r3 + 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ad }
        r4.<init>(r3);	 Catch:{ all -> 0x00ad }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x00ad }
        r4.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = " was opened successfully.";
        r4.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = r4.toString();	 Catch:{ all -> 0x00ad }
        android.util.Log.i(r0, r1);	 Catch:{ all -> 0x00ad }
        goto L_0x007f;
    L_0x00ad:
        r0 = move-exception;
        r1 = r0;
        r0 = r8;
    L_0x00b0:
        if (r0 == 0) goto L_0x00b7;
    L_0x00b2:
        r2 = r15.f18527e;
        r2.unregisterAvailabilityCallback(r0);
    L_0x00b7:
        throw r1;
    L_0x00b8:
        r0 = p000.irp.RETRY;	 Catch:{ all -> 0x00ad }
        if (r1 != r0) goto L_0x0159;
    L_0x00bc:
        r6 = r15.f18532j;	 Catch:{ all -> 0x00ad }
        monitor-enter(r6);	 Catch:{ all -> 0x00ad }
        r0 = r15.f18534l;	 Catch:{ all -> 0x0174 }
        if (r0 == 0) goto L_0x00ce;
    L_0x00c3:
        r2.close();	 Catch:{ all -> 0x0174 }
        monitor-exit(r6);	 Catch:{ all -> 0x0174 }
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x00ce:
        monitor-exit(r6);	 Catch:{ all -> 0x0174 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00ad }
        r6 = r6 + r12;
        r10 = 7000; // 0x1b58 float:9.809E-42 double:3.4585E-320;
        r10 = r10 + r4;
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x00ee;
    L_0x00db:
        r15.m12417a(r3);	 Catch:{ all -> 0x00ad }
        r2 = new irx;	 Catch:{ all -> 0x00ad }
        r2.<init>();	 Catch:{ all -> 0x00ad }
        r0 = 5;
        r2.mo1151a(r0);	 Catch:{ all -> 0x00ad }
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x00ee:
        r0 = r15.f18524b;	 Catch:{ all -> 0x00ad }
        r3 = "interruptibleTimeout#wait";
        r0.mo1903a(r3);	 Catch:{ all -> 0x00ad }
        r3 = r15.f18525c;	 Catch:{ InterruptedException -> 0x0177, all -> 0x017e }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x0177, all -> 0x017e }
        r0 = "CAM_CameraOpener";
        r6 = r15.f18523a;	 Catch:{ all -> 0x0185 }
        r7 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0185 }
        r7 = r7.length();	 Catch:{ all -> 0x0185 }
        r7 = r7 + 76;
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0185 }
        r9.<init>(r7);	 Catch:{ all -> 0x0185 }
        r7 = "Camera device ";
        r9.append(r7);	 Catch:{ all -> 0x0185 }
        r9.append(r6);	 Catch:{ all -> 0x0185 }
        r6 = " failed to open, attempting retry in ";
        r9.append(r6);	 Catch:{ all -> 0x0185 }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r9.append(r6);	 Catch:{ all -> 0x0185 }
        r6 = " milliseconds.";
        r9.append(r6);	 Catch:{ all -> 0x0185 }
        r6 = r9.toString();	 Catch:{ all -> 0x0185 }
        android.util.Log.w(r0, r6);	 Catch:{ all -> 0x0185 }
        r0 = r15.f18525c;	 Catch:{ all -> 0x0185 }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0.wait(r6);	 Catch:{ all -> 0x0185 }
        monitor-exit(r3);	 Catch:{ all -> 0x0185 }
        r0 = r15.f18524b;	 Catch:{ all -> 0x00ad }
        r0.mo1904b();	 Catch:{ all -> 0x00ad }
    L_0x0136:
        r3 = r15.f18532j;	 Catch:{ all -> 0x00ad }
        monitor-enter(r3);	 Catch:{ all -> 0x00ad }
        r0 = r15.f18534l;	 Catch:{ all -> 0x0188 }
        if (r0 == 0) goto L_0x0148;
    L_0x013d:
        r2.close();	 Catch:{ all -> 0x0188 }
        monitor-exit(r3);	 Catch:{ all -> 0x0188 }
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x0148:
        monitor-exit(r3);	 Catch:{ all -> 0x0188 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00ad }
        r2.close();	 Catch:{ all -> 0x00ad }
        r2 = new irx;	 Catch:{ all -> 0x00ad }
        r2.<init>();	 Catch:{ all -> 0x00ad }
        r3 = 1;
        r0 = r1;
        goto L_0x002d;
    L_0x0159:
        r0 = r1;
        goto L_0x002d;
    L_0x015c:
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x0163:
        r0 = r15.f18527e;
        r0.unregisterAvailabilityCallback(r8);
        goto L_0x0029;
    L_0x016a:
        r0 = move-exception;
        r1 = 0;
        r14 = r1;
        r1 = r0;
        r0 = r14;
        goto L_0x00b0;
    L_0x0171:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0171 }
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x0174:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0174 }
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x0177:
        r0 = move-exception;
        r0 = r15.f18524b;	 Catch:{ all -> 0x00ad }
        r0.mo1904b();	 Catch:{ all -> 0x00ad }
        goto L_0x0136;
    L_0x017e:
        r0 = move-exception;
        r1 = r15.f18524b;	 Catch:{ all -> 0x00ad }
        r1.mo1904b();	 Catch:{ all -> 0x00ad }
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x0185:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0185 }
        throw r0;	 Catch:{ InterruptedException -> 0x0177, all -> 0x017e }
    L_0x0188:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0188 }
        throw r0;	 Catch:{ all -> 0x00ad }
        */
        throw new UnsupportedOperationException("Method not decompiled: irl.a():irx");
    }

    /* renamed from: b */
    public final irx m12419b() {
        synchronized (this.f18532j) {
            if (this.f18533k || this.f18534l) {
                irx irx = this.f18526d;
                return irx;
            }
            this.f18533k = true;
            this.f18529g.execute(new irm(this));
            return this.f18526d;
        }
    }
}
