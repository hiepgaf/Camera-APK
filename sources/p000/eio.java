package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: eio */
public final class eio {
    /* renamed from: a */
    public static ell f3643a;

    public eio(Context context) {
        context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_media"), 0).edit().clear().apply();
    }

    /* renamed from: a */
    public static void m1756a(ikd ikd, enr enr, eol eol) {
        jri.m13152b((Object) ikd);
        jri.m13152b((Object) enr);
        jri.m13152b((Object) eol);
        if (ikd.m12260b()) {
            enr.m1906a(eol);
        } else {
            ikd.execute(new eop(enr, eol));
        }
    }

    /* renamed from: a */
    public static kbg m1755a(File file) {
        wd b = ern.m2046b(file.getAbsolutePath());
        if (b == null) {
            return kau.f19138a;
        }
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            String j = b.mo2534j("http://ns.google.com/photos/1.0/creations/", "CameraBurstID");
            if (j != null) {
                return kbg.m4745c(UUID.fromString(j));
            }
            return kau.f19138a;
        } catch (wb e) {
            return kau.f19138a;
        }
    }

    /* renamed from: a */
    public static String m1754a(ContentResolver contentResolver, Uri uri) {
        String str = null;
        Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                if (query.moveToFirst()) {
                    str = query.getString(columnIndexOrThrow);
                } else {
                    query.close();
                }
            } finally {
                query.close();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m1757a(String str) {
        boolean z = false;
        wd b = ern.m2046b(str);
        if (b != null) {
            try {
                we.f9447a.m6124a("http://ns.google.com/photos/1.0/creations/", "GCreations");
                if (b.mo2525b("http://ns.google.com/photos/1.0/creations/", "Type")) {
                    z = b.mo2534j("http://ns.google.com/photos/1.0/creations/", "Type").equals("GCameraCollage");
                }
            } catch (Throwable e) {
                Throwable th = e;
                String valueOf = String.valueOf(str);
                String str2 = "Could not fetch XMP_TYPE_BURST_COLLAGE TAG from ";
                throw new RuntimeException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            }
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void m1758a() {
    }

    /* renamed from: b */
    public final synchronized void m1759b() {
    }

    /* renamed from: c */
    public final synchronized epn m1760c() {
        return null;
    }
}
