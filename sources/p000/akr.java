package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: akr */
public final class akr implements ajz {
    /* renamed from: a */
    private final ajz f9862a;

    public akr(ajz ajz) {
        this.f9862a = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        Object obj2;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            obj2 = null;
        } else if (str.charAt(0) != '/') {
            obj2 = Uri.parse(str);
            if (obj2.getScheme() == null) {
                obj2 = akr.m6571a(str);
            }
        } else {
            obj2 = akr.m6571a(str);
        }
        if (obj2 == null || !this.f9862a.mo89a(obj2)) {
            return null;
        }
        return this.f9862a.mo88a(obj2, i, i2, adp);
    }

    /* renamed from: a */
    private static Uri m6571a(String str) {
        return Uri.fromFile(new File(str));
    }
}
