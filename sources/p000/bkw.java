package p000;

import android.content.ContentResolver;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: bkw */
public final class bkw {
    /* renamed from: a */
    public final ContentResolver f1255a;
    /* renamed from: b */
    public final hjf f1256b;
    /* renamed from: c */
    private final SharedPreferences f1257c;

    public bkw(ContentResolver contentResolver, hjf hjf, SharedPreferences sharedPreferences) {
        this.f1255a = contentResolver;
        this.f1256b = hjf;
        this.f1257c = sharedPreferences;
        bkz bkz = new bkz();
    }

    /* renamed from: a */
    public final String m848a() {
        return ije.m3774a(this.f1255a, "camera:blacklisted_resolutions_back", "");
    }

    /* renamed from: a */
    public final boolean m849a(ContentResolver contentResolver, String str, boolean z) {
        if (this.f1257c.contains(str)) {
            return this.f1257c.getBoolean(str, z);
        }
        return ije.m3779a(contentResolver, str, z);
    }

    /* renamed from: b */
    public final int m850b() {
        int d = m852d();
        hjf hjf = this.f1256b;
        ivy ivy = hjf.f6267b;
        if (ivy.f7508d || ivy.f7509e) {
            d *= 5;
        } else if (hjf.m3195c()) {
            d <<= 2;
        } else if (this.f1256b.m3196d()) {
            d <<= 2;
        }
        return ije.m3772a(this.f1255a, "camera:max_hdr_plus_imagereader_image_count", d);
    }

    /* renamed from: c */
    public final int m851c() {
        int i = 14;
        hjf hjf = this.f1256b;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c() || this.f1256b.m3196d())) {
            i = 15;
        }
        return ije.m3772a(this.f1255a, "camera:max_imagereader_image_count", i + 6);
    }

    /* renamed from: d */
    public final int m852d() {
        int i = 7;
        hjf hjf = this.f1256b;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c() || this.f1256b.m3196d())) {
            i = 8;
        }
        return ije.m3772a(this.f1255a, "camera:max_hdr_plus_burst_frame_count", i);
    }

    /* renamed from: e */
    public final boolean m853e() {
        return m849a(this.f1255a, "camera:gcam_enabled", true);
    }

    /* renamed from: f */
    public final boolean m854f() {
        boolean z = true;
        hjf hjf = this.f1256b;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c() || this.f1256b.m3196d())) {
            z = false;
        }
        return m849a(this.f1255a, "camera:hybrid_burst_enabled", z);
    }

    /* renamed from: g */
    public final boolean m855g() {
        if (this.f1256b.m3195c()) {
            return true;
        }
        if (this.f1256b.m3196d()) {
            return true;
        }
        if (this.f1256b.m3194b()) {
            return ije.m3779a(this.f1255a, "camera:google_photos_gallery_pixel_2016", false);
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m856h() {
        boolean z = true;
        hjf hjf = this.f1256b;
        ivy ivy = hjf.f6267b;
        if (!(ivy.f7508d || ivy.f7509e || hjf.m3195c() || this.f1256b.m3196d())) {
            z = false;
        }
        return m849a(this.f1255a, "camera:smartburst_enabled", z);
    }
}
