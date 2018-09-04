package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: aeh */
public final class aeh {
    aeh() {
    }

    /* renamed from: a */
    public static boolean m190a(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m189a(int i, int i2) {
        return i != kvl.UNSET_ENUM_VALUE && i2 != kvl.UNSET_ENUM_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: b */
    public static boolean m191b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
