package p000;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: cqd */
public final class cqd implements Iterable {
    /* renamed from: c */
    private static final String f2557c = bli.m862a("MediaDetails");
    /* renamed from: a */
    public TreeMap f2558a = new TreeMap();
    /* renamed from: b */
    public SparseIntArray f2559b = new SparseIntArray();

    /* renamed from: a */
    public final void m1405a(int i, Object obj) {
        this.f2558a.put(Integer.valueOf(i), obj);
    }

    /* renamed from: a */
    public static void m1404a(cqd cqd, String str) {
        Throwable th;
        String str2;
        String valueOf;
        String str3;
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.readExif(str);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12409u), 102);
            ite e = exifInterface.m8491e(ExifInterface.f12389a);
            ite e2 = exifInterface.m8491e(ExifInterface.f12390b);
            iqm a = isx.m4158a(isx.m4159a(exifInterface));
            if (a == iqm.CLOCKWISE_0 || a == iqm.CLOCKWISE_180) {
                cqd.m1403a(cqd, e, 5);
                cqd.m1403a(cqd, e2, 6);
            } else {
                cqd.m1403a(cqd, e2, 5);
                cqd.m1403a(cqd, e, 6);
            }
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12392d), 100);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12393e), 101);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12406r), 105);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12404p), 108);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12367A), 104);
            cqd.m1403a(cqd, exifInterface.m8491e(ExifInterface.f12402n), 107);
            ite e3 = exifInterface.m8491e(ExifInterface.f12410v);
            if (e3 != null) {
                cqd.m1405a(103, Double.valueOf(e3.m4190e().m4042a()));
                cqd.f2559b.put(103, R.string.unit_mm);
            }
        } catch (Throwable e4) {
            th = e4;
            str2 = f2557c;
            valueOf = String.valueOf(str);
            str3 = "Could not find file to read exif: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m874e(str2, valueOf, th);
        } catch (Throwable e42) {
            th = e42;
            str2 = f2557c;
            valueOf = String.valueOf(str);
            str3 = "Could not read exif from file: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m874e(str2, valueOf, th);
        }
    }

    /* renamed from: a */
    public static String m1402a(Context context, long j) {
        long j2 = j / 3600;
        long j3 = 3600 * j2;
        j3 = j - (j3 + (60 * ((j - j3) / 60)));
        if (j2 == 0) {
            return String.format(context.getString(R.string.details_ms), new Object[]{Long.valueOf(r4), Long.valueOf(j3)});
        }
        return String.format(context.getString(R.string.details_hms), new Object[]{Long.valueOf(j2), Long.valueOf(r4), Long.valueOf(j3)});
    }

    public final Iterator iterator() {
        return this.f2558a.entrySet().iterator();
    }

    /* renamed from: a */
    private static void m1403a(cqd cqd, ite ite, int i) {
        if (ite != null) {
            Object valueOf;
            short s = ite.f7447b;
            if (s == (short) 5 || s == (short) 10) {
                valueOf = String.valueOf(ite.m4190e().m4042a());
            } else if (s == (short) 2) {
                valueOf = ite.m4192g();
            } else {
                long j;
                long[] d = ite.m4189d();
                if (d == null || d.length <= 0) {
                    byte[] bArr;
                    valueOf = ite.f7451f;
                    if (valueOf instanceof byte[]) {
                        bArr = (byte[]) valueOf;
                    } else {
                        bArr = null;
                    }
                    if (bArr == null || bArr.length <= 0) {
                        iqn[] f = ite.m4191f();
                        if (f == null) {
                            j = 0;
                        } else if (f.length > 0) {
                            iqn iqn = f[0];
                            if (iqn.f7328b != 0) {
                                j = (long) iqn.m4042a();
                            } else {
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                    } else {
                        j = (long) bArr[0];
                    }
                } else {
                    j = d[0];
                }
                valueOf = String.valueOf(j);
            }
            if (i == 102) {
                cqd.m1405a(i, new cqe(Integer.parseInt(valueOf)));
            } else {
                cqd.m1405a(i, valueOf);
            }
        }
    }
}
