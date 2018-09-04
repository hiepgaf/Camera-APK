package p000;

import android.content.ContentValues;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: bvn */
public final class bvn implements bvm {
    /* renamed from: a */
    private static final String f11327a = bli.m862a("SpecTypeManager");
    /* renamed from: b */
    private final bvf f11328b;
    /* renamed from: c */
    private final bvp f11329c;

    bvn(bvf bvf, bvp bvp) {
        this.f11328b = bvf;
        this.f11329c = bvp;
    }

    /* renamed from: a */
    public final void mo591a(long j, bve bve) {
        String str = f11327a;
        String valueOf = String.valueOf(bve);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("add ");
        stringBuilder.append(j);
        stringBuilder.append(" as ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        bvf bvf = this.f11328b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(j));
        contentValues.put("special_type_id", bve.m1007d());
        String str2 = bvf.f1622a;
        String valueOf2 = String.valueOf(bve);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
        stringBuilder2.append("add to database for ");
        stringBuilder2.append(j);
        stringBuilder2.append(" as ");
        stringBuilder2.append(valueOf2);
        bli.m863a(str2, stringBuilder2.toString());
        kny.m18045a(bvf.f1625c, new bvi(contentValues), bvf.f1626d);
    }

    /* renamed from: a */
    public final kbg mo590a(long j) {
        kbg kbg;
        Object obj;
        kbg a = this.f11328b.m1010a(j);
        if (a.mo2084b()) {
            kbg = a;
        } else {
            kbg = this.f11329c.m1015a(j);
            if (kbg.mo2084b()) {
                mo591a(j, (bve) kbg.mo2081a());
            }
        }
        String str = f11327a;
        if (kbg.mo2084b()) {
            obj = (Serializable) kbg.mo2081a();
        } else {
            obj = " not available";
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append(j);
        stringBuilder.append(" find special type: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        return kbg;
    }
}
