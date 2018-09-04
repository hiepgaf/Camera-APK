package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import java.io.File;

/* compiled from: PG */
/* renamed from: bvp */
public final class bvp {
    /* renamed from: a */
    private static final String f1629a = bli.m862a("SpecTypeMeta");
    /* renamed from: b */
    private final ContentResolver f1630b;
    /* renamed from: c */
    private final gsx f1631c;
    /* renamed from: d */
    private final ird f1632d;

    bvp(ContentResolver contentResolver, gsx gsx, ird ird) {
        this.f1630b = contentResolver;
        this.f1631c = gsx;
        this.f1632d = ird;
    }

    /* renamed from: a */
    public final kbg m1015a(long j) {
        Object obj = 1;
        this.f1632d.mo1903a("SpecialType");
        try {
            kbg a = m1013a(Files.getContentUri("external").buildUpon().appendPath(Long.toString(j)).build());
            String str;
            if (a.mo2084b()) {
                str = (String) a.mo2081a();
                jri.m13152b((Object) str);
                String toLowerCase = str.toLowerCase();
                if (!(toLowerCase.endsWith("jpg") || toLowerCase.endsWith("jpeg") || toLowerCase.endsWith("rgbz"))) {
                    obj = null;
                }
                String str2;
                if (obj == null) {
                    str2 = f1629a;
                    toLowerCase = "Ignoring metadata for which is not an image ";
                    str = String.valueOf(str);
                    if (str.length() == 0) {
                        str = new String(toLowerCase);
                    } else {
                        str = toLowerCase.concat(str);
                    }
                    bli.m873e(str2, str);
                    a = kau.f19138a;
                    this.f1632d.mo1904b();
                } else if (m1014a(str)) {
                    str2 = f1629a;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
                    stringBuilder.append("file path for ");
                    stringBuilder.append(j);
                    stringBuilder.append(" is ");
                    stringBuilder.append(str);
                    bli.m863a(str2, stringBuilder.toString());
                    jri.m13152b((Object) str);
                    a = bve.m1000a(ern.m2032a(ern.m2037a(str)));
                    this.f1632d.mo1904b();
                } else {
                    str2 = f1629a;
                    toLowerCase = "Ignoring metadata for image that is not in DCIM/Camera: ";
                    str = String.valueOf(str);
                    if (str.length() == 0) {
                        str = new String(toLowerCase);
                    } else {
                        str = toLowerCase.concat(str);
                    }
                    bli.m873e(str2, str);
                    a = kau.f19138a;
                    this.f1632d.mo1904b();
                }
            } else {
                str = f1629a;
                StringBuilder stringBuilder2 = new StringBuilder(36);
                stringBuilder2.append("No metadata for ");
                stringBuilder2.append(j);
                bli.m873e(str, stringBuilder2.toString());
                a = kau.f19138a;
            }
            return a;
        } finally {
            this.f1632d.mo1904b();
        }
    }

    /* renamed from: a */
    private final kbg m1013a(Uri uri) {
        String str = null;
        jri.m13152b((Object) uri);
        Cursor query = this.f1630b.query(uri, new String[]{"_data"}, str, str, str);
        if (query == null || !query.moveToFirst()) {
            return kau.f19138a;
        }
        try {
            str = query.getString(0);
        } catch (Throwable e) {
            String str2 = f1629a;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("Fail to find the file path for the uri ");
            stringBuilder.append(valueOf);
            bli.m867b(str2, stringBuilder.toString(), e);
        }
        query.close();
        if (str == null) {
            return kau.f19138a;
        }
        if (new File(str).exists()) {
            return kbg.m4745c(str);
        }
        return kau.f19138a;
    }

    /* renamed from: a */
    private final boolean m1014a(String str) {
        jri.m13152b((Object) str);
        try {
            return ((String) jri.m13152b(new File(str).getCanonicalPath())).startsWith(this.f1631c.mo1624b());
        } catch (Throwable e) {
            throw new IllegalStateException("Fails to obtain canonical path", e);
        }
    }
}
