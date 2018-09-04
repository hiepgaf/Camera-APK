package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: but */
public final class but implements bus {
    /* renamed from: a */
    public final bup f11300a;
    /* renamed from: b */
    public final ContentResolver f11301b;
    /* renamed from: c */
    public final bvm f11302c;
    /* renamed from: d */
    public final gsp f11303d;
    /* renamed from: e */
    public final Map f11304e;
    /* renamed from: f */
    private final glq f11305f = new buu(this);

    public but(bup bup, ContentResolver contentResolver, gsp gsp, bvm bvm, gnh gnh) {
        this.f11300a = bup;
        this.f11301b = contentResolver;
        this.f11303d = gsp;
        this.f11302c = bvm;
        this.f11304e = new HashMap();
        gnh.m2639a(this.f11305f);
    }

    /* renamed from: a */
    public final kbg mo576a(long j) {
        for (Object obj : this.f11304e.values()) {
            if (obj.mo2708b().mo1263b() == j) {
                break;
            }
        }
        String str = buk.f1597a;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("Mediastore record not found for ");
        stringBuilder.append(j);
        bli.m866b(str, stringBuilder.toString());
        Object obj2 = null;
        return kbg.m4744b(obj2);
    }

    /* renamed from: a */
    public final kbg mo577a(Uri uri) {
        return kbg.m4744b((buo) this.f11304e.get(uri));
    }

    /* renamed from: a */
    public final List mo575a() {
        List arrayList = new ArrayList();
        for (buo buo : this.f11304e.values()) {
            if (buo.mo2711e()) {
                arrayList.add(buo);
            }
        }
        return arrayList;
    }
}
