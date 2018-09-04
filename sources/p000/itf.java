package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: itf */
public final class itf extends ikn {
    /* renamed from: e */
    private static final byte[] f18568e = new byte[]{(byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0};
    /* renamed from: f */
    private static final byte[] f18569f = new byte[]{(byte) 73, (byte) 67, (byte) 67, (byte) 95, (byte) 80, (byte) 82, (byte) 79, (byte) 70, (byte) 73, (byte) 76, (byte) 69, (byte) 0};
    /* renamed from: g */
    private final ist f18570g;
    /* renamed from: h */
    private final ExifInterface f18571h;
    /* renamed from: i */
    private short f18572i = (short) 0;
    /* renamed from: j */
    private short f18573j = (short) 0;
    /* renamed from: k */
    private int f18574k = 0;
    /* renamed from: l */
    private boolean f18575l = true;

    public itf(OutputStream outputStream, ExifInterface exifInterface, ist ist) {
        super(outputStream, new iqa());
        this.f18571h = exifInterface;
        this.f18570g = ist;
    }

    /* renamed from: a */
    private static int m12451a(ith ith, int i) {
        int b = (((ith.m4204b() * 12) + 2) + 4) + i;
        for (ite ite : ith.m4203a()) {
            if (ite != null && ite.m4179a() > 4) {
                ite.f7452g = b;
                b += ite.m4179a();
            }
        }
        return b;
    }

    /* renamed from: a */
    private static void m12452a(int i, short s) {
        if (i < 0) {
            throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", new Object[]{Integer.valueOf((s >> 8) & Illuminant.kOther), Integer.valueOf(s & Illuminant.kOther)}));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    protected final int mo1908c(int r11) {
        /*
        r10 = this;
        switch(r11) {
            case 0: goto L_0x0019;
            case 1: goto L_0x0511;
            case 2: goto L_0x05be;
            case 3: goto L_0x0567;
            case 4: goto L_0x0553;
            case 5: goto L_0x0536;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = new java.lang.IllegalStateException;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = java.lang.Integer.valueOf(r11);
        r1[r2] = r3;
        r2 = "No such state: %d";
        r1 = java.lang.String.format(r2, r1);
        r0.<init>(r1);
        throw r0;
    L_0x0019:
        r0 = 0;
        r0 = r10.m3801d(r0);
        r10.f18572i = r0;
        r0 = r10.f18572i;
        r1 = r0 & -256;
        r2 = -256; // 0xffffffffffffff00 float:NaN double:NaN;
        if (r1 == r2) goto L_0x004b;
    L_0x0028:
        r1 = new java.lang.IllegalStateException;
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r0 >> 8;
        r4 = r4 & 255;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r3 = 1;
        r0 = r0 & 255;
        r0 = java.lang.Integer.valueOf(r0);
        r2[r3] = r0;
        r0 = "Unexpected section marker: %02X%02X";
        r0 = java.lang.String.format(r0, r2);
        r1.<init>(r0);
        throw r1;
    L_0x004b:
        r1 = -40;
        if (r0 == r1) goto L_0x0053;
    L_0x004f:
        r1 = -39;
        if (r0 != r1) goto L_0x0496;
    L_0x0053:
        r10.m3794a(r0);
        r0 = r10.f18572i;
        r1 = -40;
        if (r0 != r1) goto L_0x0494;
    L_0x005c:
        r3 = r10.f18570g;
        if (r3 == 0) goto L_0x0494;
    L_0x0060:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r5 = r3.f7394a;
        r6 = r5.length;
        r0 = 0;
        r1 = r0;
    L_0x006f:
        if (r1 >= r6) goto L_0x008c;
    L_0x0071:
        r0 = r5[r1];
        if (r0 != 0) goto L_0x0079;
    L_0x0075:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x006f;
    L_0x0079:
        r7 = r0.m4203a();
        r8 = r7.length;
        r0 = 0;
    L_0x007f:
        if (r0 >= r8) goto L_0x0075;
    L_0x0081:
        r9 = r7[r0];
        if (r9 != 0) goto L_0x0088;
    L_0x0085:
        r0 = r0 + 1;
        goto L_0x007f;
    L_0x0088:
        r2.add(r9);
        goto L_0x0085;
    L_0x008c:
        r5 = r2.size();
        r0 = 0;
    L_0x0091:
        if (r0 >= r5) goto L_0x00b7;
    L_0x0093:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.ite) r0;
        r6 = r0.f7451f;
        if (r6 == 0) goto L_0x00a1;
    L_0x009f:
        r0 = r1;
        goto L_0x0091;
    L_0x00a1:
        r6 = r0.f7446a;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.m8472a(r6);
        if (r6 == 0) goto L_0x00ab;
    L_0x00a9:
        r0 = r1;
        goto L_0x0091;
    L_0x00ab:
        r6 = r0.f7446a;
        r7 = r0.f7450e;
        r3.m4152a(r6, r7);
        r4.add(r0);
        r0 = r1;
        goto L_0x0091;
    L_0x00b7:
        r0 = r10.f18570g;
        r1 = 0;
        r0 = r0.m4150a(r1);
        if (r0 != 0) goto L_0x00cb;
    L_0x00c0:
        r0 = new ith;
        r1 = 0;
        r0.<init>(r1);
        r1 = r10.f18570g;
        r1.m4151a(r0);
    L_0x00cb:
        r1 = r10.f18571h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f12398j;
        r1 = r1.m8489c(r2);
        if (r1 != 0) goto L_0x00f0;
    L_0x00d5:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12398j;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00f0:
        r0.m4201a(r1);
        r1 = r10.f18570g;
        r2 = 2;
        r1 = r1.m4150a(r2);
        if (r1 != 0) goto L_0x0107;
    L_0x00fc:
        r1 = new ith;
        r2 = 2;
        r1.<init>(r2);
        r2 = r10.f18570g;
        r2.m4151a(r1);
    L_0x0107:
        r2 = r10.f18570g;
        r5 = 4;
        r2 = r2.m4150a(r5);
        if (r2 == 0) goto L_0x0138;
    L_0x0110:
        r2 = r10.f18571h;
        r5 = com.google.android.libraries.camera.exif.ExifInterface.f12399k;
        r2 = r2.m8489c(r5);
        if (r2 != 0) goto L_0x0135;
    L_0x011a:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12399k;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0135:
        r0.m4201a(r2);
    L_0x0138:
        r0 = r10.f18570g;
        r2 = 3;
        r0 = r0.m4150a(r2);
        if (r0 == 0) goto L_0x0169;
    L_0x0141:
        r0 = r10.f18571h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f12414z;
        r0 = r0.m8489c(r2);
        if (r0 != 0) goto L_0x0166;
    L_0x014b:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12414z;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0166:
        r1.m4201a(r0);
    L_0x0169:
        r0 = r10.f18570g;
        r1 = 1;
        r0 = r0.m4150a(r1);
        r1 = r10.f18570g;
        r1 = r1.m4153a();
        if (r1 == 0) goto L_0x03ce;
    L_0x0178:
        if (r0 != 0) goto L_0x03cb;
    L_0x017a:
        r0 = new ith;
        r1 = 1;
        r0.<init>(r1);
        r1 = r10.f18570g;
        r1.m4151a(r0);
        r1 = r0;
    L_0x0186:
        r0 = r10.f18571h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f12400l;
        r0 = r0.m8489c(r2);
        if (r0 != 0) goto L_0x01ab;
    L_0x0190:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12400l;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01ab:
        r1.m4201a(r0);
        r0 = r10.f18571h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f12401m;
        r2 = r0.m8489c(r2);
        if (r2 != 0) goto L_0x01d3;
    L_0x01b8:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12401m;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01d3:
        r0 = r10.f18570g;
        r0 = r0.f7395b;
        r0 = p000.jri.m13152b(r0);
        r0 = (byte[]) r0;
        r0 = r0.length;
        r2.m4188c(r0);
        r1.m4201a(r2);
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f12394f;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r0);
        r1.m4205b(r0);
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f12396h;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r0);
        r1.m4205b(r0);
    L_0x01f6:
        r0 = r10.f18570g;
        r1 = 0;
        r0 = r0.m4150a(r1);
        if (r0 == 0) goto L_0x03c7;
    L_0x01ff:
        r0 = p000.jri.m13152b(r0);
        r0 = (p000.ith) r0;
        r1 = 8;
        r2 = p000.itf.m12451a(r0, r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12398j;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r1 = r0.m4202a(r1);
        r1 = p000.jri.m13152b(r1);
        r1 = (p000.ite) r1;
        r1.m4188c(r2);
        r1 = r10.f18570g;
        r5 = 2;
        r1 = r1.m4150a(r5);
        if (r1 == 0) goto L_0x02a4;
    L_0x0227:
        r1 = p000.jri.m13152b(r1);
        r1 = (p000.ith) r1;
        r2 = p000.itf.m12451a(r1, r2);
        r5 = r10.f18570g;
        r6 = 3;
        r5 = r5.m4150a(r6);
        if (r5 == 0) goto L_0x0252;
    L_0x023a:
        r6 = com.google.android.libraries.camera.exif.ExifInterface.f12414z;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r6);
        r1 = r1.m4202a(r6);
        r1 = p000.jri.m13152b(r1);
        r1 = (p000.ite) r1;
        r1.m4188c(r2);
        r1 = p000.itf.m12451a(r5, r2);
        r2 = r1;
    L_0x0252:
        r1 = r10.f18570g;
        r5 = 4;
        r5 = r1.m4150a(r5);
        if (r5 == 0) goto L_0x0272;
    L_0x025b:
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12399k;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r1 = r0.m4202a(r1);
        r1 = p000.jri.m13152b(r1);
        r1 = (p000.ite) r1;
        r1.m4188c(r2);
        r2 = p000.itf.m12451a(r5, r2);
    L_0x0272:
        r1 = r10.f18570g;
        r5 = 1;
        r1 = r1.m4150a(r5);
        if (r1 != 0) goto L_0x03bf;
    L_0x027b:
        r0 = r10.f18570g;
        r0 = r0.m4153a();
        if (r0 == 0) goto L_0x037d;
    L_0x0283:
        if (r1 == 0) goto L_0x0298;
    L_0x0285:
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f12400l;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r0);
        r0 = r1.m4202a(r0);
        r0 = p000.jri.m13152b(r0);
        r0 = (p000.ite) r0;
        r0.m4188c(r2);
    L_0x0298:
        r0 = r10.f18570g;
        r0 = r0.f7395b;
        r0 = p000.jri.m13152b(r0);
        r0 = (byte[]) r0;
        r0 = r0.length;
        r2 = r2 + r0;
    L_0x02a4:
        r0 = r2 + 8;
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 <= r1) goto L_0x02b3;
    L_0x02ab:
        r0 = new java.io.IOException;
        r1 = "Exif header is too large (>64Kb)";
        r0.<init>(r1);
        throw r0;
    L_0x02b3:
        r0 = -31;
        r10.m3794a(r0);
        r0 = f18568e;
        r0 = r0.length;
        r0 = r0 + 2;
        r0 = r0 + r2;
        r0 = (short) r0;
        r10.m3794a(r0);
        r0 = f18568e;
        r10.m3795a(r0);
        r0 = r3.f7397d;
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x0376;
    L_0x02cd:
        r0 = 19789; // 0x4d4d float:2.773E-41 double:9.777E-320;
        r10.m3794a(r0);
    L_0x02d2:
        r1 = new iti;
        r0 = r10.f7061b;
        r1.<init>(r0);
        r0 = r3.f7397d;
        r2 = r1.f7460a;
        r2.order(r0);
        r0 = 42;
        r1.m4207a(r0);
        r0 = 8;
        r1.m4206a(r0);
        r0 = r10.f18570g;
        r2 = 0;
        r0 = r0.m4150a(r2);
        r0 = p000.jri.m13152b(r0);
        r0 = (p000.ith) r0;
        p000.itf.m12454a(r0, r1);
        r0 = r10.f18570g;
        r2 = 2;
        r0 = r0.m4150a(r2);
        r0 = p000.jri.m13152b(r0);
        r0 = (p000.ith) r0;
        p000.itf.m12454a(r0, r1);
        r0 = r10.f18570g;
        r2 = 3;
        r0 = r0.m4150a(r2);
        if (r0 == 0) goto L_0x0316;
    L_0x0313:
        p000.itf.m12454a(r0, r1);
    L_0x0316:
        r0 = r10.f18570g;
        r2 = 4;
        r0 = r0.m4150a(r2);
        if (r0 == 0) goto L_0x0322;
    L_0x031f:
        p000.itf.m12454a(r0, r1);
    L_0x0322:
        r0 = r10.f18570g;
        r2 = 1;
        r0 = r0.m4150a(r2);
        if (r0 == 0) goto L_0x032e;
    L_0x032b:
        p000.itf.m12454a(r0, r1);
    L_0x032e:
        r0 = r10.f18570g;
        r0 = r0.m4153a();
        if (r0 == 0) goto L_0x0357;
    L_0x0336:
        r0 = r10.f18570g;
        r0 = r0.f7395b;
        r0 = p000.jri.m13152b(r0);
        r0 = (byte[]) r0;
        r1.write(r0);
    L_0x0343:
        r2 = r4.size();
        r0 = 0;
    L_0x0348:
        if (r0 >= r2) goto L_0x0494;
    L_0x034a:
        r1 = r0 + 1;
        r0 = r4.get(r0);
        r0 = (p000.ite) r0;
        r3.m4149a(r0);
        r0 = r1;
        goto L_0x0348;
    L_0x0357:
        r0 = r10.f18570g;
        r0 = r0.m4154b();
        if (r0 == 0) goto L_0x0343;
    L_0x035f:
        r0 = 0;
    L_0x0360:
        r2 = r10.f18570g;
        r2 = r2.f7396c;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x0343;
    L_0x036a:
        r2 = r10.f18570g;
        r2 = r2.m4155b(r0);
        r1.write(r2);
        r0 = r0 + 1;
        goto L_0x0360;
    L_0x0376:
        r0 = 18761; // 0x4949 float:2.629E-41 double:9.269E-320;
        r10.m3794a(r0);
        goto L_0x02d2;
    L_0x037d:
        r0 = r10.f18570g;
        r0 = r0.m4154b();
        if (r0 == 0) goto L_0x02a4;
    L_0x0385:
        r0 = r10.f18570g;
        r0 = r0.f7396c;
        r0 = r0.size();
        r5 = new long[r0];
        r0 = 0;
    L_0x0390:
        r6 = r10.f18570g;
        r6 = r6.f7396c;
        r6 = r6.size();
        if (r0 >= r6) goto L_0x03a8;
    L_0x039a:
        r6 = (long) r2;
        r5[r0] = r6;
        r6 = r10.f18570g;
        r6 = r6.m4155b(r0);
        r6 = r6.length;
        r2 = r2 + r6;
        r0 = r0 + 1;
        goto L_0x0390;
    L_0x03a8:
        if (r1 == 0) goto L_0x02a4;
    L_0x03aa:
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f12394f;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r0);
        r0 = r1.m4202a(r0);
        r0 = p000.jri.m13152b(r0);
        r0 = (p000.ite) r0;
        r0.m4184a(r5);
        goto L_0x02a4;
    L_0x03bf:
        r0.f7458b = r2;
        r2 = p000.itf.m12451a(r1, r2);
        goto L_0x027b;
    L_0x03c7:
        r2 = 8;
        goto L_0x02a4;
    L_0x03cb:
        r1 = r0;
        goto L_0x0186;
    L_0x03ce:
        r1 = r10.f18570g;
        r1 = r1.m4154b();
        if (r1 == 0) goto L_0x046c;
    L_0x03d6:
        if (r0 != 0) goto L_0x03e3;
    L_0x03d8:
        r0 = new ith;
        r1 = 1;
        r0.<init>(r1);
        r1 = r10.f18570g;
        r1.m4151a(r0);
    L_0x03e3:
        r1 = r10.f18570g;
        r1 = r1.f7396c;
        r1 = r1.size();
        r2 = r10.f18571h;
        r5 = com.google.android.libraries.camera.exif.ExifInterface.f12394f;
        r2 = r2.m8489c(r5);
        if (r2 != 0) goto L_0x0410;
    L_0x03f5:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12394f;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0410:
        r5 = r10.f18571h;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.f12396h;
        r5 = r5.m8489c(r6);
        if (r5 != 0) goto L_0x0435;
    L_0x041a:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12396h;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0435:
        r6 = new long[r1];
        r1 = 0;
    L_0x0438:
        r7 = r10.f18570g;
        r7 = r7.f7396c;
        r7 = r7.size();
        if (r1 >= r7) goto L_0x044f;
    L_0x0442:
        r7 = r10.f18570g;
        r7 = r7.m4155b(r1);
        r7 = r7.length;
        r8 = (long) r7;
        r6[r1] = r8;
        r1 = r1 + 1;
        goto L_0x0438;
    L_0x044f:
        r5.m4184a(r6);
        r0.m4201a(r2);
        r0.m4201a(r5);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12400l;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12401m;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        goto L_0x01f6;
    L_0x046c:
        if (r0 == 0) goto L_0x01f6;
    L_0x046e:
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12394f;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12396h;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12400l;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f12401m;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8476g(r1);
        r0.m4205b(r1);
        goto L_0x01f6;
    L_0x0494:
        r0 = 0;
    L_0x0495:
        return r0;
    L_0x0496:
        r0 = p000.ion.m3956a(r0);
        if (r0 == 0) goto L_0x04f3;
    L_0x049c:
        r0 = r10.f18575l;
        if (r0 == 0) goto L_0x04ec;
    L_0x04a0:
        r0 = r10.f18571h;
        r0 = r0.f12415N;
        r1 = 2;
        if (r0 != r1) goto L_0x04e9;
    L_0x04a7:
        r0 = p000.kwi.f8736a;
    L_0x04a9:
        r1 = r0.length;
        r2 = r1 + r1;
        r1 = f18569f;
        r1 = r1.length;
        r1 = r1 + 2;
        r1 = r1 + 2;
        r1 = r1 + r2;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r1 > r3) goto L_0x04e7;
    L_0x04b9:
        r1 = 1;
    L_0x04ba:
        r3 = "ICC profile does not fit in one marker segment!";
        p000.jri.m13144a(r1, r3);
        r1 = -30;
        r10.m3794a(r1);
        r1 = f18569f;
        r1 = r1.length;
        r1 = r1 + 2;
        r1 = r1 + 2;
        r1 = r1 + r2;
        r1 = (short) r1;
        r10.m3794a(r1);
        r1 = f18569f;
        r10.m3795a(r1);
        r1 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r10.m3794a(r1);
        r1 = 0;
    L_0x04db:
        r2 = r0.length;
        if (r1 >= r2) goto L_0x04ec;
    L_0x04de:
        r2 = r0[r1];
        r2 = (short) r2;
        r10.m3794a(r2);
        r1 = r1 + 1;
        goto L_0x04db;
    L_0x04e7:
        r1 = 0;
        goto L_0x04ba;
    L_0x04e9:
        r0 = p000.kwj.f8737a;
        goto L_0x04a9;
    L_0x04ec:
        r0 = r10.f18572i;
        r10.m3794a(r0);
        r0 = 4;
        goto L_0x0495;
    L_0x04f3:
        r0 = r10.f18570g;
        if (r0 == 0) goto L_0x04ff;
    L_0x04f7:
        r0 = r10.f18572i;
        r1 = -31;
        if (r0 != r1) goto L_0x04ff;
    L_0x04fd:
        r0 = 2;
        goto L_0x0495;
    L_0x04ff:
        r0 = r10.f18572i;
        r1 = -30;
        if (r0 != r1) goto L_0x050e;
    L_0x0505:
        r1 = r10.f18571h;
        r1 = r1.f12415N;
        if (r1 != 0) goto L_0x0533;
    L_0x050b:
        r1 = 0;
        r10.f18575l = r1;
    L_0x050e:
        r10.m3794a(r0);
    L_0x0511:
        r0 = 1;
        r0 = r10.m3801d(r0);
        r10.f18573j = r0;
        r0 = r10.f18573j;
        r10.m3794a(r0);
        r0 = r10.f18573j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f18574k = r0;
        r0 = r10.f18574k;
        r1 = r10.f18572i;
        p000.itf.m12452a(r0, r1);
        r0 = r10.f18574k;
        r10.m3797a(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x0533:
        r0 = 5;
        goto L_0x0495;
    L_0x0536:
        r0 = 5;
        r0 = r10.m3801d(r0);
        r10.f18573j = r0;
        r0 = r10.f18573j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f18574k = r0;
        r0 = r10.f18574k;
        r1 = r10.f18572i;
        p000.itf.m12452a(r0, r1);
        r0 = r10.f18574k;
        r10.m3799b(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x0553:
        super.m3792a();
        r0 = r10.f7060a;
        r1 = r10.f7061b;
        r2 = r0.m4028a();
        r0.m4030a(r1, r2);
        r0 = -1;
        r10.f7063d = r0;
        r0 = 4;
        goto L_0x0495;
    L_0x0567:
        r0 = 4;
        r1 = 3;
        super.m3793a(r0, r1);
        super.m3792a();
        r0 = r10.f7060a;
        r1 = r0.f7313b;
        r2 = r1 + 4;
        r3 = r0.f7314c;
        if (r2 > r3) goto L_0x05ea;
    L_0x0579:
        r2 = 4;
        r2 = new byte[r2];
        r3 = r0.f7312a;
        r4 = 0;
        r5 = 4;
        java.lang.System.arraycopy(r3, r1, r2, r4, r5);
        r1 = r0.f7313b;
        r1 = r1 + 4;
        r0.f7313b = r1;
        r0 = r10.f18574k;
        r0 = r0 + -4;
        r10.f18574k = r0;
        r0 = 0;
    L_0x0590:
        r1 = 4;
        if (r0 >= r1) goto L_0x05bc;
    L_0x0593:
        r1 = r2[r0];
        r3 = f18568e;
        r3 = r3[r0];
        if (r1 != r3) goto L_0x059e;
    L_0x059b:
        r0 = r0 + 1;
        goto L_0x0590;
    L_0x059e:
        r0 = 0;
    L_0x059f:
        if (r0 == 0) goto L_0x05a9;
    L_0x05a1:
        r0 = r10.f18574k;
        r10.m3799b(r0);
    L_0x05a6:
        r0 = 0;
        goto L_0x0495;
    L_0x05a9:
        r0 = r10.f18572i;
        r10.m3794a(r0);
        r0 = r10.f18573j;
        r10.m3794a(r0);
        r10.m3795a(r2);
        r0 = r10.f18574k;
        r10.m3797a(r0);
        goto L_0x05a6;
    L_0x05bc:
        r0 = 1;
        goto L_0x059f;
    L_0x05be:
        r0 = 2;
        r0 = r10.m3801d(r0);
        r10.f18573j = r0;
        r0 = r10.f18573j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f18574k = r0;
        r0 = r10.f18574k;
        r1 = r10.f18572i;
        p000.itf.m12452a(r0, r1);
        r0 = r10.f18574k;
        r1 = 5;
        if (r0 >= r1) goto L_0x0567;
    L_0x05d8:
        r0 = r10.f18572i;
        r10.m3794a(r0);
        r0 = r10.f18573j;
        r10.m3794a(r0);
        r0 = r10.f18574k;
        r10.m3797a(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x05ea:
        r0 = new java.lang.IllegalStateException;
        r1 = "Byte queue is too short";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: itf.c(int):int");
    }

    /* renamed from: a */
    private static void m12454a(ith ith, iti iti) {
        int i;
        int i2 = 0;
        ite[] a = ith.m4203a();
        iti.m4207a((short) r4);
        for (ite ite : a) {
            if (ite != null) {
                iti.m4207a(ite.f7446a);
                iti.m4207a(ite.f7447b);
                iti.m4206a(ite.f7449d);
                if (ite.m4179a() <= 4) {
                    itf.m12453a(ite, iti);
                    int a2 = 4 - ite.m4179a();
                    for (i = 0; i < a2; i++) {
                        iti.write(0);
                    }
                } else {
                    iti.m4206a(ite.f7452g);
                }
            }
        }
        iti.m4206a(ith.f7458b);
        i = a.length;
        while (i2 < i) {
            ite ite2 = a[i2];
            if (ite2 != null && ite2.m4179a() > 4) {
                itf.m12453a(ite2, iti);
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static void m12453a(ite ite, iti iti) {
        int i = 0;
        short s = ite.f7447b;
        int length;
        int i2;
        String valueOf;
        switch (s) {
            case (short) 1:
            case (short) 7:
                Object obj = new byte[ite.f7449d];
                length = obj.length;
                if (s == (short) 7 || s == (short) 1) {
                    jri.m13152b(ite.f7451f);
                    Object obj2 = ite.f7451f;
                    i2 = ite.f7449d;
                    if (length > i2) {
                        length = i2;
                    }
                    System.arraycopy(obj2, 0, obj, 0, length);
                    iti.write(obj);
                    return;
                }
                valueOf = String.valueOf(ite.m4175a(s));
                String str = "Cannot get BYTE value from ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new IllegalArgumentException(valueOf);
            case (short) 2:
                jri.m13152b(ite.f7451f);
                byte[] bArr = (byte[]) ite.f7451f;
                i2 = bArr.length;
                if (i2 != ite.f7449d || i2 <= 0) {
                    iti.write(bArr);
                    iti.write(0);
                    return;
                }
                bArr[i2 - 1] = (byte) 0;
                iti.write(bArr);
                return;
            case (short) 3:
                i2 = ite.f7449d;
                for (length = 0; length < i2; length++) {
                    iti.m4207a((short) ((int) ite.m4180a(length)));
                }
                return;
            case (short) 4:
            case (short) 9:
                length = ite.f7449d;
                while (i < length) {
                    iti.m4206a((int) ite.m4180a(i));
                    i++;
                }
                return;
            case (short) 5:
            case (short) 10:
                i2 = ite.f7449d;
                while (i < i2) {
                    short s2 = ite.f7447b;
                    if (s2 == (short) 10 || s2 == (short) 5) {
                        jri.m13152b(ite.f7451f);
                        iqn iqn = ((iqn[]) ite.f7451f)[i];
                        iti.m4206a((int) iqn.f7327a);
                        iti.m4206a((int) iqn.f7328b);
                        i++;
                    } else {
                        valueOf = String.valueOf(ite.m4175a(s2));
                        String str2 = "Cannot get RATIONAL value from ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        throw new IllegalArgumentException(valueOf);
                    }
                }
                return;
            default:
                return;
        }
    }
}
