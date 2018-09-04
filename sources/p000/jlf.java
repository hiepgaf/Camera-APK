package p000;

import android.annotation.TargetApi;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.util.ArrayList;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jlf */
public final class jlf {
    /* renamed from: a */
    private final Iterable f7910a;

    /* renamed from: a */
    private static /* synthetic */ void m4532a(Throwable th, BufferedInputStream bufferedInputStream) {
        if (th != null) {
            try {
                bufferedInputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        bufferedInputStream.close();
    }

    /* renamed from: a */
    public static /* synthetic */ void m4533a(Throwable th, OutputStream outputStream) {
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

    public jlf(Iterable iterable) {
        this.f7910a = iterable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.libraries.smartburst.buffers.FeatureTable m4531a(java.io.File r18) {
        /*
        r2 = new java.io.File;
        r3 = "feature_table.bin";
        r0 = r18;
        r2.<init>(r0, r3);
        r4 = new java.io.BufferedInputStream;
        r3 = new java.io.FileInputStream;
        r3.<init>(r2);
        r4.<init>(r3);
        r5 = new java.io.DataInputStream;	 Catch:{ all -> 0x0029 }
        r5.<init>(r4);	 Catch:{ all -> 0x0029 }
        r2 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r3 = 1984295711; // 0x7645f31f float:1.0037242E33 double:9.80372342E-315;
        if (r2 == r3) goto L_0x0030;
    L_0x0021:
        r2 = new java.io.IOException;	 Catch:{ all -> 0x0029 }
        r3 = "Unsupported file type!";
        r2.<init>(r3);	 Catch:{ all -> 0x0029 }
        throw r2;	 Catch:{ all -> 0x0029 }
    L_0x0029:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r3 = move-exception;
        p000.jlf.m4532a(r2, r4);
        throw r3;
    L_0x0030:
        r2 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r2 >= r3) goto L_0x0060;
    L_0x0038:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x0029 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0029 }
        r6 = 66;
        r5.<init>(r6);	 Catch:{ all -> 0x0029 }
        r6 = "Version of file (";
        r5.append(r6);	 Catch:{ all -> 0x0029 }
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = ") is too old to support (minimum: ";
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = ")";
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = r5.toString();	 Catch:{ all -> 0x0029 }
        r3.<init>(r2);	 Catch:{ all -> 0x0029 }
        throw r3;	 Catch:{ all -> 0x0029 }
    L_0x0060:
        r2 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r3 = new byte[r2];	 Catch:{ all -> 0x0029 }
        r6 = r5.read(r3);	 Catch:{ all -> 0x0029 }
        if (r2 == r6) goto L_0x008a;
    L_0x006c:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x0029 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0029 }
        r6 = 48;
        r5.<init>(r6);	 Catch:{ all -> 0x0029 }
        r6 = "Could not read ";
        r5.append(r6);	 Catch:{ all -> 0x0029 }
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = " bytes of header data!";
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = r5.toString();	 Catch:{ all -> 0x0029 }
        r3.<init>(r2);	 Catch:{ all -> 0x0029 }
        throw r3;	 Catch:{ all -> 0x0029 }
    L_0x008a:
        r6 = new jlg;	 Catch:{ all -> 0x0029 }
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x0029 }
        r2.<init>(r3);	 Catch:{ all -> 0x0029 }
        r6.<init>(r2);	 Catch:{ all -> 0x0029 }
        r2 = 0;
        r3 = 216000; // 0x34bc0 float:3.0268E-40 double:1.06718E-318;
        r3 = r6.m4535a(r2, r3);	 Catch:{ all -> 0x0029 }
        r2 = r6.f7911a;	 Catch:{ all -> 0x0029 }
        r7 = r2.readFloat();	 Catch:{ all -> 0x0029 }
        r2 = r6.f7911a;	 Catch:{ all -> 0x0029 }
        r8 = r2.readLong();	 Catch:{ all -> 0x0029 }
        r2 = 0;
        r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r10 = r6.m4535a(r2, r10);	 Catch:{ all -> 0x0029 }
        r11 = new java.util.ArrayList;	 Catch:{ all -> 0x0029 }
        r11.<init>();	 Catch:{ all -> 0x0029 }
        r2 = 0;
    L_0x00b5:
        if (r2 < r10) goto L_0x015a;
    L_0x00b7:
        r6 = new jkx;	 Catch:{ all -> 0x0029 }
        r2 = java.util.EnumSet.copyOf(r11);	 Catch:{ all -> 0x0029 }
        r6.<init>(r2, r3, r7);	 Catch:{ all -> 0x0029 }
        r2 = 1315859240; // 0x4e6e6b28 float:1.0E9 double:6.50120845E-315;
        r2 = r2 / r7;
        r12 = (long) r2;	 Catch:{ all -> 0x0029 }
        r2 = 0;
        r3 = r2;
    L_0x00c7:
        if (r3 >= r10) goto L_0x0155;
    L_0x00c9:
        r2 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r7 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r11 = r5.readInt();	 Catch:{ all -> 0x0029 }
        r14 = p000.jza.m4706a(r2);	 Catch:{ all -> 0x0029 }
        if (r14 != 0) goto L_0x00f4;
    L_0x00db:
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0029 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0029 }
        r6 = 36;
        r5.<init>(r6);	 Catch:{ all -> 0x0029 }
        r6 = "Unrecognised feature id: ";
        r5.append(r6);	 Catch:{ all -> 0x0029 }
        r5.append(r2);	 Catch:{ all -> 0x0029 }
        r2 = r5.toString();	 Catch:{ all -> 0x0029 }
        r3.<init>(r2);	 Catch:{ all -> 0x0029 }
        throw r3;	 Catch:{ all -> 0x0029 }
    L_0x00f4:
        r2 = r14.f8127A;	 Catch:{ all -> 0x0029 }
        if (r7 == r2) goto L_0x012f;
    L_0x00f8:
        r2 = new java.io.IOException;	 Catch:{ all -> 0x0029 }
        r3 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x0029 }
        r5 = r14.f8127A;	 Catch:{ all -> 0x0029 }
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0029 }
        r6 = r6.length();	 Catch:{ all -> 0x0029 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0029 }
        r6 = r6 + 79;
        r8.<init>(r6);	 Catch:{ all -> 0x0029 }
        r6 = "Unexpected feature length for feature ";
        r8.append(r6);	 Catch:{ all -> 0x0029 }
        r8.append(r3);	 Catch:{ all -> 0x0029 }
        r3 = ". Expected: ";
        r8.append(r3);	 Catch:{ all -> 0x0029 }
        r8.append(r5);	 Catch:{ all -> 0x0029 }
        r3 = ", Got: ";
        r8.append(r3);	 Catch:{ all -> 0x0029 }
        r8.append(r7);	 Catch:{ all -> 0x0029 }
        r3 = r8.toString();	 Catch:{ all -> 0x0029 }
        r2.<init>(r3);	 Catch:{ all -> 0x0029 }
        throw r2;	 Catch:{ all -> 0x0029 }
    L_0x012f:
        r2 = 0;
    L_0x0130:
        if (r2 < r11) goto L_0x0136;
    L_0x0132:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x00c7;
    L_0x0136:
        r7 = r14.f8127A;	 Catch:{ all -> 0x0029 }
        r7 = com.google.android.libraries.smartburst.utils.Feature.readValues(r14, r7, r5);	 Catch:{ all -> 0x0029 }
        r0 = (long) r2;	 Catch:{ all -> 0x0029 }
        r16 = r0;
        r16 = r16 * r12;
        r16 = r16 + r8;
        if (r7 != 0) goto L_0x014d;
    L_0x0145:
        r2 = new java.lang.AssertionError;	 Catch:{ all -> 0x0029 }
        r3 = "Feature should not be null when feature type is not null";
        r2.<init>(r3);	 Catch:{ all -> 0x0029 }
        throw r2;	 Catch:{ all -> 0x0029 }
    L_0x014d:
        r0 = r16;
        r6.setFeatureValue(r0, r7);	 Catch:{ all -> 0x0029 }
        r2 = r2 + 1;
        goto L_0x0130;
    L_0x0155:
        r2 = 0;
        p000.jlf.m4532a(r2, r4);
        return r6;
    L_0x015a:
        r12 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r13 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r12 = r6.m4535a(r12, r13);	 Catch:{ all -> 0x0029 }
        r12 = p000.jza.m4706a(r12);	 Catch:{ all -> 0x0029 }
        r11.add(r12);	 Catch:{ all -> 0x0029 }
        r2 = r2 + 1;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: jlf.a(java.io.File):com.google.android.libraries.smartburst.buffers.FeatureTable");
    }

    /* renamed from: a */
    public final jas m4534a() {
        Iterable arrayList = new ArrayList();
        for (ize a : this.f7910a) {
            arrayList.add(a.mo3162a());
        }
        return jas.m12716b(jli.m12937a(arrayList));
    }
}
