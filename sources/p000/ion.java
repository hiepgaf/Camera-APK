package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaMuxer;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ion */
public final class ion {
    /* renamed from: a */
    private static /* synthetic */ void m3953a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fileInputStream.close();
    }

    /* renamed from: a */
    public static izi m3942a(Throwable th) {
        return new izo(th);
    }

    /* renamed from: a */
    public static izs m3943a(int i) {
        return ion.m3965c(new ArrayList(i));
    }

    /* renamed from: a */
    public static NavigableMap m3949a(NavigableMap navigableMap, int i, iqc iqc) {
        boolean z;
        if (navigableMap.size() <= i) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return new iqj(navigableMap, i, iqc);
    }

    /* renamed from: a */
    public static izy m3944a() {
        return new izj();
    }

    /* renamed from: a */
    public static double m3934a(float f, double d) {
        boolean z;
        boolean z2 = true;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (d <= 0.0d) {
            z2 = false;
        }
        jri.m13143a(z2);
        double atan = Math.atan(d / ((double) (f + f)));
        return atan + atan;
    }

    /* renamed from: a */
    public static double m3933a(double d, float f) {
        return ((double) (f + f)) * Math.tan(d / 2.0d);
    }

    /* renamed from: a */
    public static izi m3941a(Object obj) {
        return new izl(obj);
    }

    /* renamed from: b */
    public static izi m3959b(Throwable th) {
        return new izn(th);
    }

    /* renamed from: a */
    public static MediaMuxer m3937a(FileDescriptor fileDescriptor, int i) {
        String valueOf = String.valueOf(fileDescriptor);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("create MediaMuxer for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" ");
        stringBuilder.append(i);
        Log.d("MediaMuxerFac", stringBuilder.toString());
        try {
            return new MediaMuxer(fileDescriptor, i);
        } catch (Throwable e) {
            throw new iom("Unable to create MediaMuxer", "file descriptor", i, e);
        }
    }

    /* renamed from: a */
    public static MediaMuxer m3938a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
        stringBuilder.append("create MediaMuxer for ");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(i);
        Log.d("MediaMuxerFac", stringBuilder.toString());
        try {
            return new MediaMuxer(str, i);
        } catch (Throwable e) {
            throw new iom("Unable to create MediaMuxer", str, i, e);
        }
    }

    /* renamed from: b */
    public static String m3960b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String str = "";
        for (int i = 2; i < stackTrace.length; i++) {
            String valueOf = String.valueOf(stackTrace[i]);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(valueOf).length());
            stringBuilder.append(str);
            stringBuilder.append("\t");
            stringBuilder.append(valueOf);
            stringBuilder.append('\n');
            str = stringBuilder.toString();
        }
        return str;
    }

    /* renamed from: a */
    private static wd m3950a(InputStream inputStream) {
        try {
            return ion.m3952a(ByteStreams.toByteArray(inputStream));
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000.wd m3951a(java.lang.String r4) {
        /*
        r0 = 0;
        r1 = r4.toLowerCase();
        r2 = ".jpg";
        r1 = r1.endsWith(r2);
        if (r1 != 0) goto L_0x001a;
    L_0x000d:
        r1 = r4.toLowerCase();
        r2 = ".jpeg";
        r1 = r1.endsWith(r2);
        if (r1 != 0) goto L_0x001a;
    L_0x0019:
        return r0;
    L_0x001a:
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0030 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x0030 }
        r1 = p000.ion.m3950a(r2);	 Catch:{ all -> 0x0029 }
        r3 = 0;
        p000.ion.m3953a(r3, r2);	 Catch:{ IOException -> 0x0030 }
        r0 = r1;
        goto L_0x0019;
    L_0x0029:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r3 = move-exception;
        p000.ion.m3953a(r1, r2);	 Catch:{ IOException -> 0x0030 }
        throw r3;	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        r1 = move-exception;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: ion.a(java.lang.String):wd");
    }

    /* renamed from: a */
    private static wd m3952a(byte[] bArr) {
        List<izc> a = ion.m3946a(new izd(bArr), true);
        if (a == null) {
            return null;
        }
        for (izc izc : a) {
            if (ion.m3954a(izc)) {
                int i;
                for (i = izc.f7586c - 1; i > 0; i--) {
                    int i2 = izc.f7585b + i;
                    byte[] bArr2 = izc.f7584a;
                    if (bArr2[i2] == (byte) 62 && bArr2[i2 - 1] != (byte) 63) {
                        i++;
                        break;
                    }
                }
                i = izc.f7586c;
                byte[] bArr3 = new byte[(i - 29)];
                System.arraycopy(izc.f7584a, izc.f7585b + 29, bArr3, 0, bArr3.length);
                try {
                    return we.m6120a(bArr3);
                } catch (wb e) {
                    return null;
                }
            }
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: a */
    public static List m3948a(Size[] sizeArr) {
        if (sizeArr == null) {
            return ken.m13464e();
        }
        List arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            if (size != null) {
                arrayList.add(new iqp(size.getWidth(), size.getHeight()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static iqp m3958b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return null;
        }
        try {
            return new iqp(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static double m3935a(iun iun) {
        SizeF sizeF = (SizeF) iun.mo1918b(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot((double) sizeF.getHeight(), (double) sizeF.getWidth());
    }

    /* renamed from: a */
    private static boolean m3954a(izc izc) {
        if (izc.f7586c < 29) {
            return false;
        }
        try {
            Object obj = new byte[29];
            System.arraycopy(izc.f7584a, izc.f7585b, obj, 0, 29);
            if (new String(obj, "UTF-8").equals(XmpUtil.XMP_HEADER)) {
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m3961b(int i) {
        switch (i) {
            case 0:
                return "UNKNOWN";
            case 34:
                return "PRIVATE";
            case 38:
                return "RAW12";
            case 39:
                return "YUV_422_888";
            case 40:
                return "YUV_444_888";
            case 41:
                return "FLEX_RGB_888";
            case 42:
                return "FLEX_RGBA_8888";
            case 257:
                return "POINT_CLOUD";
            case 1144402265:
                return "DEPTH16";
            default:
                switch (i) {
                    case 32:
                        return "RAW_SENSOR";
                    case 37:
                        return "RAW10";
                    default:
                        switch (i) {
                            case 35:
                                return "YUV_420_888";
                            default:
                                switch (i) {
                                    case 0:
                                        return "UNKNOWN";
                                    case 4:
                                        return "RGB_565";
                                    case 16:
                                        return "NV16";
                                    case 17:
                                        return "NV21";
                                    case 20:
                                        return "YUY2";
                                    case 34:
                                        return "PRIVATE";
                                    case 35:
                                        return "YUV_420_888";
                                    case 256:
                                        return "JPEG";
                                    case 842094169:
                                        return "YV12";
                                    default:
                                        return Integer.toString(i);
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    private static List m3947a(List list, wd wdVar) {
        if (list == null || list.size() <= 1) {
            return null;
        }
        try {
            xk xkVar = new xk();
            xkVar.m14528f();
            xkVar.m14527e();
            Object a = we.m6121a(wdVar, xkVar);
            int length = a.length;
            if (length > XmpUtil.MAX_XMP_BUFFER_SIZE) {
                return null;
            }
            int i;
            Object obj = new byte[(length + 29)];
            System.arraycopy(XmpUtil.XMP_HEADER.getBytes(StandardCharsets.UTF_8), 0, obj, 0, 29);
            System.arraycopy(a, 0, obj, 29, length);
            izc izc = new izc(obj, XmpUtil.M_APP1, 0, obj.length);
            int i2 = 0;
            while (i2 < list.size()) {
                if (((izc) list.get(i2)).f7587d == XmpUtil.M_APP1 && ion.m3954a((izc) list.get(i2))) {
                    list.set(i2, izc);
                    return list;
                }
                i2++;
            }
            List arrayList = new ArrayList();
            if (((izc) list.get(0)).f7587d == XmpUtil.M_APP1) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(list.subList(0, i));
            arrayList.add(izc);
            arrayList.addAll(list.subList(i, list.size()));
            return arrayList;
        } catch (wb e) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3956a(short s) {
        return ((s & -16) != -64 || s == (short) -60 || s == (short) -56 || s == (short) -52) ? false : true;
    }

    /* renamed from: a */
    public static iqp m3940a(List list) {
        jri.m13153b(list.isEmpty() ^ 1);
        return (iqp) Collections.max(list, iqq.f7332a);
    }

    /* renamed from: a */
    public static Rect m3936a(iqp iqp, iqp iqp2) {
        iqp iqp3;
        int i = iqp2.f7329a;
        int i2 = iqp.f7330b;
        int i3 = i * i2;
        int i4 = iqp.f7329a;
        int i5 = iqp2.f7330b;
        int i6 = i4 * i5;
        if (i3 > i6) {
            iqp3 = new iqp(i4, i6 / i);
        } else {
            iqp3 = new iqp(i3 / i5, i2);
        }
        i = iqp.f7329a;
        i2 = iqp3.f7329a;
        i = (i - i2) / 2;
        i3 = iqp.f7330b;
        int i7 = iqp3.f7330b;
        i3 = (i3 - i7) / 2;
        return new Rect(i, i3, i2 + i, i7 + i3);
    }

    /* renamed from: c */
    public static ixm m3964c(int i) {
        return new ixh(new ixn(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.util.List m3946a(p000.izd r7, boolean r8) {
        /*
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r5 = -1;
        r0 = 0;
        r1 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        if (r1 != r6) goto L_0x0092;
    L_0x000a:
        r1 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r2 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        if (r1 != r2) goto L_0x0092;
    L_0x0012:
        r1 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r1.<init>();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
    L_0x0017:
        r2 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        if (r2 == r5) goto L_0x008d;
    L_0x001d:
        if (r2 != r6) goto L_0x0087;
    L_0x001f:
        r2 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        if (r2 == r6) goto L_0x001f;
    L_0x0025:
        if (r2 == r5) goto L_0x0081;
    L_0x0027:
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        if (r2 != r3) goto L_0x0047;
    L_0x002b:
        if (r8 == 0) goto L_0x0032;
    L_0x002d:
        r7.close();	 Catch:{ IOException -> 0x0098 }
    L_0x0030:
        r0 = r1;
    L_0x0031:
        return r0;
    L_0x0032:
        r3 = r7.f7588a;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r3 = r3.length;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r4 = r7.f7589b;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r3 = r3 - r4;
        r2 = r7.m4363a(r3, r2);	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r1.add(r2);	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        goto L_0x002d;
    L_0x0040:
        r1 = move-exception;
        r7.close();	 Catch:{ IOException -> 0x0045 }
        goto L_0x0031;
    L_0x0045:
        r1 = move-exception;
        goto L_0x0031;
    L_0x0047:
        r3 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r4 = r7.m4362a();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        if (r3 == r5) goto L_0x007b;
    L_0x0051:
        if (r4 == r5) goto L_0x007b;
    L_0x0053:
        r3 = r3 << 8;
        r3 = r3 | r4;
        if (r8 == 0) goto L_0x005c;
    L_0x0058:
        r4 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        if (r2 != r4) goto L_0x006b;
    L_0x005c:
        r3 = r3 + -2;
        r2 = r7.m4363a(r3, r2);	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r1.add(r2);	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        goto L_0x0017;
    L_0x0066:
        r0 = move-exception;
        r7.close();	 Catch:{ IOException -> 0x009c }
    L_0x006a:
        throw r0;
    L_0x006b:
        r2 = r3 + -2;
        r3 = r7.f7589b;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r4 = r7.m4364b();	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        r2 = r2 + r3;
        r7.f7589b = r2;	 Catch:{ IOException -> 0x0040, all -> 0x0066 }
        goto L_0x0017;
    L_0x007b:
        r7.close();	 Catch:{ IOException -> 0x007f }
        goto L_0x0031;
    L_0x007f:
        r1 = move-exception;
        goto L_0x0031;
    L_0x0081:
        r7.close();	 Catch:{ IOException -> 0x0085 }
        goto L_0x0031;
    L_0x0085:
        r1 = move-exception;
        goto L_0x0031;
    L_0x0087:
        r7.close();	 Catch:{ IOException -> 0x008b }
        goto L_0x0031;
    L_0x008b:
        r1 = move-exception;
        goto L_0x0031;
    L_0x008d:
        r7.close();	 Catch:{ IOException -> 0x009a }
    L_0x0090:
        r0 = r1;
        goto L_0x0031;
    L_0x0092:
        r7.close();	 Catch:{ IOException -> 0x0096 }
        goto L_0x0031;
    L_0x0096:
        r1 = move-exception;
        goto L_0x0031;
    L_0x0098:
        r0 = move-exception;
        goto L_0x0030;
    L_0x009a:
        r0 = move-exception;
        goto L_0x0090;
    L_0x009c:
        r1 = move-exception;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: ion.a(izd, boolean):java.util.List");
    }

    @TargetApi(21)
    /* renamed from: a */
    public static Size m3939a(iqp iqp) {
        return new Size(iqp.f7329a, iqp.f7330b);
    }

    /* renamed from: b */
    public static String m3962b(iqp iqp) {
        int i = iqp.f7329a;
        int i2 = iqp.f7330b;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static Object m3945a(iwe iwe) {
        return iwe.mo2713a().f7468a;
    }

    /* renamed from: b */
    public static List m3963b(List list) {
        List arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(ion.m3945a((iwe) list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static izs m3965c(List list) {
        return new izt(list);
    }

    /* renamed from: a */
    public static boolean m3955a(InputStream inputStream, OutputStream outputStream, wd wdVar) {
        try {
            return ion.m3957a(ByteStreams.toByteArray(inputStream), outputStream, wdVar);
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m3957a(byte[] bArr, OutputStream outputStream, wd wdVar) {
        List<izc> a = ion.m3947a(ion.m3946a(new izd(bArr), false), wdVar);
        if (a == null) {
            return false;
        }
        try {
            outputStream.write(Illuminant.kOther);
            outputStream.write(XmpUtil.M_SOI);
            for (izc izc : a) {
                outputStream.write(Illuminant.kOther);
                outputStream.write(izc.f7587d);
                if (izc.f7587d != XmpUtil.M_SOS) {
                    int i = izc.f7586c + 2;
                    outputStream.write(i >> 8);
                    outputStream.write(i & Illuminant.kOther);
                }
                outputStream.write(izc.f7584a, izc.f7585b, izc.f7586c);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
