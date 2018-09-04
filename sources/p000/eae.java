package p000;

import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: eae */
public final class eae {
    /* renamed from: a */
    private static final String f3444a = bli.m862a("ResolutionSettings");
    /* renamed from: b */
    private final gos f3445b;
    /* renamed from: c */
    private final fbn f3446c;
    /* renamed from: d */
    private final String f3447d;
    /* renamed from: e */
    private final String f3448e;

    public eae(gos gos, fbn fbn, bkw bkw) {
        this.f3445b = gos;
        this.f3446c = fbn;
        this.f3447d = bkw.m848a();
        this.f3448e = ije.m3774a(bkw.f1255a, "camera:blacklisted_resolutions_front", "");
    }

    /* renamed from: a */
    public final iqp m1724a(iur iur, iut iut) {
        String str;
        String str2;
        iqp b;
        Object obj = null;
        if (iut == iut.FRONT) {
            str = "pref_camera_picturesize_front_key";
        } else {
            str = "pref_camera_picturesize_back_key";
        }
        if (iut != iut.BACK) {
            str2 = "";
            if (iut == iut.FRONT) {
                str2 = this.f3448e;
            }
        } else {
            str2 = this.f3447d;
        }
        boolean e = this.f3445b.mo1544e("default_scope", str);
        Object obj2;
        if (e) {
            b = ion.m3958b(this.f3445b.mo1543d("default_scope", str));
            if (b == null) {
                obj2 = 1;
            } else {
                boolean a;
                Object[] split = str2.split(",");
                if (split.length != 0) {
                    a = gly.m11185a(b, new HashSet(khb.m4864a(split)));
                } else {
                    a = false;
                }
                if (a) {
                    int i = 1;
                } else {
                    obj2 = null;
                }
            }
        } else {
            b = null;
            obj2 = null;
        }
        List b2 = this.f3446c.m10176b(iur).mo1920b(256);
        if (b != null && b.f7329a > 0 && b.f7330b > 0 && b2.contains(b)) {
            int i2 = 1;
        }
        if (e && r2 == null && r4 != null) {
            return b;
        }
        b = ion.m3940a(gly.m11183a(b2, str2));
        this.f3445b.mo1532a("default_scope", str, ion.m3962b(b));
        str = f3444a;
        str2 = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 53);
        stringBuilder.append("Picture size setting is not set. Selecting fallback: ");
        stringBuilder.append(str2);
        bli.m873e(str, stringBuilder.toString());
        return b;
    }
}
