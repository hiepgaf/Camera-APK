package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dap */
public final class dap implements gkr {
    /* renamed from: a */
    private static final String f20831a = bli.m862a("CapIntSession");
    /* renamed from: b */
    private final grg f20832b;
    /* renamed from: c */
    private final gnh f20833c;
    /* renamed from: d */
    private final String f20834d;
    /* renamed from: e */
    private final long f20835e;
    /* renamed from: f */
    private Location f20836f;

    public dap(String str, long j, Location location, gnh gnh, grg grg) {
        this.f20834d = str;
        this.f20835e = j;
        this.f20836f = location;
        this.f20833c = gnh;
        this.f20832b = grg;
    }

    /* renamed from: a */
    public final void mo2870a(glm glm) {
    }

    /* renamed from: a */
    public final void mo2868a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo2861a() {
    }

    /* renamed from: b */
    public final void mo2874b() {
    }

    /* renamed from: c */
    public final gob mo2876c() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: d */
    public final synchronized void mo2877d() {
    }

    /* renamed from: a */
    public final void mo2869a(gft gft) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void mo2878e() {
    }

    /* renamed from: f */
    public final void mo2879f() {
    }

    /* renamed from: a */
    public final void mo1481a(hec hec, boolean z, String str) {
    }

    /* renamed from: g */
    public final void mo2880g() {
    }

    /* renamed from: h */
    public final grg mo1482h() {
        return this.f20832b;
    }

    /* renamed from: i */
    public final synchronized int mo2881i() {
        return 0;
    }

    /* renamed from: j */
    public final synchronized hec mo2882j() {
        return hci.m11747a();
    }

    /* renamed from: k */
    public final glw mo2883k() {
        return glw.NORMAL;
    }

    /* renamed from: l */
    public final long mo2884l() {
        return this.f20835e;
    }

    /* renamed from: m */
    public final goe mo2885m() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: n */
    public final String mo2886n() {
        return this.f20834d;
    }

    /* renamed from: o */
    public final Uri mo2887o() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final kpk mo1479a(InputStream inputStream, glz glz) {
        try {
            int intValue;
            byte[] toByteArray;
            if (glz.f5406c.mo2084b()) {
                intValue = ((Integer) glz.f5406c.mo2081a()).intValue();
            } else {
                bli.m866b(f20831a, "Orientation not set");
                intValue = 0;
            }
            ExifInterface exifInterface = (ExifInterface) glz.f5407d.mo2081a();
            if (exifInterface != null) {
                if (this.f20836f != null) {
                    itg itg = new itg(exifInterface);
                    itg.m4200a(this.f20836f);
                    exifInterface = itg.f7455a;
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                exifInterface.m8488b(inputStream, byteArrayOutputStream);
                toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } else {
                toByteArray = ByteStreams.toByteArray(inputStream);
            }
            gnh gnh = this.f20833c;
            gnh.f5499b.execute(new gnk(gnh, toByteArray, intValue));
        } catch (Throwable e) {
            bli.m867b(f20831a, "Could not read image bytes.", e);
        }
        return kow.m13617a(kau.f19138a);
    }

    /* renamed from: a */
    public final void mo2862a(int i) {
    }

    /* renamed from: a */
    public final void mo2865a(Location location) {
        this.f20836f = location;
    }

    /* renamed from: b */
    public final synchronized void mo2875b(int i) {
    }

    /* renamed from: a */
    public final void mo1480a(gew gew) {
    }

    /* renamed from: a */
    public final synchronized void mo2871a(hec hec) {
    }

    /* renamed from: a */
    public final synchronized void mo2872a(iqp iqp, glw glw) {
    }

    /* renamed from: a */
    public final void mo2867a(anq anq, hec hec, glw glw) {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo2873a(byte[] bArr, hec hec, glw glw) {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo2864a(Bitmap bitmap, int i) {
    }

    /* renamed from: p */
    public final void mo2888p() {
        throw new RuntimeException("Not supported.");
    }

    /* renamed from: a */
    public final void mo2863a(Bitmap bitmap) {
        this.f20833c.m2631a(bitmap);
    }

    /* renamed from: a */
    public final void mo2866a(anq anq) {
        this.f20833c.m2631a(hid.m3168a(anq.m6850f()));
    }
}
