package p000;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.CameraProfile;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.ColorImage.Format;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxj */
public final class dxj implements aag {
    /* renamed from: a */
    public static final String f14685a = bli.m862a("CameraPreview");
    /* renamed from: j */
    private static final abc[] f14686j = new abc[]{abc.CONTINUOUS_PICTURE, abc.CONTINUOUS_VIDEO, abc.AUTO, abc.FIXED, abc.EXTENDED_DOF, abc.INFINITY, abc.MACRO};
    /* renamed from: m */
    private static final Comparator f14687m = new dxk();
    /* renamed from: b */
    public aah f14688b = null;
    /* renamed from: c */
    public abh f14689c = null;
    /* renamed from: d */
    public boolean f14690d = false;
    /* renamed from: e */
    public dxm f14691e = null;
    /* renamed from: f */
    public abo f14692f;
    /* renamed from: g */
    public final cfh f14693g;
    /* renamed from: h */
    public final Handler f14694h;
    /* renamed from: i */
    public final Object f14695i;
    /* renamed from: k */
    private ColorImage f14696k = null;
    /* renamed from: l */
    private aaz f14697l;

    public dxj(cfh cfh, Handler handler, aah aah, int i) {
        this.f14693g = cfh;
        cfh.mo2756k();
        this.f14694h = handler;
        this.f14688b = aah;
        this.f14692f = aah.mo2571i();
        this.f14697l = aah.mo2567e();
        if (this.f14688b != null) {
            double d;
            abw[] abwArr;
            int i2;
            Object obj;
            abc abc;
            bli.m863a(f14685a, "Configuring camera...");
            this.f14689c = this.f14688b.mo2568f();
            aaz aaz = this.f14697l;
            abo abo = this.f14692f;
            List<abw> c = aaz.m37c();
            List<abw> a = aaz.m31a();
            String str = f14685a;
            String valueOf = String.valueOf(dxj.m9505a((List) c));
            String str2 = "preview formats:\n";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            str = f14685a;
            valueOf = String.valueOf(dxj.m9505a((List) a));
            str2 = "picture formats:\n";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            Collections.sort(c, f14687m);
            Collections.sort(a, f14687m);
            hre hre = new hre(new hrf(i));
            double d2 = hre.f6484a.f6486b;
            if (d2 < 0.0d) {
                d = ((double) ((abw) a.get(0)).f178a.x) / ((double) ((abw) a.get(0)).f178a.y);
            } else {
                d = d2;
            }
            abw abw = null;
            abw abw2 = null;
            double d3 = Double.MAX_VALUE;
            for (abw abw3 : a) {
                double d4;
                Point point = abw3.f178a;
                if (Math.abs((((double) point.x) / ((double) point.y)) - d) > 0.01d) {
                    d4 = 14.0d;
                } else {
                    d4 = 0.0d;
                }
                point = abw3.f178a;
                double abs = d4 + (Math.abs((((double) (point.y * point.x)) / 1000000.0d) - hre.f6484a.f6485a) * 4.0d);
                if (abs <= d3) {
                    double d5 = d3;
                    abw abw4 = abw2;
                    abw abw5 = abw;
                    double d6 = d5;
                    for (abw abw6 : c) {
                        abw abw62;
                        double d7;
                        Point point2 = abw62.f178a;
                        int i3 = point2.x;
                        int i4 = point2.y;
                        Point point3 = abw3.f178a;
                        if (Math.abs((((double) i3) / ((double) i4)) - (((double) point3.x) / ((double) point3.y))) >= 0.01d) {
                            d4 = Double.MAX_VALUE;
                        } else {
                            point2 = abw62.f178a;
                            i4 = (int) Math.max(Math.ceil(Math.log(((double) Math.max(point2.x, point2.y)) / hre.f6484a.f6489e) / Math.log(2.0d)), 0.0d);
                            point3 = abw62.f178a;
                            abw abw7 = new abw(point3.x >> i4, point3.y >> i4);
                            point2 = abw3.f178a;
                            int i5 = point2.x;
                            i4 = point2.y;
                            Point point4 = abw7.f178a;
                            d7 = (double) ((i4 * i5) / (point4.x * point4.y));
                            d4 = (Math.log((double) (abw62.f178a.x / point4.x)) / Math.log(2.0d)) + (Math.max(0.0d, d7 - hre.f6484a.f6488d) + Math.max(0.0d, hre.f6484a.f6487c - d7));
                        }
                        d7 = d4 + abs;
                        if (d7 < d6) {
                            d4 = d7;
                        } else {
                            d4 = d6;
                        }
                        if (d7 < d6) {
                            abw5 = abw62;
                        }
                        if (d7 < d6) {
                            abw62 = abw3;
                        } else {
                            abw62 = abw4;
                        }
                        d6 = d4;
                        abw4 = abw62;
                    }
                    d5 = d6;
                    abw2 = abw4;
                    abw = abw5;
                    d3 = d5;
                }
            }
            if (abw2 != null) {
                abwArr = abw != null ? new abw[]{abw, abw2} : null;
            } else {
                abwArr = null;
            }
            if (abwArr == null) {
                bli.m866b(f14685a, "Could not find compatible preview and picture sizes!");
            } else {
                str = f14685a;
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Preferred megapixels: ");
                stringBuilder.append(i);
                bli.m869c(str, stringBuilder.toString());
                str = f14685a;
                Point point5 = abwArr[0].f178a;
                int i6 = point5.x;
                i2 = point5.y;
                StringBuilder stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Preview size        : ");
                stringBuilder2.append(i6);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                bli.m869c(str, stringBuilder2.toString());
                str = f14685a;
                point5 = abwArr[1].f178a;
                i6 = point5.x;
                i2 = point5.y;
                stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Picture size        : ");
                stringBuilder2.append(i6);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                bli.m869c(str, stringBuilder2.toString());
                abo.m69b(abwArr[0]);
                abo.m67a(abwArr[1]);
                abo.m65a(CameraProfile.getJpegEncodingQualityParameter(this.f14688b.mo2565c(), 2));
            }
            aaz = this.f14697l;
            abo abo2 = this.f14692f;
            List<int[]> b = aaz.m36b();
            int[] iArr = new int[]{-1, -1};
            int[] iArr2 = iArr;
            for (int[] iArr3 : b) {
                int i7 = iArr3[0];
                if (i7 >= 7000) {
                    int i8 = iArr3[1];
                    if (i8 <= 30000) {
                        if (i8 > iArr2[1]) {
                            iArr2 = iArr3;
                        } else if (i7 < iArr2[0]) {
                            iArr2 = iArr3;
                        }
                    }
                }
            }
            if (iArr2[0] < 0) {
                iArr3 = (int[]) b.get(b.size() - 1);
            } else {
                iArr3 = iArr2;
            }
            abo2.m66a(iArr3[0], iArr3[1]);
            str = f14685a;
            i2 = iArr3[0];
            int i9 = iArr3[1];
            StringBuilder stringBuilder3 = new StringBuilder(40);
            stringBuilder3.append("fps range set to ");
            stringBuilder3.append(i2);
            stringBuilder3.append("-");
            stringBuilder3.append(i9);
            bli.m863a(str, stringBuilder3.toString());
            aaz = this.f14697l;
            abf abf = abf.AUTO;
            if (abf == null) {
                obj = null;
            } else if (aaz.f57k.contains(abf)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f14692f.f153s = abf.AUTO;
            }
            if (this.f14697l.m33a(abb.OFF)) {
                this.f14692f.f150p = abb.OFF;
            }
            abo2 = this.f14692f;
            for (abc abc2 : f14686j) {
                if (this.f14697l.m34a(abc2)) {
                    break;
                }
            }
            Iterator it = new HashSet(this.f14697l.f56j).iterator();
            if (it.hasNext()) {
                abc2 = (abc) it.next();
            } else {
                abc2 = null;
            }
            abo2.f151q = abc2;
            try {
                this.f14688b.mo2562a(this.f14692f);
            } catch (RuntimeException e) {
                bli.m866b(f14685a, e.toString());
            }
            m9506a();
        }
        aah.mo2560a(false);
        this.f14695i = new Object();
    }

    /* renamed from: a */
    private static String m9505a(List list) {
        String str = "";
        for (abw abw : list) {
            str = String.valueOf(str);
            r3 = new Object[2];
            Point point = abw.f178a;
            r3[0] = Integer.valueOf(point.x);
            r3[1] = Integer.valueOf(point.y);
            String valueOf = String.valueOf(String.format("%dx%d ", r3));
            if (valueOf.length() != 0) {
                str = str.concat(valueOf);
            } else {
                str = new String(str);
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void m9506a() {
        this.f14688b.m3a(0);
    }

    /* renamed from: b */
    public final int m9512b() {
        double tan = Math.tan(((((double) this.f14697l.f67u) * 3.141592653589793d) / 180.0d) / 2.0d);
        return (int) (36.0d / (tan + tan));
    }

    /* renamed from: a */
    public final void mo1203a(byte[] bArr, aah aah) {
        if (this.f14691e != null) {
            this.f14696k.setBuffer(bArr);
            this.f14691e.mo3409a(this.f14696k, SystemClock.elapsedRealtimeNanos());
            if (this.f14690d) {
                aah.mo2561a(this.f14696k.getBuffer());
            }
        }
    }

    /* renamed from: c */
    public final void m9513c() {
        bli.m863a(f14685a, "Shutting down camera...");
        if (this.f14688b != null) {
            m9514d();
            this.f14688b = null;
        }
    }

    /* renamed from: a */
    public final void m9508a(abo abo) {
        this.f14692f = abo;
        this.f14688b.mo2562a(this.f14692f);
    }

    /* renamed from: a */
    public final void m9509a(SurfaceTexture surfaceTexture, aat aat) {
        if (this.f14688b == null || surfaceTexture == null) {
            bli.m866b(f14685a, "Started preview without camera or surface!");
            return;
        }
        bli.m863a(f14685a, "Starting camera preview...");
        this.f14688b.mo2555a(surfaceTexture);
        m9507a(aat);
    }

    /* renamed from: a */
    public final void m9507a(aat aat) {
        synchronized (this.f14695i) {
            if (this.f14690d) {
                return;
            }
            if (this.f14691e != null) {
                abw c = this.f14692f.m70c();
                int i = this.f14692f.f145k;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
                if (bitsPerPixel <= 0) {
                    StringBuilder stringBuilder = new StringBuilder(33);
                    stringBuilder.append("Unknown image format: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Point point = c.f178a;
                int i2 = (bitsPerPixel * (point.x * point.y)) / 8;
                for (bitsPerPixel = 0; bitsPerPixel < 2; bitsPerPixel++) {
                    this.f14688b.mo2561a(new byte[i2]);
                }
                Point point2 = c.f178a;
                this.f14696k = new ColorImage(point2.x, point2.y, Format.fromImageFormat(i), null);
                this.f14688b.mo2564b(this.f14694h, this);
            }
            if (aat != null) {
                this.f14688b.m7a(this.f14694h, aat);
            } else {
                aah aah = this.f14688b;
                try {
                    aah.mo2569g().m80a(new aap(aah));
                } catch (RuntimeException e) {
                    aah.mo2554a().mo2544b().mo2579a(e);
                }
            }
            this.f14690d = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public final void m9514d() {
        /*
        r4 = this;
        r1 = r4.f14695i;
        monitor-enter(r1);
        r0 = r4.f14690d;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r4.f14688b;	 Catch:{ all -> 0x0025 }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = f14685a;	 Catch:{ all -> 0x0025 }
        r2 = "Stopping camera preview...";
        p000.bli.m863a(r0, r2);	 Catch:{ all -> 0x0025 }
        r0 = 0;
        r4.f14690d = r0;	 Catch:{ all -> 0x0025 }
        r0 = r4.f14688b;	 Catch:{ all -> 0x0025 }
        r0.m24k();	 Catch:{ all -> 0x0025 }
        r0 = r4.f14688b;	 Catch:{ all -> 0x0025 }
        r2 = 0;
        r3 = 0;
        r0.mo2564b(r2, r3);	 Catch:{ all -> 0x0025 }
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        goto L_0x000c;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dxj.d():void");
    }

    /* renamed from: a */
    public final void m9510a(boolean z) {
        if (this.f14697l.m32a(aba.AUTO_WHITE_BALANCE_LOCK)) {
            this.f14692f.f156v = z ^ 1;
        }
        if (this.f14697l.m32a(aba.AUTO_EXPOSURE_LOCK)) {
            this.f14692f.f155u = z ^ 1;
        }
        try {
            this.f14688b.mo2562a(this.f14692f);
        } catch (RuntimeException e) {
            bli.m866b(f14685a, e.toString());
        }
    }
}
