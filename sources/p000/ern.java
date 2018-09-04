package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ern */
public final class ern {
    /* renamed from: a */
    private static final String f4132a = bli.m862a(XmpUtil.TAG);

    /* renamed from: a */
    private static /* synthetic */ void m2040a(Throwable th, FileInputStream fileInputStream) {
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

    static {
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }

    /* renamed from: a */
    public static boolean m2044a(wd wdVar, String str) {
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/camera/", "GCamera");
            wdVar.mo2522a("http://ns.google.com/photos/1.0/camera/", "SpecialTypeID", new xj(512), str, new xj());
            return true;
        } catch (wb e) {
            String str2 = f4132a;
            String valueOf = String.valueOf(e.getMessage());
            String str3 = "exception while appending special type id ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m866b(str2, valueOf);
            return false;
        }
    }

    /* renamed from: a */
    public static wd m2035a() {
        return we.m6118a();
    }

    /* renamed from: a */
    public static wd m2037a(String str) {
        wd b = ern.m2046b(str);
        if (b != null) {
            return b;
        }
        return we.m6118a();
    }

    /* renamed from: a */
    public static String m2032a(wd wdVar) {
        try {
            xm c = wdVar.mo2526c("http://ns.google.com/photos/1.0/camera/", "SpecialTypeID");
            if (c == null) {
                return null;
            }
            return (String) c.mo2535a();
        } catch (Throwable e) {
            bli.m864a(f4132a, "Fail to read special type id from xmp metadata", e);
            return null;
        }
    }

    /* renamed from: a */
    public static wd m2036a(InputStream inputStream) {
        List a = ern.m2033a(new erp(inputStream), true);
        if (a != null) {
            return ern.m2038a(a);
        }
        bli.m873e(f4132a, "Fail to extract xmp sections from the stream");
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static p000.wd m2046b(java.lang.String r6) {
        /*
        r1 = 0;
        r0 = r6.toLowerCase();
        r2 = ".jpg";
        r0 = r0.endsWith(r2);
        if (r0 != 0) goto L_0x0022;
    L_0x000d:
        r0 = r6.toLowerCase();
        r2 = ".jpeg";
        r0 = r0.endsWith(r2);
        if (r0 != 0) goto L_0x0022;
    L_0x0019:
        r0 = f4132a;
        r2 = "XMP parse: only jpeg file is supported";
        p000.bli.m863a(r0, r2);
        r0 = r1;
    L_0x0021:
        return r0;
    L_0x0022:
        r2 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        r2.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        r0 = p000.ern.m2036a(r2);	 Catch:{ all -> 0x0064 }
        r3 = 0;
        p000.ern.m2040a(r3, r2);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        goto L_0x0021;
    L_0x0030:
        r0 = move-exception;
        r2 = r0;
        r3 = f4132a;
        r0 = java.lang.String.valueOf(r6);
        r4 = "Could not find file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x006b;
    L_0x0040:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0045:
        p000.bli.m867b(r3, r0, r2);
        r0 = r1;
        goto L_0x0021;
    L_0x004a:
        r0 = move-exception;
        r2 = r0;
        r3 = f4132a;
        r0 = java.lang.String.valueOf(r6);
        r4 = "Could not read file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x0070;
    L_0x005a:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x005f:
        p000.bli.m867b(r3, r0, r2);
        r0 = r1;
        goto L_0x0021;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0066 }
    L_0x0066:
        r3 = move-exception;
        p000.ern.m2040a(r0, r2);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        throw r3;	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
    L_0x006b:
        r0 = r4.concat(r0);
        goto L_0x0045;
    L_0x0070:
        r0 = r4.concat(r0);
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ern.b(java.lang.String):wd");
    }

    /* renamed from: a */
    private static wd m2038a(List list) {
        for (eyo eyo : list) {
            if (ern.m2041a(eyo)) {
                int i;
                for (i = eyo.f15764c - 1; i > 0; i--) {
                    int i2 = eyo.f15763b + i;
                    byte[] bArr = eyo.f15762a;
                    if (bArr[i2] == (byte) 62 && bArr[i2 - 1] != (byte) 63) {
                        i++;
                        break;
                    }
                }
                i = eyo.f15764c;
                byte[] bArr2 = new byte[(i - 29)];
                System.arraycopy(eyo.f15762a, eyo.f15763b + 29, bArr2, 0, bArr2.length);
                try {
                    return we.m6120a(bArr2);
                } catch (Throwable e) {
                    bli.m864a(f4132a, "XMP parse error", e);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m2041a(eyo eyo) {
        if (eyo.f15764c < 29) {
            return false;
        }
        try {
            Object obj = new byte[29];
            System.arraycopy(eyo.f15762a, eyo.f15763b, obj, 0, 29);
            if (new String(obj, "UTF-8").equals(XmpUtil.XMP_HEADER)) {
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static List m2034a(List list, wd wdVar) {
        if (list == null || list.size() <= 1) {
            return null;
        }
        List list2 = (List) jri.m13152b((Object) list);
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
            System.arraycopy(XmpUtil.XMP_HEADER.getBytes(), 0, obj, 0, 29);
            System.arraycopy(a, 0, obj, 29, length);
            eyo eyo = new eyo(obj, XmpUtil.M_APP1, 0, obj.length);
            int i2 = 0;
            while (i2 < list2.size()) {
                if (((eyo) list2.get(i2)).f15765d == XmpUtil.M_APP1 && ern.m2041a((eyo) list2.get(i2))) {
                    list2.set(i2, eyo);
                    return list2;
                }
                i2++;
            }
            List arrayList = new ArrayList();
            if (((eyo) list2.get(0)).f15765d == XmpUtil.M_APP1) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(list2.subList(0, i));
            arrayList.add(eyo);
            arrayList.addAll(list2.subList(i, list2.size()));
            return arrayList;
        } catch (Throwable e) {
            bli.m864a(f4132a, "Serialize xmp failed", e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.util.List m2033a(p000.erq r7, boolean r8) {
        /*
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r5 = -1;
        r0 = 0;
        r1 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        if (r1 != r6) goto L_0x0088;
    L_0x000a:
        r1 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        r2 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        if (r1 != r2) goto L_0x0088;
    L_0x0012:
        r1 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0058 }
        r1.<init>();	 Catch:{ IOException -> 0x0058 }
    L_0x0017:
        r2 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        if (r2 == r5) goto L_0x0083;
    L_0x001d:
        if (r2 != r6) goto L_0x007d;
    L_0x001f:
        r2 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        if (r2 == r6) goto L_0x001f;
    L_0x0025:
        if (r2 == r5) goto L_0x0077;
    L_0x0027:
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        if (r2 != r3) goto L_0x0039;
    L_0x002b:
        if (r8 != 0) goto L_0x0034;
    L_0x002d:
        r2 = r7.mo1270a(r2);	 Catch:{ IOException -> 0x0058 }
        r1.add(r2);	 Catch:{ IOException -> 0x0058 }
    L_0x0034:
        r7.close();	 Catch:{ IOException -> 0x008e }
    L_0x0037:
        r0 = r1;
    L_0x0038:
        return r0;
    L_0x0039:
        r3 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        r4 = r7.mo1269a();	 Catch:{ IOException -> 0x0058 }
        if (r3 == r5) goto L_0x0071;
    L_0x0043:
        if (r4 == r5) goto L_0x0071;
    L_0x0045:
        r3 = r3 << 8;
        r3 = r3 | r4;
        if (r8 == 0) goto L_0x004e;
    L_0x004a:
        r4 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        if (r2 != r4) goto L_0x0066;
    L_0x004e:
        r3 = r3 + -2;
        r2 = r7.mo1271a(r3, r2);	 Catch:{ IOException -> 0x0058 }
        r1.add(r2);	 Catch:{ IOException -> 0x0058 }
        goto L_0x0017;
    L_0x0058:
        r1 = move-exception;
        r2 = f4132a;	 Catch:{ all -> 0x006c }
        r3 = "Could not parse file.";
        p000.bli.m864a(r2, r3, r1);	 Catch:{ all -> 0x006c }
        r7.close();	 Catch:{ IOException -> 0x0064 }
        goto L_0x0038;
    L_0x0064:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0066:
        r2 = r3 + -2;
        r7.mo1272b(r2);	 Catch:{ IOException -> 0x0058 }
        goto L_0x0017;
    L_0x006c:
        r0 = move-exception;
        r7.close();	 Catch:{ IOException -> 0x0092 }
    L_0x0070:
        throw r0;
    L_0x0071:
        r7.close();	 Catch:{ IOException -> 0x0075 }
        goto L_0x0038;
    L_0x0075:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0077:
        r7.close();	 Catch:{ IOException -> 0x007b }
        goto L_0x0038;
    L_0x007b:
        r1 = move-exception;
        goto L_0x0038;
    L_0x007d:
        r7.close();	 Catch:{ IOException -> 0x0081 }
        goto L_0x0038;
    L_0x0081:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0083:
        r7.close();	 Catch:{ IOException -> 0x0090 }
    L_0x0086:
        r0 = r1;
        goto L_0x0038;
    L_0x0088:
        r7.close();	 Catch:{ IOException -> 0x008c }
        goto L_0x0038;
    L_0x008c:
        r1 = move-exception;
        goto L_0x0038;
    L_0x008e:
        r0 = move-exception;
        goto L_0x0037;
    L_0x0090:
        r0 = move-exception;
        goto L_0x0086;
    L_0x0092:
        r1 = move-exception;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: ern.a(erq, boolean):java.util.List");
    }

    /* renamed from: a */
    private static void m2039a(OutputStream outputStream, List list) {
        outputStream.write(Illuminant.kOther);
        outputStream.write(XmpUtil.M_SOI);
        for (eyo eyo : list) {
            outputStream.write(Illuminant.kOther);
            outputStream.write(eyo.f15765d);
            if (eyo.f15765d != XmpUtil.M_SOS) {
                int i = eyo.f15764c + 2;
                outputStream.write(i >> 8);
                outputStream.write(i & Illuminant.kOther);
            }
            outputStream.write(eyo.f15762a, eyo.f15763b, eyo.f15764c);
        }
    }

    /* renamed from: a */
    public static boolean m2042a(InputStream inputStream, OutputStream outputStream, wd wdVar) {
        try {
            return ern.m2045a(ByteStreams.toByteArray(inputStream), outputStream, wdVar);
        } catch (Throwable e) {
            String str = f4132a;
            String valueOf = String.valueOf(inputStream);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("Could not read JPEG stream: ");
            stringBuilder.append(valueOf);
            bli.m867b(str, stringBuilder.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static boolean m2043a(java.lang.String r7, p000.wd r8) {
        /*
        r2 = 0;
        r1 = 0;
        r0 = r7.toLowerCase();
        r3 = ".jpg";
        r0 = r0.endsWith(r3);
        if (r0 != 0) goto L_0x0023;
    L_0x000e:
        r0 = r7.toLowerCase();
        r3 = ".jpeg";
        r0 = r0.endsWith(r3);
        if (r0 != 0) goto L_0x0023;
    L_0x001a:
        r0 = f4132a;
        r2 = "XMP parse: only jpeg file is supported";
        p000.bli.m863a(r0, r2);
        r0 = r1;
    L_0x0022:
        return r0;
    L_0x0023:
        r3 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r3.<init>(r7);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = new erp;	 Catch:{ all -> 0x0083 }
        r0.<init>(r3);	 Catch:{ all -> 0x0083 }
        r4 = 0;
        r0 = p000.ern.m2033a(r0, r4);	 Catch:{ all -> 0x0083 }
        r4 = p000.ern.m2034a(r0, r8);	 Catch:{ all -> 0x0083 }
        if (r4 == 0) goto L_0x0049;
    L_0x0038:
        r0 = 0;
        p000.ern.m2040a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x008a, all -> 0x00aa }
        r0.<init>(r7);	 Catch:{ IOException -> 0x008a, all -> 0x00aa }
        p000.ern.m2039a(r0, r4);	 Catch:{ IOException -> 0x00b3, all -> 0x00ca }
        r0.close();	 Catch:{ IOException -> 0x00cc }
    L_0x0047:
        r0 = 1;
        goto L_0x0022;
    L_0x0049:
        r0 = 0;
        p000.ern.m2040a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = r1;
        goto L_0x0022;
    L_0x004f:
        r0 = move-exception;
        r2 = r0;
        r3 = f4132a;
        r0 = java.lang.String.valueOf(r7);
        r4 = "Could not find file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x00b7;
    L_0x005f:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0064:
        p000.bli.m867b(r3, r0, r2);
        r0 = r1;
        goto L_0x0022;
    L_0x0069:
        r0 = move-exception;
        r2 = r0;
        r3 = f4132a;
        r0 = java.lang.String.valueOf(r7);
        r4 = "Could not read file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x00bc;
    L_0x0079:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x007e:
        p000.bli.m867b(r3, r0, r2);
        r0 = r1;
        goto L_0x0022;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0085 }
    L_0x0085:
        r2 = move-exception;
        p000.ern.m2040a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
    L_0x008a:
        r0 = move-exception;
        r3 = r0;
    L_0x008c:
        r4 = f4132a;	 Catch:{ all -> 0x00c1 }
        r5 = "Write file failed:";
        r0 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x00c1 }
        r6 = r0.length();	 Catch:{ all -> 0x00c1 }
        if (r6 != 0) goto L_0x00c5;
    L_0x009a:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00c1 }
        r0.<init>(r5);	 Catch:{ all -> 0x00c1 }
    L_0x009f:
        p000.bli.m864a(r4, r0, r3);	 Catch:{ all -> 0x00c1 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a4:
        r2.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00a7:
        r0 = r1;
        goto L_0x0022;
    L_0x00aa:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00ad:
        if (r0 == 0) goto L_0x00b2;
    L_0x00af:
        r0.close();	 Catch:{ IOException -> 0x00d1 }
    L_0x00b2:
        throw r1;
    L_0x00b3:
        r2 = move-exception;
        r3 = r2;
        r2 = r0;
        goto L_0x008c;
    L_0x00b7:
        r0 = r4.concat(r0);
        goto L_0x0064;
    L_0x00bc:
        r0 = r4.concat(r0);
        goto L_0x007e;
    L_0x00c1:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00ad;
    L_0x00c5:
        r0 = r5.concat(r0);	 Catch:{ all -> 0x00c1 }
        goto L_0x009f;
    L_0x00ca:
        r1 = move-exception;
        goto L_0x00ad;
    L_0x00cc:
        r0 = move-exception;
        goto L_0x0047;
    L_0x00cf:
        r0 = move-exception;
        goto L_0x00a7;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00b2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ern.a(java.lang.String, wd):boolean");
    }

    /* renamed from: a */
    private static boolean m2045a(byte[] bArr, OutputStream outputStream, wd wdVar) {
        List a = ern.m2034a(ern.m2033a(new ero(bArr), false), wdVar);
        if (a == null) {
            return false;
        }
        try {
            ern.m2039a(outputStream, a);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                }
            }
            return true;
        } catch (Throwable e2) {
            bli.m864a(f4132a, "Write to stream failed", e2);
            if (outputStream == null) {
                return false;
            }
            try {
                outputStream.close();
                return false;
            } catch (IOException e3) {
                return false;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                }
            }
        }
    }
}
