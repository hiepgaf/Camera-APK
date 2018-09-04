package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnk */
public final class bnk implements bnl {
    /* renamed from: a */
    public final UUID f11069a;
    /* renamed from: b */
    public final File f11070b;
    /* renamed from: c */
    public final long f11071c;
    /* renamed from: d */
    private final iqm f11072d;
    /* renamed from: e */
    private final int f11073e;
    /* renamed from: f */
    private final int f11074f;
    /* renamed from: g */
    private final int f11075g;
    /* renamed from: h */
    private final long f11076h;

    /* renamed from: a */
    private static /* synthetic */ void m7588a(Throwable th, FileInputStream fileInputStream) {
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
    private static /* synthetic */ void m7589a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fileOutputStream.close();
    }

    public bnk(int i, long j, long j2, UUID uuid, File file, iqm iqm, int i2, int i3) {
        this.f11075g = i;
        this.f11076h = j;
        this.f11071c = j2;
        this.f11069a = uuid;
        this.f11070b = file;
        this.f11072d = iqm;
        this.f11073e = i2;
        this.f11074f = i3;
    }

    /* renamed from: a */
    public final synchronized void mo537a() {
        jri.m13153b(ikd.m12260b() ^ 1);
        if (this.f11070b.exists() && !this.f11070b.delete()) {
            String valueOf = String.valueOf(this.f11070b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Could not delete file at ");
            stringBuilder.append(valueOf);
            Log.w("BurstDiskImage", stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bnk) && this.f11070b.equals(((bnk) obj).f11070b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ixx mo538b() {
        return ixx.JPEG;
    }

    /* renamed from: c */
    public final iqm mo539c() {
        return this.f11072d;
    }

    /* renamed from: d */
    public final File mo540d() {
        return this.f11070b;
    }

    /* renamed from: e */
    public final long mo541e() {
        return this.f11071c;
    }

    public final int hashCode() {
        return this.f11070b.hashCode();
    }

    /* renamed from: f */
    public final int mo542f() {
        return this.f11074f;
    }

    /* renamed from: g */
    public final Bitmap m7598g() {
        Options options = new Options();
        options.inSampleSize = 8;
        Bitmap decodeFile = BitmapFactory.decodeFile(this.f11070b.getAbsolutePath(), options);
        try {
            int i;
            switch (new ExifInterface(this.f11070b.getAbsolutePath()).getAttributeInt("Orientation", 1)) {
                case 3:
                    i = MediaDecoder.ROTATE_180;
                    break;
                case 6:
                    i = 90;
                    break;
                case 8:
                    i = MediaDecoder.ROTATE_90_LEFT;
                    break;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        } catch (IOException e) {
            String valueOf = String.valueOf(this.f11070b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
            stringBuilder.append("Could not read EXIF data to properly rotate: ");
            stringBuilder.append(valueOf);
            Log.e("BurstDiskImage", stringBuilder.toString());
        }
        return decodeFile;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final java.io.File m7587a(p000.gsl r7) {
        /*
        r6 = this;
        r5 = 0;
        r2 = 1;
        r0 = r6.f11069a;
        r1 = p000.bve.BURSTS;
        r1 = r1.m1007d();
        r0 = p000.bbz.m788a(r0, r2, r1, r2);
        r1 = new java.io.File;
        r2 = r6.f11070b;
        r2 = r2.getParent();
        r3 = r6.f11070b;
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r4 = "_cover_mark.jpg";
        r3 = r3.concat(r4);
        r1.<init>(r2, r3);
        r2 = new java.io.FileInputStream;
        r3 = r6.f11070b;
        r2.<init>(r3);
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0046 }
        r4 = 0;
        r3.<init>(r1, r4);	 Catch:{ all -> 0x0046 }
        p000.ern.m2042a(r2, r3, r0);	 Catch:{ all -> 0x004d }
        r0 = 0;
        p000.bnk.m7589a(r0, r3);	 Catch:{ all -> 0x0046 }
        p000.bnk.m7588a(r5, r2);
        r0 = r6.f11070b;
        r7.mo1618b(r0);
        return r1;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r1 = move-exception;
        p000.bnk.m7588a(r0, r2);
        throw r1;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r1 = move-exception;
        p000.bnk.m7589a(r0, r3);	 Catch:{ all -> 0x0046 }
        throw r1;	 Catch:{ all -> 0x0046 }
        */
        throw new UnsupportedOperationException("Method not decompiled: bnk.a(gsl):java.io.File");
    }

    /* renamed from: a */
    public final boe mo535a(gsl gsl, File file, boolean z, boolean z2) {
        File a;
        if (z) {
            a = m7587a(gsl);
        } else {
            a = this.f11070b;
        }
        gsl.mo1617a(a, file);
        return new boe(file, this.f11072d, iqp.m4043a(this.f11073e, this.f11074f), mo536a(z, z2));
    }

    /* renamed from: h */
    public final boolean mo543h() {
        return false;
    }

    /* renamed from: a */
    public final String mo536a(boolean z, boolean z2) {
        return jxr.m4675a(this.f11075g, this.f11076h, "", z, z2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11070b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("BurstDiskImage[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    public final int mo544i() {
        return this.f11073e;
    }
}
